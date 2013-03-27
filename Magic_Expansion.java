package markarthian.mods;

import java.net.Proxy;
import java.util.logging.Level;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid="Magic_Expansion", name="Magical Expansion", dependencies="required-after:MageCraft", version="Pre0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Magic_Expansion {
	
	@SidedProxy(clientSide="markarthian.mods.ClientProxy", serverSide="markarthian.mods.ServerProxy")
	public static Proxy proxy;
	
	public static Configuration config;
	//public static boolean string
	
	@Mod.PreInit
	  public void preInit(FMLPreInitializationEvent event)
	{
	    Configuration config = new Configuration(event.getSuggestedConfigurationFile());
	    try
	    {
	    	config.load();
	    	/*blarg config goes here
	    	 * String.stuff
	    	 */
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
}
