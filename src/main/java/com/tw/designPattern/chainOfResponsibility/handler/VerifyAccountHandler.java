package com.tw.designPattern.chainOfResponsibility.handler;

public class VerifyAccountHandler extends BuildHandler {

    @Override
    public void doHandler(LoginUser loginUser) {
        if ("".equals(loginUser.getLoginName())){
            System.out.println("用户名不能为空");
            return;
        }
        if ("".equals(loginUser.getPassword())){
            System.out.println("密码不能为空");
            return;
        }
        if (!loginUser.getPassword().equals("123456")){
            System.out.println("密码不正确");
            return;
        }
        System.out.println("账号密码校验通过");

        next.doHandler(loginUser);
    }

}
