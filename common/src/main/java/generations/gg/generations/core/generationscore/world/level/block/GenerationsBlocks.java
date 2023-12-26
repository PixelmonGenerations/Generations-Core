package generations.gg.generations.core.generationscore.world.level.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import generations.gg.generations.core.generationscore.GenerationsCore;
import generations.gg.generations.core.generationscore.world.item.GenericChestBlockItem;
import generations.gg.generations.core.generationscore.world.item.creativetab.GenerationsCreativeTabs;
import generations.gg.generations.core.generationscore.world.level.block.decorations.PokecenterScarletSignBlock;
import generations.gg.generations.core.generationscore.world.level.block.generic.GenericChestBlock;
import generations.gg.generations.core.generationscore.world.level.block.set.GenerationsBlockSet;
import generations.gg.generations.core.generationscore.world.level.block.state.properties.GenerationsBlockSetTypes;
import generations.gg.generations.core.generationscore.world.level.levelgen.GenerationsFeatures;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;
import java.util.function.Supplier;

public class GenerationsBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Block> ULTRA_BLOCKS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Block> POKEBRICKS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Block> MARBLE = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Block> STONE = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    public static final BlockBehaviour.Properties ULTRA_BLOCK_SETTINGS = BlockBehaviour.Properties.copy(Blocks.GLASS).lightLevel(value -> 15);
    public static final RegistrySupplier<Block> POKEMART_SIGN = registerBlockItem("pokemart_sign", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    /**
     * PokeCenter
     */
    public static final RegistrySupplier<Block> POKECENTER_SIGN = registerBlockItem("pokecenter_sign", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> POKECENTER_SCARLET_SIGN = registerBlockItem("pokecenter_scarlet_sign", () -> new PokecenterScarletSignBlock(BlockBehaviour.Properties.of().lightLevel((state) -> 15).noLootTable()));
    public static final RegistrySupplier<DoorBlock> POKECENTER_DOOR = registerBlockItem("pokecenter_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.OAK));

    public static final GenerationsBlockSet POKECENTER_ROOF_SET = new GenerationsBlockSet("pokecenter_roof", BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel(value -> 5));
    public static final GenerationsBlockSet POKECENTER_ROOF_2_SET = new GenerationsBlockSet("pokecenter_roof_2", BlockBehaviour.Properties.copy(Blocks.STONE).lightLevel(value -> 5));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_1 = registerBlockItem("house_floor_1", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_2 = registerBlockItem("house_floor_2", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_3 = registerBlockItem("house_floor_3", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_4 = registerBlockItem("house_floor_4", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_5 = registerBlockItem("house_floor_5", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_6 = registerBlockItem("house_floor_6", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_7 = registerBlockItem("house_floor_7", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HOUSE_FLOOR_8 = registerBlockItem("house_floor_8", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> RUINS_WALL = registerBlockItem("ruins_wall", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> DUSTY_RUINS_WALL = registerBlockItem("dusty_ruins_wall", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));


    public static final GenerationsBlockSet TEMPLE_BLOCK_SET = new GenerationsBlockSet("temple_block", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet TEMPLE_BRICK_SET = new GenerationsBlockSet("temple_brick", BlockBehaviour.Properties.copy(Blocks.BRICKS));
    public static final GenerationsBlockSet CASTLE_BLOCK_SET = new GenerationsBlockSet("castle_block", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CRACKED_CASTLE_BLOCK_SET = new GenerationsBlockSet("cracked_castle_block", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CASTLE_BRICK_SET = new GenerationsBlockSet("castle_brick", BlockBehaviour.Properties.copy(Blocks.BRICKS));
    public static final GenerationsBlockSet CASTLE_BRICK_2_SET = new GenerationsBlockSet("castle_brick_2", BlockBehaviour.Properties.copy(Blocks.BRICKS));

    public static final GenerationsBlockSet GRAY_CASTLE_BRICK_SET = new GenerationsBlockSet("gray_castle_brick", BlockBehaviour.Properties.copy(Blocks.BRICKS));
    public static final GenerationsBlockSet GRAY_CASTLE_BRICK_2_SET = new GenerationsBlockSet("gray_castle_brick_2", BlockBehaviour.Properties.copy(Blocks.BRICKS));
public static final GenerationsBlockSet WHITE_CASTLE_BRICK_SET = new GenerationsBlockSet("white_castle_brick", BlockBehaviour.Properties.copy(Blocks.BRICKS));
    public static final GenerationsBlockSet WHITE_CASTLE_BRICK_2_SET = new GenerationsBlockSet("white_castle_brick_2", BlockBehaviour.Properties.copy(Blocks.BRICKS));
    public static final GenerationsBlockSet CASTLE_WALL_SET = new GenerationsBlockSet("castle_wall", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CASTLE_WALL_2_SET = new GenerationsBlockSet("castle_wall_2", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CASTLE_WALL_3_SET = new GenerationsBlockSet("castle_wall_3", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CASTLE_WALL_4_SET = new GenerationsBlockSet("castle_wall_4", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CASTLE_FLOOR_SET = new GenerationsBlockSet("castle_floor", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet ICE_BRICK_SET = new GenerationsBlockSet("ice_brick", BlockBehaviour.Properties.copy(Blocks.ICE));
    public static final RegistrySupplier<Block> ICE_PILLAR = registerBlockItem("ice_pillar", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE)));
    public static final RegistrySupplier<Block> BROKEN_ICE_PILLAR = registerBlockItem("ice_pillar_broken", () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE)));

    public static final GenerationsBlockSet ICE_PILLAR_SIDE_SET = new GenerationsBlockSet("ice_pillar_side", BlockBehaviour.Properties.copy(Blocks.ICE));
    public static final GenerationsBlockSet ICE_PILLAR_TOP_SET = new GenerationsBlockSet("ice_pillar_top", BlockBehaviour.Properties.copy(Blocks.ICE));
    public static final GenerationsBlockSet ROCK_SET = new GenerationsBlockSet("rock", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CAVE_ROCK_SET = new GenerationsBlockSet("cave_rock", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet CAVE_ROCK_FLOOR_SET = new GenerationsBlockSet("cave_rock_floor", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet GRAY_CAVE_ROCK_FLOOR_SET = new GenerationsBlockSet("gray_cave_rock_floor", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet ICE_CAVE_ROCK_FLOOR_SET = new GenerationsBlockSet("ice_cave_rock_floor", BlockBehaviour.Properties.copy(Blocks.ICE));
    public static final GenerationsBlockSet BRIDGE_BLOCK_SET = new GenerationsBlockSet("bridge_block", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));


    public static final RegistrySupplier<Block> CASTLE_PILLAR = registerBlockItem("castle_pillar", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> BROKEN_CASTLE_PILLAR = registerBlockItem("broken_castle_pillar", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> PRISMARINE_PILLAR = registerBlockItem("prismarine_pillar", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> BROKEN_PRISMARINE_PILLAR = registerBlockItem("prismarine_pillar_broken", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> DARK_PRISMARINE_PILLAR = registerBlockItem("dark_prismarine_pillar", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> BROKEN_DARK_PRISMARINE_PILLAR = registerBlockItem("dark_prismarine_pillar_broken", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> HAUNTED_PILLAR = registerBlockItem("haunted_pillar", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> BROKEN_HAUNTED_PILLAR = registerBlockItem("haunted_pillar_broken", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistrySupplier<Block> DAWN_STONE_BLOCK = registerBlockItem("dawn_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> DUSK_STONE_BLOCK = registerBlockItem("dusk_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> FIRE_STONE_BLOCK = registerBlockItem("fire_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> ICE_STONE_BLOCK = registerBlockItem("ice_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> LEAF_STONE_BLOCK = registerBlockItem("leaf_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> MOON_STONE_BLOCK = registerBlockItem("moon_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> SHINY_STONE_BLOCK = registerBlockItem("shiny_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> SUN_STONE_BLOCK = registerBlockItem("sun_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> THUNDER_STONE_BLOCK = registerBlockItem("thunder_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> WATER_STONE_BLOCK = registerBlockItem("water_stone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> CRATE = registerBlockItem("crate", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    /**
     * Compressed Polished Andesite Pallet
     */
    public static final GenerationsBlockSet COMPRESSED_POLISHED_ANDESITE_SET = new GenerationsBlockSet("compressed_polished_andesite", BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE));
    public static final GenerationsBlockSet COMPRESSED_POLISHED_DIORITE_SET = new GenerationsBlockSet("compressed_polished_diorite", BlockBehaviour.Properties.copy(Blocks.POLISHED_DIORITE));
    public static final GenerationsBlockSet COMPRESSED_POLISHED_GRANITE_SET = new GenerationsBlockSet("compressed_polished_granite", BlockBehaviour.Properties.copy(Blocks.POLISHED_GRANITE));
    public static final GenerationsBlockSet COMPRESSED_POLISHED_DEEPSLATE_SET = new GenerationsBlockSet("compressed_polished_deepslate", BlockBehaviour.Properties.copy(Blocks.POLISHED_DEEPSLATE));

    public static final RegistrySupplier<Block> WARNING_BLOCK = registerBlockItem("warning_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)));


    //Cursed Pumpkin Based Blocks
    public static final RegistrySupplier<PumpkinBlock> CURSED_PUMPKIN = registerBlockItem("cursed_pumpkin", () -> new CursedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)));
    public static final RegistrySupplier<CursedCarvedPumpkinBlock> CURSED_CARVED_PUMPKIN = registerBlockItem("cursed_carved_pumpkin", () -> new CursedCarvedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.CARVED_PUMPKIN)));
    public static final RegistrySupplier<CursedCarvedPumpkinBlock> CURSED_JACK_O_LANTERN = registerBlockItem("cursed_jack_o_lantern", () -> new CursedCarvedPumpkinBlock(BlockBehaviour.Properties.copy(Blocks.JACK_O_LANTERN)));

    public static final GenerationsBlockSet COBBLE_RUINS_1_SET = new GenerationsBlockSet("cobble_ruins_1", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet COBBLE_RUINS_2_SET = new GenerationsBlockSet("cobble_ruins_2", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet COBBLE_RUINS_3_SET = new GenerationsBlockSet("cobble_ruins_3", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet COBBLE_RUINS_4_SET = new GenerationsBlockSet("cobble_ruins_4", BlockBehaviour.Properties.copy(Blocks.STONE));

    /**
     * Ultra Blocks
     */

    public static final RegistrySupplier<Block> ULTRA_WHITE = registerUltraBlock("ultra_white", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_WHITE_STAIRS = registerUltraBlock("ultra_white_stairs", () -> new StairBlock(ULTRA_WHITE.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_WHITE_SLAB = registerUltraBlock("ultra_white_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_WHITE_WALL = registerUltraBlock("ultra_white_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_WHITE_BUTTON = registerUltraBlock("ultra_white_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_WHITE_PRESSURE_PLATE = registerUltraBlock("ultra_white_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_LIGHT_GRAY = registerUltraBlock("ultra_light_gray", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_LIGHT_GRAY_STAIRS = registerUltraBlock("ultra_light_gray_stairs", () -> new StairBlock(ULTRA_LIGHT_GRAY.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_LIGHT_GRAY_SLAB = registerUltraBlock("ultra_light_gray_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_LIGHT_GRAY_WALL = registerUltraBlock("ultra_light_gray_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_LIGHT_GRAY_BUTTON = registerUltraBlock("ultra_light_gray_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_LIGHT_GRAY_PRESSURE_PLATE = registerUltraBlock("ultra_light_gray_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_GRAY = registerUltraBlock("ultra_gray", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_GRAY_STAIRS = registerUltraBlock("ultra_gray_stairs", () -> new StairBlock(ULTRA_GRAY.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_GRAY_SLAB = registerUltraBlock("ultra_gray_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_GRAY_WALL = registerUltraBlock("ultra_gray_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_GRAY_BUTTON = registerUltraBlock("ultra_gray_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_GRAY_PRESSURE_PLATE = registerUltraBlock("ultra_gray_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_BLACK = registerUltraBlock("ultra_black", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_BLACK_STAIRS = registerUltraBlock("ultra_black_stairs", () -> new StairBlock(ULTRA_BLACK.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_BLACK_SLAB = registerUltraBlock("ultra_black_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_BLACK_WALL = registerUltraBlock("ultra_black_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_BLACK_BUTTON = registerUltraBlock("ultra_black_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_BLACK_PRESSURE_PLATE = registerUltraBlock("ultra_black_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_BROWN = registerUltraBlock("ultra_brown", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_BROWN_STAIRS = registerUltraBlock("ultra_brown_stairs", () -> new StairBlock(ULTRA_BROWN.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_BROWN_SLAB = registerUltraBlock("ultra_brown_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_BROWN_WALL = registerUltraBlock("ultra_brown_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_BROWN_BUTTON = registerUltraBlock("ultra_brown_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_BROWN_PRESSURE_PLATE = registerUltraBlock("ultra_brown_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_RED = registerUltraBlock("ultra_red", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_RED_STAIRS = registerUltraBlock("ultra_red_stairs", () -> new StairBlock(ULTRA_RED.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_RED_SLAB = registerUltraBlock("ultra_red_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_RED_WALL = registerUltraBlock("ultra_red_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_RED_BUTTON = registerUltraBlock("ultra_red_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_RED_PRESSURE_PLATE = registerUltraBlock("ultra_red_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_ORANGE = registerUltraBlock("ultra_orange", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_ORANGE_STAIRS = registerUltraBlock("ultra_orange_stairs", () -> new StairBlock(ULTRA_ORANGE.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_ORANGE_SLAB = registerUltraBlock("ultra_orange_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_ORANGE_WALL = registerUltraBlock("ultra_orange_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_ORANGE_BUTTON = registerUltraBlock("ultra_orange_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_ORANGE_PRESSURE_PLATE = registerUltraBlock("ultra_orange_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_YELLOW = registerUltraBlock("ultra_yellow", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_YELLOW_STAIRS = registerUltraBlock("ultra_yellow_stairs", () -> new StairBlock(ULTRA_YELLOW.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_YELLOW_SLAB = registerUltraBlock("ultra_yellow_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_YELLOW_WALL = registerUltraBlock("ultra_yellow_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_YELLOW_BUTTON = registerUltraBlock("ultra_yellow_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_YELLOW_PRESSURE_PLATE = registerUltraBlock("ultra_yellow_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_LIME = registerUltraBlock("ultra_lime", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_LIME_STAIRS = registerUltraBlock("ultra_lime_stairs", () -> new StairBlock(ULTRA_LIME.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_LIME_SLAB = registerUltraBlock("ultra_lime_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_LIME_WALL = registerUltraBlock("ultra_lime_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_LIME_BUTTON = registerUltraBlock("ultra_lime_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_LIME_PRESSURE_PLATE = registerUltraBlock("ultra_lime_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_GREEN = registerUltraBlock("ultra_green", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_GREEN_STAIRS = registerUltraBlock("ultra_green_stairs", () -> new StairBlock(ULTRA_GREEN.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_GREEN_SLAB = registerUltraBlock("ultra_green_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_GREEN_WALL = registerUltraBlock("ultra_green_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_GREEN_BUTTON = registerUltraBlock("ultra_green_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_GREEN_PRESSURE_PLATE = registerUltraBlock("ultra_green_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_CYAN = registerUltraBlock("ultra_cyan", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_CYAN_STAIRS = registerUltraBlock("ultra_cyan_stairs", () -> new StairBlock(ULTRA_CYAN.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_CYAN_SLAB = registerUltraBlock("ultra_cyan_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_CYAN_WALL = registerUltraBlock("ultra_cyan_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_CYAN_BUTTON = registerUltraBlock("ultra_cyan_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_CYAN_PRESSURE_PLATE = registerUltraBlock("ultra_cyan_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_LIGHT_BLUE = registerUltraBlock("ultra_light_blue", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_LIGHT_BLUE_STAIRS = registerUltraBlock("ultra_light_blue_stairs", () -> new StairBlock(ULTRA_LIGHT_BLUE.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_LIGHT_BLUE_SLAB = registerUltraBlock("ultra_light_blue_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_LIGHT_BLUE_WALL = registerUltraBlock("ultra_light_blue_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_LIGHT_BLUE_BUTTON = registerUltraBlock("ultra_light_blue_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_LIGHT_BLUE_PRESSURE_PLATE = registerUltraBlock("ultra_light_blue_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_BLUE = registerUltraBlock("ultra_blue", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_BLUE_STAIRS = registerUltraBlock("ultra_blue_stairs", () -> new StairBlock(ULTRA_BLUE.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_BLUE_SLAB = registerUltraBlock("ultra_blue_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_BLUE_WALL = registerUltraBlock("ultra_blue_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_BLUE_BUTTON = registerUltraBlock("ultra_blue_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_BLUE_PRESSURE_PLATE = registerUltraBlock("ultra_blue_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_PURPLE = registerUltraBlock("ultra_purple", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_PURPLE_STAIRS = registerUltraBlock("ultra_purple_stairs", () -> new StairBlock(ULTRA_PURPLE.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_PURPLE_SLAB = registerUltraBlock("ultra_purple_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_PURPLE_WALL = registerUltraBlock("ultra_purple_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_PURPLE_BUTTON = registerUltraBlock("ultra_purple_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_PURPLE_PRESSURE_PLATE = registerUltraBlock("ultra_purple_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));

    public static final RegistrySupplier<Block> ULTRA_MAGENTA = registerUltraBlock("ultra_magenta", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_MAGENTA_STAIRS = registerUltraBlock("ultra_magenta_stairs", () -> new StairBlock(ULTRA_MAGENTA.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_MAGENTA_SLAB = registerUltraBlock("ultra_magenta_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_MAGENTA_WALL = registerUltraBlock("ultra_magenta_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_MAGENTA_BUTTON = registerUltraBlock("ultra_magenta_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_MAGENTA_PRESSURE_PLATE = registerUltraBlock("ultra_magenta_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));
    public static final RegistrySupplier<Block> ULTRA_PINK = registerUltraBlock("ultra_pink", () -> new Block(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<StairBlock> ULTRA_PINK_STAIRS = registerUltraBlock("ultra_pink_stairs", () -> new StairBlock(ULTRA_PINK.get().defaultBlockState(), ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<SlabBlock> ULTRA_PINK_SLAB = registerUltraBlock("ultra_pink_slab", () -> new SlabBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<WallBlock> ULTRA_PINK_WALL = registerUltraBlock("ultra_pink_wall", () -> new WallBlock(ULTRA_BLOCK_SETTINGS));
    public static final RegistrySupplier<ButtonBlock> ULTRA_PINK_BUTTON = registerUltraBlock("ultra_pink_button", () -> new ButtonBlock(ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ULTRA_PINK_PRESSURE_PLATE = registerUltraBlock("ultra_pink_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, ULTRA_BLOCK_SETTINGS, GenerationsBlockSetTypes.ULTRA));


    public static final RegistrySupplier<Block> ULTRA_SAND = registerBlockItem("ultra_sand", () -> new SandBlock(0xdbd3a0, BlockBehaviour.Properties.copy(Blocks.SAND)));


    /**
     * Marble blocks
     */

    public static final RegistrySupplier<Block> WHITE_MARBLE = registerMarble("white_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> WHITE_MARBLE_STAIRS = registerMarble("white_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(WHITE_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> WHITE_MARBLE_SLAB = registerMarble("white_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(WHITE_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> WHITE_MARBLE_WALL = registerMarble("white_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(WHITE_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> WHITE_MARBLE_BUTTON = registerMarble("white_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(WHITE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> WHITE_MARBLE_PRESSURE_PLATE = registerMarble("white_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(WHITE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> LIGHT_GRAY_MARBLE = registerMarble("light_gray_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> LIGHT_GRAY_MARBLE_STAIRS = registerMarble("light_gray_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(LIGHT_GRAY_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> LIGHT_GRAY_MARBLE_SLAB = registerMarble("light_gray_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> LIGHT_GRAY_MARBLE_WALL = registerMarble("light_gray_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> LIGHT_GRAY_MARBLE_BUTTON = registerMarble("light_gray_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> LIGHT_GRAY_MARBLE_PRESSURE_PLATE = registerMarble("light_gray_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(LIGHT_GRAY_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> GRAY_MARBLE = registerMarble("gray_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> GRAY_MARBLE_STAIRS = registerMarble("gray_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(GRAY_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> GRAY_MARBLE_SLAB = registerMarble("gray_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GRAY_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> GRAY_MARBLE_WALL = registerMarble("gray_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GRAY_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> GRAY_MARBLE_BUTTON = registerMarble("gray_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(GRAY_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> GRAY_MARBLE_PRESSURE_PLATE = registerMarble("gray_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(GRAY_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> BLACK_MARBLE = registerMarble("black_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> BLACK_MARBLE_STAIRS = registerMarble("black_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BLACK_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> BLACK_MARBLE_SLAB = registerMarble("black_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLACK_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> BLACK_MARBLE_WALL = registerMarble("black_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLACK_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> BLACK_MARBLE_BUTTON = registerMarble("black_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(BLACK_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> BLACK_MARBLE_PRESSURE_PLATE = registerMarble("black_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(BLACK_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> BROWN_MARBLE = registerMarble("brown_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> BROWN_MARBLE_STAIRS = registerMarble("brown_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BROWN_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> BROWN_MARBLE_SLAB = registerMarble("brown_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BROWN_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> BROWN_MARBLE_WALL = registerMarble("brown_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BROWN_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> BROWN_MARBLE_BUTTON = registerMarble("brown_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(BROWN_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> BROWN_MARBLE_PRESSURE_PLATE = registerMarble("brown_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(BROWN_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> RED_MARBLE = registerMarble("red_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> RED_MARBLE_STAIRS = registerMarble("red_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(RED_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> RED_MARBLE_SLAB = registerMarble("red_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RED_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> RED_MARBLE_WALL = registerMarble("red_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(RED_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> RED_MARBLE_BUTTON = registerMarble("red_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(RED_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> RED_MARBLE_PRESSURE_PLATE = registerMarble("red_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(RED_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> ORANGE_MARBLE = registerMarble("orange_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> ORANGE_MARBLE_STAIRS = registerMarble("orange_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> ORANGE_MARBLE_SLAB = registerMarble("orange_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORANGE_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> ORANGE_MARBLE_WALL = registerMarble("orange_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ORANGE_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> ORANGE_MARBLE_BUTTON = registerMarble("orange_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ORANGE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ORANGE_MARBLE_PRESSURE_PLATE = registerMarble("orange_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ORANGE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> YELLOW_MARBLE = registerMarble("yellow_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> YELLOW_MARBLE_STAIRS = registerMarble("yellow_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(YELLOW_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> YELLOW_MARBLE_SLAB = registerMarble("yellow_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(YELLOW_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> YELLOW_MARBLE_WALL = registerMarble("yellow_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(YELLOW_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> YELLOW_MARBLE_BUTTON = registerMarble("yellow_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(YELLOW_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> YELLOW_MARBLE_PRESSURE_PLATE = registerMarble("yellow_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(YELLOW_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> LIME_MARBLE = registerMarble("lime_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> LIME_MARBLE_STAIRS = registerMarble("lime_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(LIME_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> LIME_MARBLE_SLAB = registerMarble("lime_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIME_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> LIME_MARBLE_WALL = registerMarble("lime_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIME_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> LIME_MARBLE_BUTTON = registerMarble("lime_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(LIME_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> LIME_MARBLE_PRESSURE_PLATE = registerMarble("lime_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(LIME_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> GREEN_MARBLE = registerMarble("green_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> GREEN_MARBLE_STAIRS = registerMarble("green_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(GREEN_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> GREEN_MARBLE_SLAB = registerMarble("green_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GREEN_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> GREEN_MARBLE_WALL = registerMarble("green_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GREEN_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> GREEN_MARBLE_BUTTON = registerMarble("green_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(GREEN_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> GREEN_MARBLE_PRESSURE_PLATE = registerMarble("green_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(GREEN_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> CYAN_MARBLE = registerMarble("cyan_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> CYAN_MARBLE_STAIRS = registerMarble("cyan_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(CYAN_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> CYAN_MARBLE_SLAB = registerMarble("cyan_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CYAN_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> CYAN_MARBLE_WALL = registerMarble("cyan_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(CYAN_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> CYAN_MARBLE_BUTTON = registerMarble("cyan_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(CYAN_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> CYAN_MARBLE_PRESSURE_PLATE = registerMarble("cyan_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(CYAN_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> POWDER_BLUE_MARBLE = registerMarble("powder_blue_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> POWDER_BLUE_MARBLE_STAIRS = registerMarble("powder_blue_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(POWDER_BLUE_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> POWDER_BLUE_MARBLE_SLAB = registerMarble("powder_blue_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(POWDER_BLUE_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> POWDER_BLUE_MARBLE_WALL = registerMarble("powder_blue_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(POWDER_BLUE_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> POWDER_BLUE_MARBLE_BUTTON = registerMarble("powder_blue_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(POWDER_BLUE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> POWDER_BLUE_MARBLE_PRESSURE_PLATE = registerMarble("powder_blue_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(POWDER_BLUE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> LIGHT_BLUE_MARBLE = registerMarble("light_blue_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> LIGHT_BLUE_MARBLE_STAIRS = registerMarble("light_blue_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(LIGHT_BLUE_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> LIGHT_BLUE_MARBLE_SLAB = registerMarble("light_blue_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> LIGHT_BLUE_MARBLE_WALL = registerMarble("light_blue_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> LIGHT_BLUE_MARBLE_BUTTON = registerMarble("light_blue_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> LIGHT_BLUE_MARBLE_PRESSURE_PLATE = registerMarble("light_blue_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(LIGHT_BLUE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> BLUE_MARBLE = registerMarble("blue_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> BLUE_MARBLE_STAIRS = registerMarble("blue_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BLUE_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> BLUE_MARBLE_SLAB = registerMarble("blue_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLUE_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> BLUE_MARBLE_WALL = registerMarble("blue_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLUE_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> BLUE_MARBLE_BUTTON = registerMarble("blue_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(BLUE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> BLUE_MARBLE_PRESSURE_PLATE = registerMarble("blue_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(BLUE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> PURPLE_MARBLE = registerMarble("purple_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> PURPLE_MARBLE_STAIRS = registerMarble("purple_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(PURPLE_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> PURPLE_MARBLE_SLAB = registerMarble("purple_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PURPLE_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> PURPLE_MARBLE_WALL = registerMarble("purple_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(PURPLE_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> PURPLE_MARBLE_BUTTON = registerMarble("purple_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(PURPLE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> PURPLE_MARBLE_PRESSURE_PLATE = registerMarble("purple_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(PURPLE_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> MAGENTA_MARBLE = registerMarble("magenta_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> MAGENTA_MARBLE_STAIRS = registerMarble("magenta_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(MAGENTA_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> MAGENTA_MARBLE_SLAB = registerMarble("magenta_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MAGENTA_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> MAGENTA_MARBLE_WALL = registerMarble("magenta_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MAGENTA_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> MAGENTA_MARBLE_BUTTON = registerMarble("magenta_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(MAGENTA_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> MAGENTA_MARBLE_PRESSURE_PLATE = registerMarble("magenta_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(MAGENTA_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    public static final RegistrySupplier<Block> PINK_MARBLE = registerMarble("pink_marble", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> PINK_MARBLE_STAIRS = registerMarble("pink_marble_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(PINK_MARBLE.get())));
    public static final RegistrySupplier<SlabBlock> PINK_MARBLE_SLAB = registerMarble("pink_marble_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PINK_MARBLE.get())));
    public static final RegistrySupplier<WallBlock> PINK_MARBLE_WALL = registerMarble("pink_marble_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(PINK_MARBLE.get())));
    public static final RegistrySupplier<ButtonBlock> PINK_MARBLE_BUTTON = registerMarble("pink_marble_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(PINK_MARBLE.get()), GenerationsBlockSetTypes.MARBLE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> PINK_MARBLE_PRESSURE_PLATE = registerMarble("pink_marble_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(PINK_MARBLE.get()), GenerationsBlockSetTypes.MARBLE));

    /**
     * Unown Blocks
     */
    public static final RegistrySupplier<Block> UNOWN_BLOCK_A = registerBlockItem("unown_block_a", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_B = registerBlockItem("unown_block_b", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_C = registerBlockItem("unown_block_c", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_D = registerBlockItem("unown_block_d", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_E = registerBlockItem("unown_block_e", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_F = registerBlockItem("unown_block_f", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_G = registerBlockItem("unown_block_g", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_H = registerBlockItem("unown_block_h", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_I = registerBlockItem("unown_block_i", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_J = registerBlockItem("unown_block_j", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_K = registerBlockItem("unown_block_k", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_L = registerBlockItem("unown_block_l", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_M = registerBlockItem("unown_block_m", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_N = registerBlockItem("unown_block_n", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_O = registerBlockItem("unown_block_o", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_P = registerBlockItem("unown_block_p", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_Q = registerBlockItem("unown_block_q", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_R = registerBlockItem("unown_block_r", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_S = registerBlockItem("unown_block_s", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_T = registerBlockItem("unown_block_t", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_U = registerBlockItem("unown_block_u", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_V = registerBlockItem("unown_block_v", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_W = registerBlockItem("unown_block_w", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_X = registerBlockItem("unown_block_x", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_Y = registerBlockItem("unown_block_y", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_Z = registerBlockItem("unown_block_z", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_BLANK = registerBlockItem("unown_block_blank", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_EXCLAMATION_MARK = registerBlockItem("unown_block_exclamation_mark", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> UNOWN_BLOCK_QUESTION_MARK = registerBlockItem("unown_block_question_mark", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    /**
     * Full ChargeStone Pallet
     */
    public static final RegistrySupplier<Block> CHARGE_STONE = registerStone("charge_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> CHARGE_STONE_STAIRS = registerStone("charge_stone_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(CHARGE_STONE.get())));
    public static final RegistrySupplier<SlabBlock> CHARGE_STONE_SLAB = registerStone("charge_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHARGE_STONE.get())));
    public static final RegistrySupplier<WallBlock> CHARGE_STONE_WALL = registerStone("charge_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(CHARGE_STONE.get())));
    public static final RegistrySupplier<PressurePlateBlock> CHARGE_STONE_PRESSURE_PLATE = registerStone("charge_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(CHARGE_STONE.get()), GenerationsBlockSetTypes.CHARGE_STONE));
    public static final RegistrySupplier<ButtonBlock> CHARGE_STONE_BUTTON = registerStone("charge_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(CHARGE_STONE.get()), GenerationsBlockSetTypes.CHARGE_STONE, 20, false));

    //ChargeCobbleStone
    public static final RegistrySupplier<Block> CHARGE_COBBLESTONE = registerStone("charge_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistrySupplier<StairBlock> CHARGE_COBBLESTONE_STAIRS = registerStone("charge_cobblestone_stairs", () -> new StairBlock(Blocks.COBBLESTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<SlabBlock> CHARGE_COBBLESTONE_SLAB = registerStone("charge_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<WallBlock> CHARGE_COBBLESTONE_WALL = registerStone("charge_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(CHARGE_COBBLESTONE.get())));
    //Mossy ChargeCobbleStone
    public static final RegistrySupplier<Block> MOSSY_CHARGE_COBBLESTONE = registerStone("mossy_charge_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_COBBLESTONE)));
    public static final RegistrySupplier<StairBlock> MOSSY_CHARGE_COBBLESTONE_STAIRS = registerStone("mossy_charge_cobblestone_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(MOSSY_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<SlabBlock> MOSSY_CHARGE_COBBLESTONE_SLAB = registerStone("mossy_charge_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MOSSY_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<WallBlock> MOSSY_CHARGE_COBBLESTONE_WALL = registerStone("mossy_charge_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MOSSY_CHARGE_COBBLESTONE.get())));
    //Smooth ChargeStone
    public static final RegistrySupplier<Block> SMOOTH_CHARGE_STONE = registerStone("smooth_charge_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistrySupplier<SlabBlock> SMOOTH_CHARGE_STONE_SLAB = registerStone("smooth_charge_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE_SLAB)));
    //ChargeStoneBricks
    public static final RegistrySupplier<Block> CHARGE_STONE_BRICKS = registerStone("charge_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistrySupplier<Block> CRACKED_CHARGE_STONE_BRICKS = registerStone("cracked_charge_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistrySupplier<StairBlock> CHARGE_STONE_BRICK_STAIRS = registerStone("charge_stone_brick_stairs", () -> new StairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(CHARGE_STONE_BRICKS.get())));
    public static final RegistrySupplier<SlabBlock> CHARGE_STONE_BRICK_SLAB = registerStone("charge_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CHARGE_STONE_BRICKS.get())));
    public static final RegistrySupplier<WallBlock> CHARGE_STONE_BRICK_WALL = registerStone("charge_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(CHARGE_STONE_BRICKS.get())));
    public static final RegistrySupplier<Block> CHISELED_CHARGE_STONE_BRICKS = registerStone("chiseled_charge_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final RegistrySupplier<Block> MOSSY_CHARGE_STONE_BRICKS = registerStone("mossy_charge_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
    public static final RegistrySupplier<StairBlock> MOSSY_CHARGE_STONE_BRICK_STAIRS = registerStone("mossy_charge_stone_brick_stairs", () -> new StairBlock(Blocks.MOSSY_STONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(MOSSY_CHARGE_STONE_BRICKS.get())));
    public static final RegistrySupplier<SlabBlock> MOSSY_CHARGE_STONE_BRICK_SLAB = registerStone("mossy_charge_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MOSSY_CHARGE_STONE_BRICKS.get())));
    public static final RegistrySupplier<WallBlock> MOSSY_CHARGE_STONE_BRICK_WALL = registerStone("mossy_charge_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MOSSY_CHARGE_STONE_BRICKS.get())));
    //Infested blocks
    public static final RegistrySupplier<InfestedBlock> INFESTED_CHARGE_STONE = registerStone("infested_charge_stone", () -> new InfestedBlock(CHARGE_STONE.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_CHARGE_COBBLESTONE = registerStone("infested_charge_cobblestone", () -> new InfestedBlock(CHARGE_COBBLESTONE.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_COBBLESTONE)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_CHARGE_STONE_BRICKS = registerStone("infested_charge_stone_bricks", () -> new InfestedBlock(CHARGE_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE_BRICKS)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_MOSSY_CHARGE_STONE_BRICKS = registerStone("infested_mossy_charge_stone_bricks", () -> new InfestedBlock(MOSSY_CHARGE_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_MOSSY_STONE_BRICKS)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_CRACKED_CHARGE_STONE_BRICKS = registerStone("infested_cracked_charge_stone_bricks", () -> new InfestedBlock(CRACKED_CHARGE_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_CRACKED_STONE_BRICKS)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_CHISELED_CHARGE_STONE_BRICKS = registerStone("infested_chiseled_charge_stone_bricks", () -> new InfestedBlock(CHISELED_CHARGE_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_CHISELED_STONE_BRICKS)));
    //Full ChargeStone Pallet ^

    public static final RegistrySupplier<Block> BRIGHT_CHARGE_COBBLESTONE = registerStone("bright_charge_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).lightLevel(lightLevel -> 30)));
    public static final RegistrySupplier<SlabBlock> BRIGHT_CHARGE_COBBLESTONE_SLAB = registerStone("bright_charge_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BRIGHT_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<StairBlock> BRIGHT_CHARGE_COBBLESTONE_STAIRS = registerStone("bright_charge_cobblestone_stairs", () -> new StairBlock(Blocks.COBBLESTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BRIGHT_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<WallBlock> BRIGHT_CHARGE_COBBLESTONE_WALL = registerStone("bright_charge_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BRIGHT_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<Block> GLOWING_CHARGE_COBBLESTONE = registerStone("glowing_charge_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).lightLevel(lightLevel -> 15)));
    public static final RegistrySupplier<SlabBlock> GLOWING_CHARGE_COBBLESTONE_SLAB = registerStone("glowing_charge_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GLOWING_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<StairBlock> GLOWING_CHARGE_COBBLESTONE_STAIRS = registerStone("glowing_charge_cobblestone_stairs", () -> new StairBlock(Blocks.COBBLESTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(GLOWING_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<WallBlock> GLOWING_CHARGE_COBBLESTONE_WALL = registerStone("glowing_charge_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GLOWING_CHARGE_COBBLESTONE.get())));
    public static final RegistrySupplier<PointedChargeDripstoneBlock> POINTED_CHARGE_DRIPSTONE = registerStone("pointed_charge_dripstone", () -> new PointedChargeDripstoneBlock(BlockBehaviour.Properties.copy(Blocks.POINTED_DRIPSTONE)));
    public static final RegistrySupplier<Block> CHARGE_DRIPSTONE_BLOCK = registerStone("charge_dripstone_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK)));

    /**
     * Volcanic Stone Pallet
     */
    public static final RegistrySupplier<Block> VOLCANIC_STONE = registerStone("volcanic_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> VOLCANIC_STONE_STAIRS = registerStone("volcanic_stone_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(VOLCANIC_STONE.get())));
    public static final RegistrySupplier<SlabBlock> VOLCANIC_STONE_SLAB = registerStone("volcanic_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VOLCANIC_STONE.get())));
    public static final RegistrySupplier<WallBlock> VOLCANIC_STONE_WALL = registerStone("volcanic_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VOLCANIC_STONE.get())));
    public static final RegistrySupplier<ButtonBlock> VOLCANIC_STONE_BUTTON = registerStone("volcanic_stone_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(VOLCANIC_STONE.get()), GenerationsBlockSetTypes.VOLCANIC_STONE, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> VOLCANIC_STONE_PRESSURE_PLATE = registerStone("volcanic_stone_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(VOLCANIC_STONE.get()), GenerationsBlockSetTypes.VOLCANIC_STONE));

    //Volcanic CobbleStone
    public static final RegistrySupplier<Block> VOLCANIC_COBBLESTONE = registerStone("volcanic_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistrySupplier<StairBlock> VOLCANIC_COBBLESTONE_STAIRS = registerStone("volcanic_cobblestone_stairs", () -> new StairBlock(Blocks.COBBLESTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(VOLCANIC_COBBLESTONE.get())));
    public static final RegistrySupplier<SlabBlock> VOLCANIC_COBBLESTONE_SLAB = registerStone("volcanic_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VOLCANIC_COBBLESTONE.get())));
    public static final RegistrySupplier<WallBlock> VOLCANIC_COBBLESTONE_WALL = registerStone("volcanic_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VOLCANIC_COBBLESTONE.get())));

    //Mossy Volcanic CobbleStone
    public static final RegistrySupplier<Block> MOSSY_VOLCANIC_COBBLESTONE = registerStone("mossy_volcanic_cobblestone", () -> new Block(BlockBehaviour.Properties.copy(VOLCANIC_COBBLESTONE.get())));
    public static final RegistrySupplier<StairBlock> MOSSY_VOLCANIC_COBBLESTONE_STAIRS = registerStone("mossy_volcanic_cobblestone_stairs", () -> new StairBlock(Blocks.COBBLESTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(MOSSY_VOLCANIC_COBBLESTONE.get())));
    public static final RegistrySupplier<SlabBlock> MOSSY_VOLCANIC_COBBLESTONE_SLAB = registerStone("mossy_volcanic_cobblestone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MOSSY_VOLCANIC_COBBLESTONE.get())));
    public static final RegistrySupplier<WallBlock> MOSSY_VOLCANIC_COBBLESTONE_WALL = registerStone("mossy_volcanic_cobblestone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MOSSY_VOLCANIC_COBBLESTONE.get())));

    //Smooth Volcanic Stone
    public static final RegistrySupplier<Block> SMOOTH_VOLCANIC_STONE = registerStone("smooth_volcanic_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));
    public static final RegistrySupplier<SlabBlock> SMOOTH_VOLCANIC_STONE_SLAB = registerStone("smooth_volcanic_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SMOOTH_VOLCANIC_STONE.get())));

    //Volcanic Stone Bricks
    public static final RegistrySupplier<Block> VOLCANIC_STONE_BRICKS = registerStone("volcanic_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistrySupplier<Block> CRACKED_VOLCANIC_STONE_BRICKS = registerStone("cracked_volcanic_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));
    public static final RegistrySupplier<StairBlock> VOLCANIC_STONE_BRICK_STAIRS = registerStone("volcanic_stone_brick_stairs", () -> new StairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(VOLCANIC_STONE_BRICKS.get())));
    public static final RegistrySupplier<SlabBlock> VOLCANIC_STONE_BRICK_SLAB = registerStone("volcanic_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VOLCANIC_STONE_BRICKS.get())));
    public static final RegistrySupplier<WallBlock> VOLCANIC_STONE_BRICK_WALL = registerStone("volcanic_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VOLCANIC_STONE_BRICKS.get())));
    public static final RegistrySupplier<Block> CHISELED_VOLCANIC_STONE_BRICKS = registerStone("chiseled_volcanic_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));

    //Mossy Volcanic Stone Bricks
    public static final RegistrySupplier<Block> MOSSY_VOLCANIC_STONE_BRICKS = registerStone("mossy_volcanic_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));
    public static final RegistrySupplier<StairBlock> MOSSY_VOLCANIC_STONE_BRICK_STAIRS = registerStone("mossy_volcanic_stone_brick_stairs", () -> new StairBlock(Blocks.STONE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(MOSSY_VOLCANIC_STONE_BRICKS.get())));
    public static final RegistrySupplier<SlabBlock> MOSSY_VOLCANIC_STONE_BRICK_SLAB = registerStone("mossy_volcanic_stone_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MOSSY_VOLCANIC_STONE_BRICKS.get())));
    public static final RegistrySupplier<WallBlock> MOSSY_VOLCANIC_STONE_BRICK_WALL = registerStone("mossy_volcanic_stone_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MOSSY_VOLCANIC_STONE_BRICKS.get())));
    //Infested Volcanic Stone Bricks
    public static final RegistrySupplier<InfestedBlock> INFESTED_VOLCANIC_STONE = registerStone("infested_volcanic_stone", () -> new InfestedBlock(VOLCANIC_STONE.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_VOLCANIC_COBBLESTONE = registerStone("infested_volcanic_cobblestone", () -> new InfestedBlock(VOLCANIC_COBBLESTONE.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_COBBLESTONE)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_VOLCANIC_STONE_BRICKS = registerStone("infested_volcanic_stone_bricks", () -> new InfestedBlock(VOLCANIC_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE_BRICKS)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_MOSSY_VOLCANIC_STONE_BRICKS = registerStone("infested_mossy_volcanic_stone_bricks", () -> new InfestedBlock(MOSSY_VOLCANIC_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE_BRICKS)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_CRACKED_VOLCANIC_STONE_BRICKS = registerStone("infested_cracked_volcanic_stone_bricks", () -> new InfestedBlock(CRACKED_VOLCANIC_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE_BRICKS)));
    public static final RegistrySupplier<InfestedBlock> INFESTED_CHISELED_VOLCANIC_STONE_BRICKS = registerStone("infested_chiseled_volcanic_stone_bricks", () -> new InfestedBlock(CHISELED_VOLCANIC_STONE_BRICKS.get(), BlockBehaviour.Properties.copy(Blocks.INFESTED_STONE_BRICKS)));
    //Full Volcanic Stone Pallet^

    public static final RegistrySupplier<Block> VOLCANIC_FIRESTONE = registerBlockItem("volcanic_firestone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

    public static final RegistrySupplier<Block> VOLCANIC_ROCK = registerBlockItem("volcanic_rock", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<SlabBlock> VOLCANIC_ROCK_SLAB = registerBlockItem("volcanic_rock_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(VOLCANIC_ROCK.get())));
    public static final RegistrySupplier<StairBlock> VOLCANIC_ROCK_STAIRS = registerBlockItem("volcanic_rock_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(VOLCANIC_ROCK.get())));
    public static final RegistrySupplier<WallBlock> VOLCANIC_ROCK_WALL = registerBlockItem("volcanic_rock_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(VOLCANIC_ROCK.get())));

    /**
     * Battle Subway Blocks
     */
    public static final RegistrySupplier<Block> SUBWAY_FLOOR_CROSS = registerBlockItem("subway_floor_cross", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistrySupplier<Block> SUBWAY_FLOOR_FULL_CROSS = registerBlockItem("subway_floor_full_cross", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistrySupplier<Block> SUBWAY_FLOOR_PATH = registerBlockItem("subway_floor_path", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistrySupplier<Block> SUBWAY_FLOOR_PLAIN = registerBlockItem("subway_floor_plain", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistrySupplier<Block> SUBWAY_WALL = registerBlockItem("subway_wall", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistrySupplier<Block> SUBWAY_WALL_2 = registerBlockItem("subway_wall_2", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistrySupplier<SlabBlock> SUBWAY_FLOOR_CROSS_SLAB = registerBlockItem("subway_floor_cross_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_CROSS.get())));
    public static final RegistrySupplier<SlabBlock> SUBWAY_FLOOR_FULL_CROSS_SLAB = registerBlockItem("subway_floor_full_cross_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_FULL_CROSS.get())));
    public static final RegistrySupplier<SlabBlock> SUBWAY_FLOOR_PATH_SLAB = registerBlockItem("subway_floor_path_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_PATH.get())));
    public static final RegistrySupplier<SlabBlock> SUBWAY_FLOOR_PLAIN_SLAB = registerBlockItem("subway_floor_plain_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_PLAIN.get())));
    public static final RegistrySupplier<SlabBlock> SUBWAY_WALL_SLAB = registerBlockItem("subway_wall_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SUBWAY_WALL.get())));
    public static final RegistrySupplier<SlabBlock> SUBWAY_WALL_2_SLAB = registerBlockItem("subway_wall_2_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SUBWAY_WALL_2.get())));

    public static final RegistrySupplier<StairBlock> SUBWAY_FLOOR_CROSS_STAIRS = registerBlockItem("subway_floor_cross_stairs", () -> new StairBlock(SUBWAY_FLOOR_CROSS.get().defaultBlockState(), BlockBehaviour.Properties.copy(SUBWAY_FLOOR_CROSS.get())));
    public static final RegistrySupplier<StairBlock> SUBWAY_FLOOR_FULL_CROSS_STAIRS = registerBlockItem("subway_floor_full_cross_stairs", () -> new StairBlock(SUBWAY_FLOOR_FULL_CROSS.get().defaultBlockState(), BlockBehaviour.Properties.copy(SUBWAY_FLOOR_FULL_CROSS.get())));
    public static final RegistrySupplier<StairBlock> SUBWAY_FLOOR_PATH_STAIRS = registerBlockItem("subway_floor_path_stairs", () -> new StairBlock(SUBWAY_FLOOR_PATH.get().defaultBlockState(), BlockBehaviour.Properties.copy(SUBWAY_FLOOR_PATH.get())));
    public static final RegistrySupplier<StairBlock> SUBWAY_FLOOR_PLAIN_STAIRS = registerBlockItem("subway_floor_plain_stairs", () -> new StairBlock(SUBWAY_FLOOR_PLAIN.get().defaultBlockState(), BlockBehaviour.Properties.copy(SUBWAY_FLOOR_PLAIN.get())));
    public static final RegistrySupplier<StairBlock> SUBWAY_WALL_STAIRS = registerBlockItem("subway_wall_stairs", () -> new StairBlock(SUBWAY_WALL.get().defaultBlockState(), BlockBehaviour.Properties.copy(SUBWAY_WALL.get())));
    public static final RegistrySupplier<StairBlock> SUBWAY_WALL_2_STAIRS = registerBlockItem("subway_wall_2_stairs", () -> new StairBlock(SUBWAY_WALL_2.get().defaultBlockState(), BlockBehaviour.Properties.copy(SUBWAY_WALL_2.get())));

    public static final RegistrySupplier<WallBlock> SUBWAY_FLOOR_CROSS_WALL = registerBlockItem("subway_floor_cross_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_CROSS.get())));
    public static final RegistrySupplier<WallBlock> SUBWAY_FLOOR_FULL_CROSS_WALL = registerBlockItem("subway_floor_full_cross_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_FULL_CROSS.get())));
    public static final RegistrySupplier<WallBlock> SUBWAY_FLOOR_PATH_WALL = registerBlockItem("subway_floor_path_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_PATH.get())));
    public static final RegistrySupplier<WallBlock> SUBWAY_FLOOR_PLAIN_WALL = registerBlockItem("subway_floor_plain_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SUBWAY_FLOOR_PLAIN.get())));

    /**
     * Golden Temple (Pokelantis)
     */
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_SAND = registerBlockItem("golden_temple_sand", () -> new SandBlock(0xdbd3a0, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_SANDSTONE = registerBlockItem("golden_temple_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistrySupplier<StairBlock> GOLDEN_TEMPLE_SANDSTONE_STAIRS = registerBlockItem("golden_temple_sandstone_stairs", () -> new StairBlock(Blocks.SANDSTONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SANDSTONE_STAIRS)));
    public static final RegistrySupplier<SlabBlock> GOLDEN_TEMPLE_SANDSTONE_SLAB = registerBlockItem("golden_temple_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistrySupplier<WallBlock> GOLDEN_TEMPLE_SANDSTONE_WALL = registerBlockItem("golden_temple_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_CHISELED_SANDSTONE = registerBlockItem("golden_temple_chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE)));
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_CUT_SANDSTONE = registerBlockItem("golden_temple_cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistrySupplier<SlabBlock> GOLDEN_TEMPLE_CUT_SANDSTONE_SLAB = registerBlockItem("golden_temple_cut_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_SMOOTH_SANDSTONE = registerBlockItem("golden_temple_smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistrySupplier<StairBlock> GOLDEN_TEMPLE_SMOOTH_SANDSTONE_STAIRS = registerBlockItem("golden_temple_smooth_sandstone_stairs", () -> new StairBlock(GOLDEN_TEMPLE_SMOOTH_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(GOLDEN_TEMPLE_SMOOTH_SANDSTONE.get())));
    public static final RegistrySupplier<SlabBlock> GOLDEN_TEMPLE_SMOOTH_SANDSTONE_SLAB = registerBlockItem("golden_temple_smooth_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GOLDEN_TEMPLE_SMOOTH_SANDSTONE.get())));
    public static final RegistrySupplier<WallBlock> GOLDEN_TEMPLE_SMOOTH_SANDSTONE_WALL = registerBlockItem("golden_temple_smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GOLDEN_TEMPLE_SMOOTH_SANDSTONE.get())));
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_PRISMARINE = registerBlockItem("golden_temple_prismarine", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).requiresCorrectToolForDrops().strength(1.5F, 6.0F)));
    public static final RegistrySupplier<StairBlock> GOLDEN_TEMPLE_PRISMARINE_STAIRS = registerBlockItem("golden_temple_prismarine_stairs", () -> new StairBlock(Blocks.PRISMARINE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE_STAIRS)));
    public static final RegistrySupplier<SlabBlock> GOLDEN_TEMPLE_PRISMARINE_SLAB = registerBlockItem("golden_temple_prismarine_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistrySupplier<WallBlock> GOLDEN_TEMPLE_PRISMARINE_WALL = registerBlockItem("golden_temple_prismarine_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE)));
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_DARK_PRISMARINE = registerBlockItem("golden_temple_dark_prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
    public static final RegistrySupplier<StairBlock> GOLDEN_TEMPLE_DARK_PRISMARINE_STAIRS = registerBlockItem("golden_temple_dark_prismarine_stairs", () -> new StairBlock(Blocks.DARK_PRISMARINE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE_STAIRS)));
    public static final RegistrySupplier<SlabBlock> GOLDEN_TEMPLE_DARK_PRISMARINE_SLAB = registerBlockItem("golden_temple_dark_prismarine_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
    public static final RegistrySupplier<WallBlock> GOLDEN_TEMPLE_DARK_PRISMARINE_WALL = registerBlockItem("golden_temple_dark_prismarine_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE)));
    public static final RegistrySupplier<Block> GOLDEN_TEMPLE_PRISMARINE_BRICKS = registerBlockItem("golden_temple_prismarine_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public static final RegistrySupplier<StairBlock> GOLDEN_TEMPLE_PRISMARINE_BRICK_STAIRS = registerBlockItem("golden_temple_prismarine_brick_stairs", () -> new StairBlock(Blocks.PRISMARINE_BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICK_STAIRS)));
    public static final RegistrySupplier<SlabBlock> GOLDEN_TEMPLE_PRISMARINE_BRICK_SLAB = registerBlockItem("golden_temple_prismarine_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));
    public static final RegistrySupplier<WallBlock> GOLDEN_TEMPLE_PRISMARINE_BRICK_WALL = registerBlockItem("golden_temple_prismarine_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS)));

    /**
     * Floor
     */
    public static final GenerationsBlockSet FLOOR_1_SET = new GenerationsBlockSet("floor_1", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet FLOOR_2_SET = new GenerationsBlockSet("floor_2", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet FLOOR_3_SET = new GenerationsBlockSet("floor_3", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet FLOOR_4_SET = new GenerationsBlockSet("floor_4", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet MIRROR_FLOOR_1_SET = new GenerationsBlockSet("mirror_floor_1", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet MIRROR_FLOOR_2_SET = new GenerationsBlockSet("mirror_floor_2", BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final GenerationsBlockSet MIRROR_FLOOR_3_SET = new GenerationsBlockSet("mirror_floor_3", BlockBehaviour.Properties.copy(Blocks.STONE));

    public static final RegistrySupplier<Block> ENCHANTED_OBSIDIAN = registerBlockItem("enchanted_obsidian", () -> new EnchantedObsidianBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistrySupplier<StairBlock> ENCHANTED_OBSIDIAN_STAIRS = registerBlockItem("enchanted_obsidian_stairs", () -> new StairBlock(Blocks.OBSIDIAN.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistrySupplier<SlabBlock> ENCHANTED_OBSIDIAN_SLAB = registerBlockItem("enchanted_obsidian_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistrySupplier<WallBlock> ENCHANTED_OBSIDIAN_WALL = registerBlockItem("enchanted_obsidian_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
    public static final RegistrySupplier<ButtonBlock> ENCHANTED_OBSIDIAN_BUTTON = registerBlockItem("enchanted_obsidian_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN), GenerationsBlockSetTypes.ULTRA, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ENCHANTED_OBSIDIAN_PRESSURE_PLATE = registerBlockItem("enchanted_obsidian_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OBSIDIAN), GenerationsBlockSetTypes.ULTRA));

    /**
     * Poke Bricks
     */

    public static final RegistrySupplier<Block> WHITE_POKE_BRICK = registerPokeBrick("white_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> WHITE_POKE_BRICK_STAIRS = registerPokeBrick("white_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(WHITE_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> WHITE_POKE_BRICK_SLAB = registerPokeBrick("white_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(WHITE_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> WHITE_POKE_BRICK_WALL = registerPokeBrick("white_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(WHITE_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> WHITE_POKE_BRICK_BUTTON = registerPokeBrick("white_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(WHITE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> WHITE_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("white_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(WHITE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> LIGHT_GRAY_POKE_BRICK = registerPokeBrick("light_gray_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> LIGHT_GRAY_POKE_BRICK_STAIRS = registerPokeBrick("light_gray_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(LIGHT_GRAY_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> LIGHT_GRAY_POKE_BRICK_SLAB = registerPokeBrick("light_gray_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> LIGHT_GRAY_POKE_BRICK_WALL = registerPokeBrick("light_gray_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> LIGHT_GRAY_POKE_BRICK_BUTTON = registerPokeBrick("light_gray_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> LIGHT_GRAY_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("light_gray_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(LIGHT_GRAY_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> GRAY_POKE_BRICK = registerPokeBrick("gray_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> GRAY_POKE_BRICK_STAIRS = registerPokeBrick("gray_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(GRAY_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> GRAY_POKE_BRICK_SLAB = registerPokeBrick("gray_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GRAY_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> GRAY_POKE_BRICK_WALL = registerPokeBrick("gray_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GRAY_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> GRAY_POKE_BRICK_BUTTON = registerPokeBrick("gray_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(GRAY_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> GRAY_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("gray_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(GRAY_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> BLACK_POKE_BRICK = registerPokeBrick("black_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> BLACK_POKE_BRICK_STAIRS = registerPokeBrick("black_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BLACK_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> BLACK_POKE_BRICK_SLAB = registerPokeBrick("black_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLACK_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> BLACK_POKE_BRICK_WALL = registerPokeBrick("black_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLACK_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> BLACK_POKE_BRICK_BUTTON = registerPokeBrick("black_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(BLACK_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> BLACK_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("black_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(BLACK_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> BROWN_POKE_BRICK = registerPokeBrick("brown_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> BROWN_POKE_BRICK_STAIRS = registerPokeBrick("brown_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BROWN_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> BROWN_POKE_BRICK_SLAB = registerPokeBrick("brown_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BROWN_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> BROWN_POKE_BRICK_WALL = registerPokeBrick("brown_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BROWN_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> BROWN_POKE_BRICK_BUTTON = registerPokeBrick("brown_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(BROWN_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> BROWN_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("brown_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(BROWN_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> RED_POKE_BRICK = registerPokeBrick("red_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> RED_POKE_BRICK_STAIRS = registerPokeBrick("red_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(RED_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> RED_POKE_BRICK_SLAB = registerPokeBrick("red_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RED_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> RED_POKE_BRICK_WALL = registerPokeBrick("red_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(RED_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> RED_POKE_BRICK_BUTTON = registerPokeBrick("red_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(RED_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> RED_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("red_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(RED_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> ORANGE_POKE_BRICK = registerPokeBrick("orange_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> ORANGE_POKE_BRICK_STAIRS = registerPokeBrick("orange_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> ORANGE_POKE_BRICK_SLAB = registerPokeBrick("orange_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORANGE_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> ORANGE_POKE_BRICK_WALL = registerPokeBrick("orange_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ORANGE_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> ORANGE_POKE_BRICK_BUTTON = registerPokeBrick("orange_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(ORANGE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> ORANGE_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("orange_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(ORANGE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> YELLOW_POKE_BRICK = registerPokeBrick("yellow_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> YELLOW_POKE_BRICK_STAIRS = registerPokeBrick("yellow_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(YELLOW_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> YELLOW_POKE_BRICK_SLAB = registerPokeBrick("yellow_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(YELLOW_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> YELLOW_POKE_BRICK_WALL = registerPokeBrick("yellow_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(YELLOW_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> YELLOW_POKE_BRICK_BUTTON = registerPokeBrick("yellow_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(YELLOW_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> YELLOW_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("yellow_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(YELLOW_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> LIME_POKE_BRICK = registerPokeBrick("lime_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> LIME_POKE_BRICK_STAIRS = registerPokeBrick("lime_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(LIME_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> LIME_POKE_BRICK_SLAB = registerPokeBrick("lime_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIME_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> LIME_POKE_BRICK_WALL = registerPokeBrick("lime_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIME_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> LIME_POKE_BRICK_BUTTON = registerPokeBrick("lime_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(LIME_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> LIME_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("lime_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(LIME_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> GREEN_POKE_BRICK = registerPokeBrick("green_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> GREEN_POKE_BRICK_STAIRS = registerPokeBrick("green_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(GREEN_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> GREEN_POKE_BRICK_SLAB = registerPokeBrick("green_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GREEN_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> GREEN_POKE_BRICK_WALL = registerPokeBrick("green_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GREEN_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> GREEN_POKE_BRICK_BUTTON = registerPokeBrick("green_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(GREEN_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> GREEN_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("green_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(GREEN_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> CYAN_POKE_BRICK = registerPokeBrick("cyan_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> CYAN_POKE_BRICK_STAIRS = registerPokeBrick("cyan_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(CYAN_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> CYAN_POKE_BRICK_SLAB = registerPokeBrick("cyan_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CYAN_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> CYAN_POKE_BRICK_WALL = registerPokeBrick("cyan_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(CYAN_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> CYAN_POKE_BRICK_BUTTON = registerPokeBrick("cyan_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(CYAN_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> CYAN_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("cyan_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(CYAN_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> LIGHT_BLUE_POKE_BRICK = registerPokeBrick("light_blue_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> LIGHT_BLUE_POKE_BRICK_STAIRS = registerPokeBrick("light_blue_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(LIGHT_BLUE_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> LIGHT_BLUE_POKE_BRICK_SLAB = registerPokeBrick("light_blue_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> LIGHT_BLUE_POKE_BRICK_WALL = registerPokeBrick("light_blue_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> LIGHT_BLUE_POKE_BRICK_BUTTON = registerPokeBrick("light_blue_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> LIGHT_BLUE_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("light_blue_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(LIGHT_BLUE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> BLUE_POKE_BRICK = registerPokeBrick("blue_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> BLUE_POKE_BRICK_STAIRS = registerPokeBrick("blue_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BLUE_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> BLUE_POKE_BRICK_SLAB = registerPokeBrick("blue_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLUE_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> BLUE_POKE_BRICK_WALL = registerPokeBrick("blue_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLUE_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> BLUE_POKE_BRICK_BUTTON = registerPokeBrick("blue_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(BLUE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> BLUE_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("blue_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(BLUE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> PURPLE_POKE_BRICK = registerPokeBrick("purple_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> PURPLE_POKE_BRICK_STAIRS = registerPokeBrick("purple_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(PURPLE_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> PURPLE_POKE_BRICK_SLAB = registerPokeBrick("purple_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PURPLE_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> PURPLE_POKE_BRICK_WALL = registerPokeBrick("purple_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(PURPLE_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> PURPLE_POKE_BRICK_BUTTON = registerPokeBrick("purple_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(PURPLE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> PURPLE_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("purple_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(PURPLE_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> MAGENTA_POKE_BRICK = registerPokeBrick("magenta_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> MAGENTA_POKE_BRICK_STAIRS = registerPokeBrick("magenta_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(MAGENTA_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> MAGENTA_POKE_BRICK_SLAB = registerPokeBrick("magenta_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MAGENTA_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> MAGENTA_POKE_BRICK_WALL = registerPokeBrick("magenta_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MAGENTA_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> MAGENTA_POKE_BRICK_BUTTON = registerPokeBrick("magenta_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(MAGENTA_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> MAGENTA_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("magenta_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(MAGENTA_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));

    public static final RegistrySupplier<Block> PINK_POKE_BRICK = registerPokeBrick("pink_poke_brick", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> PINK_POKE_BRICK_STAIRS = registerPokeBrick("pink_poke_brick_stairs", () -> new StairBlock(Blocks.BRICK_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(PINK_POKE_BRICK.get())));
    public static final RegistrySupplier<SlabBlock> PINK_POKE_BRICK_SLAB = registerPokeBrick("pink_poke_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PINK_POKE_BRICK.get())));
    public static final RegistrySupplier<WallBlock> PINK_POKE_BRICK_WALL = registerPokeBrick("pink_poke_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(PINK_POKE_BRICK.get())));
    public static final RegistrySupplier<ButtonBlock> PINK_POKE_BRICK_BUTTON = registerPokeBrick("pink_poke_brick_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(PINK_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK, 20, false));
    public static final RegistrySupplier<PressurePlateBlock> PINK_POKE_BRICK_PRESSURE_PLATE = registerPokeBrick("pink_poke_brick_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(PINK_POKE_BRICK.get()), GenerationsBlockSetTypes.POKE_BRICK));


    /**
     * Ore Blocks
     */
    public static final RegistrySupplier<Block> RAW_ALUMINUM_BLOCK = registerBlockItem("raw_aluminum_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));
    public static final RegistrySupplier<Block> ALUMINUM_BLOCK = registerBlockItem("aluminum_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistrySupplier<Block> SAPPHIRE_BLOCK = registerBlockItem("sapphire_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistrySupplier<StairBlock> SAPPHIRE_STAIRS = registerBlockItem("sapphire_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(SAPPHIRE_BLOCK.get())));
    public static final RegistrySupplier<SlabBlock> SAPPHIRE_SLAB = registerBlockItem("sapphire_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(SAPPHIRE_BLOCK.get())));
    public static final RegistrySupplier<WallBlock> SAPPHIRE_WALL = registerBlockItem("sapphire_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(SAPPHIRE_BLOCK.get())));

    public static final RegistrySupplier<Block> RUBY_BLOCK = registerBlockItem("ruby_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistrySupplier<StairBlock> RUBY_STAIRS = registerBlockItem("ruby_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(RUBY_BLOCK.get())));
    public static final RegistrySupplier<SlabBlock> RUBY_SLAB = registerBlockItem("ruby_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RUBY_BLOCK.get())));
    public static final RegistrySupplier<WallBlock> RUBY_WALL = registerBlockItem("ruby_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(RUBY_BLOCK.get())));



    public static final RegistrySupplier<Block> CRYSTAL_BLOCK = registerBlockItem("crystal_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    public static final RegistrySupplier<StairBlock> CRYSTAL_STAIRS = registerBlockItem("crystal_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(CRYSTAL_BLOCK.get())));
    public static final RegistrySupplier<SlabBlock> CRYSTAL_SLAB = registerBlockItem("crystal_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CRYSTAL_BLOCK.get())));
    public static final RegistrySupplier<WallBlock> CRYSTAL_WALL = registerBlockItem("crystal_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(CRYSTAL_BLOCK.get())));
    public static final RegistrySupplier<Block> CRYSTAL_LIGHT = registerBlockItem("crystal_light", () -> new Block(BlockBehaviour.Properties.copy(CRYSTAL_BLOCK.get()).lightLevel((state) -> 15)));
    public static final RegistrySupplier<Block> SILICON_BLOCK = registerBlockItem("silicon_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));
    /**
     * Ultra Space
     */
    public static final RegistrySupplier<Block> ULTRA_SANDSTONE = registerBlockItem("ultra_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistrySupplier<StairBlock> ULTRA_SANDSTONE_STAIRS = registerBlockItem("ultra_sandstone_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(ULTRA_SANDSTONE.get())));
    public static final RegistrySupplier<SlabBlock> ULTRA_SANDSTONE_SLAB = registerBlockItem("ultra_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ULTRA_SANDSTONE.get())));
    public static final RegistrySupplier<WallBlock> ULTRA_SANDSTONE_WALL = registerBlockItem("ultra_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ULTRA_SANDSTONE.get())));
    public static final RegistrySupplier<Block> ULTRA_SMOOTH_SANDSTONE = registerBlockItem("ultra_smooth_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistrySupplier<StairBlock> ULTRA_SMOOTH_SANDSTONE_STAIRS = registerBlockItem("ultra_smooth_sandstone_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(ULTRA_SMOOTH_SANDSTONE.get())));
    public static final RegistrySupplier<SlabBlock> ULTRA_SMOOTH_SANDSTONE_SLAB = registerBlockItem("ultra_smooth_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ULTRA_SMOOTH_SANDSTONE.get())));
    public static final RegistrySupplier<WallBlock> ULTRA_SMOOTH_SANDSTONE_WALL = registerBlockItem("ultra_smooth_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(ULTRA_SMOOTH_SANDSTONE.get())));
    public static final RegistrySupplier<Block> ULTRA_CHISELED_SANDSTONE = registerBlockItem("ultra_chiseled_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE)));
    public static final RegistrySupplier<Block> ULTRA_CUT_SANDSTONE = registerBlockItem("ultra_cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE)));
    public static final RegistrySupplier<SlabBlock> ULTRA_CUT_SANDSTONE_SLAB = registerBlockItem("ultra_cut_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ULTRA_CUT_SANDSTONE.get())));
    public static final RegistrySupplier<Block> GHOST_LANTERN = registerBlockItem("ghost_lantern", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.5f).lightLevel((lightLevel) -> 15)));
    public static final RegistrySupplier<Block> GHOST_BRICKS = registerBlockItem("ghost_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> GHOST_BRICK_STAIRS = registerBlockItem("ghost_brick_stairs", () -> new StairBlock(GHOST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(GHOST_BRICKS.get())));
    public static final RegistrySupplier<SlabBlock> GHOST_BRICK_SLAB = registerBlockItem("ghost_brick_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GHOST_BRICKS.get())));
    public static final RegistrySupplier<WallBlock> GHOST_BRICK_WALL = registerBlockItem("ghost_brick_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GHOST_BRICKS.get())));
    public static final RegistrySupplier<Block> GHOST_OBELISK = registerBlockItem("ghost_obelisk", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> GHOST_OBELISK_STAIRS = registerBlockItem("ghost_obelisk_stairs", () -> new StairBlock(GHOST_OBELISK.get().defaultBlockState(), BlockBehaviour.Properties.copy(GHOST_OBELISK.get())));
    public static final RegistrySupplier<SlabBlock> GHOST_OBELISK_SLAB = registerBlockItem("ghost_obelisk_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GHOST_OBELISK.get())));
    public static final RegistrySupplier<WallBlock> GHOST_OBELISK_WALL = registerBlockItem("ghost_obelisk_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GHOST_OBELISK.get())));
    public static final RegistrySupplier<Block> GHOST_PILLAR_SIDE = registerBlockItem("ghost_pillar_side", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> GHOST_PILLAR_SIDE_STAIRS = registerBlockItem("ghost_pillar_side_stairs", () -> new StairBlock(GHOST_PILLAR_SIDE.get().defaultBlockState(), BlockBehaviour.Properties.copy(GHOST_PILLAR_SIDE.get())));
    public static final RegistrySupplier<SlabBlock> GHOST_PILLAR_SIDE_SLAB = registerBlockItem("ghost_pillar_side_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GHOST_PILLAR_SIDE.get())));
    public static final RegistrySupplier<WallBlock> GHOST_PILLAR_SIDE_WALL = registerBlockItem("ghost_pillar_side_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GHOST_PILLAR_SIDE.get())));
    public static final RegistrySupplier<Block> GHOST_PILLAR_TOP = registerBlockItem("ghost_pillar_top", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> GHOST_PILLAR_TOP_STAIRS = registerBlockItem("ghost_pillar_top_stairs", () -> new StairBlock(GHOST_PILLAR_TOP.get().defaultBlockState(), BlockBehaviour.Properties.copy(GHOST_PILLAR_TOP.get())));
    public static final RegistrySupplier<SlabBlock> GHOST_PILLAR_TOP_SLAB = registerBlockItem("ghost_pillar_top_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GHOST_PILLAR_TOP.get())));
    public static final RegistrySupplier<WallBlock> GHOST_PILLAR_TOP_WALL = registerBlockItem("ghost_pillar_top_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(GHOST_PILLAR_TOP.get())));
    public static final RegistrySupplier<Block> MIRROR_GLASS = registerBlockItem("mirror_glass", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(.5f)));
    public static final RegistrySupplier<StairBlock>  MIRROR_GLASS_STAIRS = registerBlockItem("mirror_glass_stairs", () -> new StairBlock(MIRROR_GLASS.get().defaultBlockState(), BlockBehaviour.Properties.copy(MIRROR_GLASS.get())));
    public static final RegistrySupplier<SlabBlock> MIRROR_GLASS_SLAB = registerBlockItem("mirror_glass_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MIRROR_GLASS.get())));
    public static final RegistrySupplier<WallBlock> MIRROR_GLASS_WALL = registerBlockItem("mirror_glass_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(MIRROR_GLASS.get())));

    public static final RegistrySupplier<Block> NORMAL_SANDSTONE = registerBlockItem("normal_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE)));
    public static final RegistrySupplier<StairBlock> NORMAL_SANDSTONE_STAIRS = registerBlockItem("normal_sandstone_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(NORMAL_SANDSTONE.get())));
    public static final RegistrySupplier<SlabBlock> NORMAL_SANDSTONE_SLAB = registerBlockItem("normal_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(NORMAL_SANDSTONE.get())));
    public static final RegistrySupplier<WallBlock> NORMAL_SANDSTONE_WALL = registerBlockItem("normal_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(NORMAL_SANDSTONE.get())));
    public static final RegistrySupplier<Block> BRIGHT_SANDSTONE = registerBlockItem("bright_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).lightLevel((lightLevel) -> 15)));
    public static final RegistrySupplier<StairBlock> BRIGHT_SANDSTONE_STAIRS = registerBlockItem("bright_sandstone_stairs", () -> new StairBlock(Blocks.STONE_STAIRS.defaultBlockState(), BlockBehaviour.Properties.copy(BRIGHT_SANDSTONE.get())));
    public static final RegistrySupplier<SlabBlock> BRIGHT_SANDSTONE_SLAB = registerBlockItem("bright_sandstone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BRIGHT_SANDSTONE.get())));
    public static final RegistrySupplier<WallBlock> BRIGHT_SANDSTONE_WALL = registerBlockItem("bright_sandstone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BRIGHT_SANDSTONE.get())));
    public static final RegistrySupplier<Block> MACHINE_BLOCK = registerBlockItem("machine_block", () -> new MachineBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<Block> OCEAN_BLOCK = registerBlockItem("ocean_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> OCEAN_BLOCK_STAIRS = registerBlockItem("ocean_block_stairs", () -> new StairBlock(OCEAN_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(OCEAN_BLOCK.get())));
    public static final RegistrySupplier<SlabBlock> OCEAN_BLOCK_SLAB = registerBlockItem("ocean_block_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(OCEAN_BLOCK.get())));
    public static final RegistrySupplier<WallBlock> OCEAN_BLOCK_WALL = registerBlockItem("ocean_block_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(OCEAN_BLOCK.get())));

    public static final RegistrySupplier<Block> WATER_QUARTZ = registerBlockItem("water_quartz", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistrySupplier<StairBlock> WATER_QUARTZ_STAIRS = registerBlockItem("water_quartz_stairs", () -> new StairBlock(WATER_QUARTZ.get().defaultBlockState(), BlockBehaviour.Properties.copy(WATER_QUARTZ.get())));
    public static final RegistrySupplier<SlabBlock> WATER_QUARTZ_SLAB = registerBlockItem("water_quartz_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(WATER_QUARTZ.get())));
    public static final RegistrySupplier<WallBlock> WATER_QUARTZ_WALL = registerBlockItem("water_quartz_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(WATER_QUARTZ.get())));
    public static final RegistrySupplier<Block> CONCRETE_TOP = registerBlockItem("concrete_top", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACK_CONCRETE)));
    public static final RegistrySupplier<StairBlock> CONCRETE_TOP_STAIRS = registerBlockItem("concrete_top_stairs", () -> new StairBlock(CONCRETE_TOP.get().defaultBlockState(), BlockBehaviour.Properties.copy(CONCRETE_TOP.get())));
    public static final RegistrySupplier<SlabBlock> CONCRETE_TOP_SLAB = registerBlockItem("concrete_top_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CONCRETE_TOP.get())));
    public static final RegistrySupplier<WallBlock> CONCRETE_TOP_WALL = registerBlockItem("concrete_top_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(CONCRETE_TOP.get())));
    public static final RegistrySupplier<Block> RUINS_SAND = registerBlockItem("ruins_sand", () -> new SandBlock(0xdbd3a0, BlockBehaviour.Properties.copy(Blocks.SAND)));
    public static final RegistrySupplier<Block> BURST_TURF = registerBlockItem("burst_turf", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)));

    //Rich Soil
    public static final RegistrySupplier<Block> RICH_SOIL_1 = registerBlockItem("rich_soil_1", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistrySupplier<Block> RICH_SOIL_2 = registerBlockItem("rich_soil_2", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistrySupplier<Block> RICH_SOIL_3 = registerBlockItem("rich_soil_3", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistrySupplier<Block> RICH_SOIL_4 = registerBlockItem("rich_soil_4", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    //Bleach Stone
    public static final RegistrySupplier<Block> BLEACH_STONE = registerBlockItem("bleach_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> BLEACH_STONE_STAIRS = registerBlockItem("bleach_stone_stairs", () -> new StairBlock(BLEACH_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(BLEACH_STONE.get())));
    public static final RegistrySupplier<SlabBlock> BLEACH_STONE_SLAB = registerBlockItem("bleach_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLEACH_STONE.get())));
    public static final RegistrySupplier<WallBlock> BLEACH_STONE_WALL = registerBlockItem("bleach_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(BLEACH_STONE.get())));

    //Shingles
    public static final RegistrySupplier<Block> WHITE_SHINGLES = registerBlockItem("white_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> WHITE_SHINGLES_STAIRS = registerBlockItem("white_shingles_stairs", () -> new StairBlock(WHITE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(WHITE_SHINGLES.get())));
    public static final RegistrySupplier<SlabBlock> WHITE_SHINGLES_SLAB = registerBlockItem("white_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(WHITE_SHINGLES.get())));
    public static final RegistrySupplier<Block> LIGHT_GRAY_SHINGLES = registerBlockItem("light_gray_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> LIGHT_GRAY_SHINGLES_STAIRS = registerBlockItem("light_gray_shingles_stairs", () -> new StairBlock(LIGHT_GRAY_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(LIGHT_GRAY_SHINGLES.get())));
    public static final RegistrySupplier<Block> LIGHT_GRAY_SHINGLES_SLAB = registerBlockItem("light_gray_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIGHT_GRAY_SHINGLES.get())));
    public static final RegistrySupplier<Block> GRAY_SHINGLES = registerBlockItem("gray_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> GRAY_SHINGLES_STAIRS = registerBlockItem("gray_shingles_stairs", () -> new StairBlock(GRAY_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(GRAY_SHINGLES.get())));
    public static final RegistrySupplier<Block> GRAY_SHINGLES_SLAB = registerBlockItem("gray_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GRAY_SHINGLES.get())));
    public static final RegistrySupplier<Block> BLACK_SHINGLES = registerBlockItem("black_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> BLACK_SHINGLES_STAIRS = registerBlockItem("black_shingles_stairs", () -> new StairBlock(BLACK_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BLACK_SHINGLES.get())));
    public static final RegistrySupplier<Block> BLACK_SHINGLES_SLAB = registerBlockItem("black_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLACK_SHINGLES.get())));
    public static final RegistrySupplier<Block> BROWN_SHINGLES = registerBlockItem("brown_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> BROWN_SHINGLES_STAIRS = registerBlockItem("brown_shingles_stairs", () -> new StairBlock(BROWN_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BROWN_SHINGLES.get())));
    public static final RegistrySupplier<Block> BROWN_SHINGLES_SLAB = registerBlockItem("brown_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BROWN_SHINGLES.get())));
    public static final RegistrySupplier<Block> RED_SHINGLES = registerBlockItem("red_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> RED_SHINGLES_STAIRS = registerBlockItem("red_shingles_stairs", () -> new StairBlock(RED_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(RED_SHINGLES.get())));
    public static final RegistrySupplier<Block> RED_SHINGLES_SLAB = registerBlockItem("red_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(RED_SHINGLES.get())));
    public static final RegistrySupplier<Block> ORANGE_SHINGLES = registerBlockItem("orange_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> ORANGE_SHINGLES_STAIRS = registerBlockItem("orange_shingles_stairs", () -> new StairBlock(ORANGE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_SHINGLES.get())));
    public static final RegistrySupplier<Block> ORANGE_SHINGLES_SLAB = registerBlockItem("orange_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(ORANGE_SHINGLES.get())));
    public static final RegistrySupplier<Block> YELLOW_SHINGLES = registerBlockItem("yellow_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> YELLOW_SHINGLES_STAIRS = registerBlockItem("yellow_shingles_stairs", () -> new StairBlock(YELLOW_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(YELLOW_SHINGLES.get())));
    public static final RegistrySupplier<Block> YELLOW_SHINGLES_SLAB = registerBlockItem("yellow_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(YELLOW_SHINGLES.get())));
    public static final RegistrySupplier<Block> LIME_SHINGLES = registerBlockItem("lime_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> LIME_SHINGLES_STAIRS = registerBlockItem("lime_shingles_stairs", () -> new StairBlock(LIME_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(LIME_SHINGLES.get())));
    public static final RegistrySupplier<Block> LIME_SHINGLES_SLAB = registerBlockItem("lime_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIME_SHINGLES.get())));
    public static final RegistrySupplier<Block> GREEN_SHINGLES = registerBlockItem("green_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> GREEN_SHINGLES_STAIRS = registerBlockItem("green_shingles_stairs", () -> new StairBlock(GREEN_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(GREEN_SHINGLES.get())));
    public static final RegistrySupplier<Block> GREEN_SHINGLES_SLAB = registerBlockItem("green_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(GREEN_SHINGLES.get())));
    public static final RegistrySupplier<Block> CYAN_SHINGLES = registerBlockItem("cyan_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> CYAN_SHINGLES_STAIRS = registerBlockItem("cyan_shingles_stairs", () -> new StairBlock(CYAN_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(CYAN_SHINGLES.get())));
    public static final RegistrySupplier<Block> CYAN_SHINGLES_SLAB = registerBlockItem("cyan_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(CYAN_SHINGLES.get())));
    public static final RegistrySupplier<Block> LIGHT_BLUE_SHINGLES = registerBlockItem("light_blue_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> LIGHT_BLUE_SHINGLES_STAIRS = registerBlockItem("light_blue_shingles_stairs", () -> new StairBlock(LIGHT_BLUE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(LIGHT_BLUE_SHINGLES.get())));
    public static final RegistrySupplier<Block> LIGHT_BLUE_SHINGLES_SLAB = registerBlockItem("light_blue_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(LIGHT_BLUE_SHINGLES.get())));
    public static final RegistrySupplier<Block> BLUE_SHINGLES = registerBlockItem("blue_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> BLUE_SHINGLES_STAIRS = registerBlockItem("blue_shingles_stairs", () -> new StairBlock(BLUE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(BLUE_SHINGLES.get())));
    public static final RegistrySupplier<Block> BLUE_SHINGLES_SLAB = registerBlockItem("blue_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(BLUE_SHINGLES.get())));
    public static final RegistrySupplier<Block> PURPLE_SHINGLES = registerBlockItem("purple_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> PURPLE_SHINGLES_STAIRS = registerBlockItem("purple_shingles_stairs", () -> new StairBlock(PURPLE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(PURPLE_SHINGLES.get())));
    public static final RegistrySupplier<Block> PURPLE_SHINGLES_SLAB = registerBlockItem("purple_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PURPLE_SHINGLES.get())));
    public static final RegistrySupplier<Block> MAGENTA_SHINGLES = registerBlockItem("magenta_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> MAGENTA_SHINGLES_STAIRS = registerBlockItem("magenta_shingles_stairs", () -> new StairBlock(MAGENTA_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(MAGENTA_SHINGLES.get())));
    public static final RegistrySupplier<Block> MAGENTA_SHINGLES_SLAB = registerBlockItem("magenta_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(MAGENTA_SHINGLES.get())));
    public static final RegistrySupplier<Block> PINK_SHINGLES = registerBlockItem("pink_shingles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS)));
    public static final RegistrySupplier<StairBlock> PINK_SHINGLES_STAIRS = registerBlockItem("pink_shingles_stairs", () -> new StairBlock(PINK_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(PINK_SHINGLES.get())));
    public static final RegistrySupplier<Block> PINK_SHINGLES_SLAB = registerBlockItem("pink_shingles_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(PINK_SHINGLES.get())));

    public static final RegistrySupplier<Block> COOL_STONE = registerBlockItem("cool_stone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistrySupplier<StairBlock> COOL_STONE_STAIRS = registerBlockItem("cool_stone_stairs", () -> new StairBlock(COOL_STONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(COOL_STONE.get())));
    public static final RegistrySupplier<SlabBlock> COOL_STONE_SLAB = registerBlockItem("cool_stone_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(COOL_STONE.get())));
    public static final RegistrySupplier<WallBlock> COOL_STONE_WALL = registerBlockItem("cool_stone_wall", () -> new WallBlock(BlockBehaviour.Properties.copy(COOL_STONE.get())));
    /**
     * 1 Block Tall Ballonlea Mushrooms
     */
    public static final RegistrySupplier<GenerationsMushroomBlock> BALLONLEA_BLUE_MUSHROOM = registerBlockItem("ballonlea_blue_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.BALLONLEA_BLUE_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> BALLONLEA_GREEN_MUSHROOM = registerBlockItem("ballonlea_green_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.BALLONLEA_GREEN_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> BALLONLEA_PINK_MUSHROOM = registerBlockItem("ballonlea_pink_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.BALLONLEA_PINK_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> BALLONLEA_YELLOW_MUSHROOM = registerBlockItem("ballonlea_yellow_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.BALLONLEA_YELLOW_MUSHROOM));

    public static final RegistrySupplier<GenerationsMushroomBlock> GROUP_BALLONLEA_BLUE_MUSHROOM = registerBlockItem("group_ballonlea_blue_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.GROUP_BALLONLEA_BLUE_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> GROUP_BALLONLEA_GREEN_MUSHROOM = registerBlockItem("group_ballonlea_green_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.GROUP_BALLONLEA_GREEN_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> GROUP_BALLONLEA_PINK_MUSHROOM = registerBlockItem("group_ballonlea_pink_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.GROUP_BALLONLEA_PINK_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> GROUP_BALLONLEA_YELLOW_MUSHROOM = registerBlockItem("group_ballonlea_yellow_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.GROUP_BALLONLEA_YELLOW_MUSHROOM));

    public static final RegistrySupplier<GenerationsMushroomBlock> TALL_BALLONLEA_BLUE_MUSHROOM = registerBlockItem("tall_ballonlea_blue_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.TALL_BALLONLEA_BLUE_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> TALL_BALLONLEA_GREEN_MUSHROOM = registerBlockItem("tall_ballonlea_green_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.TALL_BALLONLEA_GREEN_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> TALL_BALLONLEA_PINK_MUSHROOM = registerBlockItem("tall_ballonlea_pink_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.TALL_BALLONLEA_PINK_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> TALL_BALLONLEA_YELLOW_MUSHROOM = registerBlockItem("tall_ballonlea_yellow_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.TALL_BALLONLEA_YELLOW_MUSHROOM));

    public static final RegistrySupplier<GenerationsMushroomBlock> DOUBLE_BALLONLEA_BLUE_MUSHROOM = registerBlockItem("double_ballonlea_blue_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.DOUBLE_BALLONLEA_BLUE_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> DOUBLE_BALLONLEA_GREEN_MUSHROOM = registerBlockItem("double_ballonlea_green_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.DOUBLE_BALLONLEA_GREEN_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> DOUBLE_BALLONLEA_PINK_MUSHROOM = registerBlockItem("double_ballonlea_pink_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.DOUBLE_BALLONLEA_PINK_MUSHROOM));
    public static final RegistrySupplier<GenerationsMushroomBlock> DOUBLE_BALLONLEA_YELLOW_MUSHROOM = registerBlockItem("double_ballonlea_yellow_mushroom", () -> new GenerationsMushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM).dynamicShape().lightLevel(value -> 6), GenerationsFeatures.DOUBLE_BALLONLEA_YELLOW_MUSHROOM));

    /**
     * PokeBall Chests
     **/
    public static final RegistrySupplier<GenericChestBlock> POKEBALL_CHEST = registerChestBlockItem("pokeball_chest", () -> new GenericChestBlock(BlockBehaviour.Properties.copy(Blocks.CHEST),  9, 4, "pokeball_chest"));
    public static final RegistrySupplier<GenericChestBlock> GREATBALL_CHEST = registerChestBlockItem("greatball_chest", () -> new GenericChestBlock(BlockBehaviour.Properties.copy(Blocks.CHEST),  9, 5, "greatball_chest"));
    public static final RegistrySupplier<GenericChestBlock> ULTRABALL_CHEST = registerChestBlockItem("ultraball_chest", () -> new GenericChestBlock(BlockBehaviour.Properties.copy(Blocks.CHEST),  9, 6, "ultraball_chest"));
    public static final RegistrySupplier<GenericChestBlock> MASTERBALL_CHEST = registerChestBlockItem("masterball_chest", () -> new GenericChestBlock(BlockBehaviour.Properties.copy(Blocks.CHEST),  12, 8, "masterball_chest"));

    public static <T extends Block> RegistrySupplier<T> registerBlockItem(String name, Supplier<T> blockSupplier) {
        RegistrySupplier<T> block = BLOCKS.register(name, blockSupplier);
        register(name, properties -> new BlockItem(block.get(), properties));
        return block;
    }

    private static <T extends Block> RegistrySupplier<T> registerUltraBlock(String name, Supplier<T> blockSupplier) {
        RegistrySupplier<T> block = ULTRA_BLOCKS.register(name, blockSupplier);
        register(name, properties -> new BlockItem(block.get(), properties));
        return block;
    }

    private static <T extends Block> RegistrySupplier<T> registerPokeBrick(String name, Supplier<T> blockSupplier) {
        RegistrySupplier<T> block = POKEBRICKS.register(name, blockSupplier);
        register(name, properties -> new BlockItem(block.get(), properties));
        return block;
    }

    private static <T extends Block> RegistrySupplier<T> registerMarble(String name, Supplier<T> blockSupplier) {
        RegistrySupplier<T> block = MARBLE.register(name, blockSupplier);
        register(name, properties -> new BlockItem(block.get(), properties));
        return block;
    }

    private static <T extends GenericChestBlock> RegistrySupplier<T> registerChestBlockItem(String name, Supplier<T> blockSupplier) {
        RegistrySupplier<T> block = BLOCKS.register(name, blockSupplier);
        register(name, properties -> new GenericChestBlockItem(block.get(), properties));
        return block;
    }
    
    private static <T extends Block> RegistrySupplier<T> registerStone(String name, Supplier<T> blockSupplier) {
        RegistrySupplier<T> block = STONE.register(name, blockSupplier);
        register(name, properties -> new BlockItem(block.get(), properties));
        return block;
    }

    private static void register(String name, Function<Item.Properties, Item> itemSupplier) {
        BLOCK_ITEMS.register(name, () -> itemSupplier.apply(new Item.Properties().arch$tab(GenerationsCreativeTabs.BUILDING_BLOCKS)));
    }

    public static void init() {
        GenerationsCore.LOGGER.info("Registering Generations Blocks");
        BLOCKS.register();
        POKEBRICKS.register();
        MARBLE.register();
        ULTRA_BLOCKS.register();
        STONE.register();
        BLOCK_ITEMS.register();
    }
}
