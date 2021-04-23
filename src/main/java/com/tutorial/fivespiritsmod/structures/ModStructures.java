package com.tutorial.fivespiritsmod.structures;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModStructures {
    public static IStructurePieceType HGB_1StructurePieceType;
    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        HGB_1StructurePieceType = Registry.register(Registry.STRUCTURE_PIECE, "house", (templateManager, nbt) -> {
            return new HGB_1StructurePiece(templateManager, nbt);
        });
        for (Biome biome : ForgeRegistries.BIOMES) {
            biome.addStructure(NbtRegistry.HGB_1.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
            biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES,NbtRegistry.HGB_1.get().withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
        }
    }
}