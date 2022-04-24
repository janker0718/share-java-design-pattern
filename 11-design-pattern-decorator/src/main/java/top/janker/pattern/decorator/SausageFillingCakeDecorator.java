package top.janker.pattern.decorator;

/**
 * 加香肠鸡蛋灌饼装饰类
 * @author janker
 * @date 2022/4/24
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class SausageFillingCakeDecorator extends Decorator {
    public SausageFillingCakeDecorator(FillingCakeApi fillingCakeApi) {
        super(fillingCakeApi);
    }

    @Override
    public void generateCake() {
        super.generateCake();
        //加根香肠
        addSausage();
    }

    private void addSausage() {
        System.out.println("鸡蛋灌饼中加一根香肠");
    }
}
