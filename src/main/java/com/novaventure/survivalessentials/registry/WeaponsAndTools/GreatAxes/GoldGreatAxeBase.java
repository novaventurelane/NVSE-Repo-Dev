package com.novaventure.survivalessentials.registry.WeaponsAndTools.GreatAxes;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class GoldGreatAxeBase extends SwordItem {
    public GoldGreatAxeBase(ToolMaterial GoldToolMaterialCutlass) {
        super(GoldToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}