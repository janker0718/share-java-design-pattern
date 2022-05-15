package top.janker.pattern.state;

/**
 * @author janker
 * @date 2022/5/14
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class StatePatternTest {
    public static void main(String[] args) {
        Context context = new Context();    //创建环境
        context.handle();    //处理请求
        context.handle();
        context.handle();
        context.handle();
    }
}
