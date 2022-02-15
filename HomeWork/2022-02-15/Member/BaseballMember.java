package kosta.member;

import java.io.IOException;

public class BaseballMember extends Member{

    private String position;
    private String mainHand;
    private int backNumber;

    public BaseballMember() {}

    public BaseballMember(String position, String name, int age, String address) throws IOException {
        super(name, age, address);
        this.position = position;
        System.out.print("등번호를 입력하세요 : ");
        this.backNumber = Integer.parseInt(getBufferedReader().readLine());
        System.out.print("주 사용 손을 입력하세요[왼손 / 오른손] : ");
        this.mainHand = getBufferedReader().readLine();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public void setBackNumber(int backNumber) {
        this.backNumber = backNumber;
    }

    public String getMainHand() {
        return mainHand;
    }

    public void setMainHand(String mainHand) {
        this.mainHand = mainHand;
    }

    //출력
    @Override
    public void printMemberInformation() {
        super.printMemberInformation();
        System.out.println("[포지션] : " + position);
        System.out.println("[등번호] : " + backNumber);
        System.out.println("[왼손 / 오른손] : " + mainHand);
    }
}
