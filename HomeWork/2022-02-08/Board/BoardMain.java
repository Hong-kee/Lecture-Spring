package kosta.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoardMain {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static int n;

    public static void main(String[] args) throws IOException {
        System.out.print("작성자 수를 입력하세요 : ");
        n = Integer.parseInt(br.readLine());

        Board[] boards = new Board[n];

        for (int i = 0; i < n; i++) {
            System.out.println("글 제목, 작성자, 내용을 입력하세요 : ");
            st = new StringTokenizer(br.readLine());
            boards[i] = new Board(st.nextToken(), st.nextToken(), st.nextToken());
            System.out.println();
        }
        for (Board board : boards) board.printBoard();
    }
}
