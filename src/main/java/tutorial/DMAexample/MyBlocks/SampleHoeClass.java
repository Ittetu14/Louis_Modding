package tutorial.DMAexample.MyBlocks;

import tutorial.DMAexample.yourmodsname;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;

public class SampleHoeClass extends ItemHoe {

	public SampleHoeClass(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(yourmodsname.MODID + ":Untitled-9");
	}
}
