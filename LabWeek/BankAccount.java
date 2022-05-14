public class BankAccount {
    
    double balance ;

    BankAccount(){
        balance = 0 ;
    }
    BankAccount(double startBalance){
        balance = startBalance ;
    }
    BankAccount(String str){
        balance = Double.parseDouble(str);
    }

    void deposit(double amount){
        balance += amount ;
    }
    void deposit(String str){
        balance += Double.parseDouble(str);
    }
    void withdraw(double amount){
        balance -= amount ;
    }
    void withdraw(String str){
        balance -= Double.parseDouble(str);
    }
    void setBalance(double b){
        balance = b ;
    }
    void setBalance(String b){
        balance = Double.parseDouble(b);
    }
    double getBalance(){
        return balance ;
    }
}
