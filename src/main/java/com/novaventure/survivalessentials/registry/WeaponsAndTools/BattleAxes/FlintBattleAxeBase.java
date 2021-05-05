package com.novaventure.survivalessentials.registry.WeaponsAndTools.BattleAxes;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintBattleAxeBase extends SwordItem {
    public FlintBattleAxeBase(ToolMaterial FlintToolMaterialCutlass) {
        super(FlintToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}