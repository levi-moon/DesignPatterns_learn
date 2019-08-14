package main.java.com.levi.www.strategyPattern.behavior.quackBehavior;

import main.java.com.levi.www.strategyPattern.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫……");
    }
}
