package com.novaventure.survivalessentials.registry.Blocks.Entity;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import static com.novaventure.survivalessentials.registry.Initializers.Mobs.CAMPFIREPOTBLOCK_ENTITY;

public class CampfirePotBlockEntity extends AbstractFurnaceBlockEntity {
    public CampfirePotBlockEntity() {
        super(CAMPFIREPOTBLOCK_ENTITY, RecipeType.CAMPFIRE_COOKING);
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText("container.campfirepot");
    }

    protected int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel);
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SmokerScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}