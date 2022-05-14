import java.util.Scanner;

public class Week4p03
{
    public static void main(String[] args)
    {
        System.out.println("Program 3 : Distance Speed Time Calculator");
        Scanner input = new Scanner(System.in);
        System.out.print("To Find ? : (1)Distance (2)Speed (3)Time : ");
        int choice = input.nextInt();
        int found = 0;
        switch(choice)
        {
            case 1:
            {
                System.out.print("Enter Speed(km/hr) :");
                double speed = input.nextDouble();
                System.out.print("Enter Time(hr) :");
                double time = input.nextDouble();
                System.out.print("Distance : "+(speed*time));
                found++;
            }break;
            case 2:
            {
                System.out.print("Enter Distance(km) :");
                double distance = input.nextDouble();
                System.out.print("Enter Time(hr) :");
                double time = input.nextDouble();
                System.out.print("Speed : "+(distance/time));
                found++;
            }break;
            case 3:
            {
                System.out.print("Enter Speed(km/hr) :");
                double speed = input.nextDouble();
                System.out.print("Enter Distance(km) :");
                double distance = input.nextDouble();
                System.out.print("Time : "+(distance/speed));
                found++;
            }break;
            default :
            {
                System.out.println("Wrong Choice...");
            }
        }    }    }
