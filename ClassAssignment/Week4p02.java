import java.util.Scanner;

public class Week4p02
{
    public static void main(String[] args)
    {
        System.out.println("Program 2 : 2D Square Matrix Transpose");
        System.out.print("Enter Order(Size) of Matrix : "); // 2x2 3x3 4x4 etc
        Scanner input = new Scanner(System.in);
        int ordr = input.nextInt();
        input.nextLine(); // flushes input stream buffer
        if(ordr<1)
        {
            System.out.println("Error...");
        }
        else
        {
            double Array_A[][] = new double[ordr][ordr] ;
            double Array_A_Tra[][] = new double[ordr][ordr] ;
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
            for(int i=0;i<ordr;i++) // Transpose Matrix
            {
                for(int j=0;j<ordr;j++)
                {
                    Array_A_Tra[j][i] = Array_A[i][j] ;          
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
            System.out.println("\nTranspose : ");            
            for(int i=0;i<ordr;i++)
            {
                for(int j=0;j<ordr;j++)
                {
                    System.out.print("\t"+Array_A_Tra[i][j]);          
                }
                System.out.println("");            
            }
        }    }    }
