package com.novaventure.survivalessentials.registry.WeaponsAndTools.Knives;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneKnifeBase extends SwordItem {
    public StoneKnifeBase(ToolMaterial StoneToolMaterialKnife) {
        super(StoneToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


