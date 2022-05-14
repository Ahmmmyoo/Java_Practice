import java.util.Scanner;

public class ClassWeek5p01
{
    public static void main(String[] args)
    {
        System.out.print("\nMaking Class of (price and name) with 2 Objects\n");
        class ClassName
        {
            String Name ;
            Double price ;
        }
        
        ClassName ob1 = new ClassName();
        ClassName ob2 = new ClassName();

        Scanner inp = new Scanner(System.in);
        System.out.print("\nEnter Object 1 Name : ");
        ob1.Name = inp.next();
        System.out.print("\nEnter Object 1 Price : ");
        ob1.price = inp.nextDouble();
        System.out.print("\nEnter Object 2 Name : ");
        ob2.Name = inp.next();
        System.out.print("\nEnter Object 2 Price : ");
        ob2.price = inp.nextDouble();
        
        System.out.print("\n\nResult :\n");
        System.out.print("\nObject 1 Name : "+ob1.Name);
        System.out.print("\nObject 1 Price : "+ob1.price);
        System.out.print("\n\nObject 2 Name : "+ob2.Name);
        System.out.print("\nObject 2 Price : "+ob2.price);
    }    
}
