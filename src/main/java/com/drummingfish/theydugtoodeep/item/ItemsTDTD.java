package com.drummingfish.theydugtoodeep.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemsTDTD {

    public static Item journal;

    public static void init() {
        journal = new ItemJournal();
        GameRegistry.registerItem(journal, ItemInfo.JOURNAL_KEY);
    }
}
