package me.nvme.item;

import me.nvme.UltraMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item UwU = registerItem("uwu", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(UltraMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        UltraMod.LOGGER.info("Registering Items UwU for " + UltraMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(l -> l.add(UwU));
    }
}
