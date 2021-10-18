/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import mvc.MyShape.decorator.Border;
import mvc.MyShape.decorator.FillBehavior;
import mvc.MyShape.decorator.LineRectShape;
import mvc.model.Model;
import mvc.MyShape.decorator.MyShape;
import mvc.MyShape.decorator.MyShapeDecorator;
import mvc.view.MyFrame;
import mvc.view.MyPanel;

/**
 *
 * @author Netbeans
 */
public class Controller {

    Model model;
    MyFrame frame;
    MyPanel panel;
    MyShapeDecorator shape;
    Point2D[] p;

    public void draw(Graphics2D g2) {
        model.draw(g2);
    }

    public Controller() {
        shape =new LineRectShape(new Border( new MyShape(new Rectangle2D.Double(), FillBehavior.Fill, Color.BLUE)));
        model = new Model();
        model.setShape(shape);
        panel = new MyPanel(this);
        model.addObserver(panel);
        frame = new MyFrame(panel);
        p = new Point2D[2];

    }

    public void mousePressed(Point point) {
        p[0] = point;
    }

    public void mouseDragged(Point point) {
        p[1] = point;
        model.setFrame(p);
    }

}
