package com.tutorial.fivespiritsmod.items;

import com.tutorial.fivespiritsmod.util.Modgroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Stool extends Item{
    private static EffectInstance effectInstance = new EffectInstance(Effects.POISON, 3 * 20, 1);
    private static Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20).meat()
            .effect(effectInstance, 1)
            .build();
    public Stool() {
        super(new Properties().group(Modgroup.itemGroup_1).food(food));
        this.setRegistryName("stool");
    }
}
