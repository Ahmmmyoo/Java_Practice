import java.util.Scanner;

public class Week4p06
{
    public static void main(String[] args)
    {
        System.out.println("Program 6 : 3D Square Matrix * Constant");
        System.out.print("Enter Order(Size) of Matrix : "); // 2x2x2 3x3x3 4x4x4 etc
        Scanner input = new Scanner(System.in);
        int ordr = input.nextInt();
        input.nextLine(); // flushes input stream buffer
        double Array_A[][][] = new double[ordr][ordr][ordr] ;
        System.out.println("Enter Matrix Elements : ");
        for(int i=0;i<ordr;i++)
        {
            for(int j=0;j<ordr;j++)
            {
                for(int k=0;k<ordr;k++)
                { // getting elements of matrix from user
                    System.out.print("\t["+i+"]["+j+"]["+k+"]:");
                    Array_A[i][j][k] = input.nextDouble();
                    //input.nextLine(); not using for multiple inputs at same time eg. filling buffer             
                }   }   }
        System.out.println("\nYour Matrix : ");            
        for(int i=0;i<ordr;i++)
        {
            for(int j=0;j<ordr;j++)
            {
                for(int k=0;k<ordr;k++)
                {
                    System.out.print("\t"+Array_A[i][j][k]);  }          
                System.out.println("");            }
            System.out.println("");            }
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
                    {
                        for(int k=0;k<ordr;k++)
                        {  // using this approach because it will not effect the original matrix
                            System.out.print("\t"+(Array_A[i][j][k]*constant));          }
                        System.out.println("");            }
                    System.out.println("");            }   }
            else
                System.out.println("Thank You for Using Matrix Systems");        }    }    }