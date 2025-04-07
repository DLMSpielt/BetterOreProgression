package net.dlmspielt.betteroreprogression.tags.item;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> REPAIRS_COOPER_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(BetterOreProgression.MOD_ID, "repairs_cooper_armor"));
    public static final TagKey<Item> REPAIRS_ENDERITE_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(BetterOreProgression.MOD_ID, "repairs_enderite_armor"));
}
