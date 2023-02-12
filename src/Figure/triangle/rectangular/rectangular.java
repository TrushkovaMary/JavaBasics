package Figure.triangle.rectangular;

import Figure.Figure;

public class rectangular extends Figure {
    private int leg1;
    private int leg2;
    private double area;
    private double perimeter;

    public void setArea(double area) {
        this.area = area;
    }
    public void setArea(double leg1, double leg2) {
        this.area = leg1*leg2/2;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public void setPerimeter(double leg1, double leg2) {
        this.perimeter = leg1+leg2+Math.sqrt(Math.pow(leg1, 2)+Math.pow(leg2, 2));
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
