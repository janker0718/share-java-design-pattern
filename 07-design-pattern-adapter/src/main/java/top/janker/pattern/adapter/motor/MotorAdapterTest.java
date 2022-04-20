package top.janker.pattern.adapter.motor;

/**
 * @author janker
 * @date 2022/4/20
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class MotorAdapterTest {
    public static void main(String[] args)
    {
        System.out.println("适配器模式测试：");
        Motor motor=(Motor)ReadXML.getObject();
        motor.drive();
    }
}
