package top.janker.pattern.flyweight;

import java.util.HashMap;

/**
 * @author janker
 * @date 2022/5/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class BatteryFactory {
    private HashMap<String, Battery> flyweights = new HashMap<String, Battery>();
    public Battery getBattery(String key) {
        Battery battery = (Battery) flyweights.get(key);
        if (battery != null) {
            System.out.println("具体充电宝" + key + "已经存在，被成功获取！");
        } else {
            battery = new ConcreteBattery(key);
            flyweights.put(key, battery);
        }
        return battery;
    }
}
