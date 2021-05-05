package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Creatures.Faeries.Jars.FaeryJarBase;
import com.novaventure.survivalessentials.registry.Misc.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.*;
import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.*;

public class MiscItems {
    public static final Item AMBER_ITEM = new AmberItemBase(new Item.Settings().group(MISC_GROUP));
    public static final Item ARROW_BUNDLE = new ArrowBundleBase(new Item.Settings().group(MISC_GROUP).rarity(Rarity.UNCOMMON));
    public static final Item IGUSA_BUNDLE = new IgusaBundleBase(new Item.Settings().group(MISC_GROUP));
    public static final Item TATAMI_ITEM = new TatamiItemBase(new Item.Settings().group(MISC_GROUP));
    public static final Item JAR_BLUE_FAERY = new FaeryJarBase(new Item.Settings().group(MISC_GROUP).food(new FoodComponent.Builder().saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,60), 1.0f).build()).rarity(Rarity.RARE).maxCount(1));
    public static final Item JAR_PINK_FAERY = new FaeryJarBase(new Item.Settings().group(MISC_GROUP).food(new FoodComponent.Builder().saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120), 1.0f).build()).rarity(Rarity.RARE).maxCount(1));
    public static final Item JAR_GREEN_FAERY = new FaeryJarBase(new Item.Settings().group(MISC_GROUP).food(new FoodComponent.Builder().saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,600), 1.0f).build()).rarity(Rarity.RARE).maxCount(1));
    public static final Item JAR_PURPLE_FAERY = new FaeryJarBase(new Item.Settings().group(MISC_GROUP).food(new FoodComponent.Builder().saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,1200), 1.0f).build()).rarity(Rarity.RARE).maxCount(1));
    public static final Item JAR_RED_FAERY = new FaeryJarBase(new Item.Settings().group(MISC_GROUP).food(new FoodComponent.Builder().saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 1.0f).build()).rarity(Rarity.RARE).maxCount(1));
    public static final Item JAR_YELLOW_FAERY = new FaeryJarBase(new Item.Settings().group(MISC_GROUP).food(new FoodComponent.Builder().saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK,600), 1.0f).build()).rarity(Rarity.RARE).maxCount(1));
    public static final Item LINGERING_POWDER = new LingeringItemBase(new Item.Settings().group(MISC_GROUP).rarity(Rarity.UNCOMMON).maxCount(16));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amber"), AMBER_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lingering_powder"), LINGERING_POWDER);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "arrow_bundle"), ARROW_BUNDLE);
        //Faery Jars
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blue_faery_jar"), JAR_BLUE_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pink_faery_jar"), JAR_PINK_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_faery_jar"), JAR_GREEN_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "purple_faery_jar"), JAR_PURPLE_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_faery_jar"), JAR_RED_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "yellow_faery_jar"), JAR_YELLOW_FAERY);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "igusa_bundle"), IGUSA_BUNDLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tatami_item"), TATAMI_ITEM);
        //fix in 1.1.0 or 1.2.0:
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_eel_bucket"), FIRE_EEL_BUCKET);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fire_eel_spawn_egg"), FIRE_EEL_SPAWN_EGG);
    }
}
