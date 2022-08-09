package com.tw.designPattern.chainOfResponsibility.handler;

public abstract class BuildHandler<T> {
    protected BuildHandler next;

    public void next(BuildHandler handler){
        this.next = handler;
    }

    public abstract void doHandler(LoginUser loginUser);

    public static class Builder<T>{
        private BuildHandler<T> head;
        private BuildHandler<T> tail;

        public Builder<T> addHandler(BuildHandler handler){
            if (null == head){//head==null表示第一次添加到队列
                head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);//原tail节点指向新添加进来的节点
            this.tail = handler;//新添加进来的节点设置为tail节点
            return this;
        }

        public BuildHandler<T> build(){
            return this.head;
        }
    }
}
