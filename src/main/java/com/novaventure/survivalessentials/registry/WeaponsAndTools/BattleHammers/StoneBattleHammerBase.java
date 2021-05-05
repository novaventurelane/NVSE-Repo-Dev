package com.novaventure.survivalessentials.registry.WeaponsAndTools.BattleHammers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneBattleHammerBase extends SwordItem {
    public StoneBattleHammerBase(ToolMaterial StoneToolMaterialCutlass) {
        super(StoneToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}