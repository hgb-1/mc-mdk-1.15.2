/*package com.tutorial.fivespiritsmod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.inventory.container.ContainerType;

public class ClientProxy implements IProxy {
    @Override
    public void init() {
        ScreenManager.registerFactory((ContainerType<FilterBlockContainer>)ModGuiContainerType.filterBlockContainerType,FilterBlockScreen::new);
    }
    @Override
    public void World getClientWorld(){return Minecraft.getInstance().world;}
    @Override
    public void PlayerEntity getClientPlayer(){return Minecraft.getInstance().player;}


}*/

