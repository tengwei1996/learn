package com.tw.designPattern.chainOfResponsibility.handler;

public class VerifyPermissionHandler extends BuildHandler {

    @Override
    public void doHandler(LoginUser loginUser) {
        if (!"admin".equals(loginUser.getPermission())){
            System.out.println("暂无权限");
            return;
        }
        System.out.println("权限校验通过，登录成功");
    }

}
