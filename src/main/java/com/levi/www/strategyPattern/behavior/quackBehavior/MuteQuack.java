package main.java.com.levi.www.strategyPattern.behavior.quackBehavior;

import main.java.com.levi.www.strategyPattern.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会呱呱叫……");
    }
}
