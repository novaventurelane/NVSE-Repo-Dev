package com.novaventure.survivalessentials.registry.Creatures.FireEel;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;

public class FireEelEntityRenderer extends MobEntityRenderer<FireEelEntity, FireEelEntityModel<FireEelEntity>> {
    public FireEelEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new FireEelEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(FireEelEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/fireeel.png");
    }
}

//int i = true;