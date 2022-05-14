import java.util.Scanner;

public class Week4_Lab7_00
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Flow Chart Code : Task 2");
        
        System.out.print("Enter Marks : ");

        int grade = sc.nextInt();

        if (grade<60)
        {
            System.out.println("Grade is F");
        }
        else if (grade<70)
        {
            System.out.println("Grade is D");
        }
        else if (grade<80)
        {
            System.out.println("Grade is C");
        }
        else if (grade<90)
        {
            System.out.println("Grade is B");
        }
        else if (grade>89)
        {
            System.out.println("Grade is A");
        }
        
        System.out.println("Magic Date : Task 2");
        
        
        System.out.print("Enter Date (two digit) : ");
        int dat = sc.nextInt();
        System.out.print("Enter Month (two digit) :");
        int mont = sc.nextInt();
        System.out.print("Enter Year (two digit) :");
        int yer = sc.nextInt();
        
        if((dat>31)||(mont>12)||(yer>99))
        {
            System.out.println("Wrong Format Enter Again");
        }
        else
        {
            if(dat*mont == yer)
            {
                System.out.println("This is a Magic Date");
            }
            else
            {
                System.out.println("This is not a Magic Date");
            }
        }
        
        System.out.println("Time Calculator : Task 3");
        
        System.out.print("Enter Time in Seconds : ");
        
        double time = sc.nextDouble();
        
        if(time<60)
        {
            System.out.println("Time in Seconds : "+time);
        }
        else if(time<3600)
        {
            System.out.println("Time in Minutes : "+(time/60.00));
        }
        else if(time<216000)
        {
            System.out.println("Time in Hours : "+(time/3600.00));
        }
        else
        {
            System.out.println("Time in Days : "+(time/216000.00));
        }


        System.out.println("Software Sales : Task 4");
        
        System.out.print("Enter Amount of Sales : ");
        
        double sales = sc.nextDouble();
        
        System.out.println("Amount of Sales : "+sales);
        System.out.println("Amount : "+(sales*99.00));
        
        if((sales>9)&&(sales<20))
        {
            System.out.println("Discount (20%) : "+((sales*99)*0.20));
            System.out.println("Amount to Pay : "+((sales*99)-((sales*99)*0.20)));
        }
        if((sales>19)&&(sales<50))
        {
            System.out.println("Discount (30%) : "+((sales*99)*0.30));
            System.out.println("Amount to Pay : "+((sales*99)-((sales*99)*0.30)));
        }
        if((sales>49)&&(sales<100))
        {
            System.out.println("Discount (40%) : "+((sales*99)*0.40));
            System.out.println("Amount to Pay : "+((sales*99)-((sales*99)*0.40)));
        }
        if(sales>99)
        {
            System.out.println("Discount (50%) : "+((sales*99)*0.50));
            System.out.println("Amount to Pay : "+((sales*99)-((sales*99)*0.50)));
        }

    }
    
}
