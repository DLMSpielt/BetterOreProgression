package net.dlmspielt.betteroreprogression.item.custom;

import com.google.common.base.Suppliers;
import net.dlmspielt.betteroreprogression.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    COPPER(ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL,
            250, 5.0f, 1.5f, 20, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    BLUE_GOLD(ModTags.Blocks.INCORRECT_FOR_BLUE_GOLD_TOOL,
            1000, 7.0f, 2.5f, 17, () -> Ingredient.ofItems(ModItems.BLUE_GOLD_INGOT)),
    ENDERITE(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL,
            3000, 10.0f, 5.0f, 20, () -> Ingredient.ofItems(ModItems.ENDERITE_INGOT));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed,
                     final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}