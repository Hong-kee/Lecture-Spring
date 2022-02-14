package kosta.order;

import java.io.*;

public class Order {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String orderId;
    private String orderName;
    private Product product;

    public Order() throws IOException{
        System.out.print("주문 번호를 입력하세요 : ");
        this.orderId = br.readLine();
        System.out.print("주문 이름을 입력하세요 : ");
        this.orderName = br.readLine();
        product = new Product();
    }

    public Order(String orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //출력
    public void printAll() {
        System.out.println("주문 번호 : " + orderId);
        System.out.println("주문 이름 : " + orderName);
        System.out.println("제품 이름 : " + product.getProductName());
        System.out.println("제품 가격 : " + product.getProductPrice());
        System.out.println();
    }
}
