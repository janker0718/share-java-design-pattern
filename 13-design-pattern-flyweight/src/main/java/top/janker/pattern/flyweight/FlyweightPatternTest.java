package top.janker.pattern.flyweight;

/**
 * @author janker
 * @date 2022/5/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class FlyweightPatternTest {
    public static void main(String[] args) {
        BatteryFactory factory = new BatteryFactory();
        Battery f01 = factory.getBattery("a");
        Battery f02 = factory.getBattery("a");
        Battery f03 = factory.getBattery("a");
        Battery f11 = factory.getBattery("b");
        Battery f12 = factory.getBattery("b");
        f01.charge(new BatteryAdapter("Android充电接口"));
        f02.charge(new BatteryAdapter("Android充电接口"));
        f03.charge(new BatteryAdapter("Android充电接口"));
        f11.charge(new BatteryAdapter("IOS充电接口"));
        f12.charge(new BatteryAdapter("IOS充电接口"));
    }
}
