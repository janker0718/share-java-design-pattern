package top.janker.pattern.iterator;

/**
 * 抽象聚合类
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();

}
