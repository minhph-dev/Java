package Goods;

import java.util.Scanner;

public abstract class Computer {

    public String id, name;
    public int price;

    public Computer() {
    }

    public Computer(String id, String name, int price) {
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
                if (id.isEmpty() || id.isBlank()) {
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
                if (name.isEmpty() || name.isBlank()) {
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
                if (price<0) {
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
