package tutorial.DMAexample.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;





public class cookedEggandPork extends Item 
{
	public cookedEggandPork() 
	{
		super();
		this.setHasSubtypes(true);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}



}
