package com.tw.designPattern.command.compositeCommand;

public class CompositeCommandTest {

    public static void main(String[] args) {
        AbstractCommand command1 = new ConcreteCommand1();
        AbstractCommand command2 = new ConcreteCommand2();
        CompositeInvoker invoker = new CompositeInvoker();
        invoker.add(command1);
        invoker.add(command2);
        System.out.println("客户访问调用者的execute()方法。。。");
        invoker.execute();
    }
}
