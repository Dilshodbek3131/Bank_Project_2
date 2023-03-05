package BankServices;

import java.util.*;
import java.util.stream.IntStream;


public class Account {
    private int code;
    private String ownerName;
    private int date;
    private double amount;
    private List<Operation> operations = new ArrayList<>();
    private List<Deposit> deposits = new ArrayList<>();
    private List<Withdrawal> withdrawals = new ArrayList<>();

    public Account(int code, int date, String ownerName, double amount) {
        this.code = code;
        this.date = date;
        this.ownerName = ownerName;
        this.amount = amount;

        Deposit deposit = new Deposit(date,amount);
        operations.add(deposit);
        deposits.add(deposit);

    }

    public double getAmount() {
        return amount;
    }

    public int getCode() {return code;
    }

    public List<Operation> getMovements() {
        IntStream operation_sorted = operations.stream().mapToInt(Operation::getDate).sorted();
        return operations;
//         getMovements() sanalar bo'yicha tartiblangan hisobda bajarilgan barcha operatsiyalar ro'yxatini qaytaradi;
    }

    public List<Deposit> getDeposits() {
        IntStream deposit_sorted = deposits.stream().mapToInt(Deposit::getDate).sorted();

        return deposits;
    }

    public List<Withdrawal> getWithdrawals() {
        IntStream withdrawal_sorted = withdrawals.stream().mapToInt(Withdrawal :: getDate);
        return withdrawals;
    }

    public void deposit(int date, double value) {
        if (date > this.date) this.date = date;
        amount += value;
        Deposit deposit = new Deposit(this.date, amount);
        operations.add(deposit);
        deposits.add(deposit);
    }

    public void withdraw(int date, double value) {
        if (date > this.date) this.date = date;
        amount -= value;
        Withdrawal withdrawal = new Withdrawal(this.date, amount);
        operations.add(withdrawal);
        withdrawals.add(withdrawal);
    }

    @Override
    public String toString() {
        return code + "," + ownerName + "," + date + "," + amount;
    }
}
