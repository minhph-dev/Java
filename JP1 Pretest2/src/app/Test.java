package app;

import data.Cylinder;
import java.util.Scanner;

public class Test {

    int max = 10, next;
    Cylinder[] cList = new Cylinder[max];

    public void add() {
        if (next == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        Cylinder c = new Cylinder();
        c.accept();
        cList[next] = c;
        next++;
    }

    public void dislay() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === ALL CYLINDERS ===");
        for (int i = 0; i < next; i++) {
            System.out.println(cList[i]);
        }
    }

    public void display(float v) {
         if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int count=0;
        for (int i = 0; i < next; i++) {
            if (cList[i].volume() > v) {
                cList[i].printInfo();
                count++;
            }
        }
        if(count==0){
            System.out.println("Khong co cylinder has volumn > " + v);
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        Test t = new Test();
        String choice = "";
        while (true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Add a new cylinder");
            System.out.println("2. Display all cylinders");
            System.out.println("3. Display all cylinders having required volume");
            System.out.println("4. Exit");
            System.out.print("Vui long chon [1-4]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    t.add();
                    break;
                case "2":
                    t.dislay();
                    break;
                case "3":
                    System.out.print(" Do you want Cylinder have volumn > ");
                    float v = Float.parseFloat(sc.nextLine());
                    t.display(v);
                    break;
                case "4":
                    System.out.println("EXIT");
                    return;
                default:
                    System.out.println("Wrong choice !!!");
            }
        }
    }
}
