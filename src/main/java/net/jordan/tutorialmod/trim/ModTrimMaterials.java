package net.jordan.tutorialmod.trim;

import net.jordan.tutorialmod.TutorialMod;
import net.jordan.tutorialmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials
{
    public static final RegistryKey<ArmorTrimMaterial> PINK_GARNET = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "pink_garnet"));

    public static final RegistryKey<ArmorTrimMaterial> SILVER = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TutorialMod.MOD_ID, "silver"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable)
    {
        register(registerable, PINK_GARNET, Registries.ITEM.getEntry(ModItems.PINK_GARNET),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 1.0f);

        register(registerable, SILVER, Registries.ITEM.getEntry(ModItems.SILVER_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#d1d1d1").getOrThrow()), 0.2f);
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex)
    {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
