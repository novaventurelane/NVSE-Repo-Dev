package com.novaventure.survivalessentials;

import com.novaventure.survivalessentials.registry.Initializers.*;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SurvivalEssentials implements ModInitializer {

    public static final String MOD_ID = "novesues";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

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
        LOGGER.info("The main mod initialization sections initialized fine™️.");
    }
}