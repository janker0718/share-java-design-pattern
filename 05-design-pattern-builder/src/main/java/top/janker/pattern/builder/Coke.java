package top.janker.pattern.builder;

/**
 * 可口可乐
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Coke extends ColdDrink {

    /**
     * 价钱
     * @return
     */
    @Override
    public float price() {
        return 30.0f;
    }

    /**
     * 名称
     * @return
     */
    @Override
    public String name() {
        return "Coke";
    }
}
