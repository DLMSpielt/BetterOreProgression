package net.dlmspielt.betteroreprogression.world.gen;

import net.dlmspielt.betteroreprogression.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOre(){
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ENDERITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.END_CRYSTAL_ORE_PLACED_KEY);
    }
}
