package top.janker.pattern.state;

/**
 * @author janker
 * @date 2022/5/14
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteStateA extends State {
    public void handle(Context context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }
}
