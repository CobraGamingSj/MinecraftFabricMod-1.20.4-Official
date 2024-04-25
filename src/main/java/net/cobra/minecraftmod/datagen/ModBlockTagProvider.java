package net.cobra.minecraftmod.datagen;

import net.cobra.minecraftmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RADIANT_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.GREEN_SAPPHIRE_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.GREEN_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_GREEN_SAPPHIRE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE)
                .add(ModBlocks.GREEN_SAPPHIRE_ORE)
                .add(ModBlocks.DEEPSLATE_GREEN_SAPPHIRE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RADIANT_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.GREEN_SAPPHIRE_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);


    }
}
