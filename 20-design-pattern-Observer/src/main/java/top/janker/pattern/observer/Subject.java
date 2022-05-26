package top.janker.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标
 * @author janker
 * @date 2022/5/14
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    //增加观察者方法
    public void add(Observer observer){
        observers.add(observer);
    }
    //删除观察者方法
    public void remove(Observer observer){
        observers.remove(observer);
    }

    //通知观察者方法
    public abstract void notifyObserver();
}
