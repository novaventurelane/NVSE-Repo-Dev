package com.novaventure.survivalessentials.registry.WeaponsAndTools.FlintTools;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintBaseShovel extends ShovelItem {
    public FlintBaseShovel(ToolMaterial FlintToolMaterialShovel) {
        super(FlintToolMaterialShovel, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


