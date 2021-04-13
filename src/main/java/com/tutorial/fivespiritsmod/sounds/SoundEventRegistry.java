package com.tutorial.fivespiritsmod.sounds;

import net.minecraft.block.SoundType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;


public class SoundEventRegistry1 extends SoundType{
    public static final SoundEvent A_NEW_SOUND = new SoundEvent(new ResourceLocation("spirits", "shiyan"));
    public static final SoundType A_NEW_SOUND1 = new SoundType(1.0f, 1.0f, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND);
    public SoundEventRegistry1() {
        super(1.0f, 1.0f, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND, A_NEW_SOUND);

    }

}
//   this.setRegistryName("stool");