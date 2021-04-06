package com.tutorial.neutrinomod.item;

import com.tutorial.neutrinomod.group.Modgroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OBsidian_swrod {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "dimension");
    public static RegistryObject<Item> obsidianSword = ITEMS.register("obsidian_sword", () -> {
        return new ObsidianSword();
    });

    private static class ObsidianSword extends SwordItem {
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

        public ObsidianSword() {
            super(iItemTier, 3, -2.4F, new Item.Properties().group(Modgroup.itemGroup));
        }
    }
}
