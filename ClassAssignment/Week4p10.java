import java.util.Scanner;

public class Week4p10
{
    public static void main(String[] args)
    {
        System.out.println("Program 10 : Array Storage");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Length : ");
        int arrLen = input.nextInt();
        input.nextLine(); //flushing buffer
        String arr[] = new String[arrLen] ;
        for(int i = 0; i<arrLen ; i++)
        {
            System.out.print("Enter What to Store in "+(i+1)+" Slot : ");
            arr[i] = input.nextLine();
        }
        System.out.println("Storage Complete.....");
        System.out.print("Enter Slot to Read : ");
        int slot = input.nextInt();
        if(slot>arrLen)
        {
            System.out.print("\nError.... ");
            System.out.print("\nThere are Only "+arrLen+" Slots");
        }
        else
        {
            int temp = slot-1 ;
            System.out.print("Slot "+slot+" Contains : "+arr[temp]);
        }
    }
}
