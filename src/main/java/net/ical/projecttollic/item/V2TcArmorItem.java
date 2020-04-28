
package net.ical.projecttollic.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.ical.projecttollic.itemgroup.Pr0jec7stuffItemGroup;
import net.ical.projecttollic.PrjectllicElements;

@PrjectllicElements.ModElement.Tag
public class V2TcArmorItem extends PrjectllicElements.ModElement {
	@ObjectHolder("projecttollic:v2tcarmorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("projecttollic:v2tcarmorbody")
	public static final Item body = null;
	@ObjectHolder("projecttollic:v2tcarmorlegs")
	public static final Item legs = null;
	@ObjectHolder("projecttollic:v2tcarmorboots")
	public static final Item boots = null;
	public V2TcArmorItem(PrjectllicElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 83;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{11, 33, 28, 11}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 50;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "v2tcarmor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "projecttollic:textures/models/armor/v2tc_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("v2tcarmorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "projecttollic:textures/models/armor/v2tc_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("v2tcarmorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "projecttollic:textures/models/armor/v2tc_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("v2tcarmorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "projecttollic:textures/models/armor/v2tc_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("v2tcarmorboots"));
	}
}
