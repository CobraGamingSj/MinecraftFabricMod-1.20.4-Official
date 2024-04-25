package net.cobra.minecraftmod.datagen;

import net.cobra.minecraftmod.item.ModItems;
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
    protected void configure(RegistryWrapper.WrapperLookup arg) {
     getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
             .add(ModItems.RUBY_HELMET)
             .add(ModItems.SMITHING_TEMPLATE)
             .add(ModItems.RUBY_LEGGINGS)
             .add(ModItems.RUBY_BOOTS);

     getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
             .add(ModItems.C418_TASWELL);
    }
}
