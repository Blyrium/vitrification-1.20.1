package net.blyrium.vitrification.item;

import net.blyrium.vitrification.Vitrification;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILICA_CRUCIBLE = registerItem("silica_crucible", new Item(new FabricItemSettings()));
    public static final Item SILICA_SAND = registerItem("silica_sand", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(SILICA_CRUCIBLE);
        entries.add(SILICA_SAND);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Vitrification.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Vitrification.LOGGER.info("Registering Mod Items for " + Vitrification.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientsTab);
    }
}
