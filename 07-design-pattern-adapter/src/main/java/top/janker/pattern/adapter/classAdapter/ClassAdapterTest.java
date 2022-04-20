package top.janker.pattern.adapter.classAdapter;

/**
 * @author janker
 * @date 2022/4/19
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request();
    }
}
