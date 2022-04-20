package top.janker.pattern.adapter.objectAdapter;

import top.janker.pattern.adapter.classAdapter.Adaptee;
import top.janker.pattern.adapter.classAdapter.Target;

/**
 * 对象适配器类
 * @author janker
 * @date 2022/4/19
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("对象适配器测试！");
        adaptee.specificRequest();
    }
}