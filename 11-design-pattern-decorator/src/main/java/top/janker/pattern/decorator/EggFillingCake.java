package top.janker.pattern.decorator;

/**
 * 鸡蛋灌饼（标配）
 * @author janker
 * @date 2022/4/24
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class EggFillingCake implements FillingCakeApi{
    public EggFillingCake(){
        System.out.println("鸡蛋灌饼初始化工作");
    }
    @Override
    public void generateCake() {
        System.out.println("制作鸡蛋灌饼");
    }
}
