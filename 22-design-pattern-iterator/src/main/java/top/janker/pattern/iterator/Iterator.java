package top.janker.pattern.iterator;

/**
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}
