import java.util.Scanner;

public class Week4p01
{
    public static void main(String[] args)
    {
        System.out.println("Program 1 : 2D Square Matrix * Constant");
        System.out.print("Enter Order(Size) of Matrix : "); // 2x2 3x3 4x4 etc
        Scanner input = new Scanner(System.in);
        int ordr = input.nextInt();
        input.nextLine(); // flushes input stream buffer
        double Array_A[][] = new double[ordr][ordr] ;
        System.out.println("Enter Matrix Elements : ");
        for(int i=0;i<ordr;i++)
        {
            for(int j=0;j<ordr;j++)
            { // getting elements of matrix from user
                System.out.print("\t["+i+"]["+j+"]:");
                Array_A[i][j] = input.nextDouble();
                //input.nextLine(); not using for multiple inputs at same time eg. filling buffer             
            }
        }
        System.out.println("\nYour Matrix : ");
        for(int i=0;i<ordr;i++)
        {
            for(int j=0;j<ordr;j++)
            {
                System.out.print("\t"+Array_A[i][j]);            
            }
            System.out.println("");            
        }
        int choice = 1 ;
        while(choice==1)
        {
            System.out.print("Multiplay Matrix to constant(1) or Exit: ");
            choice = input.nextInt();
            if(choice == 1)
            {
                System.out.print("Enter Constant : ");
                Double constant = input.nextDouble();
                System.out.println("Matrix multipied to constant "+constant+" : ");        
                for(int i=0;i<ordr;i++) // Matrix Display & *constant
                {
                    for(int j=0;j<ordr;j++)
                    {  // using this approach because it will not effect the original matrix
                        System.out.print("\t"+(Array_A[i][j]*constant));          
                    }
                    System.out.println("");            
                }
            }
            else
            {
                System.out.println("Thank You for Using Matrix Systems");            
            }
        }    }    }
