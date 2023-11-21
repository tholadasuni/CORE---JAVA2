package com.cg.darden;

 public class Bank {
    // Base class for both Savings and Current accounts
    abstract static class Account {
        protected String accountHolder;
        protected double balance;

        public Account(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // Abstract method to calculate interest or cash credit
        abstract void calculateInterestOrCashCredit();
        
        // Method to display account information
        void displayAccountInfo() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: $" + balance);
        }
    }

    // Savings Account class
    static class SavingsAccount extends Account {
        private double fixedDeposit;

        public SavingsAccount(String accountHolder, double balance, double fixedDeposit) {
            super(accountHolder, balance);
            this.fixedDeposit = fixedDeposit;
        }

        @Override
        void calculateInterestOrCashCredit() {
            // For simplicity, let's assume a fixed interest rate for savings account
            double interestRate = 0.05;
            double interest = balance * interestRate;
            balance += interest;

            // Add fixed deposit to the balance
            balance += fixedDeposit;
        }
    }

    // Current Account class
    static class CurrentAccount extends Account {
        private double cashCredit;

        public CurrentAccount(String accountHolder, double balance, double cashCredit) {
            super(accountHolder, balance);
            this.cashCredit = cashCredit;
        }

        @Override
        void calculateInterestOrCashCredit() {
            // For simplicity, let's assume a fixed cash credit for current account
            balance += cashCredit;
        }
    }

    public static void main(String[] args) {
        // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount("Saver", 5000, 2000);
        CurrentAccount currentAccount = new CurrentAccount("Spender", 3000, 1000);

        // Calculate interest or cash credit for both accounts
        savingsAccount.calculateInterestOrCashCredit();
        currentAccount.calculateInterestOrCashCredit();

        // Display account information
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountInfo();
        System.out.println();

        System.out.println("Current Account Details:");
        currentAccount.displayAccountInfo();

        // Calculate and display total cash in the bank
        double totalCashInBank = savingsAccount.balance + currentAccount.balance;
        System.out.println("\nTotal Cash in the Bank: $" + totalCashInBank);
    }
}

