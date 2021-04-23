package com.tutorial.fivespiritsmod.structures;

import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.ScatteredStructurePiece;
import net.minecraft.world.gen.feature.structure.StructurePiece;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.Random;
// TemplateStructurePiece
public class HGB_1StructurePiece extends ScatteredStructurePiece {
    private static final HGB_1StructurePiece.Selector BUILD_STONE_SELECTOR = new HGB_1StructurePiece.Selector();

    protected HGB_1StructurePiece(Random random, int x, int z) {
        super(ModStructures.HGB_1StructurePieceType, random, x, 64, z, 12, 10, 15);
    }

    protected HGB_1StructurePiece(TemplateManager templateManager, CompoundNBT nbt) {
        super(ModStructures.HGB_1StructurePieceType, nbt);
    }

    @Override
    public boolean create(IWorld worldIn, ChunkGenerator<?> chunkGeneratorIn, Random randomIn, MutableBoundingBox mutableBoundingBoxIn, ChunkPos chunkPosIn) {
        this.fillWithRandomizedBlocks(worldIn, mutableBoundingBoxIn, 0, 0, 0, 4, 4, 4, false, randomIn, BUILD_STONE_SELECTOR);
        this.fillWithAir(worldIn, mutableBoundingBoxIn, 1, 1, 1, 3, 3, 3);
        this.setBlockState(worldIn, Blocks.ACACIA_TRAPDOOR.getDefaultState().rotate(Rotation.CLOCKWISE_90), 2, 2, 0, mutableBoundingBoxIn);
        this.fillWithAir(worldIn, mutableBoundingBoxIn, 2, 1, 0, 2, 1, 0);

        return true;
    }

    static class Selector extends StructurePiece.BlockSelector {
        private Selector() {
        }

        public void selectBlocks(Random rand, int x, int y, int z, boolean wall) {
            this.blockstate = Blocks.DIAMOND_BLOCK.getDefaultState();
        }
    }
}
