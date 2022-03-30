package top.janker.pattern.abstractfactory;

/**
 * @author janker
 * @date 2022/3/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
