package com.novaventure.survivalessentials.registry.WeaponsAndTools.Spears;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class NetheriteSpearBase extends SwordItem {
    public NetheriteSpearBase(ToolMaterial NetheriteToolMaterialSpear) {
        super(NetheriteToolMaterialSpear, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


