
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cross.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CrossModTabs {
	public static CreativeModeTab TAB_CROSS;

	public static void load() {
		TAB_CROSS = new CreativeModeTab("tabcross") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CrossModItems.EVE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
