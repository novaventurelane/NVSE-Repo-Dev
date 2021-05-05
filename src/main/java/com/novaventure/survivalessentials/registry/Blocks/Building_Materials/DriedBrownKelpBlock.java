package com.novaventure.survivalessentials.registry.Blocks.Building_Materials;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class DriedBrownKelpBlock extends Block {

    public DriedBrownKelpBlock() {
        super(FabricBlockSettings.of(Material.LEAVES)
                .breakByHand(true)
                .sounds(BlockSoundGroup.GRASS)
                .strength(0.5f, 0.5f));
    }
}
