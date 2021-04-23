package com.tutorial.fivespiritsmod.sounds;

import net.minecraft.util.DamageSource;

public class DamageSourceRegistry extends DamageSource {
    public static final DamageSource A1=new DamageSource("pisi").setFireDamage();

    public DamageSourceRegistry() { super("pisi");
    }
}
