package com.tutorial.fivespiritsmod.items;

import com.tutorial.fivespiritsmod.init.Modgroup;
import net.minecraft.item.Item;

public class ObsidianIngot extends Item {
    public ObsidianIngot() {
        super(new Properties().group(Modgroup.itemGroup));
        this.setRegistryName("obsidian_ingot");
    }

}
