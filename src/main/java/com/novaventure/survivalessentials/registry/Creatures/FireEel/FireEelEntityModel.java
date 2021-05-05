package com.novaventure.survivalessentials.registry.Creatures.FireEel;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class FireEelEntityModel <T extends FireEelEntity> extends EntityModel<T> {
        private final ModelPart torso;
        private final ModelPart tail;
        private final ModelPart head;
        private final ModelPart rightFin;
        private final ModelPart leftFin;

    public FireEelEntityModel() {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.torso = new ModelPart(this, 0, 0);
        this.torso.addCuboid(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
        this.torso.setPivot(0.0F, 20.0F, 0.0F);
        this.tail = new ModelPart(this, 0, 13);
        this.tail.addCuboid(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
        this.tail.setPivot(0.0F, 20.0F, 8.0F);
        this.head = new ModelPart(this, 22, 0);
        this.head.addCuboid(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
        this.head.setPivot(0.0F, 20.0F, 0.0F);
        ModelPart modelPart = new ModelPart(this, 20, 10);
        modelPart.addCuboid(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F);
        modelPart.setPivot(0.0F, 0.0F, 8.0F);
        this.tail.addChild(modelPart);
        ModelPart modelPart2 = new ModelPart(this, 2, 1);
        modelPart2.addCuboid(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F);
        modelPart2.setPivot(0.0F, -4.5F, 5.0F);
        this.torso.addChild(modelPart2);
        ModelPart modelPart3 = new ModelPart(this, 0, 2);
        modelPart3.addCuboid(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F);
        modelPart3.setPivot(0.0F, -4.5F, -1.0F);
        this.tail.addChild(modelPart3);
        this.rightFin = new ModelPart(this, -4, 0);
        this.rightFin.addCuboid(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
        this.rightFin.setPivot(-1.5F, 21.5F, 0.0F);
        this.rightFin.roll = -0.7853982F;
        this.leftFin = new ModelPart(this, 0, 0);
        this.leftFin.addCuboid(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
        this.leftFin.setPivot(1.5F, 21.5F, 0.0F);
        this.leftFin.roll = 0.7853982F;
    }

        public Iterable<ModelPart> getParts() {
        return ImmutableList.of(this.torso, this.tail, this.head, this.rightFin, this.leftFin);
    }

        public void setAngles(T entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {
        float f = 1.0F;
        float g = 1.0F;
        if (!entity.isTouchingWater()) {
            f = 1.3F;
            g = 1.7F;
        }

        this.tail.yaw = -f * 0.25F * MathHelper.sin(g * 0.6F * animationProgress);
    }

    @Override
    public void render(MatrixStack matrixStack, VertexConsumer	buffer, int packedLight,
                       int packedOverlay, float red, float green, float blue, float alpha){
        torso.render(matrixStack, buffer, packedLight, packedOverlay);
        tail.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        rightFin.render(matrixStack, buffer, packedLight, packedOverlay);
        leftFin.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
