package com.tutorial.neutrinomod.group;

import com.tutorial.neutrinomod.item.obsidian_ingot;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Modgroup {
    public static ItemGroup itemGroup = new ObsidianGroup();

    private static class ObsidianGroup extends ItemGroup {
        public ObsidianGroup() {
            super("obsidian_group");
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(obsidian_ingot.obsidianIngot.get());
        }
    }
}
