package net.dlmspielt.betteroreprogression.item.custom;

import net.dlmspielt.betteroreprogression.BetterOreProgression;

import net.dlmspielt.betteroreprogression.trim.ModTrimsMaterials;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.minecraft.item.*;
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
//Copper Tools
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER,new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.COPPER,3,-2.4F))));
  public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterials.COPPER,new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.COPPER,1f,-2.8F))));
  public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER,new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.COPPER,1.5f,-3.0F))));
  public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterials.COPPER,new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.COPPER,5.5f,-3.2F))));
public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterials.COPPER,new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.COPPER,-1.5f,-1.5F))));
//Copper Armor
public static final Item COPPER_HELMET = registerItem("copper_helmet",
        new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.HELMET,new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));




    //Blue gold Tools
public static final Item BLUE_GOLD_SWORD = registerItem("blue_gold_sword",
        new SwordItem(ModToolMaterials.BLUE_GOLD,new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.BLUE_GOLD,3,-2.4F))));
    public static final Item BLUE_GOLD_PICKAXE = registerItem("blue_gold_pickaxe",
            new PickaxeItem(ModToolMaterials.BLUE_GOLD,new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.BLUE_GOLD,1f,-2.8F))));
    public static final Item BLUE_GOLD_SHOVEL = registerItem("blue_gold_shovel",
            new ShovelItem(ModToolMaterials.BLUE_GOLD,new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.BLUE_GOLD,1.5f,-3.0F))));
    public static final Item BLUE_GOLD_AXE = registerItem("blue_gold_axe",
            new AxeItem(ModToolMaterials.BLUE_GOLD,new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.BLUE_GOLD,6f,-3.1F))));
    public static final Item BLUE_GOLD_HOE = registerItem("blue_gold_hoe",
            new HoeItem(ModToolMaterials.BLUE_GOLD,new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.BLUE_GOLD,-2.5f,-0.5F))));
//Blue Gold Armor
public static final Item BLUE_GOLD_HELMET = registerItem("blue_gold_helmet",
        new ArmorItem(ModArmorMaterials.BLUE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.HELMET,new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item BLUE_GOLD_CHESTPLATE = registerItem("blue_gold_chestplate",
            new ArmorItem(ModArmorMaterials.BLUE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item BLUE_GOLD_LEGGINGS = registerItem("blue_gold_leggings",
            new ArmorItem(ModArmorMaterials.BLUE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item BLUE_GOLD_BOOTS = registerItem("blue_gold_boots",
            new ArmorItem(ModArmorMaterials.BLUE_GOLD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));



    //Enderite Tools
public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
        new SwordItem(ModToolMaterials.ENDERITE,new Item.Settings()
                .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ENDERITE,3,-2.4F))));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new PickaxeItem(ModToolMaterials.ENDERITE,new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ENDERITE,1f,-2.8F))));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ShovelItem(ModToolMaterials.ENDERITE,new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ENDERITE,1.5f,-3.0F))));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new AxeItem(ModToolMaterials.ENDERITE,new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ENDERITE,6f,-2.9F))));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new HoeItem(ModToolMaterials.ENDERITE,new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ENDERITE,-5.0f,0.0F))));
//Enderite Armor
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
        new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
        new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
        new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
        new ArmorItem(ModArmorMaterials.ENDERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));




    //Enderite Upgrade
    public static final Item ENDERITE_UPGRADE_SMITHING_TEMPLATE = registerItem("enderite_upgrade_smithing_template", ModTrimsMaterials.EnderiteUpgrade.createEnderiteUpgrade());

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BetterOreProgression.MOD_ID,name),item);
    }

    public static void registerModItems(){
        BetterOreProgression.LOGGER.info("Registering Mod Items For The Mod" + BetterOreProgression.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(ENDERITE_INGOT);
            entries.add(ENDERITE_PIECE);
            entries.add(RAW_ENDERITE);
            entries.add(END_CRYSTAL);
            entries.add(BLUE_GOLD_INGOT);
            entries.add(ENDERITE_UPGRADE_SMITHING_TEMPLATE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries ->{
            entries.add(COPPER_SWORD);
            entries.add(COPPER_AXE);
            entries.add(BLUE_GOLD_SWORD);
            entries.add(BLUE_GOLD_AXE);
            entries.add(ENDERITE_SWORD);
            entries.add(ENDERITE_AXE);
            entries.add(ENDERITE_HELMET);
            entries.add(ENDERITE_CHESTPLATE);
            entries.add(ENDERITE_LEGGINGS);
            entries.add(ENDERITE_BOOTS);
            entries.add(BLUE_GOLD_HELMET);
            entries.add(BLUE_GOLD_CHESTPLATE);
            entries.add(BLUE_GOLD_LEGGINGS);
            entries.add(BLUE_GOLD_BOOTS);
            entries.add(COPPER_HELMET);
            entries.add(COPPER_CHESTPLATE);
            entries.add(COPPER_LEGGINGS);
            entries.add(COPPER_BOOTS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries ->{
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_PICKAXE);
        entries.add(COPPER_AXE);
        entries.add(COPPER_HOE);
        entries.add(BLUE_GOLD_SHOVEL);
        entries.add(BLUE_GOLD_PICKAXE);
        entries.add(BLUE_GOLD_AXE);
        entries.add(BLUE_GOLD_HOE);
        entries.add(ENDERITE_SHOVEL);
        entries.add(ENDERITE_PICKAXE);
        entries.add(ENDERITE_AXE);
        entries.add(ENDERITE_HOE);

        });
        }
    }

