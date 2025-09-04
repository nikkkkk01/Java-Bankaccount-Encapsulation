package myPackage;

    public class Main {

        public static void main(String[] args) {
            BankAccount myAccount = new BankAccount();

      
            myAccount.setAccountNumber("12345");
       
            myAccount.setAccountNumber("12345678");

        
            myAccount.setAccountHolder("Harry Diaz");

        
            myAccount.deposit(5000);

        
            myAccount.withdraw(4950);

      
            myAccount.withdraw(2000);

        
            System.out.println("\nFinal Account Details:");
            System.out.println(myAccount.getAccountDetails());
    }
}
