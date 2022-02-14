package kosta.order;

import java.io.*;

public class Product {

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String productName;
    private int productPrice;

    public Product() throws IOException {
        System.out.print("제품 이름을 입력하세요 : ");
        this.productName = br.readLine();
        System.out.print("제품 가격을 입력하세요 : ");
        this.productPrice = Integer.parseInt(br.readLine());
    }

    public Product(String name, int price) {
        this.productName = name;
        this.productPrice = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}
