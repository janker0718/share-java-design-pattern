package top.janker.pattern.singleton;

/**
 * @author janker
 * @date 2022/3/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class LazyUnsafeSingleton {

    private static LazyUnsafeSingleton instance;
    private LazyUnsafeSingleton (){}

    public static LazyUnsafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazyUnsafeSingleton();
        }
        return instance;
    }
}
