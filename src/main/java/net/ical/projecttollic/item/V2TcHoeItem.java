
package net.ical.projecttollic.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.ical.projecttollic.itemgroup.Pr0jec7stuffItemGroup;
import net.ical.projecttollic.PrjectllicElements;

@PrjectllicElements.ModElement.Tag
public class V2TcHoeItem extends PrjectllicElements.ModElement {
	@ObjectHolder("projecttollic:v2tchoe")
	public static final Item block = null;
	public V2TcHoeItem(PrjectllicElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2719;
			}

			public float getEfficiency() {
				return 17f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 11;
			}

			public int getEnchantability() {
				return 77;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)) {
		}.setRegistryName("v2tchoe"));
	}
}
