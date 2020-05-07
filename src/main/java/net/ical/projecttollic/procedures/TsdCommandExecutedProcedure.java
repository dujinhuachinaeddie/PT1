package net.ical.projecttollic.procedures;

import net.minecraft.world.World;

import net.ical.projecttollic.PrjectllicElements;

@PrjectllicElements.ModElement.Tag
public class TsdCommandExecutedProcedure extends PrjectllicElements.ModElement {
	public TsdCommandExecutedProcedure(PrjectllicElements instance) {
		super(instance, 100);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TsdCommandExecuted!");
			return;
		}
		World world = (World) dependencies.get("world");
		world.setDayTime((int) 100);
	}
}
