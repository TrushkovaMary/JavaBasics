package Figure.triangle.equilateral;

import Figure.Figure;

public class equilateral extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double a) {
        this.area = Math.pow(a,2)*Math.sqrt(3)/4;
    }

    public void setPerimeter(double a) {
        this.perimeter = 3*a;
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
