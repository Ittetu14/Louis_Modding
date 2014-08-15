package tutorial.DMAexample;

//Recipes - Very important imports for creating recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraftforge.common.util.EnumHelper;

//MyBlocks


import tutorial.DMAexample.MyBlocks.hardOre;
import tutorial.DMAexample.MyBlocks.BaseBlock;


import tutorial.DMAexample.MyBlocks.titaniumOre;
import tutorial.DMAexample.MyBlocks.SampleArmor;
import tutorial.DMAexample.MyBlocks.SampleAxeClass;
import tutorial.DMAexample.MyBlocks.SampleShovelClass;
import tutorial.DMAexample.MyBlocks.SampleHoeClass;
import tutorial.DMAexample.MyBlocks.SamplePickaxeClass;
import tutorial.DMAexample.MyEntities.DeathBallEntity;

//MyItems
import tutorial.DMAexample.MyItems.BaseItem;
import tutorial.DMAexample.MyItems.CookedEgg;
import tutorial.DMAexample.MyItems.CustomSword;

import tutorial.DMAexample.MyItems.MyLauncherItem;
import tutorial.DMAexample.MyItems.SampleItemClass;
import tutorial.DMAexample.MyItems.titaniumIngot;
//MyCreative Tab
import net.minecraft.creativetab.CreativeTabs;


 












//Blocks
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Items
import net.minecraft.util.MathHelper;

public class MyCode {

	

	//Custom Creative Tab
	public static CreativeTabs tabMyMod = new MyCreativeTab("MyMod");

	//Materials
	public static ToolMaterial SampleMaterial = EnumHelper.addToolMaterial("SampleMaterial", 3, 1300, 10.0F, 8.0F, 10); 
	public static ArmorMaterial SampleArmorMaterial = EnumHelper.addArmorMaterial("SampleArmorMaterial", 66, new int [] {6, 16, 12, 6}, 10);//ArmorMaterial
	
	
	//Unique ID's for Armor
	 public static int helmetID;
	 public static int chestplateID;
	 public static int leggingsID;
	 public static int bootsID;
	 
	
	
	
	//List Blocks and Items Here

	//Blocks
	public static Block titaniumOre1;
	public static Block titaniumBlock;
	
	

	//Items
	public static Item MyLauncher;
	public static Item MyFood;
	public static Item myCustomSword;
	public static Item titaniumSword;
	public static Item titaniumIngot;
	
	public static Item cookedEgg;
	public static Item cookedEggandPork;
	public static Item m67;
	
   //Armor
//	public static Item SampleItem = new SampleItemClass().setUnlocalizedName("SampleItem");
	public static Item SampleHelmet = new SampleArmor(SampleArmorMaterial, helmetID, 0).setUnlocalizedName("SampleHelmet");
	public static Item SampleChestplate = new SampleArmor(SampleArmorMaterial, chestplateID, 1).setUnlocalizedName("SampleChestplate");
	public static Item SampleLeggings = new SampleArmor(SampleArmorMaterial, leggingsID, 2).setUnlocalizedName("SampleLeggings");
	public static Item SampleBoots = new SampleArmor(SampleArmorMaterial, bootsID, 3).setUnlocalizedName("SampleBoots");
	


	//Tool
	public static Item SampleAxe = new SampleAxeClass(SampleMaterial).setUnlocalizedName("TitaniumAxe");
	public static Item SampleHoe = new SampleHoeClass(SampleMaterial).setUnlocalizedName("TitaniumHoe");
	public static Item SampleShovel = new SampleShovelClass(SampleMaterial).setUnlocalizedName("TitaniumShovel");
	public static Item SamplePickaxe = new SamplePickaxeClass(SampleMaterial).setUnlocalizedName("TitaniumPickaxe");
	//public static Item axeTutorial;
	public static Item.ToolMaterial PLA = EnumHelper.addToolMaterial("PLA", 10, 300, 7.0F, 3.0F, 24);

   
	
	//Tool Material
	//public static Item.ToolMaterial exampleMaterial = EnumHelper.addToolMaterial("examplematerial",  2, 1000, 6.0F, 2.0F, 5);	
	//public static final ArmorMaterial CUS TOM_MATERIAL= EnumHelper.addArmorMaterial("Custom", 5, new int[] {1,3,2,1}, 5);

	public static void MyBlocks(){

	

		
		
		

		//Harden Stone
		titaniumBlock = new hardOre(Material.ground)
		.setHardness(0.9F)
		.setStepSound(Block.soundTypeStone)
		.setBlockName("titaniumBlock")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("yourmodsname:titaniumblock");


		//Harden Stone
		titaniumOre1 = new titaniumOre(Material.iron)
		.setHardness(3.9F)
		.setStepSound(Block.soundTypeStone)
		.setBlockName("titaniumOre")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("yourmodsname:titaniumOre");


		

		//Harvest Level
		titaniumBlock.setHarvestLevel("pickaxe", 3);		 

		//Register Items


		GameRegistry.registerBlock(titaniumOre1,"TitaniumOre");
		GameRegistry.registerBlock(titaniumBlock,"TitaniumBlock");
		
		GameRegistry.registerItem(m67,"M67");
		GameRegistry.registerItem(SampleHelmet,"TitaniumHelmet");
		GameRegistry.registerItem(SampleChestplate,"TitaniumChestplate");
		GameRegistry.registerItem(SampleLeggings,"TitaniumLeggings");
		GameRegistry.registerItem(SampleBoots,"TitaniumBoots");
		GameRegistry.registerItem(SampleAxe,"TitaniumAxe");
		GameRegistry.registerItem(SamplePickaxe,"TitaniumPickaxe");
		GameRegistry.registerItem(SampleShovel,"TitaniumShovel");
		GameRegistry.registerItem(SampleHoe,"TitaniumHoe");
		


		MyOreGenerator ore_gen = new MyOreGenerator();
		GameRegistry.registerWorldGenerator(ore_gen, 0);
		//For Generating Ores in Game - Day 5

	}

	public static void MyRecipes()
	{

		//Shapeless - First Shapeless Recipe (CommandBlock from Red Stone Torch)
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal), new Object[] { new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1, 1), new Object[] { new ItemStack(Items.coal)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.egg), new Object[] { new ItemStack(cookedEgg)});
		GameRegistry.addShapelessRecipe(new ItemStack(titaniumIngot, 9), new Object[] { new ItemStack(titaniumBlock)});

		//Shaped 

		//Comment Every Recipe!!!!!!!!!!!!!!!!!!! Hard Ore from cactus, gold, cocoa beans.
		//This recipe is so expensive for no good reason
		GameRegistry.addRecipe(new ItemStack(Items.cooked_beef,1), new Object[]{
			"   ","BAB","   ",
			'A',Items.beef,
			'B',Blocks.fire,
		});

		GameRegistry.addRecipe(new ItemStack(Items.cooked_chicken,1), new Object[]{
			"   ","BAB","   ",
			'A',Items.chicken,
			'B',Blocks.fire,
		});

		GameRegistry.addRecipe(new ItemStack(Items.cooked_porkchop,1), new Object[]{
			"   ","BAB","   ",
			'A',Items.porkchop,
			'B',Blocks.fire,
		});

		GameRegistry.addRecipe(new ItemStack(Items.cooked_fished,1), new Object[]{
			"   "," A "," B ",
			'A',Items.fish,
			'B',Blocks.fire,
		});

		GameRegistry.addRecipe(new ItemStack(Items.baked_potato,64), new Object[]{
			"BBB","BAB","BBB",
			'A',Items.potato,
			'B',Items.nether_star
		});

		GameRegistry.addRecipe(new ItemStack(Items.melon,10), new Object[]{
			"   "," AB","   ",
			'A',Blocks.melon_block,
			'B',Items.stick,
		});

		GameRegistry.addRecipe(new ItemStack(Items.cooked_fished,1, 1), new Object[]{
			"   "," A "," B ",
			'A', new ItemStack(Items.fish, 1, 1),
			'B',Blocks.fire,
		});
		
		GameRegistry.addRecipe(new ItemStack(titaniumBlock, 1), new Object[]{
			"AAA","AAA","AAA",
			'A', new ItemStack(titaniumIngot, 1),
			
		});

		GameRegistry.addRecipe(new ItemStack(cookedEggandPork, 1), new Object[]{
			"   "," AB","   ",
			'A', new ItemStack(cookedEgg, 1),
			'B', new ItemStack(Items.porkchop, 1),
			
		});
		
	
			
		
		
		GameRegistry.addRecipe(new ItemStack(titaniumSword, 1), new Object[]{
			" A "," A "," B ",
			'A', new ItemStack(titaniumIngot, 1),
            'B', new ItemStack(Items.stick, 1),
		});
		
		GameRegistry.addRecipe(new ItemStack(m67, 1), new Object[]{
			"AA ","BCB"," B ",
			'A', new ItemStack(Items.gold_ingot, 1),
            'B', new ItemStack(titaniumIngot, 1),
            'C', new ItemStack(Items.gunpowder, 1)
		});
		
		GameRegistry.addRecipe(new ItemStack(SampleHoe, 1), new Object[]{
			" AA"," B "," B ",
			'A', new ItemStack(titaniumIngot, 1),
            'B', new ItemStack(Items.stick, 1),
		});
		
		GameRegistry.addRecipe(new ItemStack(SampleShovel, 1), new Object[]{
			" A "," B "," B ",
			'A', new ItemStack(titaniumIngot, 1),
            'B', new ItemStack(Items.stick, 1),
		});
		
		GameRegistry.addRecipe(new ItemStack(SamplePickaxe, 1), new Object[]{
			"AAA"," B "," B ",
			'A', new ItemStack(titaniumIngot, 1),
            'B', new ItemStack(Items.stick, 1),
		});
		
		GameRegistry.addRecipe(new ItemStack(titaniumSword, 1), new Object[]{
			" AA"," BA"," B ",
			'A', new ItemStack(titaniumIngot, 1),
            'B', new ItemStack(Items.stick, 1),
		});
		
		GameRegistry.addRecipe(new ItemStack(SampleHelmet, 1), new Object[]{
			"AAA","A A","   ",
			'A', new ItemStack(titaniumIngot, 1),
            });
		
		GameRegistry.addRecipe(new ItemStack(SampleChestplate, 1), new Object[]{
			"A A","AAA","AAA",
			'A', new ItemStack(titaniumIngot, 1),
            });
		
		GameRegistry.addRecipe(new ItemStack(SampleLeggings, 1), new Object[]{
			"AAA","A A","A A",
			'A', new ItemStack(titaniumIngot, 1),
            });
		
		GameRegistry.addRecipe(new ItemStack(SampleBoots, 1), new Object[]{
			"   ","A A","A A",
			'A', new ItemStack(titaniumIngot, 1),
            });
		
		
		
		


		ItemStack sharpLauncher = new ItemStack(MyLauncher);
		sharpLauncher.addEnchantment(Enchantment.sharpness, 300);

		
		//sharpSteak.addEnchantment(Enchantment.sharpness, 3);

		//Make Pumpkin Pie - Really messed up pumpkin pie recipe 
		

		//Smelting

		//Cookie Cooked Steak
		GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 3), new ItemStack(titaniumBlock, 8), 1.0F);
		GameRegistry.addSmelting(new ItemStack(Items.poisonous_potato, 1), new ItemStack(Items. baked_potato,1), 1.0F);
		GameRegistry.addSmelting(new ItemStack(Items.fish, 1, 2), new ItemStack(Items. cooked_fished,1), 1.0F);
		GameRegistry.addSmelting(new ItemStack(Items.fish, 1, 3), new ItemStack(Items. cooked_fished,1), 1.0F);
		
		
		


	}

	public static void MyItems()
	{

		

		m67 = new MyLauncherItem()
		.setMaxStackSize(3)
		.setUnlocalizedName("M67")
		.setTextureName("yourmodsname:M67");
		
		
		MyFood = new ItemFood(6, 0.6F, false)
		.setUnlocalizedName("potatoBaked")
		.setTextureName("potato_baked");

		cookedEgg = new ItemFood(7, 0.6F, false)
		.setUnlocalizedName("cooked_Egg")
		.setTextureName("yourmodsname:cookedegg");
		
		cookedEggandPork = new ItemFood(12, 0.6F, false)
		.setUnlocalizedName("cooked_EggPork")
		.setTextureName("yourmodsname:cookedEggandPork");
		
		titaniumIngot = new titaniumIngot()
		.setMaxStackSize(64)
		.setUnlocalizedName("ingot_titanium")
		.setTextureName("yourmodsname:titaniumingot");

		
		

		GameRegistry.registerItem(MyLauncher, "MyLauncher");
		GameRegistry.registerItem(MyFood, "MyFood");
		GameRegistry.registerItem(titaniumIngot, "ingot_titanium");
		
        GameRegistry.registerItem(cookedEgg, "cooked_Egg");
        GameRegistry.registerItem(cookedEggandPork, "cooked_EggandPork");
        
        




		//Custom Sword

        titaniumSword = new CustomSword(PLA)
		.setUnlocalizedName("sword_titanium")
		.setTextureName("yourmodsname:titaniumsword");
		GameRegistry.registerItem(titaniumSword, "Titanium Sword");

		//Custom Axe
		// myCustomAxe = new CustomAxe(PLA)
		// 	.setUnlocalizedName("mycustomaxe");
		//GameRegistry.registerItem(myCustomAxe, "CustomAxe");









		CreativeTabs tabCustom = new CreativeTabs("tabName") {
			@Override
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {

				return Items.ender_eye;
			}
		};




		// GameRegistry.registerItem(axeTutorial, "axeTutorial");


	}



}
