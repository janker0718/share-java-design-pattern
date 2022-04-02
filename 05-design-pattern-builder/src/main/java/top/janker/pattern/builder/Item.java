package top.janker.pattern.builder;

/**
 * 食物条目(名称 价钱 食品包装)
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
