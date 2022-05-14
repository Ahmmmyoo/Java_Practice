import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){

        System.out.print("\n\nWelcome to Bank Account\n");
        System.out.print("\n1.Deposit");
        System.out.print("\n2.Withdraw");
        System.out.print("\n3.Set Balance");
        System.out.print("\n4.Show Balance");
        System.out.print("\n5.Exit\n");
        
        Scanner sc = new Scanner(System.in);
        
        int option ;
        
        int runProgram = 1;
        
        BankAccount b1 = new BankAccount();
        
        while(runProgram == 1)
        {
            System.out.print("\nEnter Choice : ");
            option = sc.nextInt();
            switch(option) {
                case 1:{
                    System.out.print("Enter Amount to Deposit : ");
                    double depositAmount = sc.nextDouble();
                    b1.deposit(depositAmount);
                }break;
                case 2:{
                    System.out.print("Enter Amount to Withdraw : ");
                    double withdrawAmmount = sc.nextDouble();
                    b1.withdraw(withdrawAmmount);
                }break;
                case 3:{
                    System.out.print("Enter Balance to set : ");
                    double setAmmount = sc.nextDouble();
                    b1.setBalance(setAmmount);
                }break;
                case 4:{
                    System.out.print("Current Balance : "+b1.getBalance());
                }break;
                case 5:{
                    System.out.print("Exiting...");
                    runProgram = 0 ;
                }break;
            }
        }
    }
}