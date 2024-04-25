package net.cobra.minecraftmod.util;

import net.cobra.minecraftmod.block.ModBlocks;
import net.cobra.minecraftmod.item.ModItems;
import net.cobra.minecraftmod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 21),
                            new ItemStack(ModItems.RUBY_SWORD, 1), 3, 5, 0.05f
                    ));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 6),
                            new ItemStack(ModItems.PINEAPPLE, 2), 8, 7, 0.5f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.COAL, 6),
                            new ItemStack(ModItems.SAPPHIRE, 1), 2, 2, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.STICK, 61),
                            new ItemStack(ModItems.GREEN_SAPPHIRE, 1), 3, 3, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.COAL_BLOCK, 2),
                            new ItemStack(ModBlocks.SAPPHIRE_BLOCK, 1), 1, 1, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.COAL_BLOCK, 5),
                            new ItemStack(ModBlocks.GREEN_SAPPHIRE_BLOCK, 1), 2, 2, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.IRON_BLOCK, 6),
                            new ItemStack(Items.DIAMOND, 3), 3, 3, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 7),
                            new ItemStack(ModItems.RADIANT, 1), 6, 1, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DIAMOND, 7),
                            new ItemStack(ModBlocks.RADIANT_BLOCK, 1), 2, 1, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.GOLD_BLOCK, 18),
                            new ItemStack(Blocks.DIAMOND_BLOCK, 2), 5, 1, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.DIAMOND_BLOCK, 4),
                            new ItemStack(ModItems.RUBY, 1), 3, 1, 0.75f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.JEWELLER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RADIANT, 45),
                            new ItemStack(ModBlocks.RUBY_BLOCK, 5), 8, 15, 0.85f
                    ));
                });
    }






}
