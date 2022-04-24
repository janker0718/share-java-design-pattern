package top.janker.pattern.proxy;

/**
 * @author janker
 * @date 2022/4/23
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ProxyPerson implements BuyApi {
    private Person person;
    @Override
    public void buy() {
        if (null == person){
            person = new Person();
        }
        person.buy();
        buyBrownSugar();
    }

    private void buyBrownSugar() {
        System.out.println("阿峰又买了点红糖");
    }
}
