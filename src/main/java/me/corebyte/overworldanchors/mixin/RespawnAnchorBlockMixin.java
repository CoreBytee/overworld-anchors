package me.corebyte.overworldanchors.mixin;

import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.world.World;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RespawnAnchorBlock.class)
public abstract class RespawnAnchorBlockMixin {
	@Overwrite
    public static boolean isNether(World world) {
        return true;
    }
}