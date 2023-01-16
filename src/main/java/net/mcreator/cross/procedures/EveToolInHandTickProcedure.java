package net.mcreator.cross.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.cross.init.CrossModParticleTypes;

public class EveToolInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CrossModParticleTypes.CROSS_PRTC.get()), x, y, z, 3, 0.5, 1, 0.5, 0.05);
	}
}
