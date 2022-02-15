package kosta.member;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Member {

    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private int age;
    private String address;

    public Member() {}

    //Constructor : 객체를 초기화 하기 위해서
    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public void setBufferedReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    //회원 정보 출력
    public void printMemberInformation() {
        System.out.println("[이름] : " + name);
        System.out.println("[나이] : " + age);
        System.out.println("[주소] : " + address);
    }
} 
