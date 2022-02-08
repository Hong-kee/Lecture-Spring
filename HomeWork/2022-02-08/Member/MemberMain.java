package kosta.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MemberMain {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n;

    public static void main(String[] args) throws IOException {

        System.out.print("등록 회원 수를 입력하세요 : ");
        n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            System.out.print("회원 이름, 나이, 주소를 입력하세요 : ");
            st = new StringTokenizer(br.readLine());
            members[i] = new Member(st.nextToken(), Integer.parseInt(st.nextToken()), st.nextToken());
            System.out.println();
        }

        //for (int i = 0; i < n; i++) members[i].printMemberInformation();
        for (Member member : members) member.printMemberInformation();
    }
}
