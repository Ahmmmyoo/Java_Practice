import java.util.Scanner;

public class ClassWeek2p03
{
    public static void main(String[] args)
    {
        System.out.print("Enter Any Number: ");
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        if(x%2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}