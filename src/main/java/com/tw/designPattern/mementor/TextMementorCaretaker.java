package com.tw.designPattern.mementor;

import java.util.ArrayList;
import java.util.List;

/**
 * 文本备忘录管理者 备忘录管理者角色
 */
public class TextMementorCaretaker {

    /**
     * 备忘录信息容器
     */
    List<TextMementor> mementorList = new ArrayList<>();

    /**
     * 获取历史备忘录信息
     * @param index
     * @return
     */
    public TextMementor getTextMementor(int index){
        TextMementor mementor = null;
        if (mementorList.size() > 0){
            mementor = mementorList.get(index);
        }
        return mementor;
    }

    /**
     * 添加历史备忘录信息
     * @param mementor
     */
    public TextMementorCaretaker addTextMementor(TextMementor mementor){
        this.mementorList.add(mementor);
        return this;
    }
}
