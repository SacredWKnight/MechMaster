package com.Sacred.Mech.item;

import com.Sacred.Mech.MechMaster;
import com.Sacred.Mech.custom.tool.ItemPixaxel;
import com.Sacred.Mech.lib.Reference;
import com.Sacred.Mech.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;

public class ItemLeatherMitt extends ItemPixaxel{

	public ItemLeatherMitt(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1-256, par2EnumToolMaterial);
		this.setUnlocalizedName(Strings.LEATHER_MITT_NAME);
		this.setCreativeTab(MechMaster.TabMM);
	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		itemIcon = register.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
}}
