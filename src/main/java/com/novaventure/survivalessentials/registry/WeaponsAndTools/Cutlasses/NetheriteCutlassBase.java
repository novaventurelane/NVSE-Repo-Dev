package com.novaventure.survivalessentials.registry.WeaponsAndTools.Cutlasses;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class NetheriteCutlassBase extends SwordItem {
    public NetheriteCutlassBase(ToolMaterial NetheriteToolMaterialCutlass) {
        super(NetheriteToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}