package Electronics;

import Goods.ITax;
import Goods.Product;
import java.util.Scanner;

public class Television extends Product implements ITax {

    public int  QoH;
    public float price;
    public String brand;
    
    public Television() {
    }

    public Television(int price, int QpH, String brand) {
        this.price = price;
        this.QoH = QoH;
        this.brand = brand;
    }

    @Override
    protected void accept() {
        Scanner sc = new Scanner(System.in);
        super.accept();
        System.out.print("Nhap Price: ");
        price = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong hang ton kho: ");
        QoH = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap Brand: ");
        brand = sc.nextLine();
    }

    @Override
    public float getCost() {
        return  price + (price * VAT_TAX_PERCENT);
    }

     @Override
    public String toString(){
        return "Television ["
               + "Id: " + id 
               + ", Name: " + name
               + ", Price: " + price
               + ", Hang ton kho: " + QoH
               + ", Amount: " + getCost()*QoH
               + "]";
    }

    @Override
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Hang ton kho: " + QoH);
        System.out.printf("Amout: %f \n", getCost());
        System.out.println("---------");
    }

}
