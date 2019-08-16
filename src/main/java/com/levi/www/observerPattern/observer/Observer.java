package main.java.com.levi.www.observerPattern.observer;

/**
 * 观察者模式-观察者
 */
public interface Observer {

    /**
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者。
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    void update(float temp, float humidity, float pressure);
}
