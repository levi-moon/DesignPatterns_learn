package main.java.com.levi.www.observerPattern.publisher;

import main.java.com.levi.www.observerPattern.observer.Observer;
import main.java.com.levi.www.observerPattern.subject.Subject;

import java.util.ArrayList;

/**
 * |观察者模式-天气数据中心
 */
public class WeatherData implements Subject {

    private ArrayList observers;//观察者们
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//压强

    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 注册观察者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 删除观察者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当从气象站得到更新观测值时，通知观察者。
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 从气象站获取到各项数值，并赋值给天气数据中心
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
