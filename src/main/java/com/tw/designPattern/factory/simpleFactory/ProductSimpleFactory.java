package com.tw.designPattern.factory.simpleFactory;

/**
 * 简单工厂模式（静态工厂模式）
 * 定义：
 *  定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。
 * 优点：
 *  工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责，
 *  很方便的创建出相应的产品。工厂和产品的职责区分明确。
 *  客户端无需知道所创建具体产品的类名，只需知道参数即可。
 *  也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。
 * 缺点：
 *  简单工厂模式的工厂类单一，负责所有产品的创建，职责过重，一旦异常，整个系统将受影响。且工厂类代码会非常臃肿，违背高聚合原则。
 *  使用简单工厂模式会增加系统中类的个数（引入新的工厂类），增加系统的复杂度和理解难度。
 *  系统扩展困难，一旦增加新产品不得不修改工厂逻辑，在产品类型较多时，可能造成逻辑过于复杂。
 *  简单工厂模式使用了 static 工厂方法，造成工厂角色无法形成基于继承的等级结构。
 * 结构：
 *  简单工厂（SimpleFactory）：是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
 *  抽象产品（Product）：是简单工厂创建的所有对象的父类，负责描述所有实例共有的公共接口。
 *  具体产品（ConcreteProduct）：是简单工厂模式的创建目标。
 */
public class ProductSimpleFactory {

    public static Product product(String name) {
        Product product = null;
        if ("A".equals(name)) {
            product = new ProductA();
        } else if ("B".equals(name)) {
            product = new ProductB();
        }
        return product;
    }
}
