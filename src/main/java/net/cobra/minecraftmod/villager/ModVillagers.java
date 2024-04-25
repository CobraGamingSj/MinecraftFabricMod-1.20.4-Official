package net.cobra.minecraftmod.villager;

import com.google.common.collect.ImmutableSet;
import net.cobra.minecraftmod.MinecraftMod;
import net.cobra.minecraftmod.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final PointOfInterestType SOUND_POI = registerPoi("sound_poi", Blocks.ANVIL);
    public static final RegistryKey<PointOfInterestType> SOUND_POI_KEY = poiKey("sound_poi");
    public static final VillagerProfession JEWELLER = registerProfession("jeweller", SOUND_POI_KEY);

    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(MinecraftMod.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH));
    }

    private static PointOfInterestType registerPoi(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MinecraftMod.MOD_ID, name), 1, 1,block);
    }

    private static RegistryKey<PointOfInterestType> poiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(MinecraftMod.MOD_ID, name));
    }

    public static void registerVillagers() {
        MinecraftMod.LOGGER.info("Registering Villagers for" + MinecraftMod.MOD_ID);
    }

}
