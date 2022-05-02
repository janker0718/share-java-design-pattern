package top.janker.pattern.composite;

/**
 * @author janker
 * @date 2022/5/2
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }
    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问！");
    }

}
