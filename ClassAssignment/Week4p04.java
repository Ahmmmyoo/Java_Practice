import java.util.Scanner;

public class Week4p04
{
    public static void main(String[] args)
    {
        System.out.println("Program 4 : 2D Matrix Transpose");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows of Matrix : ");
        int rows = input.nextInt();
        System.out.print("Enter columns of Matrix : ");
        int columns = input.nextInt();
        input.nextLine(); // flushes input stream buffer
        if(rows<1&&columns<1)
        {
            System.out.println("Error...");
        }
        else
        {
            double Array_A[][] = new double[rows][columns] ;
            double Array_A_Tra[][] = new double[columns][rows] ;
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
            for(int i=0;i<rows;i++) // Transpose Matrix
            {
                for(int j=0;j<columns;j++)
                {
                    Array_A_Tra[j][i] = Array_A[i][j] ;          
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
            System.out.println("\nTranspose : ");            
            for(int i=0;i<columns;i++)
            {
                for(int j=0;j<rows;j++)
                {
                    System.out.print("\t"+Array_A_Tra[i][j]);          
                }
                System.out.println("");            
            }    }    }    }
