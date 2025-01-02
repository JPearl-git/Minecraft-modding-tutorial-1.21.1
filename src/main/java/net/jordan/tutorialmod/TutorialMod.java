package net.jordan.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.jordan.tutorialmod.block.ModBlocks;
import net.jordan.tutorialmod.item.ModItemGroups;
import net.jordan.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}