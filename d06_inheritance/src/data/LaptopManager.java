package data;

import java.util.Scanner;

public class LaptopManager {

    Laptop[] laptops;
    int max, next;
    Scanner sc = new Scanner(System.in);

    public LaptopManager() {
        System.out.println("How many Laptop do you want to manege ?");
        max = Integer.parseInt(sc.nextLine());
        laptops = new Laptop[max];
    }

    public void addLaptop() {
        if (next == max) {
            System.out.println("Out memory");
            return;
        }
        Laptop lap = new Laptop();
        lap.input();
        laptops[next] = lap;
        next++;
    }

    public void showAll() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === THONG TIN TAT CA SAN PHAM ===");
        for (int i = 0; i < next; i++) {
            System.out.println(laptops[i]);
        }
    }
    public void showThinLaptop() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int flag = 0;
        for (int i = 0; i < next; i++) {
            if (laptops[i].weight < 1.5) {
                laptops[i].display();
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Cannot find thin Laptop !!!");
        }
    }
    public void remove(String laptopID) {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int flag= 0;
        for (int i = 0; i < next; i++) {
            if (laptops[i].id.equals(laptopID)) {
                for (int j = i; j < next - 1; j++) {
                    laptops[j] = laptops[j + 1];
                }
                next--; 
                flag++;
                System.out.println("Da xoa Laptop co ID: " + laptopID);
                return;
            }
        }
         if (flag == 0) {
            System.out.println("Id k co trong he thong du lieu");
        }
        
    }

}
