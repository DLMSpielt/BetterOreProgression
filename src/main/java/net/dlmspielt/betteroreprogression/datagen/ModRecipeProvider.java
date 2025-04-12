package net.dlmspielt.betteroreprogression.datagen;

import net.dlmspielt.betteroreprogression.block.ModBlocks;
import net.dlmspielt.betteroreprogression.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {

        List<ItemConvertible> ENDERITE_PIECE_SMALTABLES = List.of(ModBlocks.ENDERITE_ORE, ModItems.RAW_ENDERITE);

        offerSmelting(recipeExporter, ENDERITE_PIECE_SMALTABLES, RecipeCategory.MISC,
                ModItems.ENDERITE_PIECE, 2.5f,250,"enderite_piece");
        offerBlasting(recipeExporter, ENDERITE_PIECE_SMALTABLES, RecipeCategory.MISC,
                ModItems.ENDERITE_PIECE, 2.5f,125,"enderite_piece");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BLUE_GOLD_INGOT,9)
                .input(ModBlocks.BLUE_GOLD_BLOCK);
    }
}
