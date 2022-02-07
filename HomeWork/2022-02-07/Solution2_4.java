package kosta.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution2_4 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int n;
    private static int[] fibo;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        fibo = new int[n];
        fibo[0] = 1; fibo[1] = 1;

        for (int i = 2; i < n; i++) fibo[i] = fibo[i - 1] + fibo[i - 2];
        System.out.println(Arrays.toString(fibo));
    }
}
