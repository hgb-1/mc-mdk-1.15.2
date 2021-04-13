package com.tutorial.fivespiritsmod.sounds;

import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundEventRegistry extends SoundType {
    public static final SoundEvent A_NEW_SOUND = new SoundEvent(new ResourceLocation("spirits", "shiyan"));
    /*public SoundEventRegistry() {
        super(volumeIn:音量输入, pitchIn：音高, breakSoundIn：打破声, stepSoundIn：步入声, placeSoundIn：放置声, hitSoundIn：打声音, fallSoundIn：落入声);
    }*/
    public SoundEventRegistry() {
        super(1.0f, 1.0f, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND);
    }

}
