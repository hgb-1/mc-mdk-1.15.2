package com.tutorial.fivespiritsmod.util;

import com.tutorial.fivespiritsmod.init.ModBlocks;
import com.tutorial.fivespiritsmod.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//注册
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {
    @SubscribeEvent
    public static void onBlocksRegistry(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(ModBlocks.blackgoldBlock);
        event.getRegistry().register(ModBlocks.amberStoneBlock);
    }
    @SubscribeEvent
    public static void onItemsRegistry(RegistryEvent.Register<Item> event){
        event.getRegistry().register(ModItems.obsidianIngot);
        event.getRegistry().register(ModItems.stool);

        event.getRegistry().register(new BlockItem(ModBlocks.blackgoldBlock,new Item.Properties().group(ItemGroup.MATERIALS))
                .setRegistryName(ModBlocks.blackgoldBlock.getRegistryName()));
        event.getRegistry().register(new BlockItem(ModBlocks.amberStoneBlock,new Item.Properties().group(Modgroup.itemGroup))
                .setRegistryName(ModBlocks.amberStoneBlock.getRegistryName()));
    }

    //
   /* @SubscribeEvent
     public static void onEntityInteract(PlayerInteractEvent.EntityInteract event)
    {
        PlayerEntity playerEntity1=(PlayerEntity) event.getEntity();
        World world= event.getEntity().getEntityWorld();
        if (playerEntity1.isServerWorld()&& event.getEntity() instanceof PigEntity)
        {
            PigEntity pigEntity1= (PigEntity) event.getEntity();
            ItemStack stack=playerEntity1.getHeldItem(Hand.MAIN_HAND);//获取玩家实体主手所持物品
            //不是空手，且所持物品为小麦或小麦种子或粪便
            if (stack.getItem()== Items.CARROT)
            {
                playerEntity1.attackEntityFrom(DamageSourceRegistry.A1,0.9f);
                 playerEntity1.world.createExplosion(pigEntity1,pigEntity1.getPosX(),pigEntity1.getPosY(),pigEntity1.getPosZ(),2.5f,true, Explosion.Mode.DESTROY);
                pigEntity1.setHealth(-10f);
            }
        }
    }*/
}


