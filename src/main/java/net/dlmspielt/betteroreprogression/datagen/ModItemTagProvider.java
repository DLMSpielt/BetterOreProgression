package net.dlmspielt.betteroreprogression.datagen;

import net.dlmspielt.betteroreprogression.item.custom.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
getOrCreateTagBuilder(ItemTags.SWORDS)
        .add(ModItems.COPPER_SWORD)
        .add(ModItems.BLUE_GOLD_SWORD)
        .add(ModItems.ENDERITE_SWORD);
getOrCreateTagBuilder(ItemTags.PICKAXES)
        .add(ModItems.COPPER_PICKAXE)
        .add(ModItems.BLUE_GOLD_PICKAXE)
        .add(ModItems.ENDERITE_PICKAXE);
getOrCreateTagBuilder(ItemTags.SHOVELS)
        .add(ModItems.COPPER_SHOVEL)
        .add(ModItems.BLUE_GOLD_SHOVEL)
        .add(ModItems.ENDERITE_SHOVEL);
getOrCreateTagBuilder(ItemTags.AXES)
        .add(ModItems.COPPER_AXE)
        .add(ModItems.BLUE_GOLD_AXE)
        .add(ModItems.ENDERITE_AXE);
getOrCreateTagBuilder(ItemTags.HOES)
        .add(ModItems.COPPER_HOE)
        .add(ModItems.BLUE_GOLD_HOE)
        .add(ModItems.ENDERITE_HOE);
getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
        .add(ModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE);
    }
}
