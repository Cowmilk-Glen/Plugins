package play.projectnebula.secondplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class MyFirstCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        x = true;
        if(sender instanceof Player && args.length == 0){
            Player player = (Player) sender;
            player.sendMessage("LAKSHJJDKLASJDLKJAS");
        }
        else if(args.length >=1){
            Player player = Bukkit.getPlayer(args[0]);
            if(player == null) {
                sender.sendMessage(ChatColor.RED + "This player does not exist");
            }

        }
        else{
            sender.sendMessage(ChatColor.RED + "You have to be a player, or specify a player to use this command");
        }
        return true;
    }

}