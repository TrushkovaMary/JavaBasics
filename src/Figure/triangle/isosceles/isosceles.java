package Figure.triangle.isosceles;

import Figure.Figure;

public class isosceles  extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double area) {
        this.area = area;
    }
    public void setArea(double base, double height) {
        this.area = base*height/2;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public void setPerimeter(double base, double side) {
        this.perimeter = base+2*side;
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
