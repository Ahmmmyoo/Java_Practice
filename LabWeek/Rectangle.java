public class Rectangle {

    private double length ;
    private double width ;

    public Rectangle (double len, double w) {
        this.length = len ;
        this.width = w ;
    }

    public void setLength(double len) {
        this.length = len;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width ;
    }
    
}