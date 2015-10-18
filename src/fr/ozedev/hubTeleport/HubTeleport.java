package fr.ozedev.hubTeleport;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class HubTeleport extends JavaPlugin{
	public static Plugin instance;
	
	public void onEnable(){
		instance = this;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("hub")) { // Si c'est la commande "exemple" qui a été tapée:
			if(sender instanceof Player)
				ChangeServ.changeServ("lobby", (Player) sender, instance);
			else sender.sendMessage("Seul un joueur peut executer cette commande");
			return true;//On renvoie "true" pour dire que la commande était valide
		}
		return false;//Si une autre commande a été tapée on renvoie "false" pour dire qu'elle n'était pas valide.
	}
}
