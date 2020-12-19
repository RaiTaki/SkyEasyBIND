package xyz.raitaki;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class Testbaby {

	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    Configuration config = new Configuration(event.getSuggestedConfigurationFile());
    MinecraftForge.EVENT_BUS.register(new xyz.raitaki.KeyInputHandler());
    xyz.raitaki.KeyBindings.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	}
    }