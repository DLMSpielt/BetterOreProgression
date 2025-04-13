package net.dlmspielt.betteroreprogression.datagen;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.dlmspielt.betteroreprogression.block.ModBlocks;
import net.dlmspielt.betteroreprogression.datagen.Enderite_upgrade;
import net.dlmspielt.betteroreprogression.item.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    public static void offerEnderiteUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.ENDERITE_INGOT), category, result
                )
                .criterion("has_enderite_ingot", conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, getItemPath(result) + "_smithing");}
    @Override
    public void generate(RecipeExporter recipeExporter) {

        List<ItemConvertible> ENDERITE_PIECE_SMALTABLES = List.of(ModBlocks.ENDERITE_ORE, ModItems.RAW_ENDERITE);

        offerSmelting(recipeExporter, ENDERITE_PIECE_SMALTABLES, RecipeCategory.MISC,
                ModItems.ENDERITE_PIECE, 2.5f,250,"enderite_piece");
        offerBlasting(recipeExporter, ENDERITE_PIECE_SMALTABLES, RecipeCategory.MISC,
                ModItems.ENDERITE_PIECE, 2.5f,125,"enderite_piece");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.COPPER_SWORD)
                        .pattern(" C ")
                        .pattern(" C ")
                        .pattern(" S ")
                        .input('C', Items.COPPER_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.COPPER_PICKAXE)
                        .pattern("CCC")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('C', Items.COPPER_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.COPPER_SHOVEL)
                        .pattern(" C ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('C', Items.COPPER_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.COPPER_AXE)
                        .pattern("CC ")
                        .pattern("CS ")
                        .pattern(" S ")
                        .input('C', Items.COPPER_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.COPPER_HOE)
                        .pattern(" CC")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('C', Items.COPPER_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(Items.COPPER_INGOT),conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.BLUE_GOLD_SWORD)
                        .pattern(" C ")
                        .pattern(" C ")
                        .pattern(" S ")
                        .input('C', ModItems.BLUE_GOLD_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(ModItems.BLUE_GOLD_INGOT),conditionsFromItem(ModItems.BLUE_GOLD_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BLUE_GOLD_PICKAXE)
                        .pattern("CCC")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('C', ModItems.BLUE_GOLD_INGOT)
                        .input('S',Items.STICK)
                    .criterion(hasItem(ModItems.BLUE_GOLD_INGOT),conditionsFromItem(ModItems.BLUE_GOLD_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BLUE_GOLD_SHOVEL)
                        .pattern(" C ")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('C', ModItems.BLUE_GOLD_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(ModItems.BLUE_GOLD_INGOT),conditionsFromItem(ModItems.BLUE_GOLD_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT,ModItems.BLUE_GOLD_AXE)
                        .pattern("CC ")
                        .pattern("CS ")
                        .pattern(" S ")
                        .input('C', ModItems.BLUE_GOLD_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(ModItems.BLUE_GOLD_INGOT),conditionsFromItem(ModItems.BLUE_GOLD_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS,ModItems.BLUE_GOLD_HOE)
                        .pattern(" CC")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('C', ModItems.BLUE_GOLD_INGOT)
                        .input('S',Items.STICK)
                        .criterion(hasItem(ModItems.BLUE_GOLD_INGOT),conditionsFromItem(ModItems.BLUE_GOLD_INGOT))
                        .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE,2)
                        .pattern("SCS")
                        .pattern("SES")
                        .pattern("SSS")
                        .input('C', ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE)
                        .input('S',ModItems.END_CRYSTAL)
                        .input('E',Items.END_STONE)
                        .criterion(hasItem(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE),conditionsFromItem(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE))
                        .offerTo(recipeExporter);
        offerEnderiteUpgradeRecipe(recipeExporter,Items.NETHERITE_AXE,RecipeCategory.COMBAT,ModItems.ENDERITE_AXE);
        offerEnderiteUpgradeRecipe(recipeExporter,Items.NETHERITE_SWORD,RecipeCategory.COMBAT,ModItems.ENDERITE_SWORD);
        offerEnderiteUpgradeRecipe(recipeExporter,Items.NETHERITE_PICKAXE,RecipeCategory.COMBAT,ModItems.ENDERITE_PICKAXE);
        offerEnderiteUpgradeRecipe(recipeExporter,Items.NETHERITE_SHOVEL,RecipeCategory.COMBAT,ModItems.ENDERITE_SHOVEL);
        offerEnderiteUpgradeRecipe(recipeExporter,Items.NETHERITE_HOE,RecipeCategory.COMBAT,ModItems.ENDERITE_HOE);

 offerReversibleCompactingRecipes(recipeExporter,RecipeCategory.BUILDING_BLOCKS,ModItems.BLUE_GOLD_INGOT, RecipeCategory.DECORATIONS,ModBlocks.BLUE_GOLD_BLOCK);
 offerReversibleCompactingRecipes(recipeExporter,RecipeCategory.BUILDING_BLOCKS,ModItems.ENDERITE_INGOT, RecipeCategory.DECORATIONS,ModBlocks.ENDERITE_BLOCK);
 offerReversibleCompactingRecipes(recipeExporter,RecipeCategory.BUILDING_BLOCKS,ModItems.RAW_ENDERITE, RecipeCategory.DECORATIONS,ModBlocks.RAW_ENDERITE_BLOCK);
 offerReversibleCompactingRecipes(recipeExporter,RecipeCategory.BUILDING_BLOCKS,ModItems.END_CRYSTAL, RecipeCategory.DECORATIONS,ModBlocks.END_CRYSTAL_BLOCK);
    }
}
