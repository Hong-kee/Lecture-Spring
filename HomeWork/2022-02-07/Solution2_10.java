package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2_10 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n, answer = 0;
    private static int[][] map;
    private static int[][] dir = {{-1,0}, {0,1}, {1,0}, {0,-1}};

    public static void main(String[] args) throws IOException {

        Solution2_10 s = new Solution2_10();

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) answer += s.solution(i, j);
        }
        System.out.println(answer);
    }

    public int solution(int y, int x) {
        for (int i = 0; i < 4; i++) {
            int my = y + dir[i][0];
            int mx = x + dir[i][1];

            if (inBound(my, mx)) continue;
            if (map[y][x] <= map[my][mx]) return 0;
        }
        return 1;
    }

    public boolean inBound(int y, int x) {
        return y < 0 || y == n || x < 0 || x == n;
    }

}
