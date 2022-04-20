package top.janker.pattern.adapter.classAdapter;

/**
 * 适配者接口
 * @author janker
 * @date 2022/4/19
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}
