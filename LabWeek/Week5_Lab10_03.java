import java.util.Scanner;

public class Week5_Lab10_03
{
    public static void main(String[] args)
    {
        System.out.print("\nProgram 2 : Facebook");
        
        Scanner in = new Scanner(System.in);

        System.out.print("\n\nHow Many Base Users : ");
        double baseUsers = in.nextDouble();
        
        System.out.print("\nGrowth Rate per month (Enter Percentage) : ");
        double growthRate = in.nextDouble();
        
        double growthPer = (growthRate/100.00) ;
        
        System.out.print("\nEnter The Final Users : ");
        double finalUsers = in.nextDouble();
        
        double baseusersPerMonth = (baseUsers*growthPer) ;

        double currentGrowthRate = baseusersPerMonth ;

        double currentUsers = baseUsers ;

        int monthReq = 0;

        while(currentUsers <= finalUsers)
        {
            currentGrowthRate = currentUsers*growthPer ;

            currentUsers = currentUsers + currentGrowthRate ;

            monthReq ++ ;
        }

        System.out.print("\nMonths Required to Reach Final Users : "+(monthReq));
        System.out.print("\n");
        


    }
}
