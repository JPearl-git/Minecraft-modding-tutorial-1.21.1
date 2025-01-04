package net.jordan.tutorialmod.util;

import net.jordan.tutorialmod.TutorialMod;
import net.jordan.tutorialmod.component.ModDataComponentTypes;
import net.jordan.tutorialmod.item.ModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModModelPredicates
{
    public static void registerModelPredicates()
    {
        ModelPredicateProviderRegistry.register(ModItems.CHISEL, Identifier.of(TutorialMod.MOD_ID, "used"),
                (stack, world, entity, seed) -> stack.get(ModDataComponentTypes.COORDINATES) != null ? 1f : 0f);
    }
}
