package top.janker.pattern.adapter.twoWay;

/**
 * 适配者实现
 * @author janker
 * @date 2022/4/21
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class AdapteeRealize implements  TwoWayAdaptee{
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
