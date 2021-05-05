package com.novaventure.survivalessentials.registry.Features;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.SALT_ORE;

public class SaltOreFeature {
    public static ConfiguredFeature<?, ?> ORE_SALT_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    SALT_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    62))) // max y level
            .spreadHorizontally()
            .repeat(5); // number of veins per chunk
}