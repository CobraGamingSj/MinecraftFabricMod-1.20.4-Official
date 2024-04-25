package net.cobra.minecraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent PINEAPPLE = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200, 5), 1.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 5), 1.5f).build();

}
