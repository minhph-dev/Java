package data;

import java.util.Date;
import java.util.Scanner;

public class Member extends Person {

    public String type;
    Date d = new Date();
    int currentYear= d.getYear()+1900; 
    
    public Member() {
    }

    public Member(String type) {
        this.type = type;
    }

    public Member(String type, String id, String name, int yob) {
        super(id, name, yob);
        this.type = type;
    }

    @Override
    public void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept();
        while (true) {
            try {
                System.out.print("Nhap type :");
                type = sc.nextLine();
                if ("VIP".equals(type) || "GOLD".equals(type) || "STANDARK".equals(type)) {
                    break;
                } else {
                    System.out.println("Type belongs to ['VIP','GOLD','STANDARD']");
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
        System.out.println("Age: " + (currentYear - yob));
        System.out.println("Type: " + type);
    }

    @Override
    public String toString() {
        return "Member ["
                + "Id: " + id
                + ", Name: " + name
                + ", Age: " + (currentYear - yob)
                + ", Type: " + type
                + "]";
    }
}
