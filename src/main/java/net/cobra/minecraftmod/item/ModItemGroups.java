package net.cobra.minecraftmod.item;

import net.cobra.minecraftmod.MinecraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                                 entries.add(ModItems.RUBY);
                                 entries.add(ModItems.RADIANT);
                                 entries.add(ModItems.SAPPHIRE);
                                 entries.add(ModItems.GREEN_SAPPHIRE);
                    }).build());

    public static void registerItemGroups() {

        MinecraftMod.LOGGER.info("Registering Item Groups for" + MinecraftMod.MOD_ID);
    }

}
