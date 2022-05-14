import java.util.Scanner;

public class ClassWeek6p00
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        class Cal
        {
            double num1 = 0 ;
            double num2 = 0 ;
            void sum()
            {
                double sum = num1 + num2 ;
                System.out.println("Sum : "+sum);
            }
            void sub()
            {
                double sub = num1 - num2 ;
                System.out.println("Sub : "+sub);
            }
            void div()
            {
                double div = num1 / num2 ;
                System.out.println("Div : "+div);
            }
            void mul()
            {
                double mul = num1 * num2 ;
                System.out.println("Mul : "+mul);
            }
        }

        Cal ob1 = new Cal() ;

        System.out.print("Enter 1st Num : ");
        ob1.num1 = sc.nextInt();
        System.out.print("Enter 2st Num : ");
        ob1.num2 = sc.nextInt();
        
        ob1.sum();
        ob1.sub();
        ob1.div();
        ob1.mul();
        
    }
}