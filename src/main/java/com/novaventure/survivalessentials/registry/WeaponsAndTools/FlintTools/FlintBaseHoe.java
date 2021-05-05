package com.novaventure.survivalessentials.registry.WeaponsAndTools.FlintTools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintBaseHoe extends HoeItem {
    public FlintBaseHoe(ToolMaterial FlintToolMaterialHoe) {
        super(FlintToolMaterialHoe, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


