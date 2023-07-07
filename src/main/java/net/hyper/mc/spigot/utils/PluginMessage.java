package net.hyper.mc.spigot.utils;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import lombok.Getter;

@Getter
public class PluginMessage {

    private String subChannel;
    private ByteArrayDataOutput data;

    public PluginMessage(String subChannel) {
        this.subChannel = subChannel;
        this.data = ByteStreams.newDataOutput();
        data.writeUTF(subChannel);
    }

    public PluginMessage add(String key){
        data.writeUTF(key);
        return this;
    }

    public byte[] getBytes(){
        return data.toByteArray();
    }
}
