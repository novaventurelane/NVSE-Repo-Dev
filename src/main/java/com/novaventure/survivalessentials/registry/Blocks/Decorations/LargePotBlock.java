package com.novaventure.survivalessentials.registry.Blocks.Decorations;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class LargePotBlock extends MediumPotBlock {
    protected static final VoxelShape LARGE_SHAPE;

    static {
        LARGE_SHAPE = VoxelShapes.union(MEDIUM_SHAPE, Block.createCuboidShape(4, 11, 4, 12, 13, 12));
    }

    public LargePotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return LARGE_SHAPE;
    }
}

