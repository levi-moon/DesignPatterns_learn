package main.java.com.levi.www.strategyPattern.duckObj;

import main.java.com.levi.www.strategyPattern.behavior.FlyBehavior;
import main.java.com.levi.www.strategyPattern.behavior.QuackBehavior;

/**
 * 策略模式-鸭子父类
 */
public abstract class Duck {

    public Duck() {
    }

    //飞行
    FlyBehavior flyBehavior;

    //叫声
    QuackBehavior quackBehavior;

    /**
     * 执行飞行动作
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 设置选择的飞行对象
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    /**
     * 执行叫的动作
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 设置选择的叫声对象
     * @param qb
     */
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    /**
     * 鸭子的外形
     */
    public abstract void display();

    /**
     * 鸭子会游泳
     */
    public void swim(){
        System.out.println("鸭子会游泳……");
    }

}
