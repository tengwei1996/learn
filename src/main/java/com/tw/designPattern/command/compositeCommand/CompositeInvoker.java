package com.tw.designPattern.command.compositeCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝构件（调用者）
 */
public class CompositeInvoker implements AbstractCommand{

    private List<AbstractCommand> children = new ArrayList<>();

    @Override
    public void execute() {
        for (AbstractCommand command : children){
            command.execute();
        }
    }

    public void add(AbstractCommand command){
        children.add(command);
    }

    public void remove(AbstractCommand command){
        children.remove(command);
    }
}
