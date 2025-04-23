


    
abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class FixedDeposit extends Account {
    double interestRate;
    int years;

    FixedDeposit(double balance, double interestRate, int years) {
        super(balance);
        this.interestRate = interestRate;
        this.years = years;
    }

    @Override
    double calculateInterest() {
        return balance * Math.pow((1 + interestRate / 100), years) - balance;
    }
}

public class Maina {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(10000, 5);
        FixedDeposit fixedDeposit = new FixedDeposit(10000, 6, 3);

        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + fixedDeposit.calculateInterest());
    }
}


