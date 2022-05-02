package top.janker.pattern.flyweight;

/**
 * @author janker
 * @date 2022/5/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteBattery implements Battery{
    private String key;

    public ConcreteBattery(String key) {
        this.key = key;
        System.out.println("充电宝" + key + "被使用！");
    }

    @Override
    public void charge(BatteryAdapter adapter) {
        System.out.print("充电宝" + key + "被使用，");
        System.out.println("充电接口为:" + adapter.getInfo());
    }
}
