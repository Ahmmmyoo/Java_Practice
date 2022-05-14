public class Cube extends Rectangle{

    private double heigth ;

    public Cube(double len, double w, double h) {
        super(len, w) ;
        this.heigth = h ;
    }

    public void setHeigth(double h) {
        this.heigth = h;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getSurfaceArea() {
        return ((2 * (super.getLength() * super.getWidth())) + (2 * (super.getWidth() * this.heigth)) + (2 * (this.heigth * super.getLength()))) ;
    }

    public double getVolume() {
        return (super.getLength() * super.getWidth() * this.heigth) ;
    }
    
}
