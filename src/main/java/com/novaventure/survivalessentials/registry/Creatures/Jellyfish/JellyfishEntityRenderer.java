package com.novaventure.survivalessentials.registry.Creatures.Jellyfish;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.Vector3f;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;


@Environment(EnvType.CLIENT)
public class JellyfishEntityRenderer extends MobEntityRenderer<JellyfishEntity, JellyfishEntityModel<JellyfishEntity>> {
    private static final Identifier TEXTURE = new Identifier(MOD_ID,"textures/entity/jellyfish.png");

    public JellyfishEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new JellyfishEntityModel<>(), 0.7F);
    }

    @Override
    public Identifier getTexture(JellyfishEntity jellyfishEntity) {
        return TEXTURE;
    }

    protected void setupTransforms(JellyfishEntity jellyfishEntity, MatrixStack matrixStack, float f, float g, float h) {
        float i = MathHelper.lerp(h, jellyfishEntity.prevTiltAngle, jellyfishEntity.tiltAngle);
        float j = MathHelper.lerp(h, jellyfishEntity.prevRollAngle, jellyfishEntity.rollAngle);
        matrixStack.translate(0.0D, 0.5D, 0.0D);
        matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(180.0F - g));
        matrixStack.multiply(Vector3f.POSITIVE_X.getDegreesQuaternion(i));
        matrixStack.multiply(Vector3f.POSITIVE_Y.getDegreesQuaternion(j));
        matrixStack.translate(0.0D, -1.2000000476837158D, 0.0D);
    }

    protected float getAnimationProgress(JellyfishEntity jellyfishEntity, float f) {
        return MathHelper.lerp(f, jellyfishEntity.prevTentacleAngle, jellyfishEntity.tentacleAngle);
    }

    @Nullable
    protected RenderLayer getRenderLayer(JellyfishEntity jellyfishEntity, boolean showBody, boolean translucent, boolean showOutline) {
        return RenderLayer.getEntityTranslucent(this.getTexture(jellyfishEntity), false);
    }
}
