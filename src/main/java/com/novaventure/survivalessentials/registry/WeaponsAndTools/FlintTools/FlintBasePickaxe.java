package com.novaventure.survivalessentials.registry.WeaponsAndTools.FlintTools;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.EQUIPMENT_GROUP;

public class FlintBasePickaxe extends PickaxeItem {
    public FlintBasePickaxe(ToolMaterial FlintToolMaterialPickaxe) {
        super(FlintToolMaterialPickaxe, 0, -3.0f, new Settings().group(EQUIPMENT_GROUP));
    }
}


