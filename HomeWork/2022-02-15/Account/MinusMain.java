package kosta.oop;

public class MinusMain {

    public static void main(String[] args) {

        MinusAccount minusAccount = new MinusAccount("111", "박길동",5000,10000);

        try {
            minusAccount.withdraw(12000);
        }catch (Exception e) {
            e.printStackTrace();
        }

        minusAccount.printInformation();
    }
}
