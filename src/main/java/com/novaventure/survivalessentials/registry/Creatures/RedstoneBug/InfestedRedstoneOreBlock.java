package com.novaventure.survivalessentials.registry.Creatures.RedstoneBug;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

import java.util.Random;

import static com.novaventure.survivalessentials.registry.Initializers.Mobs.OVERWORLD_REDSTONE_BUG;

public class InfestedRedstoneOreBlock extends Block {

    public InfestedRedstoneOreBlock(Settings settings) {
        super(settings);
    }

    private void spawnRedstonefish(ServerWorld serverWorld, BlockPos pos) {
        RedstoneBugEntity redstoneBugEntity = (RedstoneBugEntity) OVERWORLD_REDSTONE_BUG.create(serverWorld);
        redstoneBugEntity.refreshPositionAndAngles((double)pos.getX() + 0.5D, (double)pos.getY(),
                (double)pos.getZ() + 0.5D, 0.0F, 0.0F);
        serverWorld.spawnEntity(redstoneBugEntity);
        redstoneBugEntity.playSpawnEffects();
    }

    public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
        super.onStacksDropped(state, world, pos, stack);
        if (world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            this.spawnRedstonefish(world, pos);
        }

    }

    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {
        if (world instanceof ServerWorld) {
            this.spawnRedstonefish((ServerWorld)world, pos);
        }

    }

    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!world.isClient && player.isCreative() && world.getGameRules().getBoolean(GameRules.DO_TILE_DROPS)) {
            this.spawnRedstonefish((ServerWorld)world, pos);
        }

        super.onBreak(world, pos, state, player);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        spawnParticles(world, pos);
    }

    private static void spawnParticles(World world, BlockPos pos) {
        double d = 0.5625D;
        Random random = world.random;
        Direction[] var5 = Direction.values();
        int var6 = var5.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Direction direction = var5[var7];
            BlockPos blockPos = pos.offset(direction);
            if (!world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos)) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5D + 0.5625D * (double)direction.getOffsetX() : (double)random.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5D + 0.5625D * (double)direction.getOffsetY() : (double)random.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5D + 0.5625D * (double)direction.getOffsetZ() : (double)random.nextFloat();
                world.addParticle(DustParticleEffect.RED, (double)pos.getX() + e, (double)pos.getY() + f, (double)pos.getZ() + g, 0.0D, 0.0D, 0.0D);
            }
        }

    }
}
