package manage;

import data.Shape;
import data.Triangle;
import java.util.Scanner;

public class test {

    int maxTr;
    int nextTr;
    Triangle[] trs;
    Scanner sc;
    Triangle tr;

    public test() {
        sc = new Scanner(System.in);
        System.out.print("How many max tringle? : ");
        maxTr = Integer.parseInt(sc.nextLine());
        trs = new Triangle[maxTr];
    }

    //hàm create book()
    public void createTr() {
        if (nextTr == maxTr) {
            System.out.println("Array is full.");
            return;
        }
        tr = new Triangle();//nhăc user nhập liệu
        tr.inputData();
        trs[nextTr] = tr;
        nextTr++;
    }

    public void viewAll() {
        if (nextTr == 0) {
            System.out.println("No data!!!");
            return;
        }
        for (int i = 0; i < nextTr; i++) {
            trs[i].displayDetail();
        }
    }
    
    //kiem tra co phai tam giac can
    public void checkTamgiaccan(){
        for(int i = 0; i < nextTr; i++){
            if(trs[i].typeOfTr() == true){
                trs[i].displayDetail();
                System.out.println("Tam giac can");
            }else{
                System.out.println("Khong co tam giac can");
            }
        }
    }

    public static void main(String[] args) {
        

        int choice;
        test test1 = new test();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1.Create triangle\n2.View All\n3.Type of triangle\n4.Exit");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    test1.createTr();
                    break;
                case 2:
                    test1.viewAll();
                    break;
                case 3:
                    test1.checkTamgiaccan();
                    break;
                case 4:
                    System.out.println("Bye Bye");
                    break;
                default:
                    System.out.print("Wrong choice.Try again!! ");
            }
        } while (choice != 4);
    }
}
