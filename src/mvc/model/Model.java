/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import mvc.MyShape.decorator.MyShape;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Observable;
import mvc.MyShape.decorator.MyShapeDecorator;

/**
 *
 * @author Netbeans
 */
public class Model extends Observable{
    MyShapeDecorator shape;

    public void setFrame(Point2D[] p) {
        shape.getShape().setFrameFromDiagonal(p[0], p[1]);
        setChanged();
        notifyObservers();
    }

    public void draw(Graphics2D g2) {
        shape.draw(g2);
    }

    public void setShape(MyShapeDecorator shape) {
        this.shape = shape;
    }
    
}
