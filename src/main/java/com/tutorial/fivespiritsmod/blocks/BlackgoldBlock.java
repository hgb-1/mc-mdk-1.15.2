package com.tutorial.fivespiritsmod.blocks;

import com.tutorial.fivespiritsmod.sounds.SoundEventRegistry1;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlackgoldBlock extends Block {
    public BlackgoldBlock() {
        super(Properties.create(Material.IRON)
                .harvestLevel(3)
                //.sound(SoundType.ANVIL)
                .hardnessAndResistance(5f)
                .sound(SoundEventRegistry1.A_NEW_SOUND1)


        );
        this.setRegistryName("blackgold_block");
        }
    }


