package net.supermctea.herbaldelight.item.custom;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class DrinkableItem extends Item {
    public DrinkableItem(Settings settings) {
        super(settings);
    }
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (!world.isClient()) {
            // Something here
        }

        ItemStack container = new ItemStack(stack.getItem().getRecipeRemainder());
        PlayerEntity player;

        if (stack.isFood()) {
            super.finishUsing(stack, world, user);

        } else if (user instanceof PlayerEntity) {
            player = (PlayerEntity)user;
            if (player instanceof ServerPlayerEntity) {
                ServerPlayerEntity serverPlayer = (ServerPlayerEntity)player;
                Criteria.CONSUME_ITEM.trigger(serverPlayer, stack);
            }

            player.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!player.getAbilities().creativeMode) {
                stack.decrement(1);
            }
        }

        if (stack.isEmpty()) {
            return container;
        } else {
            if (user instanceof PlayerEntity) {
                player = (PlayerEntity)user;
                if (!player.getAbilities().creativeMode && !player.getInventory().insertStack(container)) {
                    player.dropItem(container, false);
                }
            }

            return stack;
        }
    }
}
