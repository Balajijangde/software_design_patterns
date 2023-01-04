package singleton;

public class Main {
    public static void main(String[] args){
        ConfigManager first = ConfigManager.getInstance();
        first.setConfig("testProperty", "testValue");
        System.out.println(first.getConfig("testProperty"));
        ConfigManager second = ConfigManager.getInstance();
        System.out.println(second.getConfig("testProperty"));
    }
}
