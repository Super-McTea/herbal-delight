package net.supermctea.herbaldelight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.supermctea.herbaldelight.HerbalDelight;

public class ModItems {
    public static final Item SMART_SPECS = registerItem("smart_specs", new Item(new FabricItemSettings()));
    public static final Item GREEN_TEA_CUP = registerItem("green_tea_cup", new Item(new FabricItemSettings().food(ModFoodComponents.GREEN_TEA_CUP)));
    public static final Item BLACK_TEA_CUP = registerItem("black_tea_cup", new Item(new FabricItemSettings().food(ModFoodComponents.BLACK_TEA_CUP)));

    public static final Item GREEN_TEA_LEAF = registerItem("green_tea_leaf", new Item(new FabricItemSettings()));
    public static final Item BLACK_TEA_LEAF = registerItem("black_tea_leaf", new Item(new FabricItemSettings()));
    public static final Item GREEN_TEA_PLANT = registerItem("green_tea_plant", new Item(new FabricItemSettings()));
    public static final Item BLACK_TEA_PLANT = registerItem("black_tea_plant", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HerbalDelight.MOD_ID, name), item);
    }
    public static void registerModItems() {
        HerbalDelight.LOGGER.info("Registering Mod Items for " + HerbalDelight.MOD_ID);
    }
}
