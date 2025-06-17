package Assignment;

// class represent a bankaccount
public class BankAccount {

    // Attributes  for class bankaccount

    String AccountHolderName;
    String AccountName;
    int balance;

    BankAccount(String AccountHolderName, String AccountName, int balance) {  // constructor for value initialize value
        this.AccountHolderName = AccountHolderName;
        this.AccountName = AccountName;
        this.balance = balance;
    }
     // getter and setter for attributes

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        --balance;
    }

    // Method to deposit amount into the account
   void deposit(int amount){
        balance = balance+amount;

   }
    // Method to withdraw amount from the account
    void withdraw(int amount){
        balance = balance - amount;
        if(balance>=amount){     // first check the current balance
            System.out.println("Money taken out");
        }
        else {
            System.out.println("Insufficient funds");
        }

    }
}
class Process {
    public static void main(String[] args) {

// create object of class bankaccount
        BankAccount bankAccount = new BankAccount("Purnima","SavingsAccount",50000);
       // bankAccount.deposit(5000);
        bankAccount.withdraw(50000);    // performing a withdrow
        System.out.println(bankAccount.balance);

        String status;
// checking minimum balance
        status = (bankAccount.balance>=5000)? "Minimum Balance Maintained": "Minimum Balance not Maintained";

        System.out.println(status);


    }

}

