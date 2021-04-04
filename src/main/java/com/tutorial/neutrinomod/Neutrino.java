package com.tutorial.neutrinomod;

import com.tutorial.neutrinomod.item.obsidian_ingot;
import com.tutorial.neutrinomod.item.stool;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dimension")
public class Neutrino {
    public Neutrino() {
        obsidian_ingot.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        stool.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
