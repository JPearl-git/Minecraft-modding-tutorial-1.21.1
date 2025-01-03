package net.jordan.tutorialmod.trim;

import net.jordan.tutorialmod.TutorialMod;
import net.jordan.tutorialmod.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class ModTrimPatterns
{
    public static final RegistryKey<ArmorTrimPattern> KOCK = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(TutorialMod.MOD_ID, "kock"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context)
    {
        register(context, ModItems.KOCK_SMITHING_TEMPLATE, KOCK);
    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item, RegistryKey<ArmorTrimPattern> key)
    {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(), Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);

        context.register(key, trimPattern);
    }
}
