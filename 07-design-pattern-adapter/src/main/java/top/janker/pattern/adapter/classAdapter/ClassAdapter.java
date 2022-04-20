package top.janker.pattern.adapter.classAdapter;

/**
 * 类适配器类
 * @author janker
 * @date 2022/4/19
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("类适配器测试！");
        specificRequest();
    }
}
