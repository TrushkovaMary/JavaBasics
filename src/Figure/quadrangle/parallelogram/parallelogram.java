package Figure.quadrangle.parallelogram;

import Figure.Figure;

public class parallelogram extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double side, double height) {
        this.area = side*height;
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
