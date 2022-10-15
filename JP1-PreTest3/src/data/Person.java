package data;

import java.util.Scanner;

public abstract class Person {

    public String id, name;
    public int yob;

    public Person() {
    }

    public Person(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
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
                System.out.print("Nhap year of birth :");
                yob = Integer.parseInt(sc.nextLine());
                if (yob < 1940 || yob > 2006) {
                    System.out.println("Yob must be range [1940 - 2006] !!!");
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
