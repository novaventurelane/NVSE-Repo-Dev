package com.novaventure.survivalessentials.registry.WeaponsAndTools.Sickles;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class StoneSickleBase extends SwordItem {
    public StoneSickleBase(ToolMaterial StoneToolMaterialSickle) {
        super(StoneToolMaterialSickle, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}