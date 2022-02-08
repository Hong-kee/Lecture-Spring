package kosta.oop;

public class Board {

    private String title;
    private String name;
    private String contents;

    public Board(String title, String name, String contents) {
        this.title = title;
        this.name = name;
        this.contents = contents;
    }

    //글 목록 출력
    public void printBoard() {
        System.out.println("글 제목 : " + title);
        System.out.println("작성자 : " + name);
        System.out.println("글 내용 : " + contents);
        System.out.println();
    }
}
