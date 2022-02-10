package kosta.oop;

import java.io.*;

public class PhoneBookMain {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PhoneBookManager phoneBookManager = new PhoneBookManager();

    public static void main(String[] args) throws IOException {

        while (true) {
            System.out.println("1 : 추가 / 2 : 전체 출력 / 3 : 검색 / 4 : 전화번호 수정 / 5 : 삭제 / 6 : 종료");
            int number = Integer.parseInt(br.readLine());

            switch (number) {
                case 1 -> phoneBookManager.addInformation();
                case 2 -> phoneBookManager.printAll();
                case 3 -> phoneBookManager.searchPerson();
                case 4 -> phoneBookManager.updatePhoneInfo();
                case 5 -> phoneBookManager.deletePhoneInfo();
                case 6 -> System.out.print("종료!");
            }
        }
    }
}
