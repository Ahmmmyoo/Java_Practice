
public class Wood {

    int length;
    int width;
    int height;

    public Wood() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    public Wood(int a, int b, int c) {
        this.length = a;
        this.width = b;
        this.height = c;
    }

    public Wood(Wood obj) {
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;
    }

    void setLength(int len) {
        this.length = len;
    }

    void setWidth(int wid) {
        this.width = wid;
    }

    void setHeight(int hei) {
        this.height = hei;
    }

    int getVolume() {
        return this.height*this.length*this.width ;
    }

    int getSurfaceArea() {
        return (this.height*this.length)+(this.length*this.width)+(this.width*this.height) ;
    }

}
