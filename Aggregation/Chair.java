public class Chair {


    Wood base ;


    public Chair() {
    base = new Wood();
    }

    public Chair(int a, int b, int c) {
    base = new Wood(a, b, c);
    }

    public Chair(Chair obj) {
    this.base = obj.base;
    }

    int Volume() {
    return base.getVolume();
    }
     
}
