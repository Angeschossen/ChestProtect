package me.angeschossen.chestprotect.api.events;

import me.angeschossen.chestprotect.api.objects.Protection;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerOpenProtectionEvent extends Event implements Cancellable {

    private final Player player;
    private final Protection protection;

    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled = false;


    public PlayerOpenProtectionEvent(Player player, Protection protection) {
        this.player = player;
        this.protection = protection;
    }

    public Player getPlayer() {
        return player;
    }

    public Protection getProtection() {
        return protection;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override @Deprecated
    public void setCancelled(boolean b) {
        cancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

}
