# learnDesignPatterns

## 设计模式学习

### 一、策略模式（strategyPattern）

***策略模式：定义了算法族，分别封装起来，让他们之间可以互相替换。***

策略模式中以各种类型的鸭子以及各种行为来介绍策略模式的使用。

- 鸭子（Duck）
  - 红头鸭子（RedheadDuck）
  - 绿头鸭子（MallardDuck）
  - 模型鸭子（ModelDuck）
- 行为（behavior）
  - 飞行行为（flyBehavior）
  - 模拟叫声行为（quackBehavior）
  
在鸭子（Duck）类中，定义了两个未初始化的行为变量：FlyBehavior和QuackBehavior。
两个变量分别通过setFlyBehavior(FlyBehavior fb)和setQuackBehavior(QuackBehavior qb)方法进行初始化。
这样鸭子就可以有不同的飞行行为及模拟叫声行为。
然后调用performFly()和performQuack()方法就可以产生飞行行为和模拟叫声行为了。
具体见代码：
```
Duck model = new ModelDuck();//针对超类型编程，实例化一个模型鸭子
model.display();//鸭子的长相
model.swim();//鸭子游泳的行为动作
model.setFlyBehavior(new FlyRocketPowered());//设置通过火箭飞行为
model.performFly();//调用方法实现；通过火箭飞的行为动作
model.setQuackBehavior(new Squeak());//设置模拟吱吱叫行为
model.performQuack();//调用方法实现：模拟吱吱叫的行为动作
```
**note：**“针对超类型编程”这句话，可以更明确地说成“变
量的声明类型应该是超类型，通常是一个抽象类或者是一
个接口，如此，只要是具体实现此超类型的类所产生的对
象，都可以指定给这个变量。