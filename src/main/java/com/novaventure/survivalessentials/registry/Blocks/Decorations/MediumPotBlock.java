package com.novaventure.survivalessentials.registry.Blocks.Decorations;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class MediumPotBlock extends SmallPotBlock {
    protected static final VoxelShape MEDIUM_SHAPE;

    static {
        MEDIUM_SHAPE = VoxelShapes.union(SHAPE, Block.createCuboidShape(4, 9, 4, 12, 11, 12));
    }

    public MediumPotBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return MEDIUM_SHAPE;
    }
}

