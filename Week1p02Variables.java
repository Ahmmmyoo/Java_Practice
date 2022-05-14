import java.util.Scanner;

public class Week1p02Variables
{
    public static void main (String[] args)
    {
        System.out.println("Enter Value for x : ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter Value for y : ");
        int y = input.nextInt();
        int Sum = x + y ;
        int Diff = x - y ;
        int Mul = x * y ;
        int Div = x / y ;
        input.close();
        System.out.println("Enter Value for Sum : "+Sum);
        System.out.println("Enter Value for Diff : "+Diff);
        System.out.println("Enter Value for Mul : "+Mul);
        System.out.println("Enter Value for Div : "+Div);
    }    
}