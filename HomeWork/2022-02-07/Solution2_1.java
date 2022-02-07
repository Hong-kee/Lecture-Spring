package kosta.mission2;

import java.io.*;
import java.util.*;

public class Solution2_1 {

    private static int n;
    private static int[] arr;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Solution2_1 s = new Solution2_1();
        n = Integer.parseInt(br.readLine());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int x : s.solution()) System.out.print(x + " ");
    }

    public ArrayList<Integer> solution() {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }
        return answer;
    }
}
