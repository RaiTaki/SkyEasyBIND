package xyz.raitaki;

import org.lwjgl.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeyBindings {
	
	
    public static KeyBinding bazaar;
    public static KeyBinding auchouse;
    public static KeyBinding craft;
    public static KeyBinding anvil;
    public static KeyBinding echest;
    
    
    public static void init() {
        bazaar = new KeyBinding("Bazaar", Keyboard.KEY_NONE, xyz.raitaki.References.category);
        ClientRegistry.registerKeyBinding(bazaar);
        
        auchouse = new KeyBinding("AUC House", Keyboard.KEY_NONE, xyz.raitaki.References.category);
        ClientRegistry.registerKeyBinding(auchouse);
        
        craft = new KeyBinding("Craft", Keyboard.KEY_NONE, xyz.raitaki.References.category);
        ClientRegistry.registerKeyBinding(craft);
        
        anvil = new KeyBinding("Anvil", Keyboard.KEY_NONE, xyz.raitaki.References.category);
        ClientRegistry.registerKeyBinding(anvil);
        
        echest = new KeyBinding("Ender Chest", Keyboard.KEY_NONE, xyz.raitaki.References.category);
        ClientRegistry.registerKeyBinding(echest);
        
    }
}