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
