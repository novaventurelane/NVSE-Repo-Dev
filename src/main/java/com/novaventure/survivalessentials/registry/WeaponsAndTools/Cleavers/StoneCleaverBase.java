package com.novaventure.survivalessentials.registry.WeaponsAndTools.Cleavers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneCleaverBase extends SwordItem {
    public StoneCleaverBase(ToolMaterial StoneToolMaterialKnife) {
        super(StoneToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


