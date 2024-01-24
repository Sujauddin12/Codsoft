package Codsoft.java;

public class ATMmachine {
    private double balance;
    private double deposit_Amount;
    private double withdrawAmount;
    public ATMmachine(){

    }
    // getter setter


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit_Amount() {
        return deposit_Amount;
    }

    public void setDeposit_Amount(double deposit_Amount) {
        this.deposit_Amount = deposit_Amount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
