package com.novaventure.survivalessentials.registry.Features;

import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.NETHER_SALT;

public class NetherSaltFeature {
    public static ConfiguredFeature<?, ?> ORE_SALT_NETHER = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_NETHER,
                    NETHER_SALT.getDefaultState(),
                    12)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0, // bottom offset
                    0, // min y level
                    64))) // max y level
            .spreadHorizontally()
            .repeat(15); // number of veins per chunk
}
