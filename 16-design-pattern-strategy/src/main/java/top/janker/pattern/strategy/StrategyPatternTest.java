package top.janker.pattern.strategy;

/**
 * @author janker
 * @date 2022/5/14
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy strategy = new BicycleStrategy();
        c.setStrategy(strategy);
        c.commute();

        strategy = new BusStrategy();
        c.setStrategy(strategy);
        c.commute();
    }
}
