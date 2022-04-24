package top.janker.pattern.adapter.power;

/**
 * @author janker
 * @date 2022/4/23
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class PowerAdapterTest {
    public static void main(String[] args) {
        PowerApi powerApi = new PowerAdapter(new IphonePower());
        powerApi.power();
    }
}
