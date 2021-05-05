package com.novaventure.survivalessentials.registry.WeaponsAndTools.FlintTools;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintBaseSword extends SwordItem {
    public FlintBaseSword(ToolMaterial FlintToolMaterialSword) {
        super(FlintToolMaterialSword, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


