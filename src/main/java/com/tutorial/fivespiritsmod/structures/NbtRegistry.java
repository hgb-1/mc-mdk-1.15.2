package com.tutorial.fivespiritsmod.structures;

import com.tutorial.fivespiritsmod.Main;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NbtRegistry {
    public static final DeferredRegister<Feature<?>> FEATURES = new DeferredRegister<>(ForgeRegistries.FEATURES, Main.MODID);
    public static RegistryObject<Structure<NoFeatureConfig>> HGB_1 = FEATURES.register("hgb1", () -> {
        return new HGB_1Structure(Dynamic -> {
            return NoFeatureConfig.deserialize(Dynamic);
        });
    });


}