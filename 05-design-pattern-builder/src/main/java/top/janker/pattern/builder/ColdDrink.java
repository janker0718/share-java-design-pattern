package top.janker.pattern.builder;

/**
 * 冷饮
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        //一瓶
        return new Bottle();
    }

    @Override
    public abstract float price();
}
