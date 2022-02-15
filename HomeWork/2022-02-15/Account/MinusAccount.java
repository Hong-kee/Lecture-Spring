package kosta.oop;

public class MinusAccount extends Account{

    private int creditLine;//마이너스 한도

    public MinusAccount() {}

    public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
        super(accountNo, ownerName, balance);
        this.creditLine = creditLine;
    }

    //Account에 있는 withdraw 메서드는 부적합하다. 따라서 재정의가 필요하다.
    //메서드 오버라이딩 : 부모의 메서드의 시그니처와 일치해야한다.
    //리턴형, 메서드 이름, 파라미터(갯수, 데이터형), 예외가 같아야 한다.

    @Override
    public int withdraw(int amount) throws Exception{
        if (getBalance() + creditLine < amount) throw new Exception("잔액 부족");
        int balance = getBalance();
        setBalance(balance - amount);
        return amount;
    }
}
