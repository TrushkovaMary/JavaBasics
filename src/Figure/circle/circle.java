package Figure.circle;

import Figure.Figure;

public class circle extends Figure {
    private double area;
    private double perimeter;
    private double radius;
    public void setArea(double radius){
        this.radius = radius;
        this.area = Math.PI*radius*radius;
    }
    public void setArea(double[] firstPoint, double[] secondPoint){
        this.radius = Math.sqrt(Math.pow(firstPoint[0]-secondPoint[0], 2)+Math.pow(firstPoint[1]-secondPoint[1], 2));
        this.area = Math.PI*radius*radius;
    }
    public void setPerimeter(double radius){
        this.radius = radius;
        this.perimeter = 2*Math.PI*radius;
    }
    public void setPerimeter(double[] firstPoint, double[] secondPoint){
        this.radius = Math.sqrt(Math.pow(firstPoint[0]-secondPoint[0], 2)+Math.pow(firstPoint[1]-secondPoint[1], 2));
        this.perimeter = 2*Math.PI*radius;
    }
    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPerimeter() {
        return this.perimeter;
    }
}
