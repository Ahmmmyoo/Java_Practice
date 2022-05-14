import java.util.Scanner;

public class ClassWeek2p01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance in Kilometer: ");
        float x = sc.nextFloat();

        float m = x*100 ;
        float cm = x*10000 ;
        float feet = x*3280 ;
        float inches = x*39370 ;

        System.out.println("The Distance in Meters: "+m);
        System.out.println("The Distance in Centimeters: "+cm);
        System.out.println("The Distance in Feets: "+feet);
        System.out.println("The Distance in Inches: "+inches);
    }    
}