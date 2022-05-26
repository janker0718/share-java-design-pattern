package top.janker.pattern.mediator;

/**
 * 具体同事类
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteColleague1 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请求中介者转发
    }
}
