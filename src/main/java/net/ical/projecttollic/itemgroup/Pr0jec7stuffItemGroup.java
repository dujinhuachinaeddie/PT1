
package net.ical.projecttollic.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.ical.projecttollic.item.V2TcGemItem;
import net.ical.projecttollic.PrjectllicElements;

@PrjectllicElements.ModElement.Tag
public class Pr0jec7stuffItemGroup extends PrjectllicElements.ModElement {
	public Pr0jec7stuffItemGroup(PrjectllicElements instance) {
		super(instance, 64);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabpr0jec7stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(V2TcGemItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
