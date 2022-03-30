package top.janker.pattern.singleton;

/**
 * @author janker
 * @date 2022/3/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;
    private LazySafeSingleton (){}
    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }
}
