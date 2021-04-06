package com.tutorial.neutrinomod.item.arms;

import com.tutorial.neutrinomod.group.Modgroup;
import com.tutorial.neutrinomod.item.OBsidian_swrod;
import com.tutorial.neutrinomod.item.obsidian_ingot;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Obsidian_sword_green {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "dimension");

    public static RegistryObject<Item> obsidianSwordGreen = ITEMS.register("obsidian_sword_green", () -> {
        return new ObsidianSwordGreen();
    });

    private static class ObsidianSwordGreen extends SwordItem {
        private static IItemTier iItemTier = new IItemTier() {
            @Override
            public int getMaxUses() {
                return 2000;
            }

            @Override
            public float getEfficiency() {
                return 10.0F;
            }

            @Override
            public float getAttackDamage() {
                return 4.0F;
            }

            @Override
            public int getHarvestLevel() {
                return 3;
            }

            @Override
            public int getEnchantability() {
                return 30;
            }

            @Override
            public Ingredient getRepairMaterial() {
                return Ingredient.fromItems(obsidian_ingot.obsidianIngot.get());
            }
        };

        public ObsidianSwordGreen() {
            super(iItemTier, 3, -2.4F, new Item.Properties().group(Modgroup.itemGroup));
        }
    }
}
