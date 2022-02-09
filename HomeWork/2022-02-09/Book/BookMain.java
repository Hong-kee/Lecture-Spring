package kosta.oop;

import java.io.*;

public class BookMain {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, totalPrice = 0;

    public static void main(String[] args) throws IOException {
        System.out.print("책의 갯수를 입력해주세요 : ");
        n = Integer.parseInt(br.readLine());

        Book[] book = new Book[n];

        for (int i = 0; i < n; i++) book[i] = new Book("", 0);

        for (Book bookInfo : book) {
            bookInfo.printPrice();
            totalPrice += bookInfo.getDiscountPrice();
        }
        System.out.println("총 금액 : " + totalPrice + "원");
    }
}
