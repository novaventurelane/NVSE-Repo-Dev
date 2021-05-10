package com.novaventure.survivalessentials.registry.Features.Generators;

import com.novaventure.survivalessentials.registry.Features.SEConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class AppleSaplingGenerator extends SaplingGenerator {
    public AppleSaplingGenerator() {

    }

    @Nullable
    protected ConfiguredFeature<TreeFeatureConfig, ?> createTreeFeature(Random random, boolean bl) {
        return (ConfiguredFeature<TreeFeatureConfig, ?>) SEConfiguredFeatures.APPLE_TREE_OVERWORLD;
    }
}
