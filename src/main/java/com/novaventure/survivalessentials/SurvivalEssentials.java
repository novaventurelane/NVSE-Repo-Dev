package com.novaventure.survivalessentials;

import com.novaventure.survivalessentials.registry.Initializers.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.container.ContainerProviderRegistry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.novaventure.survivalessentials.registry.Initializers.Blocks.ICEBOX_BLOCK;

public class SurvivalEssentials implements ModInitializer {

    public static final String MOD_ID = "novesues";

    @Override
    public void onInitialize() {
        //Initializers
        WeaponsAndTools.initialize();
        Mobs.initialize();
        Blocks.initialize();
        FoodAndCooking.initialize();
        MiscItems.initialize();
        ItemGroups.initialize();
        FeaturesInitializer.initialize();
        ModFluidsInitializer.initialize();
        ArmorItems.initialize();
        //Tells you if this shit actually worked
        System.out.println("The main mod initialization sections initialized fine™️.");
    }
}