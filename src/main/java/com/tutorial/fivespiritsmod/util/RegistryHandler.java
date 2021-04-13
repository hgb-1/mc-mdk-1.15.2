package com.tutorial.fivespiritsmod.util;

import com.tutorial.fivespiritsmod.init.ModBlocks;
import com.tutorial.fivespiritsmod.init.ModItems;
import com.tutorial.fivespiritsmod.sounds.SoundEventRegistry1;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraft.util.SoundEvent.*;

//注册
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    @SubscribeEvent
    public static void onBlocksRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(ModBlocks.blackgoldBlock);
    }
    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event){
        event.getRegistry().register(ModItems.obsidianIngot);
        event.getRegistry().register(ModItems.stool);

        event.getRegistry().register(new BlockItem(ModBlocks.blackgoldBlock,new Item.Properties().group(ItemGroup.MATERIALS))
                .setRegistryName(ModBlocks.blackgoldBlock.getRegistryName()));
    }
    @SubscribeEvent
    public static void onSoundEventRegistration(RegistryEvent.Register<SoundEvent> event) {
       // event.getRegistry().register(A_NEW_SOUND.setRegistryName(new ResourceLocation("spirits", "shiyan")));
       event.getRegistry().register(SoundEventRegistry1.A_NEW_SOUND);

    }

}
