package com.tutorial.fivespiritsmod.blocks.ore;

import com.google.common.eventbus.Subscribe;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.terraingen.WorldTypeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

public class AmberStoneBlock extends Block {
    public AmberStoneBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.ANVIL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .hardnessAndResistance(5f)
                .lootFrom(Blocks.BONE_BLOCK)
              );
        this.setRegistryName("amberstone_block");
    }
}
