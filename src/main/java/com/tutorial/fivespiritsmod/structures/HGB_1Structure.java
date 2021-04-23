package com.tutorial.fivespiritsmod.structures;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;
import java.util.function.Function;

public class HGB_1Structure extends Structure<NoFeatureConfig> {
public HGB_1Structure(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn) {
        super(configFactoryIn);
        }

@Override
public boolean canBeGenerated(BiomeManager biomeManagerIn, ChunkGenerator<?> generatorIn, Random randIn, int chunkX, int chunkZ, Biome biomeIn) {
        if (randIn.nextFloat() < 0.003) {
        return true;
        }
        return false;
        }

@Override
public IStartFactory getStartFactory() {
        return (structure, chunkPosX, chunkPosZ, bounds, references, seed) -> {
        return new Start(structure, chunkPosX, chunkPosZ, bounds, references, seed);
        };
        }

@Override
public String getStructureName() {
        return "hgb1-name";
        }

@Override
public int getSize() {
        return 3;
        }

public static class Start extends StructureStart {

    public Start(Structure<?> structure, int chunkPosX, int chunkPosZ, MutableBoundingBox bounds, int references, long seed) {
        super(structure, chunkPosX, chunkPosZ, bounds, references, seed);
    }

    @Override
    public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ, Biome biomeIn) {
        HGB_1StructurePiece hgb_1StructurePiece = new HGB_1StructurePiece(this.rand, chunkX * 16, chunkZ * 16);
        this.components.add(hgb_1StructurePiece);
        this.recalculateStructureSize();
    }
}
}
