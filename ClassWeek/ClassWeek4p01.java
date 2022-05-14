import java.util.Scanner;

public class ClassWeek4p01
{
    public static void main(String[] args)
    {
        System.out.println("Array Project");
        
        System.out.println("Enter Array Values : ");
        
        Scanner sc = new Scanner(System.in) ;
        

        // Making 2D Arrays A, B & C
        //size of array is 3 X 3
        int Array_A [] [] = new int[3][3] ;
        int Array_B [] [] = new int[3][3] ;
        int Array_C [] [] = new int[3][3] ;
        

        // using loops to get values of array

        // i = 0 because first elements place in array is 0 and not 1         0,0   0,1   0,2      (rows,columns)
        //                                                                    1,0   1,1   1,2
        //                                                                    2,0   2,1   2,2    
        for(int i = 0; i < 3; i++)        // goes through rows
        {
            for(int j = 0; j < 3; j++)    // goes through columns          //     i,j  i,j  i,j    
            {                                                              //     i,j  i,j  i,j              
                System.out.print("Value for A["+i+"]["+j+"] : " );         //     i,j  i,j  i,j    
                Array_A[i][j] = sc.nextInt();   
                                // gets value of current element[i][j]                        
            }                                                                   
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Value for B["+i+"]["+j+"] : " );
                Array_B[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                Array_C[i][j] = (Array_A[i][j] + Array_B[i][j]) ; // adds element[i][j] of array A & B and puts in array C
            }
        }
        
        System.out.println("");

        // display array in format  3  2  5 
        //                          1  3  6     
        //                          4  7  8  

        System.out.println("Array A Elements : ");
        for(int i = 0; i < 3; i++)  
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("\t"+Array_A[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Array B Elements : ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("\t"+Array_B[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Adding Array A & Array B into Array C : ");
        System.out.println("Array C Elements : ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("\t"+Array_C[i][j]);
            }
            System.out.print("\n");
        }

        

    }
}
