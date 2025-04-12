package net.dlmspielt.betteroreprogression.item;


import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;

import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;


import java.util.Map;

import static net.dlmspielt.betteroreprogression.tags.item.ModItemTags.*;

public class ModArmorMaterials {




        // Equipment asset keys (for texture/model)
        public static final RegistryKey<EquipmentAsset> COOPER_ASSET =
                RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of("betteroreprogression", "cooper"));
        public static final RegistryKey<EquipmentAsset> ENDERITE_ASSET =
                RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of("betteroreprogression", "enderite"));

        // COOPER Armor
        public static final ArmorMaterial COOPER = new ArmorMaterial(
                12, // base durability multiplier
                Map.of(
                        EquipmentType.HELMET, 2,
                        EquipmentType.CHESTPLATE, 4,
                        EquipmentType.LEGGINGS, 5,
                        EquipmentType.BOOTS, 2
                ),
                15, // enchantability
                SoundEvents.ITEM_ARMOR_EQUIP_IRON,
                0.0f, // toughness
                0.0f, // knockback resistance
               REPAIRS_COOPER_ARMOR,
                COOPER_ASSET

        );

        // ENDERITE Armor
        public static final ArmorMaterial ENDERITE = new ArmorMaterial(
                40,
                Map.of(
                        EquipmentType.HELMET, 4,
                        EquipmentType.CHESTPLATE, 10,
                        EquipmentType.LEGGINGS, 10,
                        EquipmentType.BOOTS, 4
                ),
                25,
                SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                5.0f,
                0.2f,
                REPAIRS_ENDERITE_ARMOR,
                ENDERITE_ASSET
        );


    }




