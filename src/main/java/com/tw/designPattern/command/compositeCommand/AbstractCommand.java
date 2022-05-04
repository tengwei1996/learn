package com.tw.designPattern.command.compositeCommand;

/**
 * 组合命令模式
 * 定义：
 *  在软件开发中，有时将命令模式与前面学的组合模式联合使用，这就构成了宏命令模式，也叫组合命令模式。
 *  宏命令包含了一组命令，它充当了具体命令与调用者的双重角色，执行它时将递归调用它所包含的所有命令
 */
public interface AbstractCommand {

    void execute();
}
