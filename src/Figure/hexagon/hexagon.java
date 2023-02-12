package Figure.hexagon;

import Figure.Figure;

public class hexagon extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double a) {
        this.area = 3*Math.sqrt(3)*Math.pow(a, 2)/2;
    }

    public void setPerimeter(double a) {
        this.perimeter = 6*a;
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

