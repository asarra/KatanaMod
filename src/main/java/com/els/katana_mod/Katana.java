package com.elsyt.katana_mod;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Katana implements ToolMaterial {

    public static final Katana INSTANCE = new Katana();

    @Override
    public int getDurability() {
        return 2400;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.6F;
    }

    @Override
    public float getAttackDamage() {
        return 9;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }
}
