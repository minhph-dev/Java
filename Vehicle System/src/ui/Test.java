package ui;

import app.VehicleCatalog;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
     VehicleCatalog v = new VehicleCatalog();
     Scanner sc = new Scanner(System.in);
        String choice = "";
        while (true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Add a new car");
            System.out.println("2. Display all cars");
            System.out.println("3. Search car by brand name");
            System.out.println("4. Display all cars having GPS module");
            System.out.println("5. Display high-rank car");
            System.out.println("6. Exit");
            System.out.print("Vui long chon [1-6]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    v.addCar();
                    break;
                case "2":
                    v.displayAll();
                    break;
                case "3":
                    System.out.print("Enter brand car want find: ");
                    String brands = sc.nextLine().trim();
                    v.searchByBrand(brands);
                    break;
                case "4":
                    v.displayAllGPSCar();
                    break;
                case "5":
                    v.displayHighRankl();
                    break;
                case "6":
                    System.out.println("EXIT");
                    return;
                default:
                    System.out.println("Wrong choice !!!");
            }
        }
    }
}
