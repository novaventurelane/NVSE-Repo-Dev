package com.novaventure.survivalessentials.registry.Blocks.Plants.Underwater;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.ORANGE_KELP;

public class OrangeKelpPlantBlock extends AbstractPlantBlock implements FluidFillable {
    public OrangeKelpPlantBlock(Settings settings) {
        super(settings, Direction.UP, VoxelShapes.fullCube(), true);
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ORANGE_KELP;
    }

    public FluidState getFluidState(BlockState state) {
        return Fluids.WATER.getStill(false);
    }

    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return false;
    }

    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return false;
    }

    public static final VoxelShape OrangeKelpPlantBlockShape;
    public static final VoxelShape OrangeKelpPlantBlockCollisionShape;

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return OrangeKelpPlantBlockShape;}

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return OrangeKelpPlantBlockCollisionShape;
    }

    static {
        OrangeKelpPlantBlockShape = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 16.0D, 12.0D);
        OrangeKelpPlantBlockCollisionShape = VoxelShapes.empty();
    }
}
