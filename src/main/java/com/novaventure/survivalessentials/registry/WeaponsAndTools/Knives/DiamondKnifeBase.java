package com.novaventure.survivalessentials.registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class DiamondKnifeBase extends SwordItem {
    public DiamondKnifeBase(ToolMaterial DiamondToolMaterialKnife) {
        super(DiamondToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


