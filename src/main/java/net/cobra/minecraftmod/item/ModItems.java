package net.cobra.minecraftmod.item;

import net.cobra.minecraftmod.MinecraftMod;
import net.cobra.minecraftmod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RADIANT = registerItem("radiant", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final Item GREEN_SAPPHIRE = registerItem("green_sapphire", new Item(new FabricItemSettings()));
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new FabricItemSettings()));
    public static final Item BLUE_GARNET = registerItem("blue_garnet", new Item(new FabricItemSettings()));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item WOOD_PELLET = registerItem("wood_pellet", new Item(new FabricItemSettings()));
    public static final Item SMITHING_TEMPLATE = registerItem("smithing_template", new Item(new FabricItemSettings()));
    public static final Item TASWELL = registerItem("taswell", new MusicDiscItem(7, ModSounds.C418_TASWEL, new FabricItemSettings().maxCount(1), 514));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new PickaxeItem(ModToolMaterial.RUBY, 2, 1.5f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new AxeItem(ModToolMaterial.RUBY, 6, 2.1f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new SwordItem(ModToolMaterial.RUBY, 9, 2.5f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel", new ShovelItem(ModToolMaterial.RUBY, 2, 1.5f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new HoeItem(ModToolMaterial.RUBY, -3, 0, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",  new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //SAPPHIRE ARMOR

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",  new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    //SAPPHIRE TOOLS

    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterial.SAPPHIRE, 4, 1.75f, new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe", new AxeItem(ModToolMaterial.SAPPHIRE, 8, 2.5f, new FabricItemSettings()));
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterial.SAPPHIRE, 11, 3.5f, new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 4, 1.75f, new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new HoeItem(ModToolMaterial.SAPPHIRE, -6, 0, new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RADIANT);
        entries.add(SAPPHIRE);
        entries.add(GREEN_SAPPHIRE);
        entries.add(PINK_GARNET);
        entries.add(BLUE_GARNET);
        entries.add(WOOD_PELLET);
        entries.add(ModItems.SMITHING_TEMPLATE);
    }
//    private static void addBlocksToFunctionalBlocksGroup(FabricItemGroupEntries entries) {
////        entries.add(ModBlocks.GEM_CONVERTER);
//    }
    private static void addItemsToFoodsAndDrinksItemGroup(FabricItemGroupEntries entries) {
       entries.add(ModItems.PINEAPPLE);
    }
   private static void addToolsToToolsGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.RUBY_PICKAXE);
        entries.add(ModItems.RUBY_AXE);
        entries.add(ModItems.RUBY_SHOVEL);
        entries.add(ModItems.RUBY_HOE);
          entries.add(ModItems.TASWELL);

       entries.add(ModItems.SAPPHIRE_AXE);
       entries.add(ModItems.SAPPHIRE_PICKAXE);
       entries.add(ModItems.SAPPHIRE_HOE);
       entries.add(ModItems.SAPPHIRE_SHOVEL);
   }
    private static void addToolsToCombatGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.RUBY_SWORD);
        entries.add(ModItems.RUBY_HELMET);
        entries.add(ModItems.RUBY_CHESTPLATE);
        entries.add(ModItems.RUBY_LEGGINGS);
        entries.add(ModItems.RUBY_BOOTS);

        entries.add(ModItems.SAPPHIRE_HELMET);
        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
        entries.add(ModItems.SAPPHIRE_LEGGINGS);
        entries.add(ModItems.SAPPHIRE_BOOTS);
        entries.add(ModItems.SAPPHIRE_SWORD);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MinecraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinecraftMod.LOGGER.info("Registering Mod Items for" + MinecraftMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodsAndDrinksItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addToolsToCombatGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addToolsToToolsGroup);
//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addBlocksToFunctionalBlocksGroup);
    }

}
