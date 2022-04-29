package com.tw.designPattern.flyweight.pureFlyweight;

import java.awt.*;

public interface ChessPieces {

    /**
     * 落子
     *
     * @param graphics
     * @param point
     */
    void downPieces(Graphics graphics, Point point);
}
