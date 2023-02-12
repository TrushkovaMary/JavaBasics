package Figure.quadrangle.trapezoid;

import Figure.Figure;

public class trapezoid extends Figure {
    private double area;
    private double perimeter;

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public void setPerimeter(double base1, double base2, double side1, double side2) {
        this.perimeter = base1+base1+side1+side2;
    }

    public void setArea(double height, double base1, double base2) {
        this.area = height*(base1+base2)/2;
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
