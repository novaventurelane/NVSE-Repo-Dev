package com.novaventure.survivalessentials.registry.Blocks.Plants.Trees.Saplings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

//special thanks to TerraformersMC for their github, without which I'd be banging my head into a desk trying to understand how to do this *$%&ing shit. <3

public class ShiverpineSaplingBlock extends SESaplingBlock {

    public ShiverpineSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    public static final VoxelShape ShiverSaplingBlockShape;
    public static final VoxelShape ShiverSaplingBlockCollisionShape;

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return ShiverSaplingBlockShape;}

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return ShiverSaplingBlockCollisionShape;
    }

    static {
        ShiverSaplingBlockShape = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
        ShiverSaplingBlockCollisionShape = VoxelShapes.empty();
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return type == NavigationType.AIR && !this.collidable ? true : super.canPathfindThrough(state, world, pos, type);
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        Block block = floor.getBlock();
        return block == Blocks.GRASS_BLOCK ||
                block == Blocks.DIRT ||
                block == Blocks.COARSE_DIRT ||
                block == Blocks.PODZOL ||
                block == Blocks.FARMLAND ||
                block == Blocks.SNOW_BLOCK;
    }
}

