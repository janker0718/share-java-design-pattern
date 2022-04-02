package top.janker.pattern.builder;

/**
 * 鸡肉汉堡
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ChickenBurger extends Burger {

    /**
     * 价钱
     * @return
     */
    @Override
    public float price() {
        return 50.5f;
    }

    /**
     * 名字
     * @return
     */
    @Override
    public String name() {
        return "Chicken Burger";
    }
}
