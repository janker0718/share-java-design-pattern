package top.janker.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构
 * @author janker
 * @date 2022/5/26
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void accept(Visitor visitor){
        Iterator<Element> i = list.iterator();
        while (i.hasNext()){
            ((Element)i.next()).accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}
