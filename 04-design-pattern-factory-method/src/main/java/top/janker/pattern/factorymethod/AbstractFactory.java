package top.janker.pattern.factorymethod;

/**
 * 抽象工厂：提供了厂品的生成方法
 * @author janker
 * @date 2022/3/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface AbstractFactory {
    Product newProduct();
}
