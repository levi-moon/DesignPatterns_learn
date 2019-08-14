package main.java.com.levi.www.strategyPattern.duckObj;

/**
 * 策略模式-红头鸭
 */
public class RedheadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我长得像红头鸭……");
    }
}
