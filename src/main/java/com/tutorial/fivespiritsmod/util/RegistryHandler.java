package com.tutorial.fivespiritsmod.util;

import com.tutorial.fivespiritsmod.fluids.FluidMercury;
import com.tutorial.fivespiritsmod.init.ModBlocks;
import com.tutorial.fivespiritsmod.init.ModItems;
import com.tutorial.fivespiritsmod.init.Modgroup;
import net.minecraft.block.Block;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//注册
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

    //方块
    @SubscribeEvent
    public static void onBlocksRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(ModBlocks.blackgoldBlock);
        event.getRegistry().register(ModBlocks.amberStoneBlock);

    }
    //物品
    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event){
        //Item
        event.getRegistry().register(ModItems.obsidianIngot);
        //food_Item
        event.getRegistry().register(ModItems.stool);

        //block_Item
        event.getRegistry().register(new BlockItem(ModBlocks.blackgoldBlock,new Item.Properties().group(ItemGroup.MATERIALS))
                .setRegistryName(ModBlocks.blackgoldBlock.getRegistryName()));
        event.getRegistry().register(new BlockItem(ModBlocks.amberStoneBlock,new Item.Properties().group(Modgroup.itemGroup))
                .setRegistryName(ModBlocks.amberStoneBlock.getRegistryName()));
        
        event.getRegistry().register(new BlockItem(FluidMercury.MILK_BLOCK.get(),new Item.Properties().group(Modgroup.itemGroup))
                .setRegistryName(FluidMercury.MILK_BLOCK.get().getRegistryName()));
    }
    @SubscribeEvent
    public static void onFluidRegistry(RegistryEvent.Register<Fluid> event){


    }



}


