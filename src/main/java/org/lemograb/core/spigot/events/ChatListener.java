package org.lemograb.core.spigot.events;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.lemograb.core.spigot.chat.ChatRenderer;

public class ChatListener implements Listener {

    private final ChatRenderer renderer;

    public ChatListener ()
    {
        renderer = new ChatRenderer();
    }

    @EventHandler
    public void onChat(AsyncChatEvent event)
    {
        event.renderer(this.renderer);
    }

}
