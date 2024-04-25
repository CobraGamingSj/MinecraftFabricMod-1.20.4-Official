package net.cobra.minecraftmod.enchantment;

import net.cobra.minecraftmod.MinecraftMod;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static Enchantment THUNDER_STRIKER = register("thunder_striker",
            new ThunderStrikerEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment EXPLOSION = register("explosion",
            new ExplosionEnchantment(Enchantment.Rarity.COMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(MinecraftMod.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering Enchantments for" + MinecraftMod.MOD_ID);
    }

}
