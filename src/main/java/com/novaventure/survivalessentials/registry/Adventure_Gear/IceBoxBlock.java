package com.novaventure.survivalessentials.registry.Adventure_Gear;

import com.novaventure.survivalessentials.registry.Blocks.Entity.CampfirePotBlockEntity;
import com.novaventure.survivalessentials.registry.Blocks.Entity.IceBoxBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.BedPart;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import java.util.Random;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.ICEBOX_BLOCK;

public class IceBoxBlock extends BlockWithEntity {
    public static final DirectionProperty FACING;
    public static final BooleanProperty IS_BOTTOM;

    public IceBoxBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(IS_BOTTOM, true));
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, IS_BOTTOM);
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        Direction direction = ctx.getPlayerFacing();
        BlockPos blockPos = ctx.getBlockPos();
        BlockPos blockPos2 = blockPos.offset(Direction.UP);
        return ctx.getWorld().getBlockState(blockPos2).canReplace(ctx) ? this.getDefaultState().with(FACING, direction) : null;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    public BlockEntity createBlockEntity(BlockView view) {
        return new IceBoxBlockEntity();
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {

        if (!world.isClient && state.get(IS_BOTTOM)) {
            world.setBlockState(pos.up(), state.with(IS_BOTTOM, false), 3);
            world.updateNeighbors(pos, Blocks.AIR);
            state.updateNeighbors(world, pos, 3);
        }
        if (itemStack.hasCustomName()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof IceBoxBlockEntity) {
                ((IceBoxBlockEntity)blockEntity).setCustomName(itemStack.getName());
            }
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        } else {
            BlockPos mainPos = pos;
            if (!state.get(IS_BOTTOM)) {
                mainPos = pos.down();
            }
            BlockEntity blockEntity = world.getBlockEntity(mainPos);
            if (blockEntity instanceof IceBoxBlockEntity) {
                player.openHandledScreen((NamedScreenHandlerFactory) blockEntity);
            }
            return ActionResult.CONSUME;
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState newState, WorldAccess world, BlockPos pos, BlockPos posFrom) {
        if (state.get(IS_BOTTOM) ? direction == Direction.UP : direction == Direction.DOWN) {
            return newState.isOf(this) && newState.get(IS_BOTTOM) != state.get(IS_BOTTOM) ? state : Blocks.AIR.getDefaultState();
        } else {
            return super.getStateForNeighborUpdate(state, direction, newState, world, pos, posFrom);
        }
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockPos mainPos = pos;
            if (!state.get(IS_BOTTOM)) {
                mainPos = pos.down();
            }
            BlockEntity blockEntity = world.getBlockEntity(mainPos);
            if (blockEntity instanceof IceBoxBlockEntity) {
                ItemScatterer.spawn(world, mainPos, (IceBoxBlockEntity)blockEntity);
                // update comparators
                world.updateComparators(mainPos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && player.isCreative()) {
            if (state.get(IS_BOTTOM)) {
                BlockPos blockPos = pos.up();
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.getBlock() == this && !blockState.get(IS_BOTTOM)) {
                    world.setBlockState(blockPos, Blocks.AIR.getDefaultState(), 35);
                    world.syncWorldEvent(player, 2001, blockPos, Block.getRawIdFromState(blockState));
                }
            }
        }

        super.onBreak(world, pos, state, player);
    }

    @Override
    public boolean hasComparatorOutput(BlockState state) {
        return false;
    }

    static {
        FACING = Properties.HORIZONTAL_FACING;
        IS_BOTTOM = BooleanProperty.of("bottom");
    }
}
