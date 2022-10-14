package Application;

import Goods.LaptopCatalog;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args){
    LaptopCatalog laptop = new LaptopCatalog();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while (true) {
            System.out.println("\n === MENU ===");
            System.out.println("1. Add a new laptop");
            System.out.println("2. Search laptop by name");
            System.out.println("3. Display all laptops");
            System.out.println("4. Remove a laptop by id");
            System.out.println("5. Exit");

            System.out.print("Vui long chon [1-5]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    laptop.addLaptop();
                    break;
                case "2":
                    System.out.print("Nhap ten laptop muon tim: ");
                    String ten = sc.nextLine().trim();
                    laptop.search(ten);
                    break;
                case "3":
                    laptop.displayAll();
                    break;
                case "4":
                    System.out.print("Nhap ID laptop muon xoa: ");
                    String id = sc.nextLine().trim();
                    laptop.remove(id);
                    break;
                case "5":
                    System.out.println("EXIT");
                    return;
                default:
                    System.out.println("Wrong choice !!!");
            }
        }
    }
}
