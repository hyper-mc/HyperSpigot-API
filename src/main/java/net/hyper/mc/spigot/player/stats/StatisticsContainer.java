package net.hyper.mc.spigot.player.stats;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.json.JSONObject;

@Data
@AllArgsConstructor
public class StatisticsContainer {

    private PlayerStatisticsManager manager;
    private JSONObject json = new JSONObject();

    public long get(String key){
        return json.optLong(key, 0L);
    }
    public Object getObj(String key){
        return json.opt(key);
    }
    public void set(String key, long value) {
        json.put(key, value);
    }
    public void set(String key, Object obj){
        json.put(key, obj);
    }

}
