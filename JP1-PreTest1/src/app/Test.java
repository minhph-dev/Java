package app;

import basic.Country;
import java.util.Scanner;

public class Test {
    int max=10, next;
    Country[] cList = new Country[max];
    public void add(){
          if (next == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        Country c = new Country();
        c.input();
         for (int i = 0; i < next; i++) {
            if (cList[i].code.equals(c.code)) {
                System.out.println(" Country code already existed in the system !!");
                return;
            }
        }
          cList[next] = c;
           next++;
       
    }
    
    public void dislay(){
      if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === ALL COUNTRY ===");
        for (int i = 0; i < next; i++) {
            System.out.println(cList[i]);
        }
    }
    public void displayTop1(){
         if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        Country populationTop1 = cList[0];
        for (int i = 0; i < next; i++) {
            if(cList[i].getPopulation() > populationTop1.getPopulation()){
               populationTop1 = cList[i];
            }
        }
        System.out.println(populationTop1);
        
    }
    public void remove(String countryCode){
         if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int flag= 0;
        for (int i = 0; i < next; i++) {
            if (cList[i].code.equals(countryCode)) {
                for (int j = i; j < next - 1; j++) {
                    cList[j] = cList[j + 1];
                }
                next--; 
                flag++;
                System.out.println("Da xoa Country co ID: " + countryCode);
                return;
            }
        }
         if (flag == 0) {
            System.out.println("Code k co trong he thong du lieu");
        }
    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Test t = new Test();
        String choice = "";
        while (true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Add new country");
            System.out.println("2. Display all countries");
            System.out.println("3. Display the country having the highest population");
            System.out.println("4. Remove a country by code");
            System.out.println("5. Exit");
            System.out.print("Vui long chon [1-5]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    t.add();
                    break;
                case "2":
                    t.dislay();
                    break;
                case "3":
                    t.displayTop1();
                    break;
                case "4":
                    System.out.print("Nhap ID Country muon xoa: ");
                    String code = sc.nextLine().trim();
                    t.remove(code);
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
