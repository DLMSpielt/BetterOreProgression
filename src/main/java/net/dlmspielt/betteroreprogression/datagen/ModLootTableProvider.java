package net.dlmspielt.betteroreprogression.datagen;

import net.dlmspielt.betteroreprogression.block.ModBlocks;
import net.dlmspielt.betteroreprogression.item.custom.ModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //ore Blocks
        addDrop(ModBlocks.ENDERITE_ORE,oreDrops(ModBlocks.ENDERITE_ORE, ModItems.RAW_ENDERITE));
        addDrop(ModBlocks.END_CRYSTAL_ORE,multipleOreDrops(ModBlocks.END_CRYSTAL_ORE,ModItems.END_CRYSTAL,1f, 3f));
       //Blocks
        addDrop(ModBlocks.BLUE_GOLD_BLOCK);
        addDrop(ModBlocks.ENDERITE_BLOCK);
        addDrop(ModBlocks.RAW_ENDERITE_BLOCK);
        addDrop(ModBlocks.END_CRYSTAL_BLOCK);

    }
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
