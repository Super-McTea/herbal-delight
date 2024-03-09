package net.supermctea.herbaldelight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.supermctea.herbaldelight.HerbalDelight;
import net.supermctea.herbaldelight.block.custom.BlackTeaCropBlock;
import net.supermctea.herbaldelight.block.custom.GreenTeaCropBlock;
import net.supermctea.herbaldelight.block.custom.HibiscusTeaCropBlock;

public class ModBlocks {
    // Raw Leaf Blocks
    public static final Block GREEN_TEA_BLOCK = registerBlock("green_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.DARK_AQUA).burnable()));
    public static final Block BLACK_TEA_BLOCK = registerBlock("black_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.BLACK).burnable()));
    public static final Block HIBISCUS_TEA_BLOCK = registerBlock("hibiscus_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.DARK_CRIMSON).burnable()));

    // Dried Leaf Blocks (decoration mostly)
    public static final Block DRIED_GREEN_TEA_BLOCK = registerBlock("dried_green_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.DARK_AQUA).burnable()));
    public static final Block DRIED_BLACK_TEA_BLOCK = registerBlock("dried_black_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.BLACK).burnable()));
    public static final Block DRIED_HIBISCUS_TEA_BLOCK = registerBlock("dried_hibiscus_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.DARK_CRIMSON).burnable()));

    // Baked Leaf Blocks
    public static final Block BAKED_GREEN_TEA_BLOCK = registerBlock("baked_green_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).mapColor(MapColor.DARK_AQUA)));
    public static final Block BAKED_BLACK_TEA_BLOCK = registerBlock("baked_black_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).mapColor(MapColor.BLACK)));
    public static final Block BAKED_HIBISCUS_TEA_BLOCK = registerBlock("baked_hibiscus_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).mapColor(MapColor.DARK_CRIMSON)));
    public static final Block BAKED_GREEN_TEA_SLAB = registerBlock("baked_green_tea_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BAKED_GREEN_TEA_BLOCK)));
    public static final Block BAKED_BLACK_TEA_SLAB = registerBlock("baked_black_tea_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BAKED_BLACK_TEA_BLOCK)));
    public static final Block BAKED_HIBISCUS_TEA_SLAB = registerBlock("baked_hibiscus_tea_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BAKED_HIBISCUS_TEA_BLOCK)));
    public static final Block BAKED_GREEN_TEA_STAIRS = registerBlock("baked_green_tea_stairs",
            new StairsBlock(BAKED_GREEN_TEA_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BAKED_GREEN_TEA_BLOCK)));
    public static final Block BAKED_BLACK_TEA_STAIRS = registerBlock("baked_black_tea_stairs",
            new StairsBlock(BAKED_BLACK_TEA_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BAKED_BLACK_TEA_BLOCK)));
    public static final Block BAKED_HIBISCUS_TEA_STAIRS = registerBlock("baked_hibiscus_tea_stairs",
            new StairsBlock(BAKED_HIBISCUS_TEA_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(BAKED_HIBISCUS_TEA_BLOCK)));

    // Baked Bricks
    public static final Block BAKED_GREEN_TEA_BRICKS = registerBlock("baked_green_tea_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).mapColor(MapColor.DARK_AQUA)));
    public static final Block BAKED_BLACK_TEA_BRICKS = registerBlock("baked_black_tea_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).mapColor(MapColor.BLACK)));
    public static final Block BAKED_HIBISCUS_TEA_BRICKS = registerBlock("baked_hibiscus_tea_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE).mapColor(MapColor.DARK_CRIMSON)));
    public static final Block BAKED_GREEN_TEA_BRICK_SLAB = registerBlock("baked_green_tea_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BAKED_GREEN_TEA_BRICKS)));
    public static final Block BAKED_BLACK_TEA_BRICK_SLAB = registerBlock("baked_black_tea_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BAKED_BLACK_TEA_BRICKS)));
    public static final Block BAKED_HIBISCUS_TEA_BRICK_SLAB = registerBlock("baked_hibiscus_tea_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(BAKED_HIBISCUS_TEA_BRICKS)));
    public static final Block BAKED_GREEN_TEA_BRICK_STAIRS = registerBlock("baked_green_tea_brick_stairs",
            new StairsBlock(BAKED_GREEN_TEA_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BAKED_GREEN_TEA_BRICKS)));
    public static final Block BAKED_BLACK_TEA_BRICK_STAIRS = registerBlock("baked_black_tea_brick_stairs",
            new StairsBlock(BAKED_BLACK_TEA_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BAKED_BLACK_TEA_BRICKS)));
    public static final Block BAKED_HIBISCUS_TEA_BRICK_STAIRS = registerBlock("baked_hibiscus_tea_brick_stairs",
            new StairsBlock(BAKED_HIBISCUS_TEA_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(BAKED_HIBISCUS_TEA_BRICKS)));

    // Crops
    public static final Block GREEN_TEA_CROP = Registry.register(Registries.BLOCK, new Identifier(HerbalDelight.MOD_ID, "green_tea_crop"),
            new GreenTeaCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block BLACK_TEA_CROP = Registry.register(Registries.BLOCK, new Identifier(HerbalDelight.MOD_ID, "black_tea_crop"),
            new BlackTeaCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block HIBISCUS_TEA_CROP = Registry.register(Registries.BLOCK, new Identifier(HerbalDelight.MOD_ID, "hibiscus_tea_crop"),
            new HibiscusTeaCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(HerbalDelight.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(HerbalDelight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        HerbalDelight.LOGGER.info("Registering Modded Blocks for " + HerbalDelight.MOD_ID);
    }
}
