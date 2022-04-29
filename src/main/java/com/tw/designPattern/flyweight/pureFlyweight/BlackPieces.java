package com.tw.designPattern.flyweight.pureFlyweight;

import java.awt.*;

public class BlackPieces implements ChessPieces{

    @Override
    public void downPieces(Graphics graphics, Point point) {
        graphics.setColor(Color.BLACK);
        graphics.fillOval(point.x,point.y,30,30);
    }
}
