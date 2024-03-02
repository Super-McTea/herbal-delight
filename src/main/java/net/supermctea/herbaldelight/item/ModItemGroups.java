package net.supermctea.herbaldelight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.supermctea.herbaldelight.HerbalDelight;
import net.supermctea.herbaldelight.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup HERBAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HerbalDelight.MOD_ID, "tea"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tea"))
                    .icon(() -> new ItemStack(ModItems.GREEN_TEA_CUP)).entries(((displayContext, entries) -> {

                        entries.add(ModItems.SMART_SPECS);

                        entries.add(ModItems.GREEN_TEA_CUP);
                        entries.add(ModItems.BLACK_TEA_CUP);
                        entries.add(ModItems.HIBISCUS_TEA_CUP);

                        entries.add(ModItems.GREEN_TEA_LEAF);
                        entries.add(ModItems.BLACK_TEA_LEAF);
                        entries.add(ModItems.HIBISCUS_TEA_LEAF);

                        entries.add(Items.DIAMOND);

                        entries.add(ModBlocks.GREEN_TEA_BLOCK);
                        entries.add(ModBlocks.BLACK_TEA_BLOCK);
                        entries.add(ModBlocks.HIBISCUS_TEA_BLOCK);

                        entries.add(ModItems.GREEN_TEA_SEEDS);
                        entries.add(ModItems.BLACK_TEA_SEEDS);
                        entries.add(ModItems.HIBISCUS_TEA_SEEDS);

                    })).build());
    public static void registerItemGroups() {
        HerbalDelight.LOGGER.info("Registering Item Groups for " + HerbalDelight.MOD_ID);
    }
}
