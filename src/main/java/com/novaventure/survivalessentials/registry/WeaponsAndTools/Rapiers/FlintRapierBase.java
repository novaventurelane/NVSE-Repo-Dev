package com.novaventure.survivalessentials.registry.WeaponsAndTools.Rapiers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintRapierBase extends SwordItem {
    public FlintRapierBase(ToolMaterial FlintToolMaterialCutlass) {
        super(FlintToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}