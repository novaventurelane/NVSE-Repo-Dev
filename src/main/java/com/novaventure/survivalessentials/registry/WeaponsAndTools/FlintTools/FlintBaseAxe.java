package com.novaventure.survivalessentials.registry.WeaponsAndTools.FlintTools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintBaseAxe extends AxeItem {
    public FlintBaseAxe(ToolMaterial FlintToolMaterialAxe) {
        super(FlintToolMaterialAxe, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


