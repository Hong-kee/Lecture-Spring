package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2_8 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int[] arr;
    private static int n;

    public static void main(String[] args) throws IOException {

        Solution2_8 s = new Solution2_8();

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        System.out.println(s.solution());
    }

    public String solution() {
        String ranking = "";
        int rank = 1;

        for (int i = 0; i < n; i++) {
            rank = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (arr[i] < arr[j]) rank++;
            }
            ranking += rank + " ";
        }
        return ranking;
    }
}
