package com.tw.designPattern.command.compositeCommand;

/**
 * 树叶构件（具体命令2）
 */
public class ConcreteCommand2 implements AbstractCommand{

    private CompositeReceiver receiver;

    public ConcreteCommand2(){
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
