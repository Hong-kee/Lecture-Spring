package kosta.oop;

/**
 * 상태 : 계좌번호, 계좌주, 잔액 => 변수 / 기능 : 입금하다, 출금하다 => 메서드
 */

public class Account {
    //멤버 변수 : 필드 (객체 생성될 때, 객체가 소멸)
    private String accountNo;
    private String ownerName;
    private int balance;

    public Account() {}

    public Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //getters, setters
    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //기능 구현 -> 메서드로 표현
    //입금하다.
    public void deposit(int amount) {
        balance += amount;
    }

    //출금하다.
    public int withdraw(int amount) throws Exception{
        if (balance < amount) throw new Exception("잔액 부족");
        balance -= amount;
        return balance;
    }

    //계좌정보 초기화
    public void initInformation(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    //계좌 정보 출력하기
    public void printInformation() {
        System.out.println("계좌 번호 : " + accountNo);
        System.out.println("계좌주 : " + ownerName);
        System.out.println("계좌 잔액 : " + balance);
        System.out.println();
    }
}
