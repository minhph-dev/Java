
package data;

import java.util.Scanner;

public class Laptop extends Computer {
    public float size, weight;
    
    @Override
    public void input(){
    super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap size: ");
        size = Float.parseFloat(sc.nextLine().trim());
        System.out.print("Nhap weight: ");
        weight = Float.parseFloat(sc.nextLine().trim());
    }
    
    @Override
    public void display(){
    super.display();
        System.out.println("Kich thuoc: " + size);
        System.out.println("Can nang: " + weight);
    }
     @Override
    public String toString(){
        return "Laptop ["
               + "Id: " + id 
               + ", Brands: " + brand
               + ", Price: " + price
               + ", Size: " + size
               + ", Weight: " + weight
               + "]";
    }
}
