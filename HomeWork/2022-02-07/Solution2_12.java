package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2_12 {

    private static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int answer = 0;

        board = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            int mentor = board[1][i];

            for (int j = i + 1; j <= n; j++) {
                int mentee = board[1][j];
                boolean isMentor = true;

                for (int k = 2; k <= m; k++) {
                    for (int l = 1; l <= n; l++) {
                        if (board[k][l] == mentee){
                            isMentor = false;
                            break;
                        }
                        else if (board[k][l] == mentor) break;
                    }
                }

                if (isMentor) ++answer;
            }
        }
        System.out.println(answer);
    }
}
