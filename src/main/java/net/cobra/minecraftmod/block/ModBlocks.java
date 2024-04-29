package net.cobra.minecraftmod.block;

import net.cobra.minecraftmod.MinecraftMod;
import net.cobra.minecraftmod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    private static void addBlocksToBuilding_BlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.RUBY_BLOCK);
        entries.add(ModBlocks.RADIANT_BLOCK);
        entries.add(ModBlocks.SAPPHIRE_BLOCK);
        entries.add(ModBlocks.GREEN_SAPPHIRE_BLOCK);
        entries.add(ModBlocks.PINK_GARNET_BLOCK);
        entries.add(ModBlocks.BLUE_GARNET_BLOCK);
    }
    private static void addBlocksToNaturalBlocksItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.RUBY_ORE);
        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
        entries.add(ModBlocks.GREEN_SAPPHIRE_ORE);
        entries.add(ModBlocks.DEEPSLATE_GREEN_SAPPHIRE_ORE);
        entries.add(ModBlocks.SAPPHIRE_ORE);
        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        entries.add(ModBlocks.DEEPSLATE_BLUE_GARNET_ORE);
        entries.add(ModBlocks.BLUE_GARNET_ORE);
        entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
        entries.add(ModBlocks.PINK_GARNET_ORE);
    }

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.create().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).hardness(5.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.BRIGHT_RED).sounds(ModSounds.RUBY_BLOCK_SOUNDS)));
    public static final Block RADIANT_BLOCK = registerBlock("radiant_block",
            new Block(FabricBlockSettings.create().strength(4.0f, 5.0f).sounds(BlockSoundGroup.METAL).hardness(4.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.DARK_RED)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.create().strength(3.0f, 4.0f).sounds(BlockSoundGroup.METAL).hardness(3.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.BLUE)));
    public static final Block GREEN_SAPPHIRE_BLOCK = registerBlock("green_sapphire_block",
            new Block(FabricBlockSettings.create().strength(3.0f, 4.0f).sounds(BlockSoundGroup.METAL).hardness(3.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 7), FabricBlockSettings.create().strength(4.0f, 4.0f).sounds(BlockSoundGroup.STONE).hardness(4.0f).requiresTool().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASS)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6), FabricBlockSettings.create().strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE).hardness(4.5f).requiresTool().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASS)));
    public static final Block GREEN_SAPPHIRE_ORE = registerBlock("green_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 8), FabricBlockSettings.create().strength(2.5f, 2.5f).sounds(BlockSoundGroup.STONE).hardness(2.5f).requiresTool().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASS)));
    public static final Block DEEPSLATE_GREEN_SAPPHIRE_ORE = registerBlock("deepslate_green_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 9), FabricBlockSettings.create().strength(3.5f, 3.5f).sounds(BlockSoundGroup.STONE).hardness(3.5f).requiresTool().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASS)));
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.create().strength(2.5f, 2.5f).sounds(BlockSoundGroup.STONE).hardness(2.5f).requiresTool().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASS)));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(4, 9), FabricBlockSettings.create().strength(3.5f, 3.5f).sounds(BlockSoundGroup.STONE).hardness(3.5f).requiresTool().mapColor(MapColor.STONE_GRAY).instrument(Instrument.BASS)));

    public static final Block BLUE_GARNET_BLOCK = registerBlock("blue_garnet_block",
            new Block(FabricBlockSettings.create().strength(5.5f, 5.0f).sounds(BlockSoundGroup.AMETHYST_CLUSTER).hardness(5.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            new Block(FabricBlockSettings.create().strength(5.5f, 5.0f).sounds(BlockSoundGroup.AMETHYST_CLUSTER).hardness(5.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.RAW_IRON_PINK)));
    public static final Block BLUE_GARNET_ORE = registerBlock("blue_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.create().strength(7.0f, 6.0f).sounds(BlockSoundGroup.STONE).hardness(6.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block DEEPSLATE_BLUE_GARNET_ORE = registerBlock("deepslate_blue_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.create().strength(8.0f, 7.0f).sounds(BlockSoundGroup.STONE).hardness(7.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.BLUE)));
    public static final Block PINK_GARNET_ORE = registerBlock("pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.create().strength(7.0f, 6.0f).sounds(BlockSoundGroup.STONE).hardness(6.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.PINK)));
    public static final Block DEEPSLATE_PINK_GARNET_ORE = registerBlock("deepslate_pink_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.create().strength(8.0f, 7.0f).sounds(BlockSoundGroup.STONE).hardness(7.0f).requiresTool().instrument(Instrument.BELL).mapColor(MapColor.TERRACOTTA_PINK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);

        return Registry.register(Registries.BLOCK, new Identifier(MinecraftMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MinecraftMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        MinecraftMod.LOGGER.info("Registering ModBlocks for" + MinecraftMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addBlocksToBuilding_BlocksItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addBlocksToNaturalBlocksItemGroup);
    }

}
