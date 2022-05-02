package top.janker.pattern.flyweight;

/**
 * @author janker
 * @date 2022/5/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class BatteryAdapter {
    private String info;

    public BatteryAdapter(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
