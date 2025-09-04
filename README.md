# Laboratory 2 on OOP – BankAccount Encapsulation

This repository contains my solution for **LABORATORY 2 ON OOP** in Java.  
The activity demonstrates the concept of **encapsulation** by implementing a simple `BankAccount` class with private attributes, getters/setters, and validation rules.

---

## 📌 Features
- Private attributes:  
  - `accountNumber` (must be exactly 8 digits)  
  - `accountHolder` (cannot be empty)  
  - `balance` (starts at 0)  
- Validations inside setter methods  
- Deposit method that only accepts positive amounts  
- Withdraw method that prevents balance from going below ₱100  
- Displays account details after transactions  

---

## 📂 Project Structure

myPackage/
├── BankAccount.java
└── Main.java

- **BankAccount.java** → Class definition with encapsulation and validations.  
- **Main.java** → Runs test cases (invalid/valid account number, deposits, withdrawals).  

---

## 🖥️ Sample Output

Error: Account number must be exactly 8 digits.

Account number set successfully.

Account holder set successfully.

Deposit successful: ₱5000.0

Error: Withdrawal would bring balance below ₱100.

Withdraw successful: ₱1500.0

Account Number: 12345678
Account Holder: Juan Dela Cruz
Balance: ₱3500.0
