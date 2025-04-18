package net.dlmspielt.betteroreprogression.world;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.dlmspielt.betteroreprogression.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERITE_ORE_KEY = registryKey("enderite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_CRYSTAL_ORE_KEY = registryKey("end_crystal_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest endReplaceables =new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> EnderiteOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.ENDERITE_ORE.getDefaultState()));
            List<OreFeatureConfig.Target> EndCrystalOre =
                List.of(OreFeatureConfig.createTarget(endReplaceables, ModBlocks.END_CRYSTAL_ORE.getDefaultState()));


        register(context, ENDERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(EnderiteOre,3));
        register(context, END_CRYSTAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(EndCrystalOre,12));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BetterOreProgression.MOD_ID,name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}


