package com.novaventure.survivalessentials.registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintKnifeBase extends SwordItem {
    public FlintKnifeBase(ToolMaterial FlintToolMaterialKnife) {
        super(FlintToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


