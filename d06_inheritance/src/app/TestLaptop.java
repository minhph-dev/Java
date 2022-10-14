
package app;
import data.LaptopManager;
import java.util.Scanner;
public class TestLaptop {
    public static void main(String[] args){
        LaptopManager lap = new LaptopManager();
        Scanner sc = new Scanner(System.in);
        String choice = "";
        while (true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Add a new laptop");
            System.out.println("2. Show All");
            System.out.println("3. Display thin laptop");
            System.out.println("4. Remove a laptop by id");
            System.out.println("5. Exit");
            System.out.print("Vui long chon [1-5]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    lap.addLaptop();
                    break;
                case "2":
                   lap.showAll();
                    break;
                case "3":
                    lap.showThinLaptop();
                    break;
                case "4":
                    System.out.print("Nhap ID laptop muon xoa: ");
                    String id = sc.nextLine().trim();
                    lap.remove(id);
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
