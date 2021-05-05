package com.novaventure.survivalessentials.registry.WeaponsAndTools.Machetes;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class IronMacheteBase extends SwordItem {
    public IronMacheteBase(ToolMaterial IronToolMaterialCutlass) {
        super(IronToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}