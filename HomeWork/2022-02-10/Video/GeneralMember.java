package kosta.video;

import java.io.*;

public class GeneralMember {
    //회원 아이디, 회원 이름, 회원 주소
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String memberId;
    private String memberName;
    private String memberAddress;
    private Video video;

    //Default Constructor
    public GeneralMember() throws IOException {
        System.out.print("회원의 아이디 : "); this.memberId = br.readLine();
        System.out.print("회원의 이름 : "); this.memberName = br.readLine();
        System.out.print("회원의 주소 : "); this.memberAddress = br.readLine();
        this.video = new Video();
    }

    //getters
    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public Video getVideo() {
        return video;
    }

    //출력 메서드
    public void printAll() {
        System.out.println("회원의 아이디 : " + getMemberId());
        System.out.println("회원의 이름 : " + getMemberName());
        System.out.println("회원의 주소 : " + getMemberAddress());
        System.out.println("회원이 대여한 비디오 번호 : " +  getVideo().getVideoNumber());
        System.out.println("회원이 대여한 비디오 제목 : " +  getVideo().getTitle());
        System.out.println("회원이 대여한 비디오 주인공 : " + getVideo().getMainActor());
        System.out.println();
    }
}
