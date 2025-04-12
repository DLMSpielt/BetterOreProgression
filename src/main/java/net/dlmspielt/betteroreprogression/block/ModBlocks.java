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

    public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(0,0),
                    AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(BlockSoundGroup.STONE)));



    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterOreProgression.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BetterOreProgression.MOD_ID,name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        BetterOreProgression.LOGGER.info("Registering Mod Block For the Mod" + BetterOreProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.ENDERITE_ORE);
        });
    }
}
