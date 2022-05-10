package top.janker.pattern.template.method;

/**
 * @author janker
 * @date 2022/5/11
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class TemplateMethodPatternTest {
    public static void main(String[] args) {
        AbstractGenerateOrder appGenerateOrder = new AppGenerateOrder();
        appGenerateOrder.order();

        AbstractGenerateOrder pcGenerateOrder = new PcGenerateOrder();
        pcGenerateOrder.order();
    }

}
