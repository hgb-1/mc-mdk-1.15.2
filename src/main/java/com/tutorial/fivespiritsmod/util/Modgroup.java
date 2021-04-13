package com.tutorial.fivespiritsmod.util;

import com.tutorial.fivespiritsmod.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Modgroup {
    public static final ItemGroup itemGroup=new ItemGroup("spirits") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.obsidianIngot);
        }
    };
    public static final ItemGroup itemGroup_1=new ItemGroup("spirits_1") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.stool);
        }
    };
}
