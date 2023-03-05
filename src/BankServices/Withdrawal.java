package BankServices;

public class Withdrawal extends Operation {

    public Withdrawal(int date, double amount) {
        super(date, amount);
    }

    @Override
    public String toString() {
        return super.getDate() + "," + super.getAmount() + "-";
    }
}


