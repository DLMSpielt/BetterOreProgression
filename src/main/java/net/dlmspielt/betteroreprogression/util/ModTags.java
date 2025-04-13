package net.dlmspielt.betteroreprogression.util;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks{
        public static final TagKey<Block> NEEDS_BLUE_GOLD_TOOL = createTag("needs_blue_gold_tool");
        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> NEEDS_ENDERITE_TOOL = createTag("needs_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createTag("incorrect_for_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLUE_GOLD_TOOL = createTag("incorrect_for_blue_gold_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");



        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(BetterOreProgression.MOD_ID, name));
        }
    }

    public static class Items{
        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(BetterOreProgression.MOD_ID, name));
        }
    }
}
