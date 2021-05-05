package com.novaventure.survivalessentials.registry.Features;

import com.mojang.serialization.Codec;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Underwater.BrownKelpBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

import java.util.Random;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.ORANGE_KELP;
import static com.novaventure.survivalessentials.registry.Initializers.Blocks.ORANGE_KELP_PLANT;

public class OrangeKelpFeature extends Feature<DefaultFeatureConfig> {
    public OrangeKelpFeature(Codec<DefaultFeatureConfig> config) {
        super(config);
    }

    @Override
    public boolean generate(StructureWorldAccess structureWorldAccess, ChunkGenerator chunkGenerator, Random random, BlockPos blockPos, DefaultFeatureConfig defaultFeatureConfig) {
        int i = 0;
        int j = structureWorldAccess.getTopY(Heightmap.Type.OCEAN_FLOOR, blockPos.getX(), blockPos.getZ());
        BlockPos blockPos2 = new BlockPos(blockPos.getX(), j, blockPos.getZ());
        if (structureWorldAccess.getBlockState(blockPos2).isOf(Blocks.WATER)) {
            BlockState blockState = ORANGE_KELP.getDefaultState();
            BlockState blockState2 = ORANGE_KELP_PLANT.getDefaultState();
            int k = 1 + random.nextInt(10);

            for(int l = 0; l <= k; ++l) {
                if (structureWorldAccess.getBlockState(blockPos2).isOf(Blocks.WATER) && structureWorldAccess.getBlockState(blockPos2.up()).isOf(Blocks.WATER) && blockState2.canPlaceAt(structureWorldAccess, blockPos2)) {
                    if (l == k) {
                        structureWorldAccess.setBlockState(blockPos2, (BlockState)blockState.with(BrownKelpBlock.AGE, random.nextInt(4) + 20), 2);
                        ++i;
                    } else {
                        structureWorldAccess.setBlockState(blockPos2, blockState2, 2);
                    }
                } else if (l > 0) {
                    BlockPos blockPos3 = blockPos2.down();
                    if (blockState.canPlaceAt(structureWorldAccess, blockPos3) && !structureWorldAccess.getBlockState(blockPos3.down()).isOf(ORANGE_KELP)) {
                        structureWorldAccess.setBlockState(blockPos3, (BlockState)blockState.with(BrownKelpBlock.AGE, random.nextInt(4) + 20), 2);
                        ++i;
                    }
                    break;
                }

                blockPos2 = blockPos2.up();
            }
        }

        return i > 0;
    }
}