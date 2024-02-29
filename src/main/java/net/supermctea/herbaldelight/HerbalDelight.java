package net.supermctea.herbaldelight;

import net.fabricmc.api.ModInitializer;

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
	}
}