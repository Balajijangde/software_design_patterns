package singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private final Map<String, Object> configs = new HashMap<>();
    //Making constructor a private method
    private ConfigManager(){}
    //Static instance of class
    static ConfigManager instance  = new ConfigManager();
    //Method to get instance of class
    static ConfigManager getInstance(){
        return instance;
    }

    public void setConfig(String name, Object value){
        configs.put(name, value);
    }

    public Object getConfig(String name){
        return configs.get(name);
    }
}
