package top.janker.pattern.strategy;

/**
 * @author janker
 * @date 2022/5/14
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class BusStrategy implements Strategy {
    @Override
    public void commute() {
        System.out.println("坐公交车上班");
    }
}
