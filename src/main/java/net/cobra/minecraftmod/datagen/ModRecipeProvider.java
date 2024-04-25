package net.cobra.minecraftmod.datagen;

import net.cobra.minecraftmod.block.ModBlocks;
import net.cobra.minecraftmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }



    @Override
    public void generate(RecipeExporter exporter) {
       offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
               ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GREEN_SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.GREEN_SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RADIANT, RecipeCategory.DECORATIONS,
                ModBlocks.RADIANT_BLOCK);


    }
}
