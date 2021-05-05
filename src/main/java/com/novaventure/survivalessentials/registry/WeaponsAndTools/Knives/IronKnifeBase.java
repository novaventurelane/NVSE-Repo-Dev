package com.novaventure.survivalessentials.registry.WeaponsAndTools.Knives;

import net.minecraft.item.*;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class IronKnifeBase extends SwordItem {
    public IronKnifeBase(ToolMaterial IronToolMaterialKnife) {
        super(IronToolMaterialKnife, 0, -3.0f, new Item.Settings().group(EQUIPMENT_GROUP));
    }
}


