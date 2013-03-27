package markarthian.mods;

import java.net.Proxy;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Item;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid="Magic_Expansion", name="Magical Expansion", version="Pre0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Magic_Expansion {
	
	@Mod.Instance("Magical Expansion")
	public static Configuration config;
	public static int MagicalInfuserID;
	public static int ScholarInfuserID;
	public static int AltarMagisID;
	public static int FormatorMateriaeID;
	public static int StairsofAscentionID;
	public static int IWAPADhoodID;
	public static int IWAPADchestID;
	public static int IWAPADlegsID;
	public static int IWAPADfeetID;
	public static int IWAENHhoodID;
	public static int IWAENHchestID;
	public static int IWAENHlegsID;
	public static int IWAENHfeetID;
	public static int IWAMAhoodID;
	public static int IWAMAchestID;
	public static int IWAMAlegsID;
	public static int IWAMAfeetID;
	public static int UnattunedEssenceID;
	public static int PureEssenceID;
	public static int EvilEssenceID;
	public static int AmuletofSkyID;
	public static Block MagicalInfuser;
	public static Block ScholarInfuser;
	public static Block AltarMagis;
	public static Block FormatorMateriae;
	public static Block StairsofAscention;
	public static Item IWAPADhood;
	public static Item IWAPADchest;
	public static Item IWAPADlegs;
	public static Item IWAPADfeet;
	public static Item IWAENHhood;
	public static Item IWAENHchest;
	public static Item IWAENHlegs;
	public static Item IWAENHfeet;
	public static Item IWAMAhood;
	public static Item IWAMAchest;
	public static Item IWAMAlegs;
	public static Item IWAMAfeet;
	public static Item UnattunedEssence;
	public static Item PureEssence;
	public static Item EvilEssence;
	public static Item AmuletofSky;
	
	@SidedProxy(clientSide="markarthian.mods.client.ClientProxy", serverSide="markarthian.mods.CommonProxy")
	public static CommonProxy proxy;
	
	@Mod.PreInit
	  public void preInit(FMLPreInitializationEvent event)
	{
	    Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    try
	    {
	    	config.load();
	    	
	    	MagicalInfuserID = config.getItem("Magical Infuser", 27200).getInt();
	    	ScholarInfuserID = config.getItem("Scholar's Infuser", 27201).getInt();
	    	AltarMagisID = config.getItem("Altar Magis", 27202).getInt();
	    	FormatorMateriaeID = config.getItem("Formator Materiae", 27203).getInt();
	    	StairsofAscentionID = config.getItem("Stairs of Ascention", 27204).getInt();
	    	IWAPADhoodID = config.getItem("Padded Wizard's Armor Hood", 27205).getInt();
	    	IWAPADchestID = config.getItem("Padded Wizard's Armor Chest", 27206).getInt();
	    	IWAPADlegsID = config.getItem("Padded Wizard's Armor Legs", 27207).getInt();
	    	IWAPADfeetID = config.getItem("Padded Wizard's Armor Feet", 27208).getInt();
	    	IWAENHhoodID = config.getItem("Enhanced Wizard's Armor Hood", 27209).getInt();
	    	IWAENHchestID = config.getItem("Enhanced Wizard's Armor Chest", 27210).getInt();
	    	IWAENHlegsID = config.getItem("Enhanced Wizard's Armor Legs", 27211).getInt();
	    	IWAENHfeetID = config.getItem("Enhanced Wizard's Armor Feet", 27212).getInt();
	    	IWAMAhoodID = config.getItem("Moderator Arcanis Wizard's Armor Hood", 27213).getInt();
	    	IWAMAchestID = config.getItem("Moderator Arcanis Wizard's Armor Chest", 27214).getInt();
	    	IWAMAlegsID = config.getItem("Moderator Arcanis Wizard's Armor Legs", 27215).getInt();
	    	IWAMAfeetID = config.getItem("Moderator Arcanis Wizard's Armor Feet", 27216).getInt();
	    	UnattunedEssenceID = config.getItem("Unattuned Essence", 27217).getInt();
	    	PureEssenceID = config.getItem("Pure Essence", 27218).getInt();
	    	EvilEssenceID = config.getItem("Evil Essence", 27219).getInt();
	    	AmuletofSkyID = config.getItem("Amulet of the Sky", 27220).getInt();
	    	
	    	
	    }
	    catch (Exception e)
	    {
	    	FMLLog.log(Level.SEVERE, e, "[Magical Expansion] Error while loading config file", new Object[0]);
	    	throw new RuntimeException(e);
	    }
	    finally
	    {
	    	config.save();
	    }
	}
	
	@Mod.Init
	public void load(FMLInitializationEvent event){
		
	}
}
