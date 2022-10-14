package data;

import java.util.Scanner;

public class Vehicle {

    protected String id, name, brand;
    protected int speed, weight, price;
    Scanner sc = new Scanner(System.in);

    public Vehicle() {
    }

    public Vehicle(String id, String name, String brand, int speed, int weight, int price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.speed = speed;
        this.weight = weight;
        this.price = price;
    }

    protected void accept() {
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
                System.out.print("Nhap Brand: ");
                brand = sc.nextLine();
                if (brand.isEmpty() || brand.isBlank()) {
                    System.out.println("Brand cannot null !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap Speed: ");
                speed = Integer.parseInt(sc.nextLine());
                if (speed <= 0) {
                    System.out.println("Speed must be > 0 !!!");
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
                if (price <= 0) {
                    System.out.println("Price must be > 0 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

}
