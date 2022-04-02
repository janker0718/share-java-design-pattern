package top.janker.pattern.builder;

/**
 * 蔬菜汉堡
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class VegBurger extends Burger {

    /**
     * 价钱
     * @return
     */
    @Override
    public float price() {
        return 25.0f;
    }

    /**
     * 汉堡名字
     * @return
     */
    @Override
    public String name() {
        return "Veg Burger";
    }
}
