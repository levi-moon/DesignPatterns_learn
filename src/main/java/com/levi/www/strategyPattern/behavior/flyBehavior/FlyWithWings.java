package main.java.com.levi.www.strategyPattern.behavior.flyBehavior;

import main.java.com.levi.www.strategyPattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用翅膀飞……");
    }
}
