
package net.ical.projecttollic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.ical.projecttollic.itemgroup.Pr0jec7stuffItemGroup;
import net.ical.projecttollic.PrjectllicElements;

@PrjectllicElements.ModElement.Tag
public class TCiSHoeItem extends PrjectllicElements.ModElement {
	@ObjectHolder("projecttollic:tcishoe")
	public static final Item block = null;
	public TCiSHoeItem(PrjectllicElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 4198;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 15;
			}

			public int getEnchantability() {
				return 105;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)) {
		}.setRegistryName("tcishoe"));
	}
}
