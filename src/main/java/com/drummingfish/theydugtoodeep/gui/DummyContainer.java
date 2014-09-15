package com.drummingfish.theydugtoodeep.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class DummyContainer extends Container {
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }
}
