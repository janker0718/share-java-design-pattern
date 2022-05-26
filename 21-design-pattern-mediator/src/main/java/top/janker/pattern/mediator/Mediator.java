package top.janker.pattern.mediator;

/**
 * 抽象中介者
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
