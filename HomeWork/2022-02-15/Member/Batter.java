package kosta.member;

import java.io.IOException;

public class Batter extends BaseballMember{

    private String defense;
    private int lineUp;

    public Batter() {}

    public Batter(String position, String name, int age, String address) throws IOException {
        super(position, name, age, address);
        System.out.print("수비 위치를 입력하세요 : ");
        this.defense = getBufferedReader().readLine();
        System.out.print("타순을 입력하세요 : ");
        this.lineUp = Integer.parseInt(getBufferedReader().readLine());
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public int getLineUp() {
        return lineUp;
    }

    public void setLineUp(int lineUp) {
        this.lineUp = lineUp;
    }

    @Override
    public void printMemberInformation() {
        super.printMemberInformation();
        System.out.println("[수비 위치] : " + defense);
        System.out.println("[타순] : " + lineUp);
        System.out.println();
    }
}
