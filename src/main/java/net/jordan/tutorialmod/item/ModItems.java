package net.jordan.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jordan.tutorialmod.TutorialMod;
import net.jordan.tutorialmod.item.custom.ChiselItem;
import net.jordan.tutorialmod.item.custom.HammerItem;
import net.jordan.tutorialmod.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems
{
    // This creates the custom items

    //region Pink Garnet Items
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item PINK_GARNET_SWORD = registerItem("pink_garnet_sword",
            new SwordItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 3, -2.4f))
            ));
    public static final Item PINK_GARNET_PICKAXE = registerItem("pink_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1, -2.8f))
            ));
    public static final Item PINK_GARNET_SHOVEL = registerItem("pink_garnet_shovel",
            new ShovelItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 1.5f, -3f))
            ));
    public static final Item PINK_GARNET_AXE = registerItem("pink_garnet_axe",
            new AxeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 6, -3.2f))
            ));
    public static final Item PINK_GARNET_HOE = registerItem("pink_garnet_hoe",
            new HoeItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 0, -3f))
            ));
    public static final Item PINK_GARNET_HAMMER = registerItem("pink_garnet_hammer",
            new HammerItem(ModToolMaterials.PINK_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNET, 7, -3.4f))
            ));

    public static final Item PINK_GARNET_BOW = registerItem("pink_garnet_bow",
            new BowItem(new Item.Settings().maxDamage(500)));

    public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
            new ModArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))
            ));
    public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))
            ));
    public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))
            ));
    public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
            new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))
            ));

    public static final Item PINK_GARNET_HORSE_ARMOR = registerItem("pink_garnet_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN,
                    false, new Item.Settings().maxCount(1)));
    //endregion

    //region Silver Items
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));

    public static final Item SILVER_SWORD = registerItem("silver_sword",
            new SwordItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SILVER, 3, -2.4f))
            ));
    public static final Item SILVER_PICKAXE = registerItem("silver_pickaxe",
            new PickaxeItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER, 1, -2.8f))
            ));
    public static final Item SILVER_SHOVEL = registerItem("silver_shovel",
            new ShovelItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SILVER, 1.5f, -3f))
            ));
    public static final Item SILVER_AXE = registerItem("silver_axe",
            new AxeItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SILVER, 6, -3.2f))
            ));
    public static final Item SILVER_HOE = registerItem("silver_hoe",
            new HoeItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SILVER, 0, -3f))
            ));
    public static final Item SILVER_HAMMER = registerItem("silver_hammer",
            new HammerItem(ModToolMaterials.SILVER, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SILVER, 7, -3.4f))
            ));

    public static final Item SILVER_BOW = registerItem("silver_bow",
            new BowItem(new Item.Settings().maxDamage(500)));

    public static final Item SILVER_HELMET = registerItem("silver_helmet",
            new ModArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))
            ));
    public static final Item SILVER_CHESTPLATE = registerItem("silver_chestplate",
            new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))
            ));
    public static final Item SILVER_LEGGINGS = registerItem("silver_leggings",
            new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))
            ));
    public static final Item SILVER_BOOTS = registerItem("silver_boots",
            new ArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))
            ));

    public static final Item SILVER_HORSE_ARMOR = registerItem("silver_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.SILVER_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN,
                    false, new Item.Settings().maxCount(1)));
    //endregion

    // This creates our custom chisel item
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item KOCK_SMITHING_TEMPLATE = registerItem("kock_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TutorialMod.MOD_ID, "kock"), FeatureFlags.VANILLA));

    //This creates our custom food
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER))
    {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type)
        {
            tooltip.add(Text.translatable("tooltip.tutorialmod.cauliflower"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    // This creates our custom fuel
    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

    // This function will register the items created by the mod
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems()
    {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        // Adds our mod item to the ingredients item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
