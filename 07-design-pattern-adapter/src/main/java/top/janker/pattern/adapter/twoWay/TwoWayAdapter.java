package top.janker.pattern.adapter.twoWay;

/**
 * 双向适配器
 * @author janker
 * @date 2022/4/21
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee {
    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}
