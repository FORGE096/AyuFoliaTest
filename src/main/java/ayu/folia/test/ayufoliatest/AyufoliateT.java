package ayu.folia.test.ayufoliatest;

import org.bukkit.plugin.java.JavaPlugin;


public final class AyufoliateT extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled. Ready to serve players!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled. See you soon!");
    }
}
