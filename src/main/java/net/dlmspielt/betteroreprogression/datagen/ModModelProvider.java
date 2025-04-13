package net.dlmspielt.betteroreprogression.datagen;

import net.dlmspielt.betteroreprogression.block.ModBlocks;
import net.dlmspielt.betteroreprogression.item.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ENDERITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_GOLD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_CRYSTAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_CRYSTAL_ORE);




    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
itemModelGenerator.register(ModItems.END_CRYSTAL, Models.GENERATED);
itemModelGenerator.register(ModItems.BLUE_GOLD_INGOT, Models.GENERATED);
itemModelGenerator.register(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
itemModelGenerator.register(ModItems.ENDERITE_PIECE, Models.GENERATED);
itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);
itemModelGenerator.register(ModItems.RAW_ENDERITE, Models.GENERATED);

itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);

itemModelGenerator.register(ModItems.BLUE_GOLD_SWORD, Models.HANDHELD);
itemModelGenerator.register(ModItems.BLUE_GOLD_PICKAXE, Models.HANDHELD);
itemModelGenerator.register(ModItems.BLUE_GOLD_SHOVEL, Models.HANDHELD);
itemModelGenerator.register(ModItems.BLUE_GOLD_AXE, Models.HANDHELD);
itemModelGenerator.register(ModItems.BLUE_GOLD_HOE, Models.HANDHELD);

itemModelGenerator.register(ModItems.ENDERITE_SWORD, Models.HANDHELD);
itemModelGenerator.register(ModItems.ENDERITE_PICKAXE, Models.HANDHELD);
itemModelGenerator.register(ModItems.ENDERITE_SHOVEL, Models.HANDHELD);
itemModelGenerator.register(ModItems.ENDERITE_AXE, Models.HANDHELD);
itemModelGenerator.register(ModItems.ENDERITE_HOE, Models.HANDHELD);
    }
}
