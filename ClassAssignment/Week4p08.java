import java.util.Scanner;

public class Week4p08
{
    public static void main(String[] args)
    {
        System.out.println("Program 8 : String Array Full Name");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amount of Words in Name : ");
        int nameLen = input.nextInt();
        input.nextLine(); //flushing buffer
        String name[] = new String[nameLen] ;
        for(int i = 0; i<nameLen ; i++)
        {
            System.out.print("Enter "+(i+1)+" Word of Name : ");
            name[i] = input.next();
            input.nextLine();
        }
        System.out.print("\n");
        System.out.print("Full Name : ");
        for(int i = 0; i<nameLen ; i++)
        {
            System.out.print(" "+name[i]);
        }
        if(nameLen > 3)
        {
            System.out.println("");
            System.out.println("Name too big...");
            System.out.println("Use "+name[0]+" As Your Short Name");
        }
    }    
}
