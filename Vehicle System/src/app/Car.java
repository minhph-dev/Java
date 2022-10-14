package app;

import data.Vehicle;
import java.util.Scanner;

public class Car extends Vehicle {

    private String GPS;
    Scanner sc = new Scanner(System.in);

    public Car() {
    }

    public Car(String GPS) {
        this.GPS = GPS;
    }

    public Car(String GPS, String id, String name, String brand, int speed, int weight, int price) {
        super(id, name, brand, speed, weight, price);
        this.GPS = GPS;
    }

    @Override
    protected void accept() {
        super.accept();
        while (true) {
            try {
                System.out.print("Do you want GPS ? ");
                GPS = sc.nextLine();
                if ("true".equals(GPS) || "false".equals(GPS)) {
                    break;
                } else {
                    System.out.println("GPS must be value 'true' or 'false' !!!");

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "Car ["
                + "Id: " + id
                + ", Name: " + name
                + ", Brands: " + brand
                + ", Speed: " + speed
                + ", Weight: " + weight
                + ", Price: " + price
                + ", GPS: " + GPS
                + "]";
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("GPS: " + GPS);
        System.out.println("----------");
    }

    public boolean isGPS() {
        if ("true".equals(GPS)) {
            return true;
        } else {
            return false;
        }
    }

    public int getPrice() {
        return price;
    }

}
