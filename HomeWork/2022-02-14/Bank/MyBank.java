package kosta.bank;

public class MyBank {

    private static Customer[] customers = new Customer[100];
    private int customersNum;

    public MyBank() {}

    public MyBank(int customersNum) {
        this.customersNum = customersNum;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public int getCustomersNum() {
        return customersNum;
    }

    public void setCustomersNum(int customersNum) {
        this.customersNum = customersNum;
    }

    public void addCustomer(String ID, String name, long balance) {
        customers[customersNum++] = new Customer(ID, name, new Account(ID, balance));
    }

    public Customer getCustomer(String ID) {
        for (Customer customer : customers) {
            if (customer == null) return null;
            else if (ID.equals(customer.getId())) return customer;
        }
        return null;
    }

    public Customer[] getAllCustomer() {
        return customers;
    }
}
