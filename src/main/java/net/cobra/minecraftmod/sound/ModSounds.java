package net.cobra.minecraftmod.sound;

import net.cobra.minecraftmod.MinecraftMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent RUBY_BLOCK_BREAK = registerSoundEvent("sound_block_break");
    public static final SoundEvent RUBY_BLOCK_STEP = registerSoundEvent("sound_block_step");
    public static final SoundEvent RUBY_BLOCK_PLACE = registerSoundEvent("sound_block_place");
    public static final SoundEvent RUBY_BLOCK_HIT = registerSoundEvent("sound_block_hit");
    public static final SoundEvent RUBY_BLOCK_FALL = registerSoundEvent("sound_block_fall");
    public static final SoundEvent C418_TASWEL = registerSoundEvent("taswell");


    public static final BlockSoundGroup RUBY_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.RUBY_BLOCK_BREAK, ModSounds.RUBY_BLOCK_STEP, ModSounds.RUBY_BLOCK_PLACE,
            ModSounds.RUBY_BLOCK_HIT, ModSounds.RUBY_BLOCK_FALL);


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MinecraftMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        MinecraftMod.LOGGER.info("Registering Sounds for " + MinecraftMod.MOD_ID);
    }
}
