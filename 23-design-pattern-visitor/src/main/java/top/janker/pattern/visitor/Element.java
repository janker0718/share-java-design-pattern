package top.janker.pattern.visitor;

/**
 * 抽象元素类
 * @author janker
 * @date 2022/5/26
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface Element {
    void accept(Visitor visitor);
}
