package me.angeschossen.chestprotect.api.events;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ProtectionPreCreationEvent extends Event implements Cancellable {
    public static HandlerList handlerList = new HandlerList();

    private final Location location;
    private final Player player;
    private boolean cancelled = false;

    public ProtectionPreCreationEvent(Location location, Player player) {
        this.location = location;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public Location getLocation() {
        return location;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
