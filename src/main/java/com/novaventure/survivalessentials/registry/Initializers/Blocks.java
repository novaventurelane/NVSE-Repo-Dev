package com.novaventure.survivalessentials.registry.Initializers;

import com.novaventure.survivalessentials.registry.Adventure_Gear.*;
import com.novaventure.survivalessentials.registry.Blocks.Building_Materials.*;
import com.novaventure.survivalessentials.registry.Blocks.Decorations.*;
import com.novaventure.survivalessentials.registry.Blocks.Entity.IceBoxBlockEntity;
import com.novaventure.survivalessentials.registry.Blocks.Entity.IceBoxScreenHandler;
import com.novaventure.survivalessentials.registry.Blocks.Fossils.*;
import com.novaventure.survivalessentials.registry.Blocks.Minerals.AmberOreBlock;
import com.novaventure.survivalessentials.registry.Blocks.Minerals.NetherCoalOreBlock;
import com.novaventure.survivalessentials.registry.Blocks.Minerals.NetherSaltBlock;
import com.novaventure.survivalessentials.registry.Blocks.Minerals.SaltOreBlock;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Bushes.*;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Crops.IgusaCropBlock;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Crops.MaizeCropBlock;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Crops.RiceCropBlock;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Decorative.Nether.DamagingPlantBase;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Decorative.Nether.ShelfFungiBase;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Trees.AppleLeavesBlock;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Trees.Saplings.SESaplingBlock;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Trees.ShiverpineLeavesBlock;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Underground.FaeryMushroomBase;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Underground.GreenMushroomBase;
import com.novaventure.survivalessentials.registry.Blocks.Plants.Underwater.*;
import com.novaventure.survivalessentials.registry.Creatures.RedstoneBug.InfestedRedstoneOreBlock;
import com.novaventure.survivalessentials.registry.Features.Generators.AppleSaplingGenerator;
import com.novaventure.survivalessentials.registry.Features.Generators.ShiverpineSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.novaventure.survivalessentials.SurvivalEssentials.MOD_ID;
import static com.novaventure.survivalessentials.registry.Initializers.ItemGroups.*;
import static net.minecraft.block.Blocks.CHEST;

public class Blocks {
    public static final Block ANCHOR_BLOCK = new AnchorBlock(FabricBlockSettings.of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES)
            .breakByHand(false)
            .sounds(BlockSoundGroup.METAL)
            .strength(2.5f, 2.5f));
    //apple tree blocks
    public static final Block APPLE_LEAVES = new AppleLeavesBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.2f, 0.6f));

    public static final Block SHIVERPINE_LEAVES = new ShiverpineLeavesBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.2f, 0.6f));

    public static final SESaplingBlock APPLE_SAPLING = new SESaplingBlock(new AppleSaplingGenerator(), AbstractBlock.Settings.of(Material.PLANT)
            .ticksRandomly().nonOpaque().noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS));

    public static final SESaplingBlock SHIVERPINE_SAPLING = new SESaplingBlock(new ShiverpineSaplingGenerator(), AbstractBlock.Settings.of(Material.PLANT)
            .ticksRandomly().nonOpaque().noCollision().ticksRandomly().breakInstantly()
            .sounds(BlockSoundGroup.GRASS));

    //bushes
    public static final Block BITTER_BERRY_BUSH = new BitterBerryBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block SPICY_BERRY_BUSH = new SpicyBerryBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.NETHER_WART)
            .strength(0,0.1f).luminance(5));

    public static final Block TOMATO_BUSH = new TomatoBushBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block LETTUCE = new LettuceBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block TUMBLE_WEED = new TumbleWeedBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));
    //crops

    public static final Block RICE_SEEDLINGS = new RiceCropBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block IGUSA_SEEDS = new IgusaCropBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    public static final Block MAIZE_CROP = new MaizeCropBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    //mushrooms
    public static final Block FAERY_MUSHROOM = new FaeryMushroomBase(FabricBlockSettings.of(Material.PLANT)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.2f, 1.0f).luminance(7));

    public static final Block GREEN_MUSHROOM = new GreenMushroomBase(FabricBlockSettings.of(Material.PLANT)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.2f, 1.0f));

    public static final Block CERULEAN_FUNGUS = new GreenMushroomBase(FabricBlockSettings.of(Material.PLANT)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.2f, 1.0f).luminance(3));

    //brown kelp
    public static final Block BROWN_KELP = new BrownKelpBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0, 0.1f));

    public static final Block BROWN_KELP_PLANT = new BrownKelpPlantBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0,0.1f));

    //seaweed
    public static final Block SEAWEED = new SeaweedBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WET_GRASS)
            .strength(0, 0.1f));
    public static final Block SEAWEED_PLANT = new SeaweedPlantBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WET_GRASS)
            .strength(0,0.1f));

    //orange kelp
    public static final Block ORANGE_KELP = new OrangeKelpBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WET_GRASS)
            .strength(0, 0.1f));
    public static final Block ORANGE_KELP_PLANT = new OrangeKelpPlantBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WET_GRASS)
            .strength(0,0.1f));

    //red seagrass
    public static final Block RED_SEAGRASS = new RedSeagrassBlock(FabricBlockSettings.of(Material.LEAVES).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WET_GRASS)
            .strength(0, 0.1f));

    //rope
    public static final Block CLIMBABLE_ROPE = new ClimbableRopeBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.NETHER_STEM)
            .strength(0,0.1f));

    //lanterns
    public static final Block FAERY_LANTERN = new FaeryLanternBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(3,0.8f).luminance(10));

    public static final Block REDSTONE_LANTERN = new RedstoneLanternBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(3,0.8f).luminance(7));

    public static final Block SEA_LANTERN_BLOCK = new SeaLanternBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(3,0.8f).luminance(13));


    public static final Block INFESTED_REDSTONE_ORE = new InfestedRedstoneOreBlock(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .breakByHand(false)
            .sounds(BlockSoundGroup.STONE)
            .strength(3, 1.5f));

    //campfires
    public static final Block CAMPFIRE_POT = new CampfirePotBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(3,1.6f).luminance(14));

    public static final Block SOUL_CAMPFIRE_POT = new CampfirePotBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(3,1.6f).luminance(14));

    public static final Block AMBER_ORE = new AmberOreBlock();
    //public static final Block AMBER_BLOCK = new AmberBlock();
    public static final Block AMBER_LANTERN = new AmberLanternBlock(FabricBlockSettings.of(Material.METAL).nonOpaque()
            .breakByHand(true)
            .sounds(BlockSoundGroup.CHAIN)
            .strength(3,0.8f).luminance(15));

    // shells
    public static final Block CLAM_BLOCK = new ClamBlock();
    public static final Block CLAM_PEARL_BLOCK = new ClamPearlBlock();
    public static final Block SAND_DOLLAR_BLOCK = new SandDollarBlock();
    public static final Block BARNACLES_BLOCK = new BarnaclesBlock();
    public static final Block GIANT_SCALLOP_BLOCK = new GiantScallopBlock();

    // public static final Block GOLD_SKULL_BLOCK = new GoldSkullBlock(FabricBlockSettings.of(Material.METAL)
    //                .breakByTool(FabricToolTags.PICKAXES)
    //                .breakByHand(false)
    //                .sounds(BlockSoundGroup.METAL)
    //                .strength(2.5f, 2.5f));

    public static final AbstractBlock.Settings POT_BLOCK_SETTINGS = FabricBlockSettings.of(Material.STONE)
            .breakByHand(true)
            .sounds(BlockSoundGroup.STONE)
            .strength(2.5f, 2.5f);
    public static final Block POT_GIFT = new MediumPotBlock(POT_BLOCK_SETTINGS);
    public static final Block POT_GOLEM = new MediumPotBlock(POT_BLOCK_SETTINGS);
    public static final Block POT_EXPLORING = new TallPotBlock(POT_BLOCK_SETTINGS);
    public static final Block POT_TEMPLE = new LargePotBlock(POT_BLOCK_SETTINGS);
    public static final Block POT_STRIPE = new SmallPotBlock(POT_BLOCK_SETTINGS);

    public static final Block SALT_ORE = new SaltOreBlock();
    public static final Block NETHER_SALT = new NetherSaltBlock();
    public static final Block NETHER_COAL_ORE = new NetherCoalOreBlock();
    public static final Block CHARCOAL_BLOCK = new Block(FabricBlockSettings.of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES)
            .breakByHand(false)
            .sounds(BlockSoundGroup.STONE)
            .strength(3, 1.5f));

    // fossils
    public static final Block STONE_BUSH = new StoneBushBlock();
    public static final Block STONE_CORAL = new StoneCoralBlock();
    public static final Block STONE_FISH = new StoneFishBlock();
    public static final Block STONE_FLOWER = new StoneFlowerBlock();
    public static final Block STONE_GUARDIAN = new StoneGuardianBlock();
    public static final Block STONE_KNFE = new StoneKnfeBlock();
    public static final Block STONE_NAUTILUS = new StoneNautilusBlock();
    public static final Block STONE_OCELOT = new StoneOcelotBlock();
    public static final Block STONE_PICK = new StonePickBlock();
    public static final Block STONE_PUFFER = new StonePufferBlock();
    public static final Block STONE_RIBS = new StoneRibsBlock();
    public static final Block STONE_SHELL = new StoneShellBlock();
    public static final Block STONE_SHVL = new StoneShvlBlock();
    public static final Block STONE_SKULL = new StoneSkullBlock();
    public static final Block STONE_SPR = new StoneSprBlock();
    public static final Block STONE_VILLAGER = new StoneVillagerBlock();
    public static final Block STONE_MUSHROOM = new StoneMushroomBlock();
    public static final Block NETHER_EEL = new NetherEelBlock();
    public static final Block NETHER_KNIFE = new NetherKnifeBlock();
    public static final Block NETHER_PIGLIN = new NetherPiglinBlock();
    public static final Block NETHER_SHVL = new NetherShvlBlock();
    public static final Block NETHER_SKULL = new NetherSkullBlock();
    public static final Block NETHER_ROSE = new NetherRoseBlock();

    private static final AbstractBlock.Settings AQUATIC_PLANT_BLOCK_SETTINGS = FabricBlockSettings.of(Material.LEAVES)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GRASS)
            .strength(0.5f, 0.5f);
    public static final Block DRIED_SEAWEED_BLOCK = new Block(AQUATIC_PLANT_BLOCK_SETTINGS);
    public static final Block DRIED_BROWN_KELP_BLOCK = new Block(AQUATIC_PLANT_BLOCK_SETTINGS);
    public static final Block DRIED_ORANGE_KELP_BLOCK = new Block(AQUATIC_PLANT_BLOCK_SETTINGS);

    // TODO Figure out the exact idea for implementing tatami blocks
    public static final Block TATAMI_CARPET = new TatamiCarpetBlock();
    public static final Block TATAMI_HALF_CARPET = new TatamiHalfCarpetBlock();
    public static final Block TATAMI_HALF = new TatamiHalfBlock();
    public static final Block TATAMI_BLOCK = new TatamiBlock();

    private static final AbstractBlock.Settings SHOJI_BLOCK_SETTINGS = FabricBlockSettings.of(Material.WOOD)
            .breakByHand(true)
            .sounds(BlockSoundGroup.WOOD)
            .strength(1.0f, 1.0f);
    public static final Block SHOJI_TALL = new ShojiBlock(SHOJI_BLOCK_SETTINGS);
    public static final Block SHOJI_SQUARE = new ShojiBlock(SHOJI_BLOCK_SETTINGS);
    public static final Block SHOJI_SMALL = new ShojiBlock(SHOJI_BLOCK_SETTINGS);
    public static final Block SHOJI_LARGE = new ShojiBlock(SHOJI_BLOCK_SETTINGS);

    public static final Block SPIKE_WALL_BLOCK = new SpikeTrapBlock(FabricBlockSettings.of(Material.WOOD)
            .breakByTool(FabricToolTags.AXES)
            .breakByHand(true)
            .sounds(BlockSoundGroup.BAMBOO)
            .strength(3, 1.5f));

    private static final AbstractBlock.Settings NETHER_BLOCK_SETTINGS = FabricBlockSettings.of(Material.PLANT)
            .breakByHand(true)
            .sounds(BlockSoundGroup.NETHER_WART)
            .strength(0.2f, 1.0f);
    public static final Block TAINTED_BUSH = new DamagingPlantBase(NETHER_BLOCK_SETTINGS);
    public static final Block WATCHERS_GAZE = new DamagingPlantBase(NETHER_BLOCK_SETTINGS);
    public static final Block WEAPING_BRIAR = new DamagingPlantBase(NETHER_BLOCK_SETTINGS);
    // We do luminance later as otherwise it would mutate the current copy and give the above plants luminance
    public static final Block GLOWING_SHELF = new ShelfFungiBase(NETHER_BLOCK_SETTINGS.luminance((state) -> 7));
    public static final Block BLAZE_NETTLE = new DamagingPlantBase(NETHER_BLOCK_SETTINGS.luminance((state) -> 5));
    public static final Block CORRUPT_WART = new DamagingPlantBase(NETHER_BLOCK_SETTINGS.luminance((state) -> 4));

    // a public identifier for multiple parts of our bigger chest
    public static final Identifier BOX = new Identifier(MOD_ID, "icebox");

    public static final Block ICEBOX_BLOCK;
    public static final BlockItem ICEBOX_BLOCK_ITEM;
    public static final BlockEntityType<IceBoxBlockEntity> ICEBOX_BLOCK_ENTITY;

    public static final Block SHIVERPINE_LOG = new ShiverpineBlock();
    public static final Block SHIVERPINE_STRIPPED_LOG = new ShiverpineStrippedBlock();
    public static final Block SHIVERPINE_PLANKS = new ShiverpineBlock();
    public static final Block SHIVERPINE_FENCE = new ShiverpineFenceBlock();
    public static final Block SHIVERPINE_GATE = new ShiverpineGateBlock();
    public static final Block SHIVERPINE_DOOR = new ShiverpineDoorBlock();
    public static final Block SHIVERPINE_TRAPDOOR = new ShiverpineTrapDoorBlock();

    static {
        ICEBOX_BLOCK = Registry.register(Registry.BLOCK, BOX, new IceBoxBlock(FabricBlockSettings.copyOf(CHEST)));
        ICEBOX_BLOCK_ITEM = Registry.register(Registry.ITEM, BOX, new BlockItem(ICEBOX_BLOCK, new Item.Settings().group(EXPLORATION_GROUP)));

        //The parameter of build at the very end is always null, do not worry about it
        ICEBOX_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, BOX, BlockEntityType.Builder
                .create(IceBoxBlockEntity::new, ICEBOX_BLOCK).build(null));
    }

    public static final ScreenHandlerType<IceBoxScreenHandler> ICEBOX_SCREEN_HANDLER= ScreenHandlerRegistry
            .registerSimple(new Identifier(MOD_ID, "icebox"), IceBoxScreenHandler::new);

    public static void initialize() {
        //Crops
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "rice_crop"), RICE_SEEDLINGS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "rice_crop"), new BlockItem(RICE_SEEDLINGS, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "igusa_crop"), IGUSA_SEEDS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "igusa_crop"), new BlockItem(IGUSA_SEEDS, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tomato_bush"), TOMATO_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tomato_bush"), new BlockItem(TOMATO_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spicy_berry_bush"), SPICY_BERRY_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spicy_berry_bush"), new BlockItem(SPICY_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,600), 1.0f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "bitter_berry_bush"), BITTER_BERRY_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bitter_berry_bush"), new BlockItem(BITTER_BERRY_BUSH, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,600), 1.0f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "maize_crop"), MAIZE_CROP);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "maize_crop"), new BlockItem(MAIZE_CROP, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.POISON,30), 1.0f).build()).maxCount(64)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "lettuce"), LETTUCE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lettuce"), new BlockItem(LETTUCE, new Item.Settings().group(COOKING_GROUP).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()).maxCount(64)));

        //Bushes
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tumbleweed"), TUMBLE_WEED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tumbleweed"), new BlockItem(TUMBLE_WEED, new Item.Settings().group(NATURE_GROUP)));

        //Tatami
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tatami_carpet"), TATAMI_CARPET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tatami_carpet"), new BlockItem(TATAMI_CARPET, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tatami_half_carpet"), TATAMI_HALF_CARPET);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tatami_half_carpet"), new BlockItem(TATAMI_HALF_CARPET, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tatami_long_half"), TATAMI_HALF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tatami_long_half"), new BlockItem(TATAMI_HALF, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tatami_block"), TATAMI_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tatami_block"), new BlockItem(TATAMI_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));

        //Shoji
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shoji_tall"), SHOJI_TALL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shoji_tall"), new BlockItem(SHOJI_TALL, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shoji_square"), SHOJI_SQUARE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shoji_square"), new BlockItem(SHOJI_SQUARE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shoji_small"), SHOJI_SMALL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shoji_small"), new BlockItem(SHOJI_SMALL, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shoji_large"), SHOJI_LARGE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shoji_large"), new BlockItem(SHOJI_LARGE, new Item.Settings().group(FURNITURE_GROUP)));

        //Shiverpine
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_log"), SHIVERPINE_LOG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_log"), new BlockItem(SHIVERPINE_LOG, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_stripped_log"), SHIVERPINE_STRIPPED_LOG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_stripped_log"), new BlockItem(SHIVERPINE_STRIPPED_LOG, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_planks"), SHIVERPINE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_planks"), new BlockItem(SHIVERPINE_PLANKS, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_gate"), SHIVERPINE_GATE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_gate"), new BlockItem(SHIVERPINE_GATE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_fence"), SHIVERPINE_FENCE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_fence"), new BlockItem(SHIVERPINE_FENCE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_door"), SHIVERPINE_DOOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_door"), new BlockItem(SHIVERPINE_DOOR, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_trapdoor"), SHIVERPINE_TRAPDOOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_trapdoor"), new BlockItem(SHIVERPINE_TRAPDOOR, new Item.Settings().group(FURNITURE_GROUP)));

        //Traps
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spike_wall_block"), SPIKE_WALL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spike_wall_block"), new BlockItem(SPIKE_WALL_BLOCK, new Item.Settings().group(EXPLORATION_GROUP)));

        //Crock Pots
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "campfire_pot"), CAMPFIRE_POT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "campfire_pot"), new BlockItem(CAMPFIRE_POT, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "soul_campfire_pot"), SOUL_CAMPFIRE_POT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soul_campfire_pot"), new BlockItem(SOUL_CAMPFIRE_POT, new Item.Settings().group(EXPLORATION_GROUP)));

        //Overworld Trees
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_sapling"), APPLE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_sapling"), new BlockItem(APPLE_SAPLING, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "apple_leaves"), APPLE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_leaves"), new BlockItem(APPLE_LEAVES, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_sapling"), SHIVERPINE_SAPLING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_sapling"), new BlockItem(SHIVERPINE_SAPLING, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "shiverpine_leaves"), SHIVERPINE_LEAVES);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "shiverpine_leaves"), new BlockItem(SHIVERPINE_LEAVES, new Item.Settings().group(NATURE_GROUP)));

        //Cave Plants
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "faery_mushroom"), FAERY_MUSHROOM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "faery_mushroom"), new BlockItem(FAERY_MUSHROOM, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "green_mushroom"), GREEN_MUSHROOM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_mushroom"), new BlockItem(GREEN_MUSHROOM, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "cerulean_fungus"), CERULEAN_FUNGUS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cerulean_fungus"), new BlockItem(CERULEAN_FUNGUS, new Item.Settings().group(NATURE_GROUP)));

        //Ocean Plants
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dried_seaweed_block"), DRIED_SEAWEED_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_seaweed_block"), new BlockItem(DRIED_SEAWEED_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dried_brown_kelp_block"), DRIED_BROWN_KELP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_brown_kelp_block"), new BlockItem(DRIED_BROWN_KELP_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dried_orange_kelp_block"), DRIED_ORANGE_KELP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dried_orange_kelp_block"), new BlockItem(DRIED_ORANGE_KELP_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_kelp"), BROWN_KELP);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "brown_kelp_plant"), BROWN_KELP_PLANT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_kelp"), new BlockItem(BROWN_KELP, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "brown_kelp_plant"), new BlockItem(BROWN_KELP_PLANT, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "seaweed"), SEAWEED);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "seaweed_plant"), SEAWEED_PLANT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "seaweed"), new BlockItem(SEAWEED, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "seaweed_plant"), new BlockItem(SEAWEED_PLANT, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "orange_kelp"), ORANGE_KELP);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "orange_kelp_plant"), ORANGE_KELP_PLANT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "orange_kelp"), new BlockItem(ORANGE_KELP, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "orange_kelp_plant"), new BlockItem(ORANGE_KELP_PLANT, new Item.Settings()));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "red_seagrass"), RED_SEAGRASS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_seagrass"), new BlockItem(RED_SEAGRASS, new Item.Settings().group(NATURE_GROUP)));

        //Shells
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "clam"), CLAM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clam"), new BlockItem(CLAM_BLOCK, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "clam_pearl"), CLAM_PEARL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "clam_pearl"), new BlockItem(CLAM_PEARL_BLOCK, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sand_dollar"), SAND_DOLLAR_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sand_dollar"), new BlockItem(SAND_DOLLAR_BLOCK, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "barnacles"), BARNACLES_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "barnacles"), new BlockItem(BARNACLES_BLOCK, new Item.Settings().group(NATURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "scallop"), GIANT_SCALLOP_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "scallop"), new BlockItem(GIANT_SCALLOP_BLOCK, new Item.Settings().group(NATURE_GROUP)));

        //Fossils
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_bush"), STONE_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_bush"), new BlockItem(STONE_BUSH, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_coral"), STONE_CORAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_coral"), new BlockItem(STONE_CORAL, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_fish"), STONE_FISH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_fish"), new BlockItem(STONE_FISH, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_flower"), STONE_FLOWER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_flower"), new BlockItem(STONE_FLOWER, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_guardian"), STONE_GUARDIAN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_guardian"), new BlockItem(STONE_GUARDIAN, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_knfe"), STONE_KNFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_knfe"), new BlockItem(STONE_KNFE, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_nautilus"), STONE_NAUTILUS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_nautilus"), new BlockItem(STONE_NAUTILUS, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_ocelot"), STONE_OCELOT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_ocelot"), new BlockItem(STONE_OCELOT, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_pick"), STONE_PICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_pick"), new BlockItem(STONE_PICK, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_puffer"), STONE_PUFFER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_puffer"), new BlockItem(STONE_PUFFER, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_ribs"), STONE_RIBS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_ribs"), new BlockItem(STONE_RIBS, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_shell"), STONE_SHELL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_shell"), new BlockItem(STONE_SHELL, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_shvl"), STONE_SHVL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_shvl"), new BlockItem(STONE_SHVL, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_skull"), STONE_SKULL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_skull"), new BlockItem(STONE_SKULL, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_spr"), STONE_SPR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_spr"), new BlockItem(STONE_SPR, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_villager"), STONE_VILLAGER);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_villager"), new BlockItem(STONE_VILLAGER, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stone_mushroom"), STONE_MUSHROOM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_mushroom"), new BlockItem(STONE_MUSHROOM, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_eel"), NETHER_EEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_eel"), new BlockItem(NETHER_EEL, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_knife"), NETHER_KNIFE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_knife"), new BlockItem(NETHER_KNIFE, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_piglin"), NETHER_PIGLIN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_piglin"), new BlockItem(NETHER_PIGLIN, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_shvl"), NETHER_SHVL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_shvl"), new BlockItem(NETHER_SHVL, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_rose"), NETHER_ROSE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_rose"), new BlockItem(NETHER_ROSE, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_skull"), NETHER_SKULL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_skull"), new BlockItem(NETHER_SKULL, new Item.Settings().group(FOSSIL_GROUP)));

        //Ores
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "salt_ore"), SALT_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "salt_ore"), new BlockItem(SALT_ORE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_salt"), NETHER_SALT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_salt"), new BlockItem(NETHER_SALT, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "nether_coal_ore"), NETHER_COAL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "nether_coal_ore"), new BlockItem(NETHER_COAL_ORE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "infested_redstone_ore"), INFESTED_REDSTONE_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "infested_redstone_ore"), new BlockItem(INFESTED_REDSTONE_ORE, new Item.Settings().group(FURNITURE_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amber_ore"), AMBER_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amber_ore"), new BlockItem(AMBER_ORE, new Item.Settings().group(FURNITURE_GROUP)));

        //Charcoal Blocks
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "charcoal_block"), CHARCOAL_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "charcoal_block"), new BlockItem(CHARCOAL_BLOCK, new Item.Settings().group(FURNITURE_GROUP)));

        //Anchor
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "anchor"), ANCHOR_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "anchor"), new BlockItem(ANCHOR_BLOCK, new Item.Settings().group(EXPLORATION_GROUP)));

        //Gold Skull
        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gold_skull"), GOLD_SKULL_BLOCK);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gold_skull"), new BlockItem(GOLD_SKULL_BLOCK, new Item.Settings().group(FOSSIL_GROUP)));

        //Pottery
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pot_gift"), POT_GIFT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pot_gift"), new BlockItem(POT_GIFT, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pot_golem"), POT_GOLEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pot_golem"), new BlockItem(POT_GOLEM, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pot_exploring"), POT_EXPLORING);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pot_exploring"), new BlockItem(POT_EXPLORING, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pot_temple"), POT_TEMPLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pot_temple"), new BlockItem(POT_TEMPLE, new Item.Settings().group(FOSSIL_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "pot_stripe"), POT_STRIPE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pot_stripe"), new BlockItem(POT_STRIPE, new Item.Settings().group(FOSSIL_GROUP)));

        //Adventure Gear
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "climbable_rope"), CLIMBABLE_ROPE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "climbable_rope"), new BlockItem(CLIMBABLE_ROPE, new Item.Settings().group(EXPLORATION_GROUP)));

        //Lanterns & Torches
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "faery_lantern"), FAERY_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "faery_lantern"), new BlockItem(FAERY_LANTERN, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "redstone_lantern"), REDSTONE_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "redstone_lantern"), new BlockItem(REDSTONE_LANTERN, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "sea_lantern"), SEA_LANTERN_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sea_lantern"), new BlockItem(SEA_LANTERN_BLOCK, new Item.Settings().group(EXPLORATION_GROUP)));
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "amber_lantern"), AMBER_LANTERN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amber_lantern"), new BlockItem(AMBER_LANTERN, new Item.Settings().group(EXPLORATION_GROUP)));

        //Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "faery_torch"), FAERY_TORCH);
        //Registry.register(Registry.ITEM, new Identifier(MOD_ID, "faery_torch"), new BlockItem(FAERY_TORCH, new Item.Settings().group(EQUIPMENT_GROUP)));
        //faery campfire 1.2

        //nether plants
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "blaze_nettle"), BLAZE_NETTLE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blaze_nettle"), new BlockItem(BLAZE_NETTLE, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "glowing_shelf"), GLOWING_SHELF);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glowing_shelf"), new BlockItem(GLOWING_SHELF, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "corrupt_nether_wart"), CORRUPT_WART);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corrupt_nether_wart"), new BlockItem(CORRUPT_WART, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "tainted_rose_bush"), TAINTED_BUSH);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tainted_rose_bush"), new BlockItem(TAINTED_BUSH, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "watchers_gaze"), WATCHERS_GAZE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "watchers_gaze"), new BlockItem(WATCHERS_GAZE, new Item.Settings().group(NATURE_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "weaping_briar"), WEAPING_BRIAR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "weaping_briar"), new BlockItem(WEAPING_BRIAR, new Item.Settings().group(NATURE_GROUP)));

    }
}
