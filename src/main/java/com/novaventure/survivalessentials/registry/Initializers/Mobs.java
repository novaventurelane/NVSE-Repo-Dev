package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Blocks.Entity.CampfirePotBlockEntity;
import com.novaventure.survivalessentials.registry.Creatures.FireEel.FireEelEntity;
import com.novaventure.survivalessentials.registry.Creatures.Jellyfish.JellyfishEntity;
import com.novaventure.survivalessentials.registry.Creatures.RedstoneBug.RedstoneBugEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;
import static com.novaventure.survivalessentials.registry.Initializers.Blocks.CAMPFIRE_POT;

public class Mobs {
    public static BlockEntityType<CampfirePotBlockEntity> CAMPFIREPOTBLOCK_ENTITY;
    //entities
    public static final EntityType<JellyfishEntity> OVERWORLD_JELLYFISH = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(MOD_ID, "jellyfish_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, JellyfishEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static final EntityType<FireEelEntity> OVERWORLD_FIRE_EEL = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(MOD_ID, "fire_eel_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.WATER_CREATURE, FireEelEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static final EntityType<RedstoneBugEntity> OVERWORLD_REDSTONE_BUG = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(MOD_ID, "redstone_bug_entity"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RedstoneBugEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static void initialize() {
        //entities
        FabricDefaultAttributeRegistry.register(OVERWORLD_JELLYFISH, JellyfishEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.10000001192092896D));
        FabricDefaultAttributeRegistry.register(OVERWORLD_FIRE_EEL, FireEelEntity.createFishAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 8.0D).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0D));
        FabricDefaultAttributeRegistry.register(OVERWORLD_REDSTONE_BUG, RedstoneBugEntity.createHostileAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 3.0D).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.30000001192092896D).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0D));
        CAMPFIREPOTBLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "container.campfirepot", BlockEntityType.Builder.create(CampfirePotBlockEntity::new, CAMPFIRE_POT).build(null));

    }
}
