package com.novaventure.survivalessentials.registry.WeaponsAndTools.Spears;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WoodToolMaterialSpear implements ToolMaterial {
    @Override
    public int getDurability() {
        //Wood: 59
        //Flint: 95
        //Stone: 131
        //Iron: 250
        //Golden: 32
        //Diamond: 1561
        //Netherite: 2031
        return 59;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        //Nothing: 1.0f
        //Wood: 2.0f
        //Flint: 3.0f
        //Stone: 4.0f
        //Iron: 6.0f
        //Diamond: 8.0f
        //Netherite: 10.0f
        //Gold: 12.0f
        return 2.0f;
    }

    @Override
    public float getAttackDamage() {
        //Wood: 0.0f
        //Flint: 0.5f
        //Stone: 1.0f
        //Iron: 2.0f
        //Diamond: 3.0f
        //Gold: 0.0f
        //Netherite: 4.0f?
        return 0.0f;
    }

    @Override
    public int getMiningLevel() {
        //Wood: 0
        //Flint: 1
        //Stone: 1
        //Iron: 2
        //Diamond: 3
        //Gold: 0
        //Netherite: 3
        return 0;
    }

    @Override
    public int getEnchantability() {
        //Wood: 15
        //Flint: 10
        //Stone: 5
        //Iron: 14
        //Diamond: 10
        //Gold: 22
        //Netherite: ??
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.OAK_WOOD,Items.ACACIA_WOOD,Items.SPRUCE_WOOD,Items.BIRCH_WOOD,Items.JUNGLE_WOOD,Items.DARK_OAK_WOOD,Items.CRIMSON_PLANKS,Items.WARPED_PLANKS);
    }
}
