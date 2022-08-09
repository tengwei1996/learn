package com.tw.designPattern.chainOfResponsibility.approve;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain implements ApproveHandler{

    List<ApproveHandler> list = new ArrayList<>();

    public HandlerChain addHandler(ApproveHandler handler){
        list.add(handler);
        return this;
    }

    @Override
    public void handleRequest() {
        for (ApproveHandler handler : list){
            handler.handleRequest();
        }

    }

}
