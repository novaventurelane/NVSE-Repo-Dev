package com.novaventure.survivalessentials;

import com.novaventure.survivalessentials.registry.Blocks.Entity.IceBoxScreen;
import com.novaventure.survivalessentials.registry.Creatures.FireEel.FireEelEntityRenderer;
import com.novaventure.survivalessentials.registry.Creatures.Jellyfish.JellyfishEntityRenderer;
import com.novaventure.survivalessentials.registry.Creatures.RedstoneBug.RedstoneEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourceType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockRenderView;

import java.util.function.Function;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;
import static com.novaventure.survivalessentials.registry.Initializers.Blocks.*;
import static com.novaventure.survivalessentials.registry.Initializers.Mobs.*;
import static com.novaventure.survivalessentials.registry.Initializers.ModFluidsInitializer.FLOWING_ROTTING;
import static com.novaventure.survivalessentials.registry.Initializers.ModFluidsInitializer.STILL_ROTTING;

public class SurvivalEssentialsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ICEBOX_SCREEN_HANDLER, IceBoxScreen::new);

        // Put blocks on the cutout layer
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                SEAWEED, SEAWEED_PLANT,
                BROWN_KELP, BROWN_KELP_PLANT,
                ORANGE_KELP, ORANGE_KELP_PLANT,
                RED_SEAGRASS,
                BARNACLES_BLOCK,
                FAERY_MUSHROOM, GREEN_MUSHROOM, CERULEAN_FUNGUS,
                APPLE_LEAVES, APPLE_SAPLING,
                BITTER_BERRY_BUSH, SPICY_BERRY_BUSH, TOMATO_BUSH, LETTUCE,
                RICE_SEEDLINGS, IGUSA_SEEDS, MAIZE_CROP,
                BLAZE_NETTLE, WEAPING_BRIAR, CORRUPT_WART, TAINTED_BUSH, WATCHERS_GAZE, GLOWING_SHELF,
                TUMBLE_WEED,
                FAERY_LANTERN, REDSTONE_LANTERN, SEA_LANTERN_BLOCK, AMBER_LANTERN,
                POT_GIFT,
                CAMPFIRE_POT, SOUL_CAMPFIRE_POT,
                SPIKE_WALL_BLOCK);

        registerEntityRenderers();

        // fluids
        setupFluidRendering(STILL_ROTTING, FLOWING_ROTTING, new Identifier("minecraft", "water"), 0x4CC248);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), STILL_ROTTING, FLOWING_ROTTING);

        SurvivalEssentials.LOGGER.info("If you're reading this client mod initialization loaded fine™️ too.");
    }

    private static void registerEntityRenderers() {
        // jellyfish
        EntityRendererRegistry.INSTANCE.register(OVERWORLD_JELLYFISH,
                (dispatcher, context) -> new JellyfishEntityRenderer(dispatcher));

        // fire eel
        EntityRendererRegistry.INSTANCE.register(OVERWORLD_FIRE_EEL,
                (dispatcher, context) -> new FireEelEntityRenderer(dispatcher));

        // redstone bug
        EntityRendererRegistry.INSTANCE.register(OVERWORLD_REDSTONE_BUG,
                (dispatcher, context) -> new RedstoneEntityRenderer(dispatcher));
    }

    public static void setupFluidRendering(final Fluid still, final Fluid flowing, final Identifier textureFluidId, final int color)
    {
        final Identifier stillSpriteId = new Identifier(MOD_ID, "blocks/rotting_still");
        final Identifier flowingSpriteId = new Identifier(MOD_ID, "blocks/rotting_flow");

        // If they're not already present, add the sprites to the block atlas
        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) ->
        {
            registry.register(flowingSpriteId);
            registry.register(stillSpriteId);
        });

        final Identifier fluidId = Registry.FLUID.getId(still);
        final Identifier listenerId = new Identifier(fluidId.getNamespace(), fluidId.getPath() + "_reload_listener");

        final Sprite[] fluidSprites = { null, null };

        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener()
        {
            @Override
            public Identifier getFabricId()
            {
                return listenerId;
            }

            /**
             * Get the sprites from the block atlas when resources are reloaded
             */
            @Override
            public void apply(ResourceManager resourceManager)
            {
                final Function<Identifier, Sprite> atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE);
                fluidSprites[0] = atlas.apply(stillSpriteId);
                fluidSprites[1] = atlas.apply(flowingSpriteId);
            }
        });

        // The FluidRenderer gets the sprites and color from a FluidRenderHandler during rendering
        final FluidRenderHandler renderHandler = new FluidRenderHandler()
        {
            @Override
            public Sprite[] getFluidSprites(BlockRenderView view, BlockPos pos, FluidState state)
            {
                return fluidSprites;
            }

            @Override
            public int getFluidColor(BlockRenderView view, BlockPos pos, FluidState state)
            {
                return color;
            }
        };

        FluidRenderHandlerRegistry.INSTANCE.register(still, renderHandler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, renderHandler);
    }
}
