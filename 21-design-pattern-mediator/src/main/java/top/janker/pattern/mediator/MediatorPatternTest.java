package top.janker.pattern.mediator;

/**
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class MediatorPatternTest {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
