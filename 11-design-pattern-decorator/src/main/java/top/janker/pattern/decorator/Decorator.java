package top.janker.pattern.decorator;

/**
 * 抽象装饰器
 * @author janker
 * @date 2022/4/24
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Decorator implements FillingCakeApi{
    private FillingCakeApi fillingCakeApi;
    public Decorator(FillingCakeApi fillingCakeApi){
        this.fillingCakeApi = fillingCakeApi;
    }
    @Override
    public void generateCake() {
        fillingCakeApi.generateCake();
    }
}
