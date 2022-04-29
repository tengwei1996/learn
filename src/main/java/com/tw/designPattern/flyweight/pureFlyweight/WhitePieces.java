package com.tw.designPattern.flyweight.pureFlyweight;

import java.awt.*;

public class WhitePieces implements ChessPieces{
    @Override
    public void downPieces(Graphics graphics, Point point) {
        graphics.setColor(Color.WHITE);
        graphics.fillOval(point.x,point.y,30,30);
    }
}
