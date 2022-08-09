package com.tw.designPattern.chainOfResponsibility.handler;

public class TestChain {

    public static void main(String[] args) {
        LoginUser loginUser = new LoginUser();
        loginUser.setLoginName("孤狼1号");
        loginUser.setPassword("123456");
        loginUser.setRoleName("admin");
        loginUser.setPermission("admin");

        BuildHandler.Builder builder = new BuildHandler.Builder();
        builder.addHandler(new VerifyAccountHandler())
                .addHandler(new VerifyPermissionHandler());
        builder.build().doHandler(loginUser);

    }
}
