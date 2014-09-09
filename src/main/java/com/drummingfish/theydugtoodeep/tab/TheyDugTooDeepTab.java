package com.drummingfish.theydugtoodeep.tab;

import com.drummingfish.theydugtoodeep.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TheyDugTooDeepTab {
    public static final CreativeTabs THEYDUGTOODEEP_TAB = new CreativeTabs(ModInfo.ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return Items.item_frame;
        }
    };
}
