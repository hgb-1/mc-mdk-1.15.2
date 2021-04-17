package com.tutorial.fivespiritsmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
//@Mod("spirits")
@Mod(Main.MODID)
    public class Main {
    public static final String MODID = "spirits";
  //待定  public static IProxy proxy= DistExecutor.runForDist(()-> ClientProxy::new,()->ServerProxy::new);

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public Main() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
       // proxy.init();
    }
}
