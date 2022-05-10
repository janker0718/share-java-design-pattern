package top.janker.pattern.template.method;

/**
 * App下单生成订单实现类
 * @author janker
 * @date 2022/5/11
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class AppGenerateOrder extends AbstractGenerateOrder{
    @Override
    public void subValidateParam() {
        System.out.println("app特殊逻辑校验");
    }
}
