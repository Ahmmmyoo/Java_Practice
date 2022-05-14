import java.util.Scanner; // using scanner to get input basic salary from the user

public class ClassWeek4p00 // your file name should be exactly the same as this class name
{
    public static void main(String[] args)
    {
        System.out.println("Project");
        
        Scanner sc = new Scanner(System.in);  // created an object sc to get the input basic salary from the user
        
        System.out.print("Enter Basic Salary : ");
        
        double bs = sc.nextDouble(); // basic salary is stored in bs which will be given by the user

        // grade is itinitialized with value 0
        int grade = 0 ; // grade value will be stored here which will be assigned in the if-else-if below
        
        System.out.print("Accoding to Pakitan Min Salary, Your Grade is "); // the grade salary chart is included in the file
        
        // the if-else-if which gives the grade based on salary given in the conditions

        if(bs<15880) // condition for grade 16 if salary is below 15880
        {
            System.out.print("16 or below");
            grade = 16 ; // puts value "16" in grade
        }
        else if(bs<25440) // condition for grade 17
        {
            System.out.print("17");
            grade = 17 ;
        }
        else if(bs<31890)
        {
            System.out.print("18");
            grade = 18 ;
        }
        else if(bs<49370)
        {
            System.out.print("19");
            grade = 19 ;
        }
        else if(bs<57410)
        {
            System.out.print("20");
            grade = 20 ;
        }
        else // only grade 20 and below is calculated in this program, this else will execute if salary is more than grade 20
        {
            System.out.println("\nError... Too much salary \tGrade 20 and below are calculated only");
        }
        
        System.out.println(" ");
        

        // Initializing values for HRA, MA, CovA
        // double is used as we are dealing with decimals

        double hra = 0.00;
        double ma = 0.00;
        double cova = 0.00;

        
        switch(grade) // different percentage of hra,ma,cova will be given based on grade
        {
            case 16: // for grade 16
            {
                hra =  (0.08*bs) ; // 8% of basic salary
                ma = (0.20*bs) ;   // 20% of basic salary
                cova = (0.10*bs) ; // 10% of basic salary
                
                System.out.println(" HRA: "+hra+"\tMA: "+ma+"\tCovA: "+cova);

                break; // breaks out of switch 
                
            }
            case 17:
            {
                hra =  (0.10*bs) ;
                ma = (0.30*bs) ;
                cova = (0.20*bs) ;
                
                System.out.println(" HRA: "+hra+"\tMA: "+ma+"\tCovA: "+cova);

                break;

            }
            case 18:
            {
                hra =  (0.10*bs) ;
                ma = (0.30*bs) ;
                cova = (0.20*bs) ;
                
                System.out.println(" HRA: "+hra+"\tMA: "+ma+"\tCovA: "+cova);

                break;

            }
            case 19:
            {
                hra =  (0.15*bs) ;
                ma = (0.40*bs) ;
                cova = (0.30*bs) ;
                
                System.out.println(" HRA: "+hra+"\tMA: "+ma+"\tCovA: "+cova);

                break;
                
            }
            case 20:
            {
                hra =  (0.15*bs) ;
                ma = (0.40*bs) ;
                cova = (0.30*bs) ;
                
                System.out.println(" HRA: "+hra+"\tMA: "+ma+"\tCovA: "+cova);
                
                break;
                
            }   
            default: // this will display 0.00 for each hra, ma & cova 
            {
                System.out.println(" HRA: "+hra+" MA: "+ma+" CovA: "+cova);
            }
        }

        if(grade==0) // if grade is above 20 it will remain 0 as initialized and program will exit
        {
            System.exit(0);
        }
    
        double ts = bs+hra+ma+cova; // total salary is equal to basic salary plus hra, ma & cova

        System.out.println("Your Total Salary is "+ts);
        
        double it = (0.10*ts); // tax is 10% of total salary
        
        System.out.println("Your Income Tax is "+it);
        
        double gs = ts-it; // Gross salary is total salary minus tax
        
        System.out.println("Your Gross Salary is "+gs);


    }    
}
