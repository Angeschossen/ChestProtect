package me.angeschossen.chestprotect.api.events;

import me.angeschossen.chestprotect.api.objects.BlockProtection;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerOpenProtectionEvent extends Event implements Cancellable {

    private final Player player;
    private final BlockProtection blockProtection;

    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled = false;


    public PlayerOpenProtectionEvent(Player player, BlockProtection blockProtection) {
        this.player = player;
        this.blockProtection = blockProtection;
    }

    public Player getPlayer() {
        return player;
    }

    public BlockProtection getBlockProtection() {
        return blockProtection;
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
