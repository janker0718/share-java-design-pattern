package top.janker.pattern.visitor;

/**
 * 访问者模式测试类
 * @author janker
 * @date 2022/5/26
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class VisitorPatternTest {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
