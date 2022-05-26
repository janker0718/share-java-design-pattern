package top.janker.pattern.iterator;

import java.util.List;

/**
 * 具体迭代器
 * @author janker
 * @date 2022/5/25
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }
    @Override
    public Object first() {
        index = 0;
        return list.get(0);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()){
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() -1){
            return true;
        }else
        return false;
    }
}
