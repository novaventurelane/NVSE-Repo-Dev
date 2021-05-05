package com.novaventure.survivalessentials.registry.WeaponsAndTools.BattleAxes;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneBattleAxeBase extends SwordItem {
    public StoneBattleAxeBase(ToolMaterial StoneToolMaterialCutlass) {
        super(StoneToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}