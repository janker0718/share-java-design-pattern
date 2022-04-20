package top.janker.pattern.adapter.motor;

/**
 * 光能适配器
 * @author janker
 * @date 2022/4/20
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class OpticalAdapter implements Motor {
    private OpticalMotor omotor;

    public OpticalAdapter() {
        omotor = new OpticalMotor();
    }

    public void drive() {
        omotor.opticalDrive();
    }
}
