public class Cubee extends Rectanglee {
    
    private double hei;

    public Cubee() {
        super();
        this.hei = 4;
    }

    public Cubee(double wid, double len, double hei) {
        super(wid, len);
        this.hei = hei;
    }

    public Cubee(double squ) {
        super(squ);
        this.hei = squ;
    }

    public void sethei(double hei) {
        this.hei = hei;
    }

    public double gethei() {
        return this.hei;
    }

    public double getArea_widhei() {
        return super.getwid() * this.hei;
    }

    public double getArea_heilen() {
        return this.hei * super.getlen();
    }

    public double getSurfaceArea() {
        return (2 * getArea_lenwid()) + (2 * getArea_widhei()) + (2 * getArea_heilen());
    }

    public double getVolume() {
        return super.getArea_lenwid() * this.hei;
    }

}
