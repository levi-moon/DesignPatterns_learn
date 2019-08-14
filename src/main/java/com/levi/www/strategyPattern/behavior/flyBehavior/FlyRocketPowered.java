package main.java.com.levi.www.strategyPattern.behavior.flyBehavior;

import main.java.com.levi.www.strategyPattern.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我用火箭飞……");
    }
}
