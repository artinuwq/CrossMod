
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cross.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.cross.item.EveItem;
import net.mcreator.cross.CrossMod;

public class CrossModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CrossMod.MODID);
	public static final RegistryObject<Item> EVE = REGISTRY.register("eve", () -> new EveItem());
}
