package top.janker.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> list = new ArrayList<Object>();
    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return new ConcreteIterator(list);
    }
}
