package net.supermctea.herbaldelight;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.util.Identifier;
import net.supermctea.herbaldelight.block.ModBlocks;
import net.supermctea.herbaldelight.item.ModItemGroups;
import net.supermctea.herbaldelight.item.ModItems;
import net.supermctea.herbaldelight.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class HerbalDelight implements ModInitializer {
	public static final String MOD_ID = "herbaldelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world! Ready to begin? " + MOD_ID + " sure is!");
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.registerLootTable();

		this.registerFlammableBlocks();
		this.registerCompostableBlocks();
	}

	private void registerFlammableBlocks() {
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_TEA_BLOCK, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_TEA_BLOCK, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HIBISCUS_TEA_BLOCK, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIED_BLACK_TEA_BLOCK, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIED_GREEN_TEA_BLOCK, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DRIED_HIBISCUS_TEA_BLOCK, 30, 60);
	}
	private void registerCompostableBlocks() {
		CompostingChanceRegistry.INSTANCE.add(ModItems.BLACK_TEA_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_TEA_SEEDS, 0.3f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HIBISCUS_TEA_SEEDS, 0.3f);

		CompostingChanceRegistry.INSTANCE.add(ModItems.BLACK_TEA_LEAF, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.GREEN_TEA_LEAF, 0.65f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.HIBISCUS_TEA_LEAF, 0.65f);

		CompostingChanceRegistry.INSTANCE.add(ModItems.DRIED_BLACK_TEA_LEAF, 0.85f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.DRIED_GREEN_TEA_LEAF, 0.85f);
		CompostingChanceRegistry.INSTANCE.add(ModItems.DRIED_HIBISCUS_TEA_LEAF, 0.85f);
	}
}