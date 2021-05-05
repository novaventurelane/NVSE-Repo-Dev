package com.novaventure.survivalessentials.registry.Adventure_Gear;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.Random;

public class FaeryLanternBlock extends LanternBlock {
    private static final DustParticleEffect FAERY_DUST;

    public FaeryLanternBlock(Settings settings) {
        super(settings);
    }

    @Environment(EnvType.CLIENT)
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        for (Direction direction : Direction.values()) {
            BlockPos blockPos = pos.offset(direction);
            if (!world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos) && random.nextBoolean()) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5D + 0.5625D * (double) direction.getOffsetX() : (double) random.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5D + 0.5625D * (double) direction.getOffsetY() : (double) random.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5D + 0.5625D * (double) direction.getOffsetZ() : (double) random.nextFloat();
                world.addParticle(FAERY_DUST, pos.getX() + e, pos.getY() + f, pos.getZ() + g, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    static {
        FAERY_DUST = new DustParticleEffect(1.0F, 1.0F, 0.0F, 0.5F);
    }
}
