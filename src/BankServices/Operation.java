package BankServices;

public abstract class Operation {
    private int date;
    private double amount;

    public Operation(int date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public int getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }


    public abstract String toString();
}


