package tutorial.DMAexample.MyBlocks;

import tutorial.DMAexample.yourmodsname;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;

public class SamplePickaxeClass extends ItemPickaxe {

	public SamplePickaxeClass(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setCreativeTab(CreativeTabs.tabTools);
		setTextureName(yourmodsname.MODID + ":Untitled-6");
	}
}
