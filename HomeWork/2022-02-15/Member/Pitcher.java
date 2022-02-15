package kosta.member;

import java.io.IOException;

public class Pitcher extends BaseballMember{

    private String breakingBall;
    private int velocity;

    public Pitcher() {}

    public Pitcher(String position, String name, int age, String address) throws IOException {
        super(position, name, age, address);
        System.out.print("메인 변화구를 입력하세요 : ");
        this.breakingBall = getBufferedReader().readLine();
        System.out.print("최고 구속을 입력하세요 : ");
        this.velocity = Integer.parseInt(getBufferedReader().readLine());
    }

    public String getBreakingBall() {
        return breakingBall;
    }

    public void setBreakingBall(String breakingBall) {
        this.breakingBall = breakingBall;
    }


    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    //출력
    @Override
    public void printMemberInformation() {
        super.printMemberInformation();
        System.out.println("[메인 변화구] : " + breakingBall);
        System.out.println("[최고 구속] : " + velocity + " km/h");
        System.out.println();
    }
}
