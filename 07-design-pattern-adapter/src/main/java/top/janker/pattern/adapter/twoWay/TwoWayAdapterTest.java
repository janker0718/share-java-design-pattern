package top.janker.pattern.adapter.twoWay;

/**
 * 客户端代码
 * @author janker
 * @date 2022/4/21
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class TwoWayAdapterTest {
    public static void main(String[] args) {
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee = new AdapteeRealize();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target = new TargetRealize();
        adaptee = new TwoWayAdapter(target);
        adaptee.specificRequest();
    }
}
