package top.janker.pattern.iterator;

/**
 * 迭代器模式测试类
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class IteratorPatternTest {
    public static void main(String[] args) {
        Aggregate ag = new ConcreteAggregate();
        ag.add("张三");
        ag.add("李四");
        ag.add("王五");
        System.out.println("聚合的内容有：");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = it.first();
        System.out.println("\nFirst：" + ob.toString());
    }
}
