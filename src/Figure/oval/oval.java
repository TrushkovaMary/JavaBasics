package Figure.oval;

import Figure.Figure;

public class oval extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double a, double b) {
        this.area = Math.PI*a*b;
    }

    public void setPerimeter(double a, double b) {
        this.perimeter = 2*Math.PI*Math.sqrt((a*a+b*b)/2);
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
