package com.novaventure.survivalessentials.registry.WeaponsAndTools.Spears;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;


public class FlintSpearBase extends SwordItem {
    public FlintSpearBase(ToolMaterial FlintToolMaterialSpear) {
        super(FlintToolMaterialSpear, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


