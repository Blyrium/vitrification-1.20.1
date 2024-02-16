package net.blyrium.vitrification;

import net.blyrium.vitrification.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vitrification implements ModInitializer {
	public static final String MOD_ID = "vitrification";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}