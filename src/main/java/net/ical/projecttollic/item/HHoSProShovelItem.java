
package net.ical.projecttollic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.ical.projecttollic.itemgroup.Pr0jec7stuffItemGroup;
import net.ical.projecttollic.PrjectllicElements;

@PrjectllicElements.ModElement.Tag
public class HHoSProShovelItem extends PrjectllicElements.ModElement {
	@ObjectHolder("projecttollic:hhosproshovel")
	public static final Item block = null;
	public HHoSProShovelItem(PrjectllicElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 6267;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 20;
			}

			public int getEnchantability() {
				return 140;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)) {
		}.setRegistryName("hhosproshovel"));
	}
}
