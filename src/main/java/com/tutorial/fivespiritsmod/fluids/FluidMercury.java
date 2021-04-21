package com.tutorial.fivespiritsmod.fluids;

import com.tutorial.fivespiritsmod.util.Modgroup;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
//注册Main中
public class FluidMercury{
//流体动静态材质
    public static final ResourceLocation MILK_STILL_RL = new ResourceLocation("spirits" , "fluid/mercury_still");
    public static final ResourceLocation MILK_FLOWING_RL = new ResourceLocation("spirits" , "fluid/mercury_still");
    public static final ResourceLocation MILK_OVERLAY_RL = new ResourceLocation("spirits" , "fluid/mercury_overlay");

    public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<Fluid>(ForgeRegistries.FLUIDS, "spirits");

    public static final RegistryObject<FlowingFluid> MILK_FLUID = FLUIDS.register("milk_fluid",
            () -> new ForgeFlowingFluid.Source(FluidMercury.MILK_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MILK_FLOWING = FLUIDS.register("milk_flowing",
            () -> new ForgeFlowingFluid.Flowing(FluidMercury.MILK_PROPERTIES));
//流体属性
    public static final ForgeFlowingFluid.Properties MILK_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MILK_FLUID.get(), () -> MILK_FLOWING.get(),
            FluidAttributes.builder(MILK_STILL_RL, MILK_FLOWING_RL)
                    .density(1000)
                    // .color(16777215)
                    .color(12319903)
                    .luminosity(10)
                    .viscosity(4000)

                   // .rarity(Rarity.RARE)
                    .rarity(Rarity.COMMON)
                    .sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK)
                    .overlay(MILK_OVERLAY_RL)
    )
                    .block(() -> FluidMercury.MILK_BLOCK.get())
                    .bucket(() -> FluidMercury.EXAMPLE_BUCKET.get());
//流体块
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "spirits");
    public static final RegistryObject<FlowingFluidBlock> MILK_BLOCK = FluidMercury.BLOCKS.register("mercury_fluid",
            () -> new FlowingFluidBlock(() -> FluidMercury.MILK_FLUID.get(),
                    Block.Properties.create(Material.WATER)
                            .doesNotBlockMovement()
                            .hardnessAndResistance(100.0f)
                            .noDrops()
            )
    );
//流体桶
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "spirits");
    public static final RegistryObject<BucketItem> EXAMPLE_BUCKET = ITEMS.register("example_bucket",
            () -> new BucketItem(() -> FluidMercury.MILK_FLUID.get(),
                    new Item.Properties()
                            .group(Modgroup.itemGroup)
                            .maxStackSize(1)
            ));

}