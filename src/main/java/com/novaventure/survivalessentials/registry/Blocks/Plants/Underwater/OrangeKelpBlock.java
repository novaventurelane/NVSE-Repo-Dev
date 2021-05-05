package com.novaventure.survivalessentials.registry.Blocks.Plants.Underwater;

import java.util.Random;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.ORANGE_KELP_PLANT;

public class OrangeKelpBlock extends AbstractPlantStemBlock implements FluidFillable {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D);

    public OrangeKelpBlock(Settings settings) {
        super(settings, Direction.UP, SHAPE, true, 0.14D);
    }

    protected boolean chooseStemState(BlockState state) {
        return state.isOf(Blocks.WATER);
    }

    public Block getPlant() {
        return ORANGE_KELP_PLANT;
    }

    protected boolean canAttachTo(Block block) {
        return block != Blocks.MAGMA_BLOCK;
    }

    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return false;
    }

    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return false;
    }

    protected int method_26376(Random random) { return 1; }

    public static final VoxelShape OrangeKelpPlantBlockShape;
    public static final VoxelShape OrangeKelpPlantBlockCollisionShape;

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return OrangeKelpPlantBlockShape;}

    public VoxelShape getCollisionShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return OrangeKelpPlantBlockCollisionShape;
    }

    static {
        OrangeKelpPlantBlockShape = Block.createCuboidShape(4.0D, 0.0D, 4.0D, 12.0D, 8.0D, 12.0D);
        OrangeKelpPlantBlockCollisionShape = VoxelShapes.empty();
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        FluidState fluidState = ctx.getWorld().getFluidState(ctx.getBlockPos());
        return fluidState.isIn(FluidTags.WATER) && fluidState.getLevel() == 8 ? super.getPlacementState(ctx) : null;
    }

    public FluidState getFluidState(BlockState state) {
        return Fluids.WATER.getStill(false);
    }
}
