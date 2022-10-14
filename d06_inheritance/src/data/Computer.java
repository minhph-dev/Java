package data;

import java.util.Scanner;

public class Computer {

    public String id, brand;
    public int price;

    public Computer() {
    }

    public Computer(String id, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Id: ");
        id = sc.nextLine().trim();
        System.out.print("Nhap Brand: ");
        brand = sc.nextLine().trim();
        System.out.print("Nhap Price: ");
        price = Integer.parseInt(sc.nextLine().trim());
    }

    public void display() {
        System.out.println("=== THONG TIN MAY TINH ===");
        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

}
