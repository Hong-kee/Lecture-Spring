package kosta.mission2;

import java.io.*;
import java.util.*;

public class Solution2_2 {

    private static int n, maxHeight = -1;
    private static int[] arr;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        Solution2_2 s = new Solution2_2();

        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        System.out.print(s.solution());
    }

    public int solution() {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += arr[i] > maxHeight ? 1 : 0;
            maxHeight = Math.max(maxHeight, arr[i]);
        }
        return answer;
    }
}
