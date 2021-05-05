package com.novaventure.survivalessentials.registry.WeaponsAndTools.Daggers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class GoldenDaggerBase extends SwordItem {
    public GoldenDaggerBase(ToolMaterial GoldToolMaterialKnife) {
        super(GoldToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


