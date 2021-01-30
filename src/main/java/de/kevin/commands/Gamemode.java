package de.kevin.commands;

import de.kevin.ServerUtils;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if(!(sender instanceof Player)) return true;

        if(command.getName().equalsIgnoreCase("gamemode")) {
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("1")) {
                    if(!player.getGameMode().equals(GameMode.CREATIVE)) {
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(ServerUtils.getPluginPrefix() + "Du bist nun im Kreativ-Modus");
                    }else{
                        player.sendMessage(ServerUtils.getPluginPrefix() + "§4Du bist schon in Kreativ!");
                    }
                }else{
                    if(args[0].equalsIgnoreCase("0")) {
                        if(!player.getGameMode().equals(GameMode.SURVIVAL)) {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(ServerUtils.getPluginPrefix() + "Du bist nun im Survival-Modus");
                        }else{
                            player.sendMessage(ServerUtils.getPluginPrefix() + "§4Du bist schon in Survival!");
                        }
                    }
                }
            }
        }

        return false;
    }
}
