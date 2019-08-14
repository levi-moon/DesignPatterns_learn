package main.java.com.levi.www.strategyPattern.duckObj;

/**
 * 策略模式-绿头鸭
 */
public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我长得像绿头鸭……");
    }
}
