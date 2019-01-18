package me.angeschossen.chestprotect.api.objects;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;


public interface ProtectPlayer {

    Player getPlayer();

    String getPlayerUUID();

    int getSize();

    void addProtection(Location location, Material material);

    void removeProtection(Location location);

    void removeProtection(String worldName, int x, int y, int z);

}
