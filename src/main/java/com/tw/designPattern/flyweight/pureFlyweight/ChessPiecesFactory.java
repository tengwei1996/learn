package com.tw.designPattern.flyweight.pureFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式
 * 定义：
 *  享元（Flyweight）模式的定义：运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
 * 优点：
 *  相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 * 缺点：
 *  为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
 *  读取享元模式的外部状态会使得运行时间稍微变长。
 * 实现：
 *  享元模式的定义提出了两个要求，细粒度和共享对象。因为要求细粒度，所以不可避免地会使对象数量多且性质相近，此时我们就将这些对象的信息分为两个部分：内部状态和外部状态。
 *  内部状态指对象共享出来的信息，存储在享元信息内部，并且不回随环境的改变而改变。
 *  外部状态指对象得以依赖的一个标记，随环境的改变而改变，不可共享。
 * 结构：
 *  抽象享元角色（Flyweight）：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
 *  具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
 *  非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
 *  享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，
 *  享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象。
 * 应用场景：
 *  系统中存在大量相同或相似的对象，这些对象耗费大量的内存资源。
 *  大部分的对象可以按照内部状态进行分组，且可将不同部分外部化，这样每一个组只需保存一个内部状态。
 *  由于享元模式需要额外维护一个保存享元的数据结构，所以应当在有足够多的享元实例时才值得使用享元模式。
 * 注：
 *  享元模式分为：单纯享元模式和复合享元模式
 *  单纯享元模式：这种享元模式中的所有的具体享元类都是可以共享的，不存在非共享的具体享元类。
 *  复合享元模式：这种享元模式中的有些享元对象是由一些单纯享元对象组合而成的，它们就是复合享元对象。虽然复合享元对象本身不能共享，但它们可以分解成单纯享元对象再被共享。
 *  享元模式其实是工厂方法模式的一个改进机制，享元模式同样要求创建一个或一组对象，并且就是通过工厂方法模式生成对象的，只不过享元模式为工厂方法模式增加了缓存这一功能。
 */

/**
 * 运用享元模式创建五子棋例子
 * 五子棋中肯定存在创建大量的黑子或者白子，这时候就可以用享元模式
 * 棋子（ChessPieces）类是抽象享元角色，它包含了一个落子的 DownPieces(Graphics g,Point pt) 方法；
 * 白子（WhitePieces）和黑子（BlackPieces）类是具体享元角色，它实现了落子方法；
 * Point 是非享元角色，它指定了落子的位置；
 * ChessPiecesFactory 是享元工厂角色，它通过 Map 来管理棋子，并且提供了获取白子或者黑子的 getChessPieces(String type) 方法；
 * 客户类（Chessboard）利用 Graphics 组件在框架窗体中绘制一个棋盘，并实现 mouseClicked(MouseEvent e) 事件处理方法，该方法根据用户的选择从享元工厂中获取白子或者黑子并落在棋盘上。
 *
 * 享元模式有一个内蕴状态和外蕴状态
 * 内蕴状态是可以被共享的如列子中ChessPiecesFactory中的chessPiecesMap，它是不会随着环境的改变而改变，是共享的,外蕴状态如ChessPiecesFactory中的getChessPieces(String type)方法
 * 参数type就是外蕴状态它是会随着环境的改变而改变，由客户端掌握，不可以共享的，享元工厂可以根据外蕴状态传进来的参数返回相应的享元对象。
 */
public class ChessPiecesFactory {

    private Map<String, ChessPieces> chessPiecesMap = new HashMap<>();

    public ChessPiecesFactory() {
        WhitePieces whitePieces = new WhitePieces();
        BlackPieces blackPieces = new BlackPieces();
        chessPiecesMap.put("white", whitePieces);
        chessPiecesMap.put("black", blackPieces);
    }

    public ChessPieces getChessPieces(String type) {
        ChessPieces chessPieces = null;
        if ("white".equalsIgnoreCase(type)) {
            chessPieces = chessPiecesMap.get("white");
            if (chessPieces == null) {
                chessPiecesMap.put("white", new WhitePieces());
            }
        } else if ("black".equalsIgnoreCase(type)) {
            chessPieces = chessPiecesMap.get("black");
            if (chessPieces == null) {
                chessPiecesMap.put("black", new BlackPieces());
            }
        }
        return chessPieces;
    }
}
