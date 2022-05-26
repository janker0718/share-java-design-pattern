package top.janker.pattern.visitor;

/**
 * 具体访问者B
 * @author janker
 * @date 2022/5/26
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->" + element.operationA());
    }

    @Override
    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->" + element.operationB());
    }
}
