package com.tutorial.fivespiritsmod.items;

import com.tutorial.fivespiritsmod.util.Modgroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

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
    //覆写添加物品信息
   /* @Override
    public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
        super.addInformation(itemstack, world, list, flag);
        list.add(new StringTextComponent("{$dj$})");
    }*/
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("stool-msg"));
    }

}
