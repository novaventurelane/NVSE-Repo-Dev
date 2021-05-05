package com.novaventure.survivalessentials.registry.WeaponsAndTools.Spears;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneSpearBase extends SwordItem {
    public StoneSpearBase(ToolMaterial StoneToolMaterialSpear) {
        super(StoneToolMaterialSpear, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


