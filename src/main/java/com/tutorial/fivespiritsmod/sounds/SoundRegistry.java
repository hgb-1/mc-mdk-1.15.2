package com.tutorial.fivespiritsmod.sounds;

import net.minecraft.block.SoundType;
import net.minecraft.client.audio.Sound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class SoundRegistry extends Sound {
    public static final SoundEvent A_NEW_SOUND = new SoundEvent(new ResourceLocation("spirits", "shiyan"));


    /*public SoundEventRegistry() {
        super(volumeIn:音量输入, pitchIn：音高, breakSoundIn：打破声, stepSoundIn：步入声, placeSoundIn：放置声, hitSoundIn：打声音, fallSoundIn：落入声);
    }*/
    public static final SoundType B=new SoundType(1.0f, 1.0f, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND);

    public SoundRegistry(String nameIn, float volumeIn, float pitchIn, int weightIn, Type typeIn, boolean streamingIn, boolean preloadIn, int attenuationDistanceIn) {
        super(nameIn, volumeIn, pitchIn, weightIn, typeIn, streamingIn, preloadIn, attenuationDistanceIn);
    }
}
