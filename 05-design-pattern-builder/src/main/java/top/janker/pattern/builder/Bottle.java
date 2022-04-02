package top.janker.pattern.builder;

/**
 * 包装的单位 瓶
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}