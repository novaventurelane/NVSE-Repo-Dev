package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.WeaponsAndTools.BattleAxes.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.BattleHammers.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Cleavers.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Cutlasses.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Daggers.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.FlintTools.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.GreatAxes.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Hatchets.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Knives.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Machetes.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Rapiers.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Sickles.*;
import com.novaventure.survivalessentials.registry.WeaponsAndTools.Spears.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;

public class WeaponsAndTools {

    public static void initialize() {
        //Flint Tools
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_axe"), new FlintBaseAxe(new FlintToolMaterialAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_pickaxe"), new FlintBasePickaxe(new FlintToolMaterialPickaxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_hoe"), new FlintBaseHoe(new FlintToolMaterialHoe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_sword"), new FlintBaseSword(new FlintToolMaterialSword()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_shovel"), new FlintBaseShovel(new FlintToolMaterialShovel()));
        //Knives
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_knife"), new FlintKnifeBase(new FlintToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_knife"), new StoneKnifeBase(new StoneToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_knife"), new GoldKnifeBase(new GoldenToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_knife"), new IronKnifeBase(new IronToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_knife"), new DiamondKnifeBase(new DiamondToolMaterialKnife()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_knife"), new NetheriteKnifeBase(new NetheriteToolMaterialKnife()));
        //Cutlasses
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_cutlass"), new FlintCutlassBase(new FlintToolMaterialCutlass()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_cutlass"), new StoneCutlassBase(new StoneToolMaterialCutlass()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_cutlass"), new GoldCutlassBase(new GoldToolMaterialCutlass()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_cutlass"), new IronCutlassBase(new IronToolMaterialCutlass()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_cutlass"), new DiamondCutlassBase(new DiamondToolMaterialCutlass()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_cutlass"), new NetheriteCutlassBase(new NetheriteToolMaterialCutlass()));
        //Spears
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_spear"), new FlintSpearBase(new FlintToolMaterialSpear()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_spear"), new StoneSpearBase(new StoneToolMaterialSpear()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_spear"), new GoldSpearBase(new GoldenToolMaterialSpear()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_spear"), new IronSpearBase(new IronToolMaterialSpear()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_spear"), new DiamondSpearBase(new DiamondToolMaterialSpear()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_spear"), new NetheriteSpearBase(new NetheriteToolMaterialSpear()));
        //Sickles
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_sickle"), new FlintSickleBase(new FlintToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_sickle"), new StoneSickleBase(new StoneToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_sickle"), new GoldSickleBase(new GoldenToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_sickle"), new IronSickleBase(new IronToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_sickle"), new DiamondSickleBase(new DiamondToolMaterialSickle()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_sickle"), new NetheriteSickleBase(new NetheriteToolMaterialSickle()));
        //Dwarven Battle Axes
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_battle_axe"), new FlintBattleAxeBase(new FlintToolMaterialBattleAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_battle_axe"), new StoneBattleAxeBase(new StoneToolMaterialBattleAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_battle_axe"), new GoldBattleAxeBase(new GoldToolMaterialBattleAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_battle_axe"), new IronBattleAxeBase(new IronToolMaterialBattleAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_battle_axe"), new DiamondBattleAxeBase(new DiamondToolMaterialBattleAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_battle_axe"), new NetheriteBattleAxeBase(new NetheriteToolMaterialBattleAxe()));
        //Battle Hammers
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_battle_hammer"), new FlintBattleHammerBase(new FlintToolMaterialBattleHammer()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_battle_hammer"), new StoneBattleHammerBase(new StoneToolMaterialBattleHammer()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_battle_hammer"), new GoldBattleHammerBase(new GoldToolMaterialBattleHammer()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_battle_hammer"), new IronBattleHammerBase(new IronToolMaterialBattleHammer()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_battle_hammer"), new DiamondBattleHammerBase(new DiamondToolMaterialBattleHammer()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_battle_hammer"), new NetheriteBattleHammerBase(new NetheriteToolMaterialBattleHammer()));
        //Cleavers
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_cleaver"), new FlintCleaverBase(new FlintToolMaterialCleaver()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_cleaver"), new StoneCleaverBase(new StoneToolMaterialCleaver()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_cleaver"), new GoldenCleaverBase(new GoldenToolMaterialCleaver()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_cleaver"), new IronCleaverBase(new IronToolMaterialCleaver()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_cleaver"), new DiamondCleaverBase(new DiamondToolMaterialCleaver()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_cleaver"), new NetheriteCleaverBase(new NetheriteToolMaterialCleaver()));
        //Daggers
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_dagger"), new FlintDaggerBase(new FlintToolMaterialDagger()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_dagger"), new StoneDaggerBase(new StoneToolMaterialDagger()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_dagger"), new GoldenDaggerBase(new GoldenToolMaterialDagger()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_dagger"), new IronDaggerBase(new IronToolMaterialDagger()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_dagger"), new DiamondDaggerBase(new DiamondToolMaterialDagger()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_dagger"), new NetheriteDaggerBase(new NetheriteToolMaterialDagger()));
        //Hatchets
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_hatchet"), new FlintHatchetBase(new FlintToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_hatchet"), new StoneHatchetBase(new StoneToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_hatchet"), new GoldHatchetBase(new GoldenToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_hatchet"), new IronHatchetBase(new IronToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_hatchet"), new DiamondHatchetBase(new DiamondToolMaterialHatchet()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_hatchet"), new NetheriteHatchetBase(new NetheriteToolMaterialHatchet()));
        //GreatAxes
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_great_axe"), new FlintGreatAxeBase(new FlintToolMaterialGreatAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_great_axe"), new StoneGreatAxeBase(new StoneToolMaterialGreatAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_great_axe"), new GoldGreatAxeBase(new GoldToolMaterialGreatAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_great_axe"), new IronGreatAxeBase(new IronToolMaterialGreatAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_great_axe"), new DiamondGreatAxeBase(new DiamondToolMaterialGreatAxe()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_great_axe"), new NetheriteGreatAxeBase(new NetheriteToolMaterialGreatAxe()));
        //Legendaries
        //Machetes
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_machete"), new FlintMacheteBase(new FlintToolMaterialMachete()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_machete"), new StoneMacheteBase(new StoneToolMaterialMachete()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_machete"), new GoldMacheteBase(new GoldToolMaterialMachete()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_machete"), new IronMacheteBase(new IronToolMaterialMachete()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_machete"), new DiamondMacheteBase(new DiamondToolMaterialMachete()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_machete"), new NetheriteMacheteBase(new NetheriteToolMaterialMachete()));
        //Rapiers
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flint_rapier"), new FlintRapierBase(new FlintToolMaterialRapier()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_rapier"), new StoneRapierBase(new StoneToolMaterialRapier()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_rapier"), new GoldRapierBase(new GoldToolMaterialRapier()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_rapier"), new IronRapierBase(new IronToolMaterialRapier()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_rapier"), new DiamondRapierBase(new DiamondToolMaterialRapier()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_rapier"), new NetheriteRapierBase(new NetheriteToolMaterialRapier()));
    }
}
