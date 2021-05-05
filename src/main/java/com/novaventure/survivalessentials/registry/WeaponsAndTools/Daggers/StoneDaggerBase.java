package com.novaventure.survivalessentials.registry.WeaponsAndTools.Daggers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneDaggerBase extends SwordItem {
    public StoneDaggerBase(ToolMaterial StoneToolMaterialKnife) {
        super(StoneToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


