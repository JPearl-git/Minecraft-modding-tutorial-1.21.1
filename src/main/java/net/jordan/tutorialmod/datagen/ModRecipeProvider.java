package net.jordan.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jordan.tutorialmod.TutorialMod;
import net.jordan.tutorialmod.block.ModBlocks;
import net.jordan.tutorialmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        //region Pink Garnet Recipes

        List<ItemConvertible> PINK_GARNET_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET, ModBlocks.PINK_GARNET_ORE, ModBlocks.PINK_GARNET_DEEPSLATE_ORE);
        offerSmelting(recipeExporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 200, "pink_garnet");
        offerBlasting(recipeExporter, PINK_GARNET_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET, 0.25f, 100, "pink_garnet");
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.RAW_PINK_GARNET_BLOCK);

        createStairsRecipe(ModBlocks.PINK_GARNET_STAIRS, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_SLAB, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BUTTON, 1)
                .input(ModBlocks.PINK_GARNET_BLOCK)
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        offerWallRecipe(recipeExporter, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_WALL, ModBlocks.PINK_GARNET_BLOCK);

        createFenceRecipe(ModBlocks.PINK_GARNET_FENCE, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        createFenceGateRecipe(ModBlocks.PINK_GARNET_FENCE_GATE, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        createDoorRecipe(ModBlocks.PINK_GARNET_DOOR, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        createTrapdoorRecipe(ModBlocks.PINK_GARNET_TRAPDOOR, Ingredient.ofItems(ModBlocks.PINK_GARNET_BLOCK))
                .criterion(hasItem(ModBlocks.PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);

        //endregion

        //region Silver Recipes
        
        List<ItemConvertible> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER, ModBlocks.SILVER_ORE, ModBlocks.SILVER_DEEPSLATE_ORE);
        offerSmelting(recipeExporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.25f, 200, "silver");
        offerBlasting(recipeExporter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.25f, 100, "silver");
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SILVER_INGOT, RecipeCategory.DECORATIONS, ModBlocks.SILVER_BLOCK);
        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_SILVER, RecipeCategory.DECORATIONS, ModBlocks.RAW_SILVER_BLOCK);

        createStairsRecipe(ModBlocks.SILVER_STAIRS, Ingredient.ofItems(ModBlocks.SILVER_BLOCK))
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);

        createSlabRecipe(RecipeCategory.DECORATIONS, ModBlocks.SILVER_SLAB, Ingredient.ofItems(ModBlocks.SILVER_BLOCK))
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.SILVER_BUTTON, 1)
                .input(ModBlocks.SILVER_BLOCK)
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);

        createPressurePlateRecipe(RecipeCategory.DECORATIONS, ModBlocks.SILVER_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.SILVER_BLOCK))
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);

        offerWallRecipe(recipeExporter, RecipeCategory.DECORATIONS, ModBlocks.SILVER_WALL, ModBlocks.SILVER_BLOCK);

        createFenceRecipe(ModBlocks.SILVER_FENCE, Ingredient.ofItems(ModBlocks.SILVER_BLOCK))
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);

        createFenceGateRecipe(ModBlocks.SILVER_FENCE_GATE, Ingredient.ofItems(ModBlocks.SILVER_BLOCK))
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);

        createDoorRecipe(ModBlocks.SILVER_DOOR, Ingredient.ofItems(ModBlocks.SILVER_BLOCK))
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);

        createTrapdoorRecipe(ModBlocks.SILVER_TRAPDOOR, Ingredient.ofItems(ModBlocks.SILVER_BLOCK))
                .criterion(hasItem(ModBlocks.SILVER_BLOCK), conditionsFromItem(ModBlocks.SILVER_BLOCK))
                .offerTo(recipeExporter);
        
        //endregion

        //region Sample Recipes
        //
        // Example of a shaped recipe
        /*
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RAW_PINK_GARNET)
                .criterion(hasItem(ModItems.RAW_PINK_GARNET), conditionsFromItem(ModItems.RAW_PINK_GARNET))
                .offerTo(recipeExporter);
         */

        //Example of a shapeless recipe
        /*
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 9)
                .input(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .criterion(hasItem(ModBlocks.RAW_PINK_GARNET_BLOCK), conditionsFromItem(ModBlocks.RAW_PINK_GARNET_BLOCK))
                .offerTo(recipeExporter);
         */

        //endregion

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET, 32)
                .input(ModBlocks.MAGIC_BLOCK)
                .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                .offerTo(recipeExporter, Identifier.of(TutorialMod.MOD_ID, "raw_pink_garnet_from_magic_block"));
    }
}
