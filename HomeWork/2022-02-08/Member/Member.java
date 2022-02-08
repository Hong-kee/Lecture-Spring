package kosta.oop;

public class Member {

    private String name;
    private int age;
    private String address;

    //Constructor : 객체를 초기화 하기 위해서
    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //회원 정보 출력
    public void printMemberInformation() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println();
    }
}
