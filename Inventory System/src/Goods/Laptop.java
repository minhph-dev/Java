package Goods;

import java.util.Scanner;

public class Laptop extends Computer {

    public String wedcam;
    public int QoH;

    public Laptop() {
    }

    public Laptop(String wedcam, int QoH) {
        this.wedcam = wedcam;
        this.QoH = QoH;
    }

    @Override
    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Do you want wedcam: ");
            wedcam = sc.nextLine();
            if ("y".equals(wedcam) || "n".equals(wedcam)) {
                break;
            }
            System.out.println("Wedcam must be y/n !!!");
        }
        System.out.print("Nhap so luong ton kho: ");
        QoH = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void printInfo() {
        System.out.println("=== THONG TIN SAN PHAM ===");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Wedcam is: " + wedcam);
        System.out.println("Hang ton kho: " + QoH);
        System.out.printf("Amount: %d \n", price * QoH);
    }
     @Override
    public String toString(){
        return "Laptop ["
               + "Id: " + id 
               + ", Name: " + name
               + ", Price: " + price
                + ", Wedcam: " + wedcam
               + ", Hang ton kho: " + QoH
               + ", Amount: " + (price * QoH)
               + "]";
    }

}
