package xyz.raitaki;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

public class KeyInputHandler {
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
    	EntityPlayer player = (EntityPlayer) Minecraft.getMinecraft().thePlayer;
    	
    	if(KeyBindings.anvil.isPressed())
        	Minecraft.getMinecraft().thePlayer.sendChatMessage("/anvil");
    	
    	
    	if(KeyBindings.auchouse.isPressed())
    		Minecraft.getMinecraft().thePlayer.sendChatMessage("/ah");
    	
    	if(KeyBindings.bazaar.isPressed())
    		Minecraft.getMinecraft().thePlayer.sendChatMessage("/bazaar");
    	
    	
    	if(KeyBindings.craft.isPressed())
    		Minecraft.getMinecraft().thePlayer.sendChatMessage("/craft");
    	
    	
    	if(KeyBindings.echest.isPressed())
    		Minecraft.getMinecraft().thePlayer.sendChatMessage("/echest");

    }
    


}