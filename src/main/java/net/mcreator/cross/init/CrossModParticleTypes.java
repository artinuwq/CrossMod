
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.cross.CrossMod;

public class CrossModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, CrossMod.MODID);
	public static final RegistryObject<SimpleParticleType> YRWYTB = REGISTRY.register("yrwytb", () -> new SimpleParticleType(false));
}
