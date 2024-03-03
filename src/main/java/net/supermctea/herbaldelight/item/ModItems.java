package net.supermctea.herbaldelight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.supermctea.herbaldelight.HerbalDelight;
import net.supermctea.herbaldelight.block.ModBlocks;
import net.supermctea.herbaldelight.item.custom.BlackTeaCupItem;
import net.supermctea.herbaldelight.item.custom.GreenTeaCupItem;
import net.supermctea.herbaldelight.item.custom.HibiscusTeaCupItem;

public class ModItems {
    public static final Item SMART_SPECS = registerItem("smart_specs", new Item(new FabricItemSettings()));

    // Food Items
    public static final Item GREEN_TEA_CUP = registerItem("green_tea_cup", new GreenTeaCupItem(new FabricItemSettings()
            .food(ModFoodComponents.GREEN_TEA_CUP).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16)));
    public static final Item BLACK_TEA_CUP = registerItem("black_tea_cup", new BlackTeaCupItem(new FabricItemSettings()
            .food(ModFoodComponents.BLACK_TEA_CUP).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16)));
    public static final Item HIBISCUS_TEA_CUP = registerItem("hibiscus_tea_cup", new HibiscusTeaCupItem(new FabricItemSettings()
            .food(ModFoodComponents.HIBISCUS_TEA_CUP).recipeRemainder(Items.GLASS_BOTTLE).maxCount(16)));

    // Raw Leaf Crop
    public static final Item GREEN_TEA_LEAF = registerItem("green_tea_leaf", new Item(new FabricItemSettings()));
    public static final Item BLACK_TEA_LEAF = registerItem("black_tea_leaf", new Item(new FabricItemSettings()));
    public static final Item HIBISCUS_TEA_LEAF = registerItem("hibiscus_tea_leaf", new Item(new FabricItemSettings()));

    // Dried Leaf (to craft with)
    public static final Item DRIED_GREEN_TEA_LEAF = registerItem("dried_green_tea_leaf", new Item(new FabricItemSettings()));
    public static final Item DRIED_BLACK_TEA_LEAF = registerItem("dried_black_tea_leaf", new Item(new FabricItemSettings()));
    public static final Item DRIED_HIBISCUS_TEA_LEAF = registerItem("dried_hibiscus_tea_leaf", new Item(new FabricItemSettings()));

    // Crop Seeds
    public static final Item GREEN_TEA_SEEDS = registerItem("green_tea_seeds",
            new AliasedBlockItem(ModBlocks.GREEN_TEA_CROP, new FabricItemSettings()));
    public static final Item BLACK_TEA_SEEDS = registerItem("black_tea_seeds",
            new AliasedBlockItem(ModBlocks.BLACK_TEA_CROP, new FabricItemSettings()));
    public static final Item HIBISCUS_TEA_SEEDS = registerItem("hibiscus_tea_seeds",
            new AliasedBlockItem(ModBlocks.HIBISCUS_TEA_CROP, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HerbalDelight.MOD_ID, name), item);
    }
    public static void registerModItems() {
        HerbalDelight.LOGGER.info("Registering Mod Items for " + HerbalDelight.MOD_ID);
    }
}
