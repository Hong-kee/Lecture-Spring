package kosta.video;

import java.io.*;

public class Video {
    //비디오 번호, 제목, 주연 배우
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int videoNumber;
    private String title;
    private String mainActor;

    //Default Constructor
    public Video() throws IOException {
        System.out.print("회원이 대여한 비디오 번호 : "); this.videoNumber = Integer.parseInt(br.readLine());
        System.out.print("회원이 대여한 비디오 제목 : "); this.title = br.readLine();
        System.out.print("회원이 대여한 비디오 주인공 : "); this.mainActor = br.readLine();
        System.out.println();
        br.close();
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public int getVideoNumber() {
        return videoNumber;
    }
}
