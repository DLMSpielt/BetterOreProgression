package net.dlmspielt.betteroreprogression.item;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//enderite Items from netherite 35 hue!!!
public class ModItems {

    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterOreProgression.MOD_ID , name), item);
    }

    public static void registerModItems() {
        BetterOreProgression.LOGGER.info("Registering Mod Items for" + BetterOreProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(ENDERITE_INGOT);
                });
    }
}
