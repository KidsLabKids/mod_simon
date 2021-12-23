package net.mcreator.luckyblock.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.particles.ParticleTypes;

import net.mcreator.luckyblock.LuckyBlockMod;

import java.util.Map;

public class SalzWennEinBlockPlatziertWurdeVonProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency x for procedure SalzWennEinBlockPlatziertWurdeVon!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency y for procedure SalzWennEinBlockPlatziertWurdeVon!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency z for procedure SalzWennEinBlockPlatziertWurdeVon!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LuckyBlockMod.LOGGER.warn("Failed to load dependency world for procedure SalzWennEinBlockPlatziertWurdeVon!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		for (int index0 = 0; index0 < (int) (1000); index0++) {
			world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0, 1, 0);
		}
	}
}
