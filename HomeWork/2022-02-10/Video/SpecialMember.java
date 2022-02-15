package kosta.video;

import java.io.IOException;

public class SpecialMember extends GeneralMember{

    private int bonusPoint;
    private String grade;

    public SpecialMember() throws IOException {}

    public SpecialMember(int bonusPoint) throws IOException {
        this.bonusPoint = bonusPoint * 10 / 100;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }
    
    //출력
    @Override
    public void printAll() {
        super.printAll();
        System.out.println("보너스 포인트 : " + bonusPoint);
        System.out.println("현재 회원님의 등급은 " + checkGrade() + "입니다.");
        System.out.println();
    }

    //등급 측정
    public String checkGrade() {
        if (bonusPoint >= 100) grade = "VIP";
        else if (bonusPoint >= 90) grade = "A";
        else if (bonusPoint >= 80) grade = "B";
        else if (bonusPoint >= 70) grade = "C";
        else grade = "D";

        return grade;
    }
}
