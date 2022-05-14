import java.util.Scanner;

public class Week4p05
{
    public static void main(String[] args)
    {
        System.out.println("Program 5 : 2D Matrix * Constant");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows of Matrix : ");
        int rows = input.nextInt();
        System.out.print("Enter columns of Matrix : ");
        int columns = input.nextInt();
        input.nextLine(); // flushes input stream buffer
        double Array_A[][] = new double[rows][columns] ;
        System.out.println("Enter Matrix Elements : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            { // getting elements of matrix from user
                System.out.print("\t["+i+"]["+j+"]:");
                Array_A[i][j] = input.nextDouble();
                //input.nextLine(); not using for multiple inputs at same time eg. filling buffer             
            }
        }
        System.out.println("\nYour Matrix : ");            
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
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
                for(int i=0;i<rows;i++) // Matrix Display & *constant
                {
                    for(int j=0;j<columns;j++)
                    {  // using this approach because it will not effect the original matrix
                        System.out.print("\t"+(Array_A[i][j]*constant));          
                    }
                    System.out.println("");            
                }
            }
            else
            {
                System.out.println("Thank You for Using Matrix Systems");            
            }        }    }    }
