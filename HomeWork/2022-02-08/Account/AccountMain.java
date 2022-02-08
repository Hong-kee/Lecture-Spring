package kosta.oop;

public class AccountMain {

    public static void main(String[] args) {
        //객체를 생성(Account)
        Account account1; // 클래스타입(레퍼런스타입) 생성된 객체의 주소값을 담기위한 변수
        account1 = new Account("1111", "키키", 2020);// 인스턴스화(객체 생성), account=>인스턴스 변수

        //인스턴스 변수는 .을 통해서 객체에 접근해서 사용할 수 있다.
        //객체 초기화
        //account1.initInformation("11111-11111", "홍길동", 10000);

        //계좌 정보 출력
        account1.printInformation();

        //Quiz > account2 객체를 생성 후 초기화와 출력을 하고, 중복되는 내용에 대해서는 메서드로 구현해보자.
        Account account2 = new Account("2222", "홍기", 2000);
        //account2.initInformation("2222-2222", "홍기", 20000);

        account2.printInformation();
    }
}
