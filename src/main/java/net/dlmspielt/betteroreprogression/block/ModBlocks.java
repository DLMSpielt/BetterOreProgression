package net.dlmspielt.betteroreprogression.block;

import net.dlmspielt.betteroreprogression.BetterOreProgression;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
//Enderite blocks
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0,0),
                    AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.STONE)));
public static final Block ENDERITE_BLOCK = registerBlockfireproof("enderite_block",
        new Block(AbstractBlock.Settings.create().strength(75f,2400f).requiresTool()
                .sounds(BlockSoundGroup.NETHERITE)));
public static final Block RAW_ENDERITE_BLOCK = registerBlockfireproof("raw_enderite_block",
         new Block(AbstractBlock.Settings.create().strength(50f,1200f).requiresTool()
                 .sounds(BlockSoundGroup.NETHERITE)));

//Blue Gold blocks
    public static final Block BLUE_GOLD_BLOCK = registerBlock("blue_gold_block",
        new Block(AbstractBlock.Settings.create().strength(6.0f,7.0f).requiresTool()));

    //Crystal of End Blocks
    public static final Block END_CRYSTAL_ORE = registerBlock("end_crystal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0,6),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block END_CRYSTAL_BLOCK = registerBlock("end_crystal_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterOreProgression.MOD_ID, name), block);
    }
    private static Block registerBlockfireproof(String name, Block block){
        registerBlockItemfireproof(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterOreProgression.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BetterOreProgression.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }
    private static void registerBlockItemfireproof(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BetterOreProgression.MOD_ID,name),
                new BlockItem(block, new Item.Settings().fireproof()));
    }

    public static void registerModBlocks(){
        BetterOreProgression.LOGGER.info("Registering Mod Block For the Mod" + BetterOreProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.ENDERITE_ORE);
            entries.add(ModBlocks.END_CRYSTAL_ORE);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.BLUE_GOLD_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.ENDERITE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_ENDERITE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.END_CRYSTAL_BLOCK);

        });
    }
}
