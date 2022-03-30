package top.janker.pattern.factorymethod;

/**
 * 具体产品1：实现抽象产品中的抽象方法
 * @author janker
 * @date 2022/3/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示...");
    }
}
