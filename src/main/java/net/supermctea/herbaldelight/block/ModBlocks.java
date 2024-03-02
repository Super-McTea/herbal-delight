package net.supermctea.herbaldelight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
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
    public static final Block GREEN_TEA_BLOCK = registerBlock("green_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.DARK_GREEN).burnable()));
    public static final Block BLACK_TEA_BLOCK = registerBlock("black_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.BLACK).burnable()));
    public static final Block HIBISCUS_TEA_BLOCK = registerBlock("hibiscus_tea_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.DARK_CRIMSON).burnable()));

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
