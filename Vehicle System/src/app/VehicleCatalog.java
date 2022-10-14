package app;

import java.util.Scanner;

public class VehicleCatalog {

    Car[] vehicleList;
    int max, next;
    Scanner sc = new Scanner(System.in);

    public VehicleCatalog() {
        System.out.print("How many CAR do you want to manage : ");
        max = Integer.parseInt(sc.nextLine());
        vehicleList = new Car[max];
    }

    public void addCar() {
        if (next == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        Car c = new Car();
        c.accept();
        vehicleList[next] = c;
        next++;
    }

    public void displayAll() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        for (int i = 0; i < next; i++) {
            System.out.println(vehicleList[i]);
        }
    }

    public void searchByBrand(String sBrand) {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int flag = 0;
        for (int i = 0; i < next; i++) {
            if (vehicleList[i].getBrand().contains(sBrand)) {
                vehicleList[i].printInfo();
                flag++;
            }
        }

        if (flag == 0) {
            System.out.println("Khong tim thay car co ten: " + sBrand);
        }
    }

    public void displayAllGPSCar() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === DANH SACH CAR CO GPS ===");
        int flag = 0;
        for (int i = 0; i < next; i++) {
            if (vehicleList[i].isGPS()) {
                vehicleList[i].printInfo();
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Khong tim thay car co GPS !!! ");
        }
    }

    public void displayHighRankl() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === DANH SACH CAR CO GIA HON 50000 ===");
        int flag = 0;
        for (int i = 0; i < next; i++) {
            if (vehicleList[i].getPrice() > 50000) {
                vehicleList[i].printInfo();
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Khong tim thay car co gia hon 50000: ");
        }
    }
}
