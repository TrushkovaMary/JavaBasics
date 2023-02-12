package Figure.quadrangle.rectangle;

import Figure.Figure;

public class rectangle extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double firstSide, double secondSide) {
        this.area = firstSide*secondSide;
    }

    public void setPerimeter(double firstSide, double secondSide) {
        this.perimeter = 2*(firstSide+secondSide);
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
