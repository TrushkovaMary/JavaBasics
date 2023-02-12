package Figure.quadrangle.square;

import Figure.Figure;

public class square extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double a) {
        this.area = a*a;
    }

    public void setPerimeter(double a) {
        this.perimeter = 4*a;
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
