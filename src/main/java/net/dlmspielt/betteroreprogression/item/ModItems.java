package net.dlmspielt.betteroreprogression.item;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.spongepowered.include.com.google.common.base.Function;

public class ModItems {
    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterOreProgression.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    //Items Register
public static final Item ENDERITE_INGOT = register("enderite_ingot", Item :: new, new Item.Settings().fireproof());
    public static final Item ENDERITE_PIECE = register("enderite_piece", Item :: new, new Item.Settings().fireproof());
    public static final Item ENDERITE_ORE = register("enderite_ore", Item :: new, new Item.Settings().fireproof());
    public static final Item END_CRYSTAL = register("end_crystal", Item :: new, new Item.Settings().fireproof());




    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_PIECE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_ORE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.END_CRYSTAL));
    }
}