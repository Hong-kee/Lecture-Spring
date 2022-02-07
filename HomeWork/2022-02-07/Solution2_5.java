package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2_5 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n, answer = 0;

    public static void main(String[] args) throws IOException {

        Solution2_5 s = new Solution2_5();
        n = Integer.parseInt(br.readLine());

        for (int i = 2; i <= n; i++) answer += s.solution(i);
        System.out.println(answer);
    }

    public int solution(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return 0;
        }
        return 1;
    }
}
