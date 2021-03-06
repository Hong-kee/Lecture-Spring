package kosta.bank;

public class Account {

    private String ID;
    private long balance;

    public Account() {}

    public Account(String ID, long balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public boolean withdraw(long amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
