package com.tutorial.neutrinomod.item;

import com.tutorial.neutrinomod.group.Modgroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class obsidian_ingot {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "dimension");
    public static RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot", () -> {
        return new ObsidianIngot();
    });

    private static class ObsidianIngot extends Item {


        //物品分组类别-杂项
        public ObsidianIngot() {
           // super(new Properties().group(ItemGroup.MATERIALS));
            super(new Properties().group(Modgroup.itemGroup));
        }
    }
}
