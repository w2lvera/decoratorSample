/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.MyShape.decorator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;


/**
 *
 * @author Netbeans
 */
public class MyShape implements MyShapeDecorator{
    RectangularShape shape;
    FillBehavior fb;
    Color color;

    public RectangularShape getShape() {
        return shape;
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }

    public FillBehavior getFb() {
        return fb;
    }

    public void setFb(FillBehavior fb) {
        this.fb = fb;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void draw(Graphics2D g){
        Paint p = g.getPaint();
        g.setColor(color);
        fb.draw(this, g);
        g.setPaint(p);
    }

    public MyShape(RectangularShape shape, FillBehavior fb, Color color) {
        this.shape = shape;
        this.fb = fb;
        this.color = color;
    }

    public MyShape() {
    }

//    @Override
//    public void setFrame(Point2D[] p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void setParameter(int par) {
    }
    
    
}
