package top.janker.pattern.adapter.power;

/**
 * @author janker
 * @date 2022/4/23
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class PowerAdapter implements  PowerApi {

    private IphonePower iphonePower;
    public PowerAdapter(IphonePower iphonePower){
        this.iphonePower = iphonePower;
    }
    @Override
    public void power() {
        System.out.println("充电器适配器开始适配");
        iphonePower.iphonePower();
    }
}
