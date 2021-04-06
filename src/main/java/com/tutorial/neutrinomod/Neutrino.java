package com.tutorial.neutrinomod;

import com.tutorial.neutrinomod.item.OBsidian_swrod;
import com.tutorial.neutrinomod.item.arms.Obsidian_sword_green;
import com.tutorial.neutrinomod.item.obsidian_ingot;
import com.tutorial.neutrinomod.item.stool;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dimension")
public class Neutrino {
    public Neutrino() {
        //Item
        obsidian_ingot.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        stool.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        OBsidian_swrod.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Obsidian_sword_green.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        
    }
}
