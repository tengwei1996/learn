package com.tw.designPattern.adapter.objectAdapter;

/**
 * 适配器模式
 * 定义：
 *  将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 *  适配器模式分为类结构型模式和对象结构型模式两种，
 *  前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。
 * 优点：
 *  客户端通过适配器可以透明地调用目标接口。
 *  复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
 *  将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。
 *  在很多业务场景中符合开闭原则。
 * 缺点：
 *  适配器编写过程需要结合业务场景全面考虑，可能会增加系统的复杂性。
 *  增加代码阅读难度，降低代码可读性，过多使用适配器会使系统代码变得凌乱。
 * 结构：
 *  目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。（客户端希望的接口）
 *  适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。（真正访问的接口）
 *  适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。（将真正访问的接口转换成客户端希望的接口）
 * 实现：
 *  类适配器模式可以定义一个适配器类来实现当前系统的业务接口，同时又继承现有组件库中已经存在的组件。
 *  对象适配器模式可釆用将现有组件库中已经实现的组件引入适配器类中，该类同时实现当前系统的业务接口。现在来介绍它们的基本结构。
 * 应用场景：
 *  以前开发的系统存在满足新系统功能需求的类，但其接口同新系统的接口不一致。
 *  使用第三方提供的组件，但组件接口定义和自己要求的接口定义不同。
 */

/**
 * 用适配器模式（Adapter）模拟新能源汽车的发动机。
 * 新能源汽车的发动机有电能发动机（ElectricMotor）和光能发动机（OpticalMotor）等，
 * 各种发动机的驱动方法不同，例如，电能发动机的驱动方法 electricDrive() 是用电能驱动，
 * 而光能发动机的驱动方法 opticalDrive() 是用光能驱动，它们是适配器模式中被访问的适配者。
 * 客户端希望用统一的发动机驱动方法 drive() 访问这两种发动机，所以必须定义一个统一的目标接口 Motor，
 * 然后再定义电能适配器（ElectricAdapter）和光能适配器（OpticalAdapter）去适配这两种发动机。
 * 目标：发动机
 */
public interface Motor {

    void drive();
}
