package kosta.homework;

import java.io.IOException;

public class ForLoop1 extends ForLoopData{

    public static void main(String[] args) throws IOException {

        ForLoopData forLoopData = new ForLoopData();

        while(true) {
            forLoopData.inputData();
            if (playTheForLoop(forLoopData)) return;
        }

    }
    public static boolean playTheForLoop(ForLoopData forLoopData) {
        switch (getPlayNumber()) {
            case "0":
                System.out.println("종료!");
                return true;
            case "1-1": forLoopData.playOne(); break;
            case "1-2": forLoopData.playTwo(); break;
            case "1-3": forLoopData.playThree(); break;
            case "1-4": forLoopData.playFour(); break;
            case "1-5": forLoopData.playFive(); break;
            case "1-6": forLoopData.playSix(); break;
            case "1-7": forLoopData.playSeven(); break;

            case "2-1": forLoopData.playEight(); break;
            case "2-2": forLoopData.playNine(); break;
            case "2-3": forLoopData.playTen(); break;
            case "2-4": forLoopData.playEleven(); break;
            case "2-5": forLoopData.playTwelve(); break;
            case "2-6": forLoopData.playThirteen(); break;
            case "2-7": forLoopData.playFourteen(); break;
            case "2-8": forLoopData.playFifteen(); break;
            case "2-9": forLoopData.playSixteen(); break;
            case "2-10": forLoopData.playSeventeen(); break;

            case "1-8": forLoopData.playEighteen(); break;
            case "1-9": forLoopData.playNineteen(); break;
            case "1-10": forLoopData.playTwenty(); break;

            default: System.out.println("그런 번호는 없습니다.");
        }
        return false;
    }
}
