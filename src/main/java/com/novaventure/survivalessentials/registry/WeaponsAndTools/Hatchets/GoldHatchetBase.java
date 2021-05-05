package com.novaventure.survivalessentials.registry.WeaponsAndTools.Hatchets;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class GoldHatchetBase extends SwordItem {
    public GoldHatchetBase(ToolMaterial GoldToolMaterialKnife) {
        super(GoldToolMaterialKnife, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


