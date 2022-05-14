import java.util.Scanner;
public class Week4p07 { public static void main(String[] args)
    {   System.out.println("Program 7 : 4D Square Matrix * Constant");
        System.out.print("Enter Order(Size) of Matrix : "); // 2x2x2x2 3x3x3x3 4x4x4x4 etc
        Scanner input = new Scanner(System.in);
        int ordr = input.nextInt();
        input.nextLine(); // flushes input stream buffer
        double Array_A[][][][] = new double[ordr][ordr][ordr][ordr] ;
        System.out.println("Enter Matrix Elements : ");
        for(int i=0;i<ordr;i++)
        {
            for(int j=0;j<ordr;j++)
            {
                for(int k=0;k<ordr;k++)
                {
                    for(int z=0;z<ordr;z++) // getting elements of matrix from user
                        {    System.out.print("\t["+i+"]["+j+"]["+k+"]["+z+"]:");
                            Array_A[i][j][k][z] = input.nextDouble();   }     }   }   }
        System.out.println("\nYour Matrix : ");            
        for(int i=0;i<ordr;i++)
        {
            for(int j=0;j<ordr;j++)
            {
                for(int k=0;k<ordr;k++)
                {
                    for(int z=0;z<ordr;z++)
                    {
                        System.out.print("\t"+Array_A[i][j][k][z]);  }
                    System.out.println("");            }
                System.out.println("");            }
            System.out.println("\n");            }
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
                        {
                            for(int z=0;z<ordr;z++)
                            {  // using this approach because it will not effect the original matrix
                                System.out.print("\t"+(Array_A[i][j][k][z]*constant));          }
                            System.out.println("");            }
                        System.out.println("");            }
                    System.out.println("\n");            }   }
            else
                System.out.println("Thank You for Using Matrix Systems");      }   }    }
