package com.tw.designPattern.mementor;

import java.util.Date;

/**
 * 文本 发起人角色
 */
public class Text {

    private String title;

    private String content;

    private Date createTime;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 保存信息到备忘录
     * @return
     */
    public TextMementor saveTextMementor(){
        TextMementor mementor = new TextMementor();
        mementor.setTitle(this.title);
        mementor.setContent(this.content);
        mementor.setCreateTime(this.createTime);
        return mementor;
    }

    /**
     * 获取备忘录信息
     * @param mementor
     */
    public void getTextMementor(TextMementor mementor){
        this.title = mementor.getTitle();
        this.content = mementor.getContent();
        this.createTime = mementor.getCreateTime();
    }

    @Override
    public String toString() {
        return "Text{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
