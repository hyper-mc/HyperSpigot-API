package net.hyper.mc.spigot;

import net.hyper.mc.msgbrokerapi.HyperMessageBroker;
import net.hyper.mc.spigot.bungeecord.IBungeeManager;

public interface HyperSpigot {

    HyperMessageBroker getMessenger();
    IBungeeManager getBungeeManager();
    void setData(String name, String key, Object value);
}
