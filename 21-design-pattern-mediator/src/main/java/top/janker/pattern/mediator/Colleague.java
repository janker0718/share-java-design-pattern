package top.janker.pattern.mediator;

/**
 * 抽象同事类
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMedium(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract  void send();

}
