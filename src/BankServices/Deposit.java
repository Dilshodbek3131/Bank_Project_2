package BankServices;

public class Deposit extends Operation{
    public Deposit(int date, double amount) {
        super(date, amount);
    }

    public String toString() {
        return super.getDate() + "," + super.getAmount() + "+";
    }
}


