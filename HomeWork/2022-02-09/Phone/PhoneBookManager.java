package kosta.oop;

import java.io.*;

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

    //이름을 찾아 전화번호를 업데이트 하는 메서드
    public void updatePhoneInfo() throws IOException{
        //이름 입력 => 해당 전화번호부 => 수정 전화번호 입력 받아 => 수정
        System.out.print("이름을 입력하세요 : ");
        String searchName = br.readLine();

        for (int i = 0; i < index; i++) {
            if (searchName.equals(phoneBook[i].getName())) {
                System.out.print("수정 전화번호를 입력하세요 : ");
                String updateNumber = br.readLine();
                phoneBook[i].setPhoneNumber(updateNumber);
                break;
            }
        }
    }

    //이름을 찾아 전화번호부 삭제하는 메서드
    public void deletePhoneInfo() throws IOException{
        System.out.print("삭제할 이름을 입력하세요 : ");
        String deleteName = br.readLine();

        for (int i = 0; i < index; i++) {
            if (deleteName.equals(phoneBook[i].getName())) {
                phoneBook[i] = null;
                for (int j = i + 1; j < index; j++) phoneBook[i] = phoneBook[j];
                System.out.println("삭제하였습니다.");
                --index;
            }
        }
    }
}
