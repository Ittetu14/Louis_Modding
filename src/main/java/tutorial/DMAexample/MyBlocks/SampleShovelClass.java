package tutorial.DMAexample.MyBlocks;

import tutorial.DMAexample.yourmodsname;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;

public class SampleShovelClass extends ItemSpade {

	public SampleShovelClass(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(yourmodsname.MODID + ":Untitled-7");
	}
}

