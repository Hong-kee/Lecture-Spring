package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2_9 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n;
    private static int[][] board;

    public static void main(String[] args) throws IOException {

        Solution2_9 s = new Solution2_9();

        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }
        System.out.print(s.solution(n));
    }

    public int solution(int n) {
        int value = 0, answer = -1;

        //가로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) value += board[i][j];
            answer = Math.max(answer, value);
            value = 0;
        }

        //세로
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) value += board[j][i];
            answer = Math.max(answer, value);
            value = 0;
        }

        //대각
        for (int i = 0; i < n; i++) value += board[i][i];
        answer = Math.max(answer, value);
        value = 0;

        for (int i = n - 1; i >= 0; i--) value += board[n - i - 1][i];
        answer = Math.max(answer, value);

        return answer;
    }
}
