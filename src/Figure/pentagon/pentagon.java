package Figure.pentagon;

import Figure.Figure;

public class pentagon extends Figure {
    private double area;
    private double perimeter;

    public void setArea(double a) {
        this.area = Math.sqrt(5)*Math.sqrt(5+2*Math.sqrt(5))*Math.pow(a, 2)/4;
    }

    public void setPerimeter(double a) {
        this.perimeter = 5*a;
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
