
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cross.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.cross.client.particle.CrossPrtcParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CrossModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(CrossModParticleTypes.CROSS_PRTC.get(), CrossPrtcParticle::provider);
	}
}
