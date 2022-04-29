package com.tw.designPattern.flyweight.pureFlyweight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Chessboard extends MouseAdapter {

    /**
     * 棋子工厂
     */
    ChessPiecesFactory chessPiecesFactory;

    /**
     * 窗体对象
     */
    JFrame jFrame;

    /**
     * 画图工具（画棋子）
     */
    Graphics graphics;

    /**
     * 白子单选按钮
     */
    JRadioButton whiteChessPiecesRadio;

    /**
     * 黑子单选按钮
     */
    JRadioButton blackChessPiecesRadio;

    private final int x = 50;

    private final int y = 50;

    /**
     * 小方格宽高
     */
    private final int w = 40;

    /**
     * 棋盘款高
     */
    private final int rw = 400;

    Chessboard() {
        // 创建棋子工厂
        chessPiecesFactory = new ChessPiecesFactory();
        // 创建窗体（棋盘）
        jFrame = new JFrame("享元模式在五子棋游戏中的应用");
        // 棋盘位置设置左上角顶点在100，100（相对于屏幕）宽高为500
        jFrame.setBounds(600, 200, 600, 600);
        // 设置窗体（棋盘）可见
        jFrame.setVisible(true);
        // 设置不可拖拽放大放小棋盘
        jFrame.setResizable(false);
        // 设置同步开关，关闭棋盘，程序停止运行
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel southJPanel = new JPanel();
        jFrame.add("South", southJPanel);
        // 白子单选按钮
        whiteChessPiecesRadio = new JRadioButton("白子");
        // 黑子单选按钮
        blackChessPiecesRadio = new JRadioButton("黑子", true);
        // 将白子、黑子单选按钮加入到buttonGroup中
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(whiteChessPiecesRadio);
        buttonGroup.add(blackChessPiecesRadio);
        // 将白子、黑子单选按钮放入到JPlane中
        southJPanel.add(whiteChessPiecesRadio);
        southJPanel.add(blackChessPiecesRadio);
        // 中间棋盘划线JPlane
        JPanel centerJPanel = new JPanel();
//        centerJPanel.setLayout(null);
        // 添加鼠标监听时间
        centerJPanel.addMouseListener(this);
        // 加入到棋盘中
        jFrame.add("Center", centerJPanel);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 获取画图工具
        graphics = centerJPanel.getGraphics();
        // 设置颜色
        graphics.setColor(Color.BLUE);
        //
        graphics.drawRect(x, y, rw, rw);
        // 划线
        for (int i = 1; i < 10; i++) {
            // 竖线
            graphics.drawLine(x + (i * w), y, x + (i * w), y + rw);
            // 横线
            graphics.drawLine(x, y + (i * w), x + rw, y + (i * w));
        }
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        // 获取鼠标点击对象
        Point point = new Point(mouseEvent.getX() - 15, mouseEvent.getY() - 15);
        if (whiteChessPiecesRadio.isSelected()) {
            // 选择白子，下白子
            ChessPieces whiteChessPieces = chessPiecesFactory.getChessPieces("white");
            // 这里是享元模式的体现
            System.out.println("白子：" + whiteChessPieces);
            whiteChessPieces.downPieces(graphics, point);
        } else if (blackChessPiecesRadio.isSelected()) {
            // 选择黑子，下黑子
            // 这里是享元模式的体现
            ChessPieces blackChessPieces = chessPiecesFactory.getChessPieces("black");
            System.out.println("黑子：" + blackChessPieces);
            blackChessPieces.downPieces(graphics, point);
        }
    }

}
