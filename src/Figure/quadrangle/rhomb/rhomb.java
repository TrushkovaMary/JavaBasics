package Figure.quadrangle.rhomb;

import Figure.Figure;

public class rhomb extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double a, double height) {
        this.area = a*height;
    }

    public void setPerimeter(double a) {
        this.perimeter = 4*a;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
