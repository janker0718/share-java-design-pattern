package top.janker.pattern.state;

/**
 * @author janker
 * @date 2022/5/14
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public abstract class State {
    public abstract void handle(Context context);
}
