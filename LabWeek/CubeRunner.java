public class CubeRunner {
    public static void main(String[] args) {
        System.out.print("\nWelcom to Cube & Rectangle Runner");
        System.out.print("\nCreating Rectangle Object And Testing it: ");
        Rectangle r1 = new Rectangle(3, 6) ;       
        System.out.print("\n Rectangle setlength: 7 and setwidth: 9");
        r1.setLength(7); r1.setWidth(9);
        System.out.print("\n Rectangle getlength: "+r1.getLength()+" getwidth: "+r1.getWidth());
        System.out.print("\n Rectangle getArea: "+r1.getArea());
        System.out.print("\n\nCreating Cube Object And Testing it: ");
        Cube c1 = new Cube(5, 6, 7) ;
        System.out.print("\n Cube length: "+c1.getLength()+" width: "+c1.getWidth()+" heigth: "+c1.getHeigth());
        System.out.print("\n Cube Surface Area: "+c1.getSurfaceArea()+" Volume: "+c1.getVolume());

    }
    
}
