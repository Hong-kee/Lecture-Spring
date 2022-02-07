package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution2_7 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static int n, answer = 0;

    public static void main(String[] args) throws IOException {

        Solution2_7 s = new Solution2_7();
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (Integer x : s.solution()) answer += s.calculate(x);
        System.out.println(answer);
    }

    public ArrayList<Integer> solution() {
        int value = 0;
        for (int i = 0; i < n; i++) {
            if (st.nextToken().equals("1")) value++;
            else {
                arrayList.add(value);
                value = 0;
            }
        }
        if (value != 0) arrayList.add(value);
        return arrayList;
    }

    public int calculate(int num) {
        return num * (num + 1) / 2;
    }
}
