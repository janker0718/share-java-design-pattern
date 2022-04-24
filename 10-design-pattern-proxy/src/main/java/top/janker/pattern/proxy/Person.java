package top.janker.pattern.proxy;

/**
 * @author janker
 * @date 2022/4/23
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Person implements BuyApi {
    @Override
    public void buy() {
        System.out.println("去超市买点姨妈巾");
    }
}
