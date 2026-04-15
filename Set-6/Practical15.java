package set;

class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;

    public BankAccount() {
        balance = 1000.00;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if ((balance - amount) < 1000) { // minimum balance must be 1000
            throw new NotSufficientFundException("Not Sufficient Fund");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        }
    }
}

public class Practical15 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(1000.00);

        try {
            acc.withdraw(400.00); 
            acc.withdraw(300.00); 
            acc.withdraw(500.00); 

        } catch (NotSufficientFundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
