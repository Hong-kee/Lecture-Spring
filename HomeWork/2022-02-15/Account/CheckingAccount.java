package kosta.oop;

public class CheckingAccount extends Account{

    private String cardNo;

    public CheckingAccount() {}

    public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
        //Super Method : 부모의 생성자를 호출한다. -> 자식에서 부모로 데이터를 하는 목적
        super(accountNo, ownerName, balance);
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int pay(String cardNo, int amount) throws Exception{
        if (!cardNo.equals(this.cardNo) || getBalance() < amount) {
            throw new Exception("결제 불능");
        }
        return withdraw(amount);
    }
}
