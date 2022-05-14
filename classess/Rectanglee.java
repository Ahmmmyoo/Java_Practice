public class Rectanglee {
    
    private double len;
    private double wid;

    public Rectanglee() {
        this.len = 2;
        this.wid = 5;
    }

    public Rectanglee(double wid, double len) {
        this.len = len;
        this.wid = wid;
    }

    public Rectanglee(double squ) {
        this.len = squ;
        this.wid = squ;
    }

    public void setlen(double len) {
        this.len = len;
    }

    public void setwid(double wid) {
        this.wid = wid;
    }

    public double getlen() {
        return this.len;
    }

    public double getwid() {
        return this.wid;
    }

    public double getArea_lenwid() {
        return this.len * this.wid;
    }

    public double getRecArea() {
        return getArea_lenwid();
    }

}
