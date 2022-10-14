
package Goods;

import java.util.Scanner;

public abstract class Product {
    protected String id, name;

    public Product() {
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }
    protected void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Id: ");
        id = sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
    }
    public abstract void printInfo();
}
