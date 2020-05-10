package shapes;
public class Circle 
{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
//////////////////////////////////////////////////////////////////////////

package shapes;

public class Cylinder
{
    private double h;
    Circle c;

    public Cylinder(double h, double radius) {
        c = new Circle(radius);
        this.h = h;
    }
    
    public double getVolume()
    {
        return c.getArea()*h;
    }
    
    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
///////////////////////////////////////////////////////////////////////////////
package mathshapes;

import shapes.Cylinder;
import shapes.Circle;

public class MathShapes {

    public static void main(String[] args) 
    {
        Circle c1 = new Circle(4);
        Cylinder cy = new Cylinder(7.3, 2);
        
        System.out.println(c1.getArea());
        System.out.println(cy.getVolume());
    }
    
}

