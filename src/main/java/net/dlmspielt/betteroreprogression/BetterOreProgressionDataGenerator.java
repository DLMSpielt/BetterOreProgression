package net.dlmspielt.betteroreprogression;

import net.dlmspielt.betteroreprogression.datagen.*;
import net.dlmspielt.betteroreprogression.world.ModConfiguredFeatures;
import net.dlmspielt.betteroreprogression.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class BetterOreProgressionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
pack.addProvider(ModBlockTagProvider::new);
pack.addProvider(ModItemTagProvider::new);
pack.addProvider(ModLootTableProvider::new);
pack.addProvider(ModModelProvider::new);
pack.addProvider(ModRecipeProvider::new);
pack.addProvider(ModRegistryDataGenerator::new);
	}
	public void buildRegistry(RegistryBuilder registryBuilder){
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
	}
}
