package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Armor.NovaArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;
import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.ARMOR_GROUP;

public class ArmorItems {
    public static final Item DIVING_HELMET = new ArmorItem(NovaArmorMaterials.DIVING, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));

    public static final Item TURTLE_CHESTPLATE = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item TURTLE_PANTS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));
    public static final Item TURTLE_BOOTS = new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET, new Item.Settings().group(ARMOR_GROUP));

    public static final Item TOOL_BELT = new ArmorItem(NovaArmorMaterials.TOOL_BELT, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));

    public static final Item ARROW_QUIVER = new ArmorItem(NovaArmorMaterials.QUIVER, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STEAM_LEGGINGS = new ArmorItem(NovaArmorMaterials.QUIVER, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STEAM_BOOTS = new ArmorItem(NovaArmorMaterials.QUIVER, EquipmentSlot.FEET, new Item.Settings().group(ARMOR_GROUP));

    public static final Item TRADER_CHEST = new ArmorItem(NovaArmorMaterials.TRADER, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item TRADER_HAT = new ArmorItem(NovaArmorMaterials.TRADER, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));
    public static final Item SANDALS = new ArmorItem(NovaArmorMaterials.TRADER, EquipmentSlot.FEET, new Item.Settings().group(ARMOR_GROUP));

    public static final Item ALT_TRADER_CHEST = new ArmorItem(NovaArmorMaterials.ALT_TRADER, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));

    public static final Item STRAY_HOOD = new ArmorItem(NovaArmorMaterials.STRAY, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STRAY_SHAWL = new ArmorItem(NovaArmorMaterials.STRAY, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STRAY_LEGGINGS = new ArmorItem(NovaArmorMaterials.STRAY, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));

    // public static final Item WOODLAND_HOOD = new ArmorItem(NovaArmorMaterials.WOODLAND, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));
    // public static final Item WOODLAND_CLOAK = new ArmorItem(NovaArmorMaterials.WOODLAND, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));

    public static final Item CHEF_APRON = new ArmorItem(NovaArmorMaterials.CHEF, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));
    public static final Item CHEF_HEADBAND = new ArmorItem(NovaArmorMaterials.CHEF, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diving_helmet"), DIVING_HELMET);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "turtle_chestplate"), TURTLE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "turtle_pants"), TURTLE_PANTS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "turtle_boots"), TURTLE_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tool_belt"), TOOL_BELT);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "arrow_quiver"), ARROW_QUIVER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steam_punk_leggings"), STEAM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steam_punk_boots"), STEAM_BOOTS);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "trader_head_wrap"), TRADER_HAT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "trader_coat"), TRADER_CHEST);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sandals"), SANDALS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sleeveless_trader_coat"), ALT_TRADER_CHEST);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stray_hood"), STRAY_HOOD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stray_shawl"), STRAY_SHAWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stray_leggings"), STRAY_LEGGINGS);

        // Registry.register(Registry.ITEM, new Identifier(MOD_ID, "woodland_hood"), WOODLAND_HOOD);
        // Registry.register(Registry.ITEM, new Identifier(MOD_ID, "woodland_cloak"), WOODLAND_CLOAK);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chef_apron"), CHEF_APRON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chef_headband"), CHEF_HEADBAND);

    }
}
