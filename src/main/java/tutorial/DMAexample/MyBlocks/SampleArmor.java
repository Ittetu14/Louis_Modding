package tutorial.DMAexample.MyBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import tutorial.DMAexample.MyCode;
import tutorial.DMAexample.yourmodsname;

public class SampleArmor extends ItemArmor {
	public SampleArmor(ArmorMaterial material, int id, int placement) {
		super(material, id, placement);
		setCreativeTab(CreativeTabs.tabCombat);

		if (placement == 0) {//If Armor Piece if Helmet
			this.setTextureName(yourmodsname.MODID + ":Untitled-5");

		}
		else if (placement == 1)  {//If Armor Piece if the Chestplate
			this.setTextureName(yourmodsname.MODID + ":Untitled-2");
		}
		else if (placement == 2)  {//If Armor Piece if the Leggings
			this.setTextureName(yourmodsname.MODID + ":Untitled-4");
		}	
		else if (placement == 3)  {//If Armor Piece if the Boots
			this.setTextureName(yourmodsname.MODID + ":Untitled-3");
		}	
	}
	public String getArmorTexture(ItemStack stack,Entity entity, int slot, String type) {
		if (stack.getItem() == MyCode.SampleHelmet || stack.getItem() == MyCode.SampleChestplate || stack.getItem() == MyCode.SampleBoots) {
			return yourmodsname.MODID + ":textures/modles/armor/titaniumarmor.png";
		}
		if (stack.getItem() == MyCode.SampleLeggings) {
			return yourmodsname.MODID + ";textures/models/armor/SampleArmor_2.png";
		} else {
			return null;
		}

	}
	}
