package com.novaventure.survivalessentials.registry.Blocks.Decorations;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TallPotBlock extends LargePotBlock {
    private static final VoxelShape TALL_SHAPE;

    static {
        TALL_SHAPE = VoxelShapes.union(LARGE_SHAPE, Block.createCuboidShape(4, 13, 4, 12, 16, 12));
    }

    public TallPotBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return TALL_SHAPE;
    }
}

