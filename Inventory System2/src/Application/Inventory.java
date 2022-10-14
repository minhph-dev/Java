
package Application;

import Electronics.TelevisionCatalog;
import java.util.Scanner;

public class Inventory {
     public static void main(String[] args){
     TelevisionCatalog televison = new TelevisionCatalog();
     Scanner sc = new Scanner(System.in);
        String choice = "";
        while (true) {
            System.out.println("\n === MENU ===");
            System.out.println("1. Add a new television");
            System.out.println("2. Search televisions by brand");
            System.out.println("3. Display all televisions");
            System.out.println("4. Display high-valued televisions");
            System.out.println("5. Exit");

            System.out.print("Vui long chon [1-5]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    televison.add();
                    break;
                case "2":
                    System.out.print("Nhap BRAND televison muon tim: ");
                    String ten = sc.nextLine().trim();
                    televison.searchByBrand(ten);
                    break;
                case "3":
                    televison.displayAll();
                    break;
                case "4":
                    televison.displayHighValue();
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
