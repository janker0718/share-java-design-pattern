package top.janker.pattern.adapter.objectAdapter;

import top.janker.pattern.adapter.classAdapter.Adaptee;
import top.janker.pattern.adapter.classAdapter.Target;

/**
 *
 * @author janker
 * @date 2022/4/19
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {

        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}
