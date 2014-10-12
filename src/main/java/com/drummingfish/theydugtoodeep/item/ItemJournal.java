package com.drummingfish.theydugtoodeep.item;

import com.drummingfish.theydugtoodeep.TheyDugTooDeep;
import com.drummingfish.theydugtoodeep.tab.TheyDugTooDeepTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemJournal extends Item {

    public ItemJournal() {
        super();
        this.setUnlocalizedName(ItemInfo.JOURNAL_UNLOCALIZED_NAME);
        this.setCreativeTab(TheyDugTooDeepTab.THEYDUGTOODEEP_TAB);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) player.openGui(TheyDugTooDeep.instance, 1, world, (int)player.posX, (int)player.posY, (int)player.posZ);
        return stack;
    }

    @Override
    public void onUpdate(ItemStack item, World world, Entity entity, int integer, boolean bool) {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.JOURNAL_ICON);
    }
}
