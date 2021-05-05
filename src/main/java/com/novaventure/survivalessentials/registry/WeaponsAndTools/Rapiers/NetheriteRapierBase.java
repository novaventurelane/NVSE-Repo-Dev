package com.novaventure.survivalessentials.registry.WeaponsAndTools.Rapiers;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class NetheriteRapierBase extends SwordItem {
    public NetheriteRapierBase(ToolMaterial NetheriteToolMaterialCutlass) {
        super(NetheriteToolMaterialCutlass, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}