package basic;

import java.util.Date;
import java.util.Scanner;

public abstract class Student {

    protected String id, name;
    protected int yob;
    Date d = new Date();
    int currentYear = d.getYear() + 1900;

    public Student() {
    }

    public Student(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    public abstract void print();

    public void input() {
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
                int age = currentYear - yob;
                if (age < 14 || age > 61) {
                    System.out.println("Age must be between 15 and 60 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
