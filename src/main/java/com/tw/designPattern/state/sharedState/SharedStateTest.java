package com.tw.designPattern.state.sharedState;

public class SharedStateTest {

    public static void main(String[] args) {
        // 创建环境
        ShareContext context = new ShareContext();
        // 处理请求
        context.handle();
        context.handle();
        context.handle();
        context.handle();
    }
}
