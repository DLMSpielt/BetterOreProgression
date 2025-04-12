package net.dlmspielt.betteroreprogression.item;

import net.dlmspielt.betteroreprogression.BetterOreProgression;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot", new Item(new Item.Settings().fireproof()));
    public static final Item ENDERITE_PIECE = registerItem("enderite_piece", new Item(new Item.Settings().fireproof()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new Item.Settings().fireproof()));
    public static final Item END_CRYSTAL = registerItem("end_crystal", new Item(new Item.Settings()));
//Blue Gold Hue:159 , Satu:-45, Lumi:-13
    public static final Item BLUE_GOLD_INGOT = registerItem("blue_gold_ingot", new Item(new Item.Settings()));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BetterOreProgression.MOD_ID,name),item);
    }

    public static void registerModItems(){
        BetterOreProgression.LOGGER.info("Registering Mod Items For The Mod" + BetterOreProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(END_CRYSTAL);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(RAW_ENDERITE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(ENDERITE_PIECE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(ENDERITE_INGOT);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(BLUE_GOLD_INGOT);
        });
    }
}
