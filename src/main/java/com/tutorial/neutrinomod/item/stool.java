package com.tutorial.neutrinomod.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

 public class stool {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "dimension");

    public static RegistryObject<Item> stool = ITEMS.register("stool", () -> {
        return new Stool();
    });

    private static class Stool extends Item {
        //食物带来的药水效果——private static EffectInstance effectInstance =new EffectInstance(Effects.效果种类, 时间, 等级)
        private static EffectInstance effectInstance = new EffectInstance(Effects.POISON, 3 * 20, 1);
        //食物带来的饱食度
        private static Food food = (new Food.Builder())
                .saturation(10)
                .hunger(20)
                .effect(effectInstance, 1)
                .build();

        //物品分组类别-食物
        public Stool() {
            super(new Properties().food(food).group(ItemGroup.FOOD));
        }
    }
}
