package com.novaventure.survivalessentials.registry.WeaponsAndTools.Cutlasses;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintCutlassBase extends SwordItem {
    public FlintCutlassBase(ToolMaterial FlintToolMaterialCutlass) {
        super(FlintToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}