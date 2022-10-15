package app;

import data.MobilePhone;
import java.util.Scanner;

public class MobilePhoneTest {

    int max = 10, next;
    MobilePhone[] mList = new MobilePhone[max];

    public void add() {
        if (next == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        MobilePhone m = new MobilePhone();
        m.accept();
        mList[next] = m;
        next++;
    }

    public void dislay() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === ALL STUDENT ===");
        for (int i = 0; i < next; i++) {
            System.out.println(mList[i]);
        }
    }

    public void displayTop1() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        MobilePhone top1Price = mList[0];
        for (int i = 0; i < next; i++) {
            if (mList[i].price > top1Price.price) {
                top1Price = mList[i];
            }
        }
        System.out.println(top1Price);
    }

    public void display(String mBrand) {
         if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("Brand Phone want find");
        int flag =0;
        for (int i = 0; i < next; i++) {
            if (mList[i].brand.equals(mBrand)) {
                mList[i].printInfo();
                flag++;
            }
        }
        if(flag == 0){
            System.out.println("Cannot find brand " + mBrand);
        }
    }

    public void remove(String mID) {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int flag =0;
        for (int i = 0; i < next; i++) {
            if (mList[i].id.equals(mID)) {
                for (int j = i; j < next - 1; j++) {
                    mList[j] = mList[j + 1];
                }
                next--;
                flag++;
                System.out.println("Da xoa Member co ID: " + mID);
                return;
            }
        }
        if (flag == 0) {
            System.out.println("Id k co trong he thong du lieu");
        }
    }
    
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        MobilePhoneTest m = new MobilePhoneTest();
        String choice = "";
        while (true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Add a new Mobile Phone");
            System.out.println("2. Display list of Mobile Phone");
            System.out.println("3. Display Top 1 Mobile Phone");
            System.out.println("4. Search Mobile Phone by brand name");
            System.out.println("5. Remove Mobile Phone by ID");
            System.out.println("6. EXIT");
            System.out.print("Vui long chon [1-6]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    m.add();
                    break;
                case "2":
                    m.dislay();
                    break;
                case "3":
                    m.displayTop1();
                    break;
                case "4":
                    System.out.print("Brand Phone want find: ");
                    String brand = sc.nextLine();
                    m.display(brand);
                    break;
                case "5":
                    System.out.print("Enter id phone want delete: ");
                    String id = sc.nextLine();
                    m.remove(id);
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
