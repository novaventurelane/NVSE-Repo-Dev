package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Blocks.Plants.Crops.RiceItemBase;
import com.novaventure.survivalessentials.registry.Cooking.FoodTypeBases.*;
import com.novaventure.survivalessentials.registry.Cooking.Food.*;
import com.novaventure.survivalessentials.registry.Cooking.Food.SaltBase;
import com.novaventure.survivalessentials.registry.Cooking.Jars.JamBase;
import com.novaventure.survivalessentials.registry.Cooking.Jars.JarPotionBase;
import com.novaventure.survivalessentials.registry.Creatures.FireEel.Items.FireEelItemBase;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.*;
import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.*;

public class FoodAndCooking {
    public static final Item JARPOTION_BASE = new JarPotionBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item GLISTERING_JAR = new JamBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item BERRY_JAR = new JamBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item DRIED_SEAWEED = new DriedSeaweedBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item DRIED_BROWN_KELP = new DriedBrownKelpBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item DRIED_ORANGE_KELP = new DriedOrangeKelpBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item DRIED_SALMON = new DriedSalmonBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item DRIED_COD = new DriedCodBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item DRIED_TROPICAL = new DriedTropicalBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item DRIED_FIRE_EEL = new DriedFireEelBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item COOKED_TROPICAL = new CookedTropicalBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item RICE_ITEM = new RiceItemBase(new Item.Settings().group(COOKING_GROUP));
    public static final Item MILK_BOTTLE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(16));
    public static final Item FIRE_EEL_ITEM = new FireEelItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item GRILLED_FIRE_EEL_ITEM = new GrilledFireEelItemBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64));
    public static final Item HONEYCOMB_CHUNK = new HoneyCombChunkBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120), 1.0f).build()).maxCount(16));
    public static final Item SALT = new SaltBase(new Item.Settings().group(MISC_GROUP));
    //new
    public static final Item CLOWN_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE,1200),1.0f).build()).maxCount(16));
    public static final Item CAKE_SLICE = new PieBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120), 1.0f).build()).maxCount(16));
    public static final Item RAW_EGGS = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600), 0.7f).build()).maxCount(16));
    public static final Item COOKED_EGG_BOWL = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build()).maxCount(16));
    public static final Item FRUIT_KABOB = new FruitCabobAltBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build()).maxCount(16));
    public static final Item GOLDEN_FRUIT_KABOB = new FruitCabobAltBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build()).maxCount(16));
    public static final Item RAW_BACON = new BaconBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build()).maxCount(64));
    public static final Item COOKED_BACON = new BaconBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item FULL_BREAKFAST = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(16));
    public static final Item APPLE_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(16));
    public static final Item APPLE_DOUGH = new DoughBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BAKED_POTATO_SPECIAL = new BakedPotatoBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item CARROT_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item GLISTERING_SWEET_BERRY_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item GLISTERING_WART = new GlisteringWartBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item GLISTERING_FIRE_BERRY_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item GLISTERING_BITTER_BERRY_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item APPLE_PIE = new PieBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item PUMPKIN_BOWL = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item PUMPKIN_JAR = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BBOX_CLOWNFISH = new BBoxBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BBOX_SALMON = new BBoxBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BBOX_UNAGI = new BBoxBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BBOX_EMPTY = new BBoxBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item CAKE_DOUGH = new DoughBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item NETHER_FUNGUS_STEW = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BONE_BROTH = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item TOMATO_SOUP = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item RICE_BOWL = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COOKIE_DOUGH = new DoughBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SALMON_ROLL = new SalmonRollBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BREAD_DOUGH = new DoughBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item PUMPKIN_DOUGH = new DoughBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item APPLE_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BITTER_BERRY_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item CHORUS_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item MAGMA_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SLIME_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SPICY_BERRY_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item NETHER_WART_JAM = new JamBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item APPLE_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BITTER_BERRY_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SPICY_BERRY_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SWEET_BERRY_CYSER = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item MEAD_MUG = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item MUG_EMPTY = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SWEET_BERRY_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SPICY_BERRY_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item FAERY_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item CHORUS_WINE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item CHICKEN_CURRY = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item FULL_BREAKFAST_VEGETARIAN = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COOKED_PUMPKIN_SEEDS = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BACON_AND_EGGS = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item COD_CHOWDER = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SEAWEED_SALAD = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item TOMATO_JUICE = new DrinkBottleBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item FAERY_SOUP = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item FAERY_MEAD = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));

    //
    public static final Item MAIZE_PORRIDGE = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item ATOLE_MUG = new MeadBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item NAAN_BREAD = new LambGyroBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item NAAN_DOUGH = new DoughBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item BEEF_STEW = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item SPICY_RABBIT_BIGO = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item LAMB_BIRYANI = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item PORK_STIR_FRY = new BowlBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));
    public static final Item LAMB_GYRO = new LambGyroBase(new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build()).maxCount(64));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maize_porridge"), MAIZE_PORRIDGE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "atole"), ATOLE_MUG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "naan_bread"), NAAN_BREAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "naan_dough"), NAAN_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "beef_stew"), BEEF_STEW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rabbit_bigo"), SPICY_RABBIT_BIGO);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lamb_biryani"), LAMB_BIRYANI);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pork_stir_fry"), PORK_STIR_FRY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lamb_gyro"), LAMB_GYRO);
        //
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rice_item"), RICE_ITEM);
        //Fire Eel Stuffs
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_eel_item"), FIRE_EEL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "grilled_fire_eel_item"), GRILLED_FIRE_EEL_ITEM);
        //Bee/Honey Stuffs
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "honeycomb_chunk"), HONEYCOMB_CHUNK);
        //Drinks
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "milk_bottle"), MILK_BOTTLE);
        //Empty Jar
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jarpotion_base"), JARPOTION_BASE);
        //Jams
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_jam"), GLISTERING_JAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "berry_jam"), BERRY_JAR);
        //Spore Jars
        //Jar of Materials
        //Dried Seaweed/Kelp
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_seaweed"), DRIED_SEAWEED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_brown_kelp"), DRIED_BROWN_KELP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_orange_kelp"), DRIED_ORANGE_KELP);
        //Salt
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt"), SALT);
        //Fish
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_salmon"), DRIED_SALMON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_cod"), DRIED_COD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_tropical_fish"), DRIED_TROPICAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_fire_eel"), DRIED_FIRE_EEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_tropical_fish"), COOKED_TROPICAL);
        //new
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clownfish_salad"), CLOWN_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tomato_juice"), TOMATO_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "seaweed_salad"), SEAWEED_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cod_chowder"), COD_CHOWDER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bacon_and_eggs"), BACON_AND_EGGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_pumpkin_seeds"), COOKED_PUMPKIN_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "full_breakfast_vegetarian"), FULL_BREAKFAST_VEGETARIAN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "full_breakfast"), FULL_BREAKFAST);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chicken_curry"), CHICKEN_CURRY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chorus_wine"), CHORUS_WINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chorus_jam"), CHORUS_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spicy_berry_wine"), SPICY_BERRY_WINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_berry_wine"), SWEET_BERRY_WINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mug_empty"), MUG_EMPTY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mead_mug"), MEAD_MUG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_berry_cyser"), SWEET_BERRY_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spicy_berry_cyser"), SPICY_BERRY_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_berry_cyser"), BITTER_BERRY_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_cyser"), APPLE_CYSER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherwart_jam"), NETHER_WART_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spicy_berry_jam"), SPICY_BERRY_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "slime_jam"), SLIME_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "magma_jam"), MAGMA_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_berry_jam"), BITTER_BERRY_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_jam"), APPLE_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_dough"), PUMPKIN_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bread_dough"), BREAD_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salmon_roll"), SALMON_ROLL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cake_slice"), CAKE_SLICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cake_dough"), CAKE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cookie_dough"), COOKIE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rice_bowl"), RICE_BOWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tomato_soup"), TOMATO_SOUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bone_broth"), BONE_BROTH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_fungus_stew"), NETHER_FUNGUS_STEW);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bbox_empty"), BBOX_EMPTY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bbox_unagi"), BBOX_UNAGI);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bbox_clownfish"), BBOX_CLOWNFISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bbox_salmon"), BBOX_SALMON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_jar"), PUMPKIN_JAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_bowl"), PUMPKIN_BOWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_pie"), APPLE_PIE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_bitter_jam"), GLISTERING_BITTER_BERRY_JAM);
        //needs texture
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_spicy_jam"), GLISTERING_FIRE_BERRY_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_sweet_jam"), GLISTERING_SWEET_BERRY_JAM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carrot_salad"), CARROT_SALAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "baked_potato_special"), BAKED_POTATO_SPECIAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_dough"), APPLE_DOUGH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_juice"), APPLE_JUICE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_bacon"), COOKED_BACON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_bacon"), RAW_BACON);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_kabob"), GOLDEN_FRUIT_KABOB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fruit_kabob"), FRUIT_KABOB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_egg_bowl"), COOKED_EGG_BOWL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "raw_egg_bowl"), RAW_EGGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "faery_wine"), FAERY_WINE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "faery_mushroom_soup"), FAERY_SOUP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "faery_mead"), FAERY_MEAD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glistering_wart"), GLISTERING_WART);

    }
}
