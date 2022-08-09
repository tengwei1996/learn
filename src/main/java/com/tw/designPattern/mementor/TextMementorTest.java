package com.tw.designPattern.mementor;

import java.util.Date;

public class TextMementorTest {

    public static void main(String[] args) throws InterruptedException {
        // 创建发起人对象，设置属性
        Text text = new Text();
        text.setTitle("文本一二三");
        text.setContent("这是文本一二三");
        text.setCreateTime(new Date());
        // 保存一次信息到备忘录
        TextMementor mementor1 = text.saveTextMementor();
        // 睡个一秒，区别下时间
        Thread.sleep(1000);
        // 重新设置发起人对象属性
        text.setTitle("文本四五六");
        text.setContent("这是文本四五六");
        text.setCreateTime(new Date());
        // 第二次保存信息到备忘录
        TextMementor mementor2 = text.saveTextMementor();
        // 创建备忘录管理员对象
        TextMementorCaretaker mementorCaretaker = new TextMementorCaretaker();
        // 将备忘录信息添加到备忘录管理对象中
        mementorCaretaker.addTextMementor(mementor1).addTextMementor(mementor2);
        // 获取第一次备份信息
        TextMementor textMementor1 = mementorCaretaker.getTextMementor(0);
        System.out.println("第一次备份信息：" + textMementor1);
        // 获取第二次备份信息
        TextMementor textMementor2 = mementorCaretaker.getTextMementor(1);
        System.out.println("第二次备份信息：" + textMementor2);
        text.getTextMementor(textMementor1);
        System.out.println("恢复到第一次备忘录状态：" + text);
        text.getTextMementor(textMementor2);
        System.out.println("恢复到第二次备份状态：" + text);
    }
}
