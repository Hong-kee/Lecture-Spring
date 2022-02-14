package kosta.bank;

public class Customer {

    private String ID;
    private String name;
    private Account account;

    public Customer() {}

    public Customer(String ID, String name, Account account) {
        this.ID = ID;
        this.name = name;
        this.account = account;
    }

    public String getId() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
