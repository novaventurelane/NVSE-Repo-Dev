package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Armor.Chef.ChefArmor;
import com.novaventure.survivalessentials.registry.Armor.Diving.DivingArmor;
import com.novaventure.survivalessentials.registry.Armor.Quiver.ArrowQuiverArmor;
import com.novaventure.survivalessentials.registry.Armor.Stray.StrayArmor;
import com.novaventure.survivalessentials.registry.Armor.Tool_Belt.ToolBelt;
import com.novaventure.survivalessentials.registry.Armor.Trader.AltTraderArmor;
import com.novaventure.survivalessentials.registry.Armor.Trader.TraderArmor;
import com.novaventure.survivalessentials.registry.Armor.Turtle.TurtleArmor;
import com.novaventure.survivalessentials.registry.Armor.Woodland.WoodlandArmor;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;
import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.ARMOR_GROUP;

public class ArmorItems {
    public static final ArmorMaterial DIVING_ARMOR_MATERIAL = new DivingArmor();
    public static final Item DIVING_HELMET = new ArmorItem(DIVING_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial TURTLE_ARMOR_MATERIAL = new TurtleArmor();
    public static final Item TURTLE_CHESTPLATE = new ArmorItem(TURTLE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item TURTLE_PANTS = new ArmorItem(TURTLE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));
    public static final Item TURTLE_BOOTS = new ArmorItem(TURTLE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial TOOL_BELT_MATERIAL = new ToolBelt();
    public static final Item TOOL_BELT = new ArmorItem(TOOL_BELT_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial ARROW_QUIVER_MATERIAL = new ArrowQuiverArmor();
    public static final Item ARROW_QUIVER = new ArmorItem(ARROW_QUIVER_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STEAM_LEGGINGS = new ArmorItem(ARROW_QUIVER_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STEAM_BOOTS = new ArmorItem(ARROW_QUIVER_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial TRADER_MATERIAL = new TraderArmor();
    public static final Item TRADER_CHEST = new ArmorItem(TRADER_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item TRADER_HAT = new ArmorItem(TRADER_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));
    public static final Item SANDALS = new ArmorItem(TRADER_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial ALT_TRADER_MATERIAL = new AltTraderArmor();
    public static final Item ALT_TRADER_CHEST = new ArmorItem(ALT_TRADER_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial STRAY_MATERIAL = new StrayArmor();
    public static final Item STRAY_HOOD = new ArmorItem(STRAY_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STRAY_SHAWL = new ArmorItem(STRAY_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));
    public static final Item STRAY_LEGGINGS = new ArmorItem(STRAY_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial WOODLAND_MATERIAL = new WoodlandArmor();
    //public static final Item WOODLAND_HOOD = new ArmorItem(WOODLAND_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));
    //public static final Item WOODLAND_CLOAK = new ArmorItem(WOODLAND_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ARMOR_GROUP));

    public static final ArmorMaterial CHEF_MATERIAL = new ChefArmor();
    public static final Item CHEF_APRON = new ArmorItem(CHEF_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ARMOR_GROUP));
    public static final Item CHEF_HEADBAND = new ArmorItem(CHEF_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ARMOR_GROUP));

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

        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "woodland_hood"), WOODLAND_HOOD);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "woodland_cloak"), WOODLAND_CLOAK);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chef_apron"), CHEF_APRON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chef_headband"), CHEF_HEADBAND);

    }
}
