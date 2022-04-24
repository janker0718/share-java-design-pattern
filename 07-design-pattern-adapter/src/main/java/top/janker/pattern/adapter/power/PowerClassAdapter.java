package top.janker.pattern.adapter.power;

/**
 * @author janker
 * @date 2022/4/23
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class PowerClassAdapter extends IphonePower implements PowerApi {

    @Override
    public void power() {
        System.out.println("充电器类适配器开始适配");
        iphonePower();
    }
}
