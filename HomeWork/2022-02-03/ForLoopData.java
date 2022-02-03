package kosta.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoopData {

    private static int number, cnt, blank, value, p;
    private static String playNumber;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int[][] board;

    public static int getNumber() {
        return number;
    }
    public static String getPlayNumber() {
        return playNumber;
    }
    public static int getCnt() {
        return cnt;
    }
    public static int getBlank() {
        return blank;
    }
    public static int getValue() {
        return value;
    }
    public static BufferedReader getBr() {
        return br;
    }
    public static int[][] getBoard() {
        return board;
    }

    static void inputData() throws IOException {
        System.out.print("실행할 번호를 입력하세요 : ");
        playNumber = br.readLine();
        System.out.print("크기를 입력하세요 : ");
        number = Integer.parseInt(br.readLine());
        board = new int[number][number];
    }
  
    static void playOne() {
        int num = 0;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(++num + " ");
            }
            System.out.println();
        }
    }
  
    static void playTwo() {
        int num = 0;

        for (int i = number - 1; i >= 0; i--) {
            for (int j = 0; j < number; j++) {
                board[i][j] = ++num;
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
  
    static void playThree() {
        int num = 1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
  
    static void playFour() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
  
    static void playFive() {
        int num = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(++num + " ");
            }
            System.out.println();
        }
    }
  
    static void playSix() {
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
  
    static void playSeven() {
        int num = 0;
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(++num + " ");
            }
            System.out.println();
        }
    }
  
    static void playEight() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) System.out.print("*");
            System.out.println();
        }
    }
  
    static void playNine() {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
  
    static void playTen() {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("*");
            System.out.println();
        }
    }
  
    static void playEleven() {
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) System.out.print(" ");
            for (int k = 1; k <= i * 2 -1; k++) System.out.print("*");
            System.out.println();
        }
    }
  
    static void playTwelve() {
        playEleven();
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= i; j++) System.out.print(" ");
            for (int k = 1; k <= (number - i) * 2 - 1; k++) System.out.print("*");
            System.out.println();
        }
    }
  
    static void playThirteen() {
        for (int i = number - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) System.out.print(" ");
            for (int j = 1; j <= (number - i) * 2 - 1; j++) System.out.print("*");
            for (int j = 1; j <= i * 2; j++) System.out.print(" ");
            for (int j = 1; j <= (number - i) * 2 - 1; j++) System.out.print("*");
            for (int j = 1; j <= i; j++) System.out.print(" ");
            System.out.println();
        }
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= i; j++) System.out.print(" ");
            for (int j = 1; j <= (number - i) * 2 - 1; j++) System.out.print("*");
            for (int j = 1; j <= i * 2; j++) System.out.print(" ");
            for (int j = 1; j <= (number - i) * 2 - 1; j++) System.out.print("*");
            for (int j = 1; j <= i; j++) System.out.print(" ");
            System.out.println();
        }
    }
  
    static void playFourteen() {
        cnt = number * 2 -1; blank = 1;
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) System.out.print(" ");
            for (int j = 1; j <= blank; j++) System.out.print("*");
            for (int j = 1; j <= (i - 1) * 2; j++) System.out.print(" ");
            for (int j = 1; j <= cnt; j++) System.out.print("*");
            for (int j = 1; j <= (i - 1) * 2; j++) System.out.print(" ");
            for (int j = 1; j <= blank; j++) System.out.print("*");
            for (int j = 1; j <= i - 1; j++) System.out.print(" ");
            cnt += 2; blank += 2;
            System.out.println();
        }
    }
  
    static void playFifteen() {
        //playEleven();
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number * 4 - 2; j++) System.out.print(" ");
            for (int k = 1; k <= i * 2 -1; k++) System.out.print("*");
            System.out.println();
        }
        //playFourteen();
        cnt = number * 2 + 1; blank = 1;
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) System.out.print(" ");
            for (int j = 1; j <= blank; j++) System.out.print("*");
            for (int j = 1; j <= (i - 1) * 2; j++) System.out.print(" ");
            for (int j = 1; j <= cnt; j++) System.out.print("*");
            for (int j = 1; j <= (i - 1) * 2; j++) System.out.print(" ");
            for (int j = 1; j <= blank; j++) System.out.print("*");
            for (int j = 1; j <= i - 1; j++) System.out.print(" ");
            cnt += 2; blank += 2;
            System.out.println();
        }
    }
  
    static void playSixteen() {
        for (int i = 1; i <= number + 2; i++) {
            if (i == 1 || i == number + 2)
                for (int j = 1; j <= number + 2; j++) System.out.print("$");
            else {
                System.out.print("$");
                for (int j = 1; j <= number; j++) System.out.print("*");
                System.out.print("$");
            }
            System.out.println();
        }
    }
  
    static void playSeventeen() {
        cnt = 0;
        for (int i = 1; i <= number * 2 + 3; i++) {
            if (i == 1 || i == number * 2 + 3) System.out.print("*");
            else if (i == 2 || i == number * 2 + 2) System.out.print("**");
            else {
                if (i > number + 2) cnt--;
                else cnt++;

                System.out.print("*");
                for (int j = 1; j <= cnt; j++) System.out.print("@");
                System.out.print("*");
            }

            System.out.println();
        }
    }
  
    static void playEighteen() {
        for (int i = 1; i <= number; i++) {
            value = i;
            for (int j = 1; j <= number; j++) {
                System.out.print(value++ + " ");
            }
            System.out.println();
        }
    }
  
    static void playNineteen() {
        for (int i = 1; i <= number; i++) {
            value = i;
            for (int j = 1; j <= number; j++) {
                if (value - 1 == number) value = 1;
                System.out.print(value++ + " ");
            }
            System.out.println();
        }
    }
  
    static void playTwenty() {
        value = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = i; j < number; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(value++ + " ");
            System.out.println();
        }
    }
}
