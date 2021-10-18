/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.MyShape.decorator;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

/**
 *
 * @author Netbeans
 */
public class Border implements MyShapeDecorator{
    MyShapeDecorator myShapeDecorator;
    int width=10;

    public Border(MyShapeDecorator myShapeDecorator) {

       this.myShapeDecorator = myShapeDecorator;

    }

    @Override

    public void draw(Graphics2D g2) {

        this.myShapeDecorator.draw(g2);

        RectangularShape helpShape = myShapeDecorator.getShape();

        Point2D pointLeft = new Point2D.Double(helpShape.getMinX()-width,

               helpShape.getMinY()-width );

        Point2D pointRight = new Point2D.Double(helpShape.getMaxX()+width,

               helpShape.getMaxY()+width);

        RectangularShape helpShape1 = (RectangularShape) helpShape.clone();

        helpShape1.setFrameFromDiagonal(pointLeft, pointRight);

        g2.draw(helpShape1);

   }

//    @Override
//
//    public void setFrame(Point2D[] p) {        myShapeInterface.setFrame(p);    }

    @Override

    public RectangularShape getShape() {   return myShapeDecorator.getShape();   }

    @Override
    public void setParameter(int par){    width = par;    }

}

 
