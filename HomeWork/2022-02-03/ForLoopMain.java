package kosta.homework;

import java.io.IOException;

public class ForLoop1 extends ForLoopData{

    public static void main(String[] args) throws IOException {

        while(true) {
            inputData();
            if (playTheForLoop()) return;
        }
    }
  
    private static boolean playTheForLoop() {
        switch (getPlayNumber()) {
            case "0":
                System.out.println("종료!");
                return true;
            case "1-1": playOne(); break;
            case "1-2": playTwo(); break;
            case "1-3": playThree(); break;
            case "1-4": playFour(); break;
            case "1-5": playFive(); break;
            case "1-6": playSix(); break;
            case "1-7": playSeven(); break;

            case "2-1": playEight(); break;
            case "2-2": playNine(); break;
            case "2-3": playTen(); break;
            case "2-4": playEleven(); break;
            case "2-5": playTwelve(); break;
            case "2-6": playThirteen(); break;
            case "2-7": playFourteen(); break;
            case "2-8": playFifteen(); break;
            case "2-9": playSixteen(); break;
            case "2-10": playSeventeen(); break;

            case "1-8": playEighteen(); break;
            case "1-9": playNineteen(); break;
            case "1-10": playTwenty(); break;

            default: System.out.println("그런 번호는 없습니다.");
        }
        return false;
    }
}
