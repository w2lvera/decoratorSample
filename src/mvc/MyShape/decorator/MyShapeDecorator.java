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
public interface MyShapeDecorator {

    void draw(Graphics2D g2);

    //void setFrame(Point2D []p);

    RectangularShape getShape();

    void setParameter(int par);

}
