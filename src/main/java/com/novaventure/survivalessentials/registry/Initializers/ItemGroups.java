package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Icons.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;

public class ItemGroups {
    //icons for item groups
    public static final Item EXPLORATION_ICON = new ExplorationGroupBase(new Item.Settings());
    public static final Item COOKING_ICON = new CookingGroupBase(new Item.Settings());
    public static final Item EQUIPMENT_ICON = new EquipmentGroupBase(new Item.Settings());
    public static final Item FURNITURE_ICON = new FurnitureGroupBase(new Item.Settings());
    public static final Item MISC_ICON = new MiscGroupBase(new Item.Settings());
    public static final Item NATURE_ICON = new NatureGroupBase(new Item.Settings());
    public static final Item FOSSIL_ICON = new FossilGroupBase(new Item.Settings());
    public static final Item ARMOR_ICON = new ArmorGroupBase(new Item.Settings());

    //item groups & some items
    //i fucking hate order of operations in programming
    public static final ItemGroup NATURE_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "nature")).icon(() -> new ItemStack(NATURE_ICON)).build();

    public static final ItemGroup FOSSIL_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "fossil")).icon(() -> new ItemStack(FOSSIL_ICON)).build();

    public static final ItemGroup EQUIPMENT_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "equipment")).icon(() -> new ItemStack(EQUIPMENT_ICON)).build();

    public static final ItemGroup COOKING_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "cooking")).icon(() -> new ItemStack(COOKING_ICON)).build();

    public static final ItemGroup EXPLORATION_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "exploration")).icon(() -> new ItemStack(EXPLORATION_ICON)).build();

    public static final ItemGroup FURNITURE_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "furniture")).icon(() -> new ItemStack(FURNITURE_ICON)).build();

    public static final ItemGroup MISC_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "misc")).icon(() -> new ItemStack(MISC_ICON)).build();

    public static final ItemGroup ARMOR_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "armor")).icon(() -> new ItemStack(ARMOR_ICON)).build();

    public static void initialize() {
        //icons
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "equipment"), EQUIPMENT_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "furniture"), FURNITURE_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooking"), COOKING_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "exploration"), EXPLORATION_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "misc"), MISC_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nature"), NATURE_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fossil"), FOSSIL_ICON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "armor"), ARMOR_ICON);
    }
}
