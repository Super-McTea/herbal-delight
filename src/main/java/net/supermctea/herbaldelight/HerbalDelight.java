package net.supermctea.herbaldelight;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.supermctea.herbaldelight.block.ModBlocks;
import net.supermctea.herbaldelight.item.ModItemGroups;
import net.supermctea.herbaldelight.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HerbalDelight implements ModInitializer {
	public static final String MOD_ID = "herbaldelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world! Ready to begin?");
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_TEA_BLOCK, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_TEA_BLOCK, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HIBISCUS_TEA_BLOCK, 30, 60);

		CompostingChanceRegistry.INSTANCE.add(ModItems.BLACK_TEA_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_TEA_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HIBISCUS_TEA_SEEDS, 0.3f);

		CompostingChanceRegistry.INSTANCE.add(ModItems.BLACK_TEA_LEAF, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_TEA_LEAF, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HIBISCUS_TEA_LEAF, 0.65f);

		// TODO: add dried leaves to the composting registry with a value of 0.85
	}
}