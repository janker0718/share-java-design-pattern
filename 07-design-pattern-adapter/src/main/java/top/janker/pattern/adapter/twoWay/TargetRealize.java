package top.janker.pattern.adapter.twoWay;

/**
 *
 //目标实现
 * @author janker
 * @date 2022/4/21
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class TargetRealize implements TwoWayTarget {
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
