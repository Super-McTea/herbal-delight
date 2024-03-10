package net.supermctea.herbaldelight.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.util.Identifier;
import net.supermctea.herbaldelight.HerbalDelight;
import net.supermctea.herbaldelight.item.ModItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ModLootTableModifiers {
    private static final Identifier GRASS_ID =
            new Identifier("minecraft","blocks/grass");
    private static final Identifier TALL_GRASS_ID =
            new Identifier("minecraft", "blocks/tall_grass");
    private static final Identifier TALL_FERN_ID =
            new Identifier("minecraft", "blocks/tall_fern");
    private static final Identifier DEAD_BUSH_ID =
            new Identifier("minecraft", "blocks/dead_bush");

    public static void registerLootTable() {
        Set<Identifier> addItemLootBlockIdList = Set.of(
                TALL_GRASS_ID,
                TALL_FERN_ID
        );

        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            Identifier injectId = new Identifier(HerbalDelight.MOD_ID, "inject/" + id.getPath());

            if (addItemLootBlockIdList.contains(id)) {
                tableBuilder.pool(LootPool.builder().with(LootTableEntry.builder(injectId)).build());
            }
        });
    }
}
