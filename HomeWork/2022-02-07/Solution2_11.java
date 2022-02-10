package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2_11 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int[][] board;
    private static boolean[][] checkClass;
    private static int n, answer = 0, cntTemp = 0;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        board = new int[n][5];
        checkClass = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (board[k][i] == board[j][i]) {
                        checkClass[k][j] = true;
                        checkClass[j][k] = true;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                if (checkClass[i][j]) ++cnt;
            }

            if (cnt > cntTemp) {
                cntTemp = cnt;
                answer = i;
            }
        }
        System.out.println(answer + 1);
    }
}
