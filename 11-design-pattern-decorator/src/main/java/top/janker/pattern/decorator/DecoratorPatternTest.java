package top.janker.pattern.decorator;

/**
 * @author janker
 * @date 2022/4/24
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        FillingCakeApi fillingCakeApi = new EggFillingCake();
        FillingCakeApi cakeApi = new SausageFillingCakeDecorator(fillingCakeApi);
        cakeApi.generateCake();
    }
}
