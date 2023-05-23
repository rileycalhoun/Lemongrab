package org.lemograb.core.spigot.chat;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ChatRenderer implements io.papermc.paper.chat.ChatRenderer {

    @Override
    public @NotNull Component render(@NotNull Player source, @NotNull Component displayName, @NotNull Component message, @NotNull Audience viewer) {
        Component format = Component.text()
                .append(displayName.color(NamedTextColor.GRAY))
                .append(Component.text(": ").color(NamedTextColor.WHITE))
                .append(message.color(NamedTextColor.WHITE))
                .build();

        viewer.sendMessage(format);
        return format;
    }

}
