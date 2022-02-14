package kosta.order;

import java.io.*;
import java.util.*;

public class OrderMain {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static List<Order> orderList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        while(true) {
            System.out.print("1.추가 / 2. 출력 / 3. 종료 : ");
            int number = Integer.parseInt(br.readLine());

            if (number == 1) {
                Order order = new Order();
                orderList.add(order);
            }
            else if (number == 2) {
                for (Order order : orderList) order.printAll();
            }
            else break;
        }
    }
}
