package com.novaventure.survivalessentials.registry.Cooking.Jars;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import static com.novaventure.survivalessentials.registry.Initializers.FoodAndCooking.JARPOTION_BASE;
import static com.novaventure.survivalessentials.registry.Initializers.FoodAndCooking.MUG_EMPTY;

public class JamBase extends Item {
    public JamBase(Settings settings) {
        super(settings);
    }

    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity playerEntity = user instanceof PlayerEntity ? (PlayerEntity)user : null;
        if (playerEntity instanceof ServerPlayerEntity) {
            Criteria.CONSUME_ITEM.trigger((ServerPlayerEntity)playerEntity, stack);
        }

        if (!world.isClient) {
            user.clearStatusEffects();
        }

        if (playerEntity != null) {
            playerEntity.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!playerEntity.abilities.creativeMode) {
                stack.decrement(1);
            }
        }

        if (playerEntity == null || !playerEntity.abilities.creativeMode) {
            if (stack.isEmpty()) {
                return new ItemStack(JARPOTION_BASE);
            }

            if (playerEntity != null) {
                playerEntity.inventory.insertStack(new ItemStack(JARPOTION_BASE));
            }
        }

        return stack.isEmpty() ? new ItemStack(JARPOTION_BASE) : stack;
    }

    public int getMaxUseTime(ItemStack stack) {
        return 24;
    }

    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return ItemUsage.consumeHeldItem(world, user, hand);
    }
}