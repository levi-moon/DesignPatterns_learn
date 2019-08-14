package test.java.com.levi.www.strategyPattern;

import main.java.com.levi.www.strategyPattern.behavior.flyBehavior.FlyNoWay;
import main.java.com.levi.www.strategyPattern.behavior.flyBehavior.FlyRocketPowered;
import main.java.com.levi.www.strategyPattern.behavior.quackBehavior.Squeak;
import main.java.com.levi.www.strategyPattern.duckObj.Duck;
import main.java.com.levi.www.strategyPattern.duckObj.ModelDuck;

public class TestDuck {

    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.display();
        model.swim();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.setQuackBehavior(new Squeak());
        model.performQuack();
    }

}
