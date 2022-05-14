import java.util.Scanner;

public class LabTaskWeek3p01
{
    public static void main(String[] args)
    {
        // Program to calculate Student Marks and print DMC

        Scanner scr = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");
        System.out.println("Program from Calculating Student Marks and Printing DMC");
        System.out.println("-------------------------------------------------------");
        
        System.out.print  ("Enter Student Name : ");
        String name = scr.nextLine();
        
        System.out.print  ("Enter Subject Name : ");
        String subject = scr.nextLine();
        
        String temp; // using to clear the buffer
        
        System.out.print  ("Enter Marks of Test 1 (out of 20) : ");
        int test1 = scr.nextInt();
        temp = scr.nextLine();
        
        System.out.print  ("Enter Marks of Test 2 (out of 20) : ");
        int test2 = scr.nextInt();
        temp = scr.nextLine();
        
        System.out.print  ("Enter Marks of Test 3 (out of 20) : ");
        int test3 = scr.nextInt();
        temp = scr.nextLine();
        
        System.out.print  ("Enter Marks of Test 4 (out of 20) : ");
        int test4 = scr.nextInt();
        temp = scr.nextLine();
        
        System.out.print  ("Enter Marks of Test 5 (out of 20) : ");
        int test5 = scr.nextInt();
        temp = scr.nextLine();
        
        double per1 = (test1/20)*100 ;
        double per2 = (test2/20)*100 ;
        double per3 = (test3/20)*100 ;
        double per4 = (test4/20)*100 ;
        double per5 = (test5/20)*100 ;

        double aver = (test1+test2+test3+test4+test5)/5 ;

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------DMC---------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("Test 1 Marks : "+test1+" And Percentage : "+per1);
        System.out.println("Test 1 Marks : "+test2+" And Percentage : "+per2);
        System.out.println("Test 1 Marks : "+test3+" And Percentage : "+per3);
        System.out.println("Test 1 Marks : "+test4+" And Percentage : "+per4);
        System.out.println("Test 1 Marks : "+test5+" And Percentage : "+per5);
        System.out.println("Total Marks Obtained out of 100 : "+(test1+test2+test3+test4+test5));
        System.out.println("Total Marks Percentage : "+(test1+test2+test3+test4+test5));
        System.out.println("Average Marks : "+aver);
        




    }    
}
