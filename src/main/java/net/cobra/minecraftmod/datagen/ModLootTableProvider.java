package net.cobra.minecraftmod.datagen;

import net.cobra.minecraftmod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RADIANT_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.GREEN_SAPPHIRE_BLOCK);
    }
}
