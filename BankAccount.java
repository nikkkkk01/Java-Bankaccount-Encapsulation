package myPackage;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance = 0;

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && accountNumber.matches("\\d{8}")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number must be exactly 8 digits.");
        }
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Account holder name cannot be empty.");
        }
    }

 
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₱" + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 100) {
            balance -= amount;
            System.out.println("Withdrew: ₱" + amount);
        } else {
            System.out.println("Error: Withdrawal denied. Balance must stay above ₱100.");
        }
    }

   
    public String getAccountDetails() {
        return "Account Number: " + accountNumber + "\n"
                + "Account Holder: " + accountHolder + "\n"
                + "Balance: ₱" + balance;
    }
}
