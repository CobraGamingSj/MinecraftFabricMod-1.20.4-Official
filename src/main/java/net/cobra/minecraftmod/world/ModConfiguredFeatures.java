package net.cobra.minecraftmod.world;

import net.cobra.minecraftmod.MinecraftMod;
import net.cobra.minecraftmod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY  = registryKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_RUBY_ORE_KEY  = registryKey("deepalte_ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY  = registryKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_SAPPHIRE_ORE_KEY  = registryKey("deepslate_sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_SAPPHIRE_ORE_KEY  = registryKey("green_sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_GREEN_SAPPHIRE_ORE_KEY  = registryKey("deepslate_green_sapphire_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGreenSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.GREEN_SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_GREEN_SAPPHIRE_ORE.getDefaultState()));

        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 2));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 3));
        register(context, GREEN_SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldGreenSapphireOres, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MinecraftMod.MOD_ID,name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
