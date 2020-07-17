package play.projectnebula.secondplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class StopFallDamage implements Listener {
    @EventHandler(priority = EventPriority.HIGH)
    public void onDamage(EntityDamageEvent e){
        if(e.getEntity() instanceof Player){
            if(e.getCause() == EntityDamageEvent.DamageCause.FALL){
                e.setDamage(0);
            }
        }
    }
}
