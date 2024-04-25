package net.cobra.minecraftmod.world;

import net.cobra.minecraftmod.MinecraftMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;


import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_RUBY_ORE_PLACED_KEY = registerKey("deepslate_ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_SAPPHIRE_ORE_PLACED_KEY = registerKey("deepslate_sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> GREEN_SAPPHIRE_ORE_PLACED_KEY = registerKey("green_sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> DEEPSLATE_GREEN_SAPPHIRE_ORE_PLACED_KEY = registerKey("deepslate_green_sapphire_ore_placed");

    public static void boostrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(1), YOffset.fixed(-28))));
        register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(-80))));
        register(context, GREEN_SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GREEN_SAPPHIRE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(10), YOffset.fixed(-71))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MinecraftMod.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
