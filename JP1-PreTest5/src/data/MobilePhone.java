package data;

import java.util.Scanner;

public class MobilePhone extends Product {

    public String brand;
    public int year, qoh;

    public MobilePhone() {
    }

    public MobilePhone(String brand, int year, int qoh) {
        this.brand = brand;
        this.year = year;
        this.qoh = qoh;
    }

    public MobilePhone(String brand, int year, int qoh, String id, String name, int price) {
        super(id, name, price);
        this.brand = brand;
        this.year = year;
        this.qoh = qoh;
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept();
        while (true) {
            try {
                System.out.print("Nhap brand: ");
                brand = sc.nextLine();
                if ("Iphone".equals(brand)
                        || "Samsung".equals(brand)
                        || "Motorola".equals(brand)
                        || "Nokia".equals(brand)) {
                    break;
                } else {
                    System.out.println("Brand belongs to [ Iphone, Samsung, Motorola, Nokia ]");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap Year: ");
                year = Integer.parseInt(sc.nextLine());
                if (year < 2000) {
                    System.out.println("Year must be from 2000 ultil now !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap quantity-on-hand: ");
                qoh = Integer.parseInt(sc.nextLine());
                if (qoh < 0 || qoh > 30) {
                    System.out.println("Qoh must be between 0 and 30 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    @Override
    public void printInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Qoh: " + qoh);
        System.out.println("Amount: " + (price * qoh));
        System.out.println("----------");
    }

    @Override
    public String toString() {
        return "Phone ["
                + "Id: " + id
                + ", Name: " + name
                + ", Price: " + price
                + ", Brand: " + brand
                + ", Year: " + year
                + ", Qoh: " + qoh
                + ", Amount: " + (price * qoh)
                + "]";
    }

}
