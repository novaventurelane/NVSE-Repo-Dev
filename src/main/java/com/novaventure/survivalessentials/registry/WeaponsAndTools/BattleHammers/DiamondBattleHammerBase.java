package com.novaventure.survivalessentials.registry.WeaponsAndTools.BattleHammers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class DiamondBattleHammerBase extends SwordItem {
    public DiamondBattleHammerBase(ToolMaterial DiamondToolMaterialCutlass) {
        super(DiamondToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}