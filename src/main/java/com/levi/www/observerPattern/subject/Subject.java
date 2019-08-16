package main.java.com.levi.www.observerPattern.subject;

import main.java.com.levi.www.observerPattern.observer.Observer;

/**
 * 观察者模式-主题
 */
public interface Subject {

    /**
     * 注册观察者
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 删除观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有的观察者
     */
    void notifyObservers();
}
