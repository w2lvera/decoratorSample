/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.MyShape.decorator;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;

/**
 *
 * @author Netbeans
 */
public class LineRectShape implements MyShapeDecorator{
    MyShapeDecorator myShapeDecorator;
    public LineRectShape(MyShapeDecorator myShapeDecorator) {

        this.myShapeDecorator = myShapeDecorator;

    }

   @Override

    public void draw(Graphics2D g2) {

        myShapeDecorator.draw(g2);

        Line2D line;

        RectangularShape helpShape = myShapeDecorator.getShape();

        Point2D pointLeft = new Point2D.Double(helpShape.getMinX(),

               helpShape.getMinY() );

        Point2D pointRight = new Point2D.Double(helpShape.getMaxX(),

               helpShape.getMaxY() );

        line = new Line2D.Double(pointLeft,pointRight);

        g2.draw(line);

    }

 

//    @Override
//
//    public void setFrame(Point2D[] p) {
//
//     myShapeInterface.setFrame(p);    }

    @Override

    public RectangularShape getShape() {  

return myShapeDecorator.getShape();    }

    @Override
    public void setParameter(int par) {

    }

}