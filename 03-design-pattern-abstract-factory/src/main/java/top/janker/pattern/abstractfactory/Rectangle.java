package top.janker.pattern.abstractfactory;

/**
 * @author janker
 * @date 2022/3/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
