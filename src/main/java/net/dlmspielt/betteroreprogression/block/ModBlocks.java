package net.dlmspielt.betteroreprogression.block;

import net.dlmspielt.betteroreprogression.BetterOreProgression;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

   public static final Block ENDERIETE_ORE_BLOCK = registerBlock("enderite_ore_block",
           new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK,
                           Identifier.of(BetterOreProgression.MOD_ID,"enderite_ore_block"))).strength(5f)
                   .requiresTool().sounds(BlockSoundGroup.STONE)));


    private static void registerModBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BetterOreProgression.MOD_ID,name)
        , new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterOreProgression.MOD_ID, name)))));
    }
    private static Block registerBlock(String name, Block block){
        registerModBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterOreProgression.MOD_ID, name), block);
    }

  public static void registerModBlocks(){
      BetterOreProgression.LOGGER.info("Registering Mod added Block for" + BetterOreProgression.MOD_ID);
      ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries ->{
          entries.add(ModBlocks.ENDERIETE_ORE_BLOCK);
      });
  }

    }
