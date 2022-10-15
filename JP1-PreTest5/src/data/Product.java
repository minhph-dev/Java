package data;

import java.util.Scanner;

public abstract class Product {

    public String id, name;
    public int price;

    public Product() {
    }

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap Id: ");
                id = sc.nextLine();
                if (id.isBlank() || id.isEmpty()) {
                    System.out.println("Id cannot null !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap Name: ");
                name = sc.nextLine();
                if (name.isBlank() || name.isEmpty()) {
                    System.out.println("Name cannot null !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap Price: ");
                price = Integer.parseInt(sc.nextLine());
                if (price <=0 ) {
                    System.out.println("Price must be > 0 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public abstract void printInfo();

}
