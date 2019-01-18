package me.angeschossen.chestprotect.api.events;

import me.angeschossen.chestprotect.api.objects.ProtectionChunk;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ProtectionChunkDeletedEvent extends Event {
    public static HandlerList handlerList = new HandlerList();

    private ProtectionChunk protectionChunk;

    public ProtectionChunkDeletedEvent(ProtectionChunk protectionChunk) {
        this.protectionChunk = protectionChunk;
    }

    public ProtectionChunk getProtectionChunk(){
        return protectionChunk;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
