package com.tutorial.fivespiritsmod.blocks;

import com.tutorial.fivespiritsmod.sounds.SoundRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlackgoldBlock extends Block {
    public BlackgoldBlock() {
        super(Properties.create(Material.IRON)
                .harvestLevel(3)
                //.sound(SoundType.ANVIL)
                .sound(SoundRegistry.B)
                .hardnessAndResistance(5f)
               // .sound(new SoundType(1.0f,1.0f, SoundEventRegistry.A_NEW_SOUND, SoundEventRegistry.A_NEW_SOUND, SoundEventRegistry.A_NEW_SOUND, SoundEventRegistry.A_NEW_SOUND,SoundEventRegistry.A_NEW_SOUND))
        );
        this.setRegistryName("blackgold_block");
        }
    }


