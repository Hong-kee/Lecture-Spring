package kosta.member;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MemberMain {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n;

    public static void main(String[] args) throws IOException {

        System.out.print("등록 회원 수를 입력하세요 : ");
        n = Integer.parseInt(br.readLine());
        List<Member> members = new ArrayList<>();

        while (n --> 0) {
            System.out.print("포지션을 입력하세요 : ");
            String position = br.readLine();
            System.out.print("회원 이름, 나이, 주소를 입력하세요 : ");
            st = new StringTokenizer(br.readLine());

            if ("투수".equals(position))
                members.add(new Pitcher(position, st.nextToken(), Integer.parseInt(st.nextToken()), st.nextToken()));
            else if ("타자".equals(position))
                members.add(new Batter(position, st.nextToken(), Integer.parseInt(st.nextToken()), st.nextToken()));
            System.out.println();
        }
        for (Member member : members) member.printMemberInformation();
    }
}
