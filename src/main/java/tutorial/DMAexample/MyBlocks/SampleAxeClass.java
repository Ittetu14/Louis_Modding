package tutorial.DMAexample.MyBlocks;

import tutorial.DMAexample.yourmodsname;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class SampleAxeClass extends ItemAxe {

	public SampleAxeClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(yourmodsname.MODID + ":Untitled-8");
	}
}
