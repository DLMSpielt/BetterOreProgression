package net.dlmspielt.betteroreprogression.world;

import net.dlmspielt.betteroreprogression.BetterOreProgression;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ENDERITE_ORE_PLACED_KEY = registerKey("enderite_ore_placed");
    public static final RegistryKey<PlacedFeature> END_CRYSTAL_ORE_PLACED_KEY = registerKey("end_crystal_ore_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, END_CRYSTAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_CRYSTAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(8,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        register(context, ENDERITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ENDERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(55))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(BetterOreProgression.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
