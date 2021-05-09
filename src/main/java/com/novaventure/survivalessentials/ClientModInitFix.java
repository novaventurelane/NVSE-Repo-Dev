package com.novaventure.survivalessentials;

import com.novaventure.survivalessentials.registry.Blocks.Entity.BoxScreen;
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

import static com.novaventure.survivalessentials.SurvivalEssentials.*;
import static com.novaventure.survivalessentials.registry.Initializers.Blocks.*;
import static com.novaventure.survivalessentials.registry.Initializers.Mobs.*;
import static com.novaventure.survivalessentials.registry.Initializers.ModFluidsInitializer.FLOWING_ROTTING;
import static com.novaventure.survivalessentials.registry.Initializers.ModFluidsInitializer.STILL_ROTTING;

public class ClientModInitFix implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(ICEBOX_SCREEN_HANDLER, BoxScreen::new);

        BlockRenderLayerMap.INSTANCE.putBlock(SEAWEED, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SEAWEED_PLANT, RenderLayer.getCutout());

        //removing this section got rid of the x above the water but left the block rendering issue
        //BlockRenderLayerMap.INSTANCE.putBlock(SEAWEED, RenderLayer.getTranslucent());
        //BlockRenderLayerMap.INSTANCE.putBlock(SEAWEED_PLANT, RenderLayer.getTranslucent());

        //brown kelp texture fix

        BlockRenderLayerMap.INSTANCE.putBlock(BROWN_KELP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(BROWN_KELP_PLANT, RenderLayer.getCutout());

        //removing this section got rid of the x above the water but left the block rendering issue
        //BlockRenderLayerMap.INSTANCE.putBlock(BROWN_KELP, RenderLayer.getTranslucent());
        //BlockRenderLayerMap.INSTANCE.putBlock(BROWN_KELP_PLANT, RenderLayer.getTranslucent());

        //seaweed texture fix

        BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_KELP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ORANGE_KELP_PLANT, RenderLayer.getCutout());

        //red seagrass fix
        BlockRenderLayerMap.INSTANCE.putBlock(RED_SEAGRASS, RenderLayer.getCutout());

        //barnacles fix
        BlockRenderLayerMap.INSTANCE.putBlock(BARNACLES_BLOCK, RenderLayer.getCutout());

        //mushroom texture fix
        BlockRenderLayerMap.INSTANCE.putBlock(FAERY_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GREEN_MUSHROOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CERULEAN_FUNGUS, RenderLayer.getCutout());

        //apple leaves texture fix
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_LEAVES, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SHIVERPINE_LEAVES, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SHIVERPINE_LEAVES, RenderLayer.getCutout());

        //apple sapling texture fix
        BlockRenderLayerMap.INSTANCE.putBlock(APPLE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SHIVERPINE_SAPLING, RenderLayer.getCutout());

        //bush texture fix
        BlockRenderLayerMap.INSTANCE.putBlock(BITTER_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SPICY_BERRY_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TOMATO_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(LETTUCE, RenderLayer.getCutout());

        //crop texture fixes
        BlockRenderLayerMap.INSTANCE.putBlock(RICE_SEEDLINGS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(IGUSA_SEEDS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MAIZE_CROP, RenderLayer.getCutout());

        //jellyfish
        EntityRendererRegistry.INSTANCE.register(OVERWORLD_JELLYFISH, (dispatcher, context) -> {
          return new JellyfishEntityRenderer(dispatcher);
        });

        //fire eel
        EntityRendererRegistry.INSTANCE.register(OVERWORLD_FIRE_EEL, (dispatcher, context) -> {
            return new FireEelEntityRenderer(dispatcher);
        });

        //redstone bug
        EntityRendererRegistry.INSTANCE.register(OVERWORLD_REDSTONE_BUG, (dispatcher, context) -> {
            return new RedstoneEntityRenderer(dispatcher);
        });

        //lantern & torch texture fixes
        BlockRenderLayerMap.INSTANCE.putBlock(FAERY_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FAERY_LANTERN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(REDSTONE_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(REDSTONE_LANTERN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SEA_LANTERN_BLOCK, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SEA_LANTERN_BLOCK, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(AMBER_LANTERN, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(AMBER_LANTERN, RenderLayer.getCutout());

        //pottery fixes
        BlockRenderLayerMap.INSTANCE.putBlock(POT_GIFT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(POT_GIFT, RenderLayer.getCutout());

        //campfire fixes
        BlockRenderLayerMap.INSTANCE.putBlock(CAMPFIRE_POT, RenderLayer.getCutout());
        //BlockRenderLayerMap.INSTANCE.putBlock(CAMPFIRE_POT, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(SOUL_CAMPFIRE_POT, RenderLayer.getCutout());

        //spike trap fix
        BlockRenderLayerMap.INSTANCE.putBlock(SPIKE_WALL_BLOCK, RenderLayer.getCutout());

        System.out.println("If you're reading this client mod initialization loaded fine™️ too.");

        //fluids
        setupFluidRendering(STILL_ROTTING, FLOWING_ROTTING, new Identifier("minecraft", "water"), 0x4CC248);
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), STILL_ROTTING, FLOWING_ROTTING);

        //nether plants
        BlockRenderLayerMap.INSTANCE.putBlock(BLAZE_NETTLE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WEAPING_BRIAR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(CORRUPT_WART, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TAINTED_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(WATCHERS_GAZE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(GLOWING_SHELF, RenderLayer.getCutout());

        //bushes
        BlockRenderLayerMap.INSTANCE.putBlock(TUMBLE_WEED, RenderLayer.getCutout());

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
