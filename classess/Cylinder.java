public class Cylinder extends Circle{

    private double hei;

    public Cylinder() {
        super();
        this.hei = 5;
    }

    public Cylinder(double rad, double hei) {
        super(rad);
        this.hei = hei;
    }

    public void sethei(double hei) {
        this.hei = hei;
    }

    public double gethei() {
        return this.hei;
    }

    public double getSurfaceArea() {
        return (getCircumference() * this.hei) + (2 * getArea());
    }

    public double getVolume() {
        return getArea() * this.hei;
    }

}