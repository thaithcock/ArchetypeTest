package com.example.groupid.samplebukkitplugin;

import org.bukkit.plugin.java.JavaPlugin;

/*
 * This is the main class of the sample plug-in
 */
public class MyPlugin extends JavaPlugin {
    /*
     * This is called when your plug-in is enabled
     */
    @Override
    public void onEnable() {
        // save the configuration file
        saveDefaultConfig();
        
        // Create the SampleBukkitPluginListener
        new MyEventListener(this);
        
        // set the command executor for sample
        this.getCommand("sample").setExecutor(new MyCommandExecutor(this));
    }
    
    /*
     * This is called when your plug-in shuts down
     */
    @Override
    public void onDisable() {        
        
    }

}
