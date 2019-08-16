# learnDesignPatterns

## 设计模式学习

[toc]

### 一、策略模式（strategyPattern）

***策略模式：定义了算法族，分别封装起来，让他们之间可以互相替换。***

策略模式中以各种类型的鸭子以及各种行为来介绍策略模式的使用。
所有不同类型的鸭子都继承鸭子（Duck）这个父类，所有不同类型的飞行行为都实现飞行行为（flyBehavior），所有不同类型的模拟叫声行为都实现模拟叫声行为（QuackBehavior）。

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

----

### 二、观察者模式（observerPattern）

***观察者模式：在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新。***

观察者模式通过天气中心和各类展示板来介绍观察者模式。
天气中心是发布者，各类展示板是观察者。
天气中心通过推送的方式，向各类展示板推送温度，湿度等天气数据。

- 主题（subject）
  - 主题（Subject）
- 观察者（observer）
  - 观察者（Observer）
  - 展示信息（DisplayElement）
  - 目前状况布告板（CurrentConditionsDisplay）
- 发布者（publisher）
  - 天气数据中心（WeatherData）
  
主题接口（Subject）中主要定义了三个方法：
注册观察者registerObserver(Observer o)、
删除观察者removeObserver(Observer o)、
通知观察者notifyObservers()。
天气数据发布者（WeatherData）实现主题接口（Subject），
同时定义了：观察者们observers（ArrayList类型）、
温度temperature、湿度humidity、压强pressure几个属性，
并通过registerObserver(Observer o)方法来注册观察者，
通过removeObserver(Observer o)方法来删除观察者，
通过notifyObservers()方法来通知给观察者，主要是通过调用观察者的更新数据的方法来展示新数据。
目前状况布告板（CurrentConditionsDisplay）类来展示天气信息数据，
通过该类的构造器，先向发布者注册本观察者的信息，然后发布者通过观察者类中的更新方法来更新观察者的数据，
实现发布者向观察者通知的动作。
具体见代码：
```
WeatherData weatherData = new WeatherData();
CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
weatherData.setMeasurements(80, 65, 30.4f);
weatherData.setMeasurements(82, 70, 29.2f);
weatherData.setMeasurements(78, 90, 29.2f);
```
**note：**在本例中，主要是实现发布者向观察者推`push`的动作,而没有实现观察者主动向发布者拉`pull`的动作。
在观察者模式中，推`push`的方式被认为更“正确”。在Java中，提供了Observer接口与Observable类，可以实现观察者主动去拉的动作，
但是Observable是一个类，要使用它就比用用继承，这样就限制了Observable的复用潜力，而且Observable将关键的方法setChanged()方法保护起来了（被定义成protected），
这样的设计违反了设计原则：“多用组合，少用继承”。

----

