package net.dlmspielt.betteroreprogression.datagen;

import net.dlmspielt.betteroreprogression.item.custom.ModItems;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public abstract class Enderite_upgrade extends RecipeProvider {
    public Enderite_upgrade(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

    }
    public static void offerEnderiteUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.ENDERITE_INGOT), category, result
                )
                .criterion("has_enderite_ingot", conditionsFromItem(ModItems.ENDERITE_INGOT))
                .offerTo(exporter, getItemPath(result) + "_smithing");
    }
}
