public class Circle {
    
    private double radius;
    private final double pi = 3.14159265359;

    public Circle() {
        this.radius = 3;
    }

    public Circle(double rad) {
        this.radius = rad;
    }

    public void setradius(double rad) {
        this.radius = rad;
    }

    public double getradius() {
        return this.radius;
    }

    public double getpi() {
        return this.pi;
    }

    public double getArea() {
        return this.pi * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * this.pi * this.radius;
    }

}