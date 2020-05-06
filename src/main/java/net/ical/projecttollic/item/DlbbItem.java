
package net.ical.projecttollic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.ical.projecttollic.itemgroup.Pr0jec7stuffItemGroup;
import net.ical.projecttollic.PrjectllicElements;

@PrjectllicElements.ModElement.Tag
public class DlbbItem extends PrjectllicElements.ModElement {
	@ObjectHolder("projecttollic:dlbb")
	public static final Item block = null;
	public DlbbItem(PrjectllicElements instance) {
		super(instance, 100);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, PrjectllicElements.sounds.get(new ResourceLocation("projecttollic:dlbb")),
					new Item.Properties().group(Pr0jec7stuffItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dlbb");
		}
	}
}
