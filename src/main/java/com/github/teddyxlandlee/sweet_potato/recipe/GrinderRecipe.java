package com.github.teddyxlandlee.sweet_potato.recipe;

import com.github.teddyxlandlee.sweet_potato.ExampleMod;
import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class GrinderRecipe implements Recipe<Inventory> {
    protected final Identifier id;
    protected final String group;
    protected final Ingredient input;
    protected final ItemStack output;
    protected final int grindTime;

    public GrinderRecipe(Identifier id, String group, Ingredient input, ItemStack output, int grindTime) {
        this.id = id;
        this.group = group;
        this.input = input;
        this.output = output;
        this.grindTime = grindTime;
    }


    @Override
    public boolean matches(Inventory inv, World world) {
        return this.input.test(inv.getStack(0));
    }

    @Override
    public ItemStack craft(Inventory inv) {
        return this.output.copy();
    }

    @Environment(EnvType.CLIENT)
    @Override
    public boolean fits(int width, int height) {
        return true;
    }

    @Override
    public ItemStack getOutput() {
        return this.output;
    }

    @Override
    public Identifier getId() {
        return this.id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<?> getType() {
        return ExampleMod.GRINDER_RECIPE_TYPE;
    }

    public static class Serializer extends AbstractRecipeSerializer<GrinderRecipe> {

        @Override
        public GrinderRecipe read(Identifier id, JsonObject json) {
            return null;
        }

        @Override
        public GrinderRecipe read(Identifier id, PacketByteBuf buf) {
            return null;
        }

        @Override
        public void write(PacketByteBuf buf, GrinderRecipe recipe) {

        }
    }
}
