package com.novaventure.survivalessentials.registry.WeaponsAndTools.Spears;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;


public class DiamondSpearBase extends SwordItem {
    public DiamondSpearBase(ToolMaterial DiamondToolMaterialSpear) {
        super(DiamondToolMaterialSpear, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


