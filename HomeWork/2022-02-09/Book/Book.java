package kosta.oop;

import java.util.Scanner;

public class Book {

    private static Scanner sc = new Scanner(System.in);
    private String title;
    private int price;
    private int discountPrice;

    //Default Constructor
    public Book() {}

    //Constructor Overloading
    public Book(String title, int price) {
        System.out.print("책의 제목을 입력해주세요 :");
        title = sc.nextLine();
        System.out.print("책의 가격을 입력해주세요 :");
        price = Integer.parseInt(sc.nextLine());

        this.title = title;
        this.price = price;

        if (price >= 30000) this.discountPrice = price * 75 / 100;
        else if (price >= 20000) this.discountPrice = price * 80 / 100;
        else if (price >= 15000) this.discountPrice = price * 85 / 100;
    }

    //getter
    public int getDiscountPrice() {
        return discountPrice;
    }

    //금액 할인하기
//    public void discountPrice() {
//        if (price >= 30000) this.discountPrice = price * 75 / 100;
//        else if (price >= 20000) this.discountPrice = price * 80 / 100;
//        else if (price >= 15000) this.discountPrice = price * 85 / 100;
//    }

    //가격 출력
    public void printPrice() {
        System.out.println(title + "교재 정가는 " + price + "원 "+ "할인된 가격은 " + discountPrice + "원 입니다.");
    }
}
