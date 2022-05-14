import java.util.Scanner;

public class Week4p09
{
    public static void main(String[] args)
    {
        System.out.println("Program 9 : String Array Brands");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount of Brands you know : ");
        int amount = input.nextInt();
        input.nextLine(); //flushing buffer
        String brand[] = new String[amount] ;
        for(int i = 0; i<amount ; i++)
        {
            System.out.print("Enter "+(i+1)+" Brand Name : ");
            brand[i] = input.next();
            input.nextLine();
        }
        System.out.print("\n");
        System.out.print("Brands : ");
        for(int i = 0; i<amount ; i++)
        {
            System.out.print("\t\t"+brand[i]);
        }
        if(amount > 12)
        {
            System.out.println("");
            System.out.println("You know a lot of brands :)");
            System.out.println("");
        }
    }    
}
