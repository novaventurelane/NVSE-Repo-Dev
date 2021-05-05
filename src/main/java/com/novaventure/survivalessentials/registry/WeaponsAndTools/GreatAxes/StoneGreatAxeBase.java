package com.novaventure.survivalessentials.registry.WeaponsAndTools.GreatAxes;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneGreatAxeBase extends SwordItem {
    public StoneGreatAxeBase(ToolMaterial StoneToolMaterialCutlass) {
        super(StoneToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}