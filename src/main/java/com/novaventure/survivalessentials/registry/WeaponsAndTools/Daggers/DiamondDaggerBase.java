package com.novaventure.survivalessentials.registry.WeaponsAndTools.Daggers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class DiamondDaggerBase extends SwordItem {
    public DiamondDaggerBase(ToolMaterial DiamondToolMaterialKnife) {
        super(DiamondToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


