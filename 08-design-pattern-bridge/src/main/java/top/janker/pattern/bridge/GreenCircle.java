package top.janker.pattern.bridge;

/**
 * 绿色的圆
 * @author janker
 * @date 2022/4/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}