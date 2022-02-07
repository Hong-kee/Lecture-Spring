package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2_3 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    private static StringTokenizer st;
    private static int[][] arr;
    private static int n;

    public static void main(String[] args) throws IOException {

        Solution2_3 s = new Solution2_3();
        n = Integer.parseInt(br.readLine());
        arr = new int[2][n];

        for (int i = 0; i < 2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(s.solution());
    }

    public StringBuilder solution() {
        for (int i = 0; i < n; i++) {
            int value = arr[0][i] - arr[1][i];

            if (value == 0) sb.append("D").append('\n');
            else if (value == -1 || value == 2) sb.append("B").append('\n');
            else sb.append("A").append('\n');
        }
        return sb;
    }
}
