package top.janker.pattern.observer;

/**
 * @author janker
 * @date 2022/5/14
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
