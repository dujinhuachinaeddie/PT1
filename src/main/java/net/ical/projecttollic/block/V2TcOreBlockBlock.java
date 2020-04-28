
package net.ical.projecttollic.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.ical.projecttollic.itemgroup.Pr0jec7stuffItemGroup;
import net.ical.projecttollic.PrjectllicElements;

import java.util.List;
import java.util.Collections;

@PrjectllicElements.ModElement.Tag
public class V2TcOreBlockBlock extends PrjectllicElements.ModElement {
	@ObjectHolder("projecttollic:v2tcoreblock")
	public static final Block block = null;
	public V2TcOreBlockBlock(PrjectllicElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(Pr0jec7stuffItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(11)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("v2tcoreblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
