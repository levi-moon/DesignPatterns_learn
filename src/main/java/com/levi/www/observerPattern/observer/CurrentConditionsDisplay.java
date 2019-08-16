package main.java.com.levi.www.observerPattern.observer;

import main.java.com.levi.www.observerPattern.subject.Subject;

/**
 * 观察者模式-目前状况布告板
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature;//温度
    private float humidity;//湿度
    private Subject weatherData;//主题（发布者）

    /**
     * 通过构造器向发布者注册本观察者的信息
     * @param weatherData
     */
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    /**
     * 在布告板上展示天气信息数据
     */
    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    /**
     * 更新天气信息数据
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
