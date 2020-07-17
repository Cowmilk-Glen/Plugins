package play.projectnebula.secondplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class SecondPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new StopFallDamage(),this);
        this.getCommand("newcom").setExecutor(new MyFirstCommand());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
