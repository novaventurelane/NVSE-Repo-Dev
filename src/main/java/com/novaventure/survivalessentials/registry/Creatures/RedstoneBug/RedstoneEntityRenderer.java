package com.novaventure.survivalessentials.registry.Creatures.RedstoneBug;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;

@Environment(EnvType.CLIENT)
public class RedstoneEntityRenderer extends MobEntityRenderer<RedstoneBugEntity, RedstoneEntityModel<RedstoneBugEntity>> {
    private static final Identifier TEXTURE = new Identifier(MOD_ID, "textures/entity/redstone_bug.png");

    public RedstoneEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new RedstoneEntityModel<>(), 0.3F);
    }

    protected float getLyingAngle(RedstoneBugEntity redstoneBugEntity) {
        return 180.0F;
    }

    public Identifier getTexture(RedstoneBugEntity redstoneBugEntity) {
        return TEXTURE;
    }
}
