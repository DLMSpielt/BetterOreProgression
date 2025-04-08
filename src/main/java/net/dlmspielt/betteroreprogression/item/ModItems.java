package net.dlmspielt.betteroreprogression.item;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.dlmspielt.betteroreprogression.tags.item.ModItemTags;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.equipment.trim.ArmorTrim;
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
    public static final Item END_CRYSTAL = register("end_crystal", Item :: new, new Item.Settings());



    //Cooper Armor
    public static final Item COOPER_HELMET = register("cooper_helmet", Item::new, new Item.Settings().armor(ModArmorMaterials.COOPER, EquipmentType.HELMET));
    public static final Item COOPER_CHESTPLATE = register("cooper_chestplate", Item::new, new Item.Settings().armor(ModArmorMaterials.COOPER, EquipmentType.CHESTPLATE));
    public static final Item COOPER_LEGGINGS = register("cooper_leggings", Item::new, new Item.Settings().armor(ModArmorMaterials.COOPER, EquipmentType.LEGGINGS));
    public static final Item COOPER_BOOTS = register("cooper_boots",Item::new, new Item.Settings().armor(ModArmorMaterials.COOPER, EquipmentType.BOOTS));

    //Enderite Armor
    public static final Item ENDERITE_HELMET = register("enderite_helmet", Item::new, new Item.Settings().armor(ModArmorMaterials.ENDERITE, EquipmentType.HELMET).fireproof());
    public static final Item ENDERITE_CHESTPLATE = register("enderite_chestplate", Item::new, new Item.Settings().armor(ModArmorMaterials.ENDERITE, EquipmentType.CHESTPLATE).fireproof());
    public static final Item ENDERITE_LEGGINGS = register("enderite_leggings", Item::new, new Item.Settings().armor(ModArmorMaterials.ENDERITE, EquipmentType.LEGGINGS).fireproof());
    public static final Item ENDERITE_BOOTS = register("enderite_boots", Item::new, new Item.Settings().armor(ModArmorMaterials.ENDERITE, EquipmentType.BOOTS).fireproof());


    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_PIECE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_ORE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) -> itemGroup.add(ModItems.END_CRYSTAL));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.COOPER_HELMET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.COOPER_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.COOPER_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.COOPER_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_HELMET));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register((itemGroup) -> itemGroup.add(ModItems.ENDERITE_BOOTS));
    }
}