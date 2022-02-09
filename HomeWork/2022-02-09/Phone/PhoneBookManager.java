package kosta.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBookManager {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PhoneBook[] phoneBook = new PhoneBook[100];
    private static int index = 0;

    //전화번호 정보 추가 메서드
    public void addInformation() throws IOException {
        System.out.print("이름 : ");
        String name = br.readLine();

        System.out.print("전화번호 : ");
        String phoneNumber = br.readLine();

        System.out.print("생년월일 : ");
        String birthDate = br.readLine();

        phoneBook[index++] = new PhoneBook(name, phoneNumber, birthDate);
        System.out.println("전화번호가 등록되었습니다.");
    }

    //전화번호부에 있는 모든 사람들 출력 메서드
    public void printAll() {
        for (int i = 0; i < index; i++) {
            System.out.println("이름 : " + phoneBook[i].getName());
            System.out.println("전화번호 : " + phoneBook[i].getPhoneNumber());
            System.out.println("생년월일 : " + phoneBook[i].getBirthDate());
        }
        System.out.println("총 " + index + "개의 전화번호부를 출력했습니다.");
    }

    //이름 검색하고 출력하는 메서드
    public void searchPerson() throws IOException{
        System.out.print("검색 이름을 입력하세요 : ");
        String searchName = br.readLine();

        for (int i = 0; i < index; i++) {
            if (phoneBook[i] == null) {
                System.out.println("그런 이름은 없습니다.");
                break;
            }
            else if (phoneBook[i] != null && searchName.equals(phoneBook[i].getName())) {
                System.out.println("이름 : " + phoneBook[i].getName());
                System.out.println("전화번호 : " + phoneBook[i].getPhoneNumber());
                System.out.println("생년월일 : " + phoneBook[i].getBirthDate());
                break;
            }
        }
    }
}
