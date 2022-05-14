import java.util.Scanner;

public class ClassWeek2p02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount in Rupees: ");
        float pk = sc.nextFloat();

        Double dollar = pk/177.05 ;
        Double pounds = pk/240.0 ;
        Double ryal   = pk/47.0 ;
        Double darham = pk/48.0 ;
        Double euro   = pk/200.0 ;

        System.out.println("");
        System.out.println("The Amount in Dollars: "+dollar);
        System.out.println("The Amount in Pounds:  "+pounds);
        System.out.println("The Amount in Riyal:   "+ryal);
        System.out.println("The Amount in Darham:  "+darham);
        System.out.println("The Amount in Euro:    "+euro);
        System.out.println("");

    }
}