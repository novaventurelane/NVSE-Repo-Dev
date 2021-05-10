package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Features.BrownKelpFeature;
import com.novaventure.survivalessentials.registry.Features.OrangeKelpFeature;
import com.novaventure.survivalessentials.registry.Features.SEConfiguredFeatures;
import com.novaventure.survivalessentials.registry.Features.SeaweedFeature;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountNoiseBiasedDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;
import static com.novaventure.survivalessentials.registry.Features.NetherSaltFeature.ORE_SALT_NETHER;
import static com.novaventure.survivalessentials.registry.Features.SaltOreFeature.ORE_SALT_OVERWORLD;
import static com.novaventure.survivalessentials.registry.Initializers.Blocks.*;
import static net.minecraft.world.biome.BiomeKeys.*;

public class FeaturesInitializer {
    //features
    //faery mushroom gen
    //green mushroom gen
    //cerulean mushroom gen
    //seaweed gen
    private static final Feature<DefaultFeatureConfig> OVERWORLD_SEAWEED_KELP_FEATURE = new SeaweedFeature(DefaultFeatureConfig.CODEC);

    public static final ConfiguredFeature<?, ?> OVERWORLD_SEAWEED_FEATURE_CONFIGURED = OVERWORLD_SEAWEED_KELP_FEATURE.configure(FeatureConfig.DEFAULT)
            .decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP.spreadHorizontally())
            .decorate(Decorator.COUNT_NOISE_BIASED.configure(new CountNoiseBiasedDecoratorConfig(120, 80.0D, 0.0D)));

    //brown kelp gen
    private static final Feature<DefaultFeatureConfig> OVERWORLD_BROWN_KELP_FEATURE = new BrownKelpFeature(DefaultFeatureConfig.CODEC);

    public static final ConfiguredFeature<?, ?> OVERWORLD_BROWN_KELP_FEATURE_CONFIGURED = OVERWORLD_BROWN_KELP_FEATURE.configure(FeatureConfig.DEFAULT)
            .decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP.spreadHorizontally())
            .decorate(Decorator.COUNT_NOISE_BIASED.configure(new CountNoiseBiasedDecoratorConfig(80, 80.0D, 0.0D)));

    //orange kelp gen
    private static final Feature<DefaultFeatureConfig> OVERWORLD_ORANGE_KELP_FEATURE = new OrangeKelpFeature(DefaultFeatureConfig.CODEC);

    public static final ConfiguredFeature<?, ?> OVERWORLD_ORANGE_KELP_FEATURE_CONFIGURED = OVERWORLD_ORANGE_KELP_FEATURE.configure(FeatureConfig.DEFAULT)
            .decorate(ConfiguredFeatures.Decorators.TOP_SOLID_HEIGHTMAP.spreadHorizontally())
            .decorate(Decorator.COUNT_NOISE_BIASED.configure(new CountNoiseBiasedDecoratorConfig(80, 80.0D, 0.0D)));

    public static void initialize() {
        //Things That Burn
        FlammableBlockRegistry flammableBlockRegistry = FlammableBlockRegistry.getDefaultInstance();
        flammableBlockRegistry.add(APPLE_LEAVES, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_DOOR, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_FENCE, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_GATE, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_LEAVES, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_LOG, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_PLANKS, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_STRIPPED_LOG, 60, 100);
        flammableBlockRegistry.add(SHIVERPINE_TRAPDOOR, 60, 100);

        //trees
        SEConfiguredFeatures.registerConfiguredFeatures();

        //Feature Generation
        //apple tree gen
        RegistryKey<ConfiguredFeature<?, ?>> scatteredappletreeFeatureOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "scattered_apple_trees"));
        //noinspection deprecation
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(PLAINS), GenerationStep.Feature.TOP_LAYER_MODIFICATION,
                scatteredappletreeFeatureOverworld);
        //shiverpine tree gen
        RegistryKey<ConfiguredFeature<?, ?>> scatteredshiverpinetreeFeatureOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "scattered_shiverpine_trees"));
        //noinspection deprecation
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(SNOWY_TUNDRA, ICE_SPIKES, FROZEN_OCEAN, DEEP_FROZEN_OCEAN, FROZEN_RIVER), GenerationStep.Feature.TOP_LAYER_MODIFICATION,
                scatteredshiverpinetreeFeatureOverworld);
        //faery mushroom gen
        //green mushroom gen
        //new brown kelp gen
        RegistryKey<ConfiguredFeature<?, ?>> brownkelpFeatureOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "overworld_brown_kelp_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, brownkelpFeatureOverworld.getValue(), OVERWORLD_BROWN_KELP_FEATURE_CONFIGURED);
        //noinspection deprecation
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(SWAMP, SWAMP_HILLS, JUNGLE, JUNGLE_HILLS, BAMBOO_JUNGLE_HILLS, BAMBOO_JUNGLE, MUSHROOM_FIELDS, MUSHROOM_FIELD_SHORE), GenerationStep.Feature.TOP_LAYER_MODIFICATION, brownkelpFeatureOverworld);
        Registry.register(Registry.FEATURE, new Identifier(MOD_ID, "overworld_brown_kelp_feature"), OVERWORLD_BROWN_KELP_FEATURE);
        //new seaweed gen
        RegistryKey<ConfiguredFeature<?, ?>> seaweedkelpFeatureOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "overworld_seaweed_kelp_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, seaweedkelpFeatureOverworld.getValue(), OVERWORLD_SEAWEED_FEATURE_CONFIGURED);
        //noinspection deprecation
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(FROZEN_OCEAN, DEEP_FROZEN_OCEAN, COLD_OCEAN, DEEP_COLD_OCEAN, SNOWY_BEACH, STONE_SHORE, OCEAN, DEEP_OCEAN, BEACH), GenerationStep.Feature.VEGETAL_DECORATION, seaweedkelpFeatureOverworld);
        Registry.register(Registry.FEATURE, new Identifier(MOD_ID, "overworld_seaweed_kelp_feature"), OVERWORLD_SEAWEED_KELP_FEATURE);
        //new orange kelp gen
        RegistryKey<ConfiguredFeature<?, ?>> orangekelpFeatureOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "overworld_orange_kelp_feature"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orangekelpFeatureOverworld.getValue(), OVERWORLD_ORANGE_KELP_FEATURE_CONFIGURED);
        //noinspection deprecation
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(DEEP_OCEAN, OCEAN, BEACH, STONE_SHORE), GenerationStep.Feature.TOP_LAYER_MODIFICATION, brownkelpFeatureOverworld);
        Registry.register(Registry.FEATURE, new Identifier(MOD_ID, "overworld_orange_kelp_feature"), OVERWORLD_ORANGE_KELP_FEATURE);
        //new salt ore gen
        RegistryKey<ConfiguredFeature<?, ?>> oreSaltOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "ore_salt_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltOverworld.getValue(), ORE_SALT_OVERWORLD);
        //noinspection deprecation
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(DESERT, DESERT_LAKES, DESERT_HILLS, MODIFIED_BADLANDS_PLATEAU, MODIFIED_WOODED_BADLANDS_PLATEAU, BADLANDS_PLATEAU, BADLANDS, SHATTERED_SAVANNA, SHATTERED_SAVANNA_PLATEAU, ERODED_BADLANDS, SAVANNA, SAVANNA_PLATEAU), GenerationStep.Feature.UNDERGROUND_ORES, oreSaltOverworld);

        //new nether salt ore gen
        RegistryKey<ConfiguredFeature<?, ?>> oreSaltNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "ore_salt_nether"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSaltNether.getValue(), ORE_SALT_NETHER);
        //noinspection deprecation
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(NETHER_WASTES, SOUL_SAND_VALLEY), GenerationStep.Feature.UNDERGROUND_ORES, oreSaltNether);

    }
}
