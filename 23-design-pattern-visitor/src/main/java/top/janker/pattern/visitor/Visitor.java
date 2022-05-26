package top.janker.pattern.visitor;

/**
 * 抽象访问者类
 * @author janker
 * @date 2022/5/26
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
