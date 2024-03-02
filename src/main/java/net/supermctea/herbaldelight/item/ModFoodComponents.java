package net.supermctea.herbaldelight.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GREEN_TEA_CUP = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f)
            .snack().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300), 0.3f)
            .build();
    public static final FoodComponent BLACK_TEA_CUP = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
            .snack().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400), 0.3f)
            .build();
    public static final FoodComponent HIBISCUS_TEA_CUP = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f)
            .snack().alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300), 0.3f)
            .build();
}
