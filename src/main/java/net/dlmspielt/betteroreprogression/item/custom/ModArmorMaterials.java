package net.dlmspielt.betteroreprogression.item.custom;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> COPPER_ARMOR_MATERIAL = registerArmorMaterial("copper",
            ()-> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class),enumMap -> {
                enumMap.put(ArmorItem.Type.BOOTS,2);
                enumMap.put(ArmorItem.Type.LEGGINGS,4);
                enumMap.put(ArmorItem.Type.CHESTPLATE,6);
                enumMap.put(ArmorItem.Type.HELMET,2);
                enumMap.put(ArmorItem.Type.BODY,4);
                    }
                    ),20, SoundEvents.ITEM_ARMOR_EQUIP_IRON,()-> Ingredient.ofItems(Items.COPPER_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(BetterOreProgression.MOD_ID,"copper"))),0,0));
    public static final RegistryEntry<ArmorMaterial> BLUE_GOLD_ARMOR_MATERIAL = registerArmorMaterial("blue_gold",
            ()-> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class),enumMap -> {
                enumMap.put(ArmorItem.Type.BOOTS,2);
                enumMap.put(ArmorItem.Type.LEGGINGS,5);
                enumMap.put(ArmorItem.Type.CHESTPLATE,6);
                enumMap.put(ArmorItem.Type.HELMET,2);
                enumMap.put(ArmorItem.Type.BODY,9);
                    }
                    ),17, SoundEvents.ITEM_ARMOR_EQUIP_IRON,()-> Ingredient.ofItems(ModItems.BLUE_GOLD_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(BetterOreProgression.MOD_ID,"blue_gold"))),0,0));
    public static final RegistryEntry<ArmorMaterial> ENDERITE_ARMOR_MATERIAL = registerArmorMaterial("enderite",
            ()-> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class),enumMap -> {
                enumMap.put(ArmorItem.Type.BOOTS,4);
                enumMap.put(ArmorItem.Type.LEGGINGS,8);
                enumMap.put(ArmorItem.Type.CHESTPLATE,10);
                enumMap.put(ArmorItem.Type.HELMET,4);
                enumMap.put(ArmorItem.Type.BODY,14);
                    }
                    ),20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,()-> Ingredient.ofItems(ModItems.ENDERITE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(BetterOreProgression.MOD_ID,"enderite"))),4,0.3F));


    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material){
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(BetterOreProgression.MOD_ID, name), material.get());
    }
}
