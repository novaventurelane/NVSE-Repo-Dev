package com.novaventure.survivalessentials.registry.WeaponsAndTools.Cleavers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class DiamondCleaverBase extends SwordItem {
    public DiamondCleaverBase(ToolMaterial DiamondToolMaterialKnife) {
        super(DiamondToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


