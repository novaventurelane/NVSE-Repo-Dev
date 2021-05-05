package com.novaventure.survivalessentials.registry.Creatures.FireEel;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.SchoolingFishEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class FireEelEntity extends SchoolingFishEntity {
    public FireEelEntity(EntityType<? extends FireEelEntity> entityType, World world) {super(entityType, world);}

    public int getMaxGroupSize() {return 1;}

    //fix in 1.1.0 or 1.2.0
    public ItemStack getFishBucketItem() {
        return new ItemStack(Items.WATER_BUCKET);}

    public SoundEvent getAmbientSound() {return SoundEvents.ENTITY_SALMON_AMBIENT; }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SALMON_DEATH;
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SALMON_HURT;
    }

    protected SoundEvent getFlopSound() { return SoundEvents.ENTITY_SALMON_FLOP; }

    public static DefaultAttributeContainer.Builder createFireEelAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 3.0D);
    }
}
