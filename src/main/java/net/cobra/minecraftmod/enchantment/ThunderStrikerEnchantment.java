package net.cobra.minecraftmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class ThunderStrikerEnchantment extends Enchantment {
    public ThunderStrikerEnchantment(Rarity rarity, EnchantmentTarget target, EquipmentSlot... slotTypes) {
        super(rarity, target, slotTypes);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(!user.getEntityWorld().isClient()) {

            ServerWorld world = (ServerWorld) user.getEntityWorld();
            BlockPos position = target.getBlockPos();

            if(level == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
            }
            if(level == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
            }
            if(level == 3) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.TNT.spawn(world, null, null, position,
                        SpawnReason.TRIGGERED, true, true);
            }
        }
        super.onTargetDamaged(user, target, level);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
