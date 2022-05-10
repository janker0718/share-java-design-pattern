package top.janker.pattern.template.method;

/**
 * @author janker
 * @date 2022/5/8
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public abstract class AbstractGenerateOrder {

    public void order(){
        subValidateParam();
        commonValidateParam();
        createOrder();
    }

    protected abstract void subValidateParam();

    private void createOrder(){
        System.out.println("通用创建订单操作");
    }

    private void commonValidateParam(){
        System.out.println("通用校验参数");
    }
}
