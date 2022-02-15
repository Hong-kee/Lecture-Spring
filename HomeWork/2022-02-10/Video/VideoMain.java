package kosta.video;

import java.io.*;

public class VideoMain {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.print("입력 받을 회원 수를 입력하세요 : ");
        int memberCount = Integer.parseInt(br.readLine());

//        GeneralMember[] generalMembers = new GeneralMember[memberCount];
        SpecialMember[] specialMembers = new SpecialMember[memberCount];

//        for (int i = 0; i < memberCount; i++) generalMembers[i] = new GeneralMember();
//        for (int i = 0; i < memberCount; i++) {
//            generalMembers[i].printAll();
//        }

        for (int i = 0; i < memberCount; i++) {
            System.out.print("가격을 입력하세요 : ");
            int price = Integer.parseInt(br.readLine());
            specialMembers[i] = new SpecialMember(price);
        }
        for (int i = 0; i < memberCount; i++) specialMembers[i].printAll();
    }
}
