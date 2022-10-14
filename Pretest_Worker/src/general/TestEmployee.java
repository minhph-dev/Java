package general;

import java.util.Scanner;
import salary.Worker;

public class TestEmployee {

    public int maxworker = 10, nextworker;
    Worker[] worker = new Worker[maxworker];

    public void add() {
        if (nextworker == maxworker) {
            System.out.println("Out memory !!!");
        }
        Worker w = new Worker();
        w.input();
        worker[nextworker] = w;
        nextworker++;
    }

    public void Overtime() {
        int cnt = 0;
        if (nextworker == 0) {
            System.out.println("Khong co du lieu !!!");
            return;
        }
        for (int i = 0; i < nextworker; i++) {
            if (worker[i].workday > 22) {
                worker[i].display();
                cnt++;
            } 
        }
        if(cnt ==0){
                System.out.println("Khong tim thay nhan vien o workday > 24");
            }
    }

    public void displayAll() {
        if (nextworker == 0) {
            System.out.println("Khong co du lieu !!!");
            return;
        }
        System.out.println("=== ALL WORKER ===");
        for (int i = 0; i < nextworker; i++) {
            System.out.println(worker[i]);
        }
    }
    
    public static void main(String[] args){
      String choice = "";
        Scanner sc = new Scanner(System.in);
        TestEmployee e = new TestEmployee();
        while (true) {
            System.out.println("\n === MENU ===");
            System.out.println("1. Add new Worker");
            System.out.println("2. Find Over Time");
            System.out.println("3. Display All");
            System.out.println("4. Exit");

            System.out.print("Vui long chon [1-4]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    e.add();
                    break;
                case "2":
                   e.Overtime();
                    break;
                case "3":
                    e.displayAll();
                    break;
                case "4":
                    System.out.println("EXIT");
                    return;
                default:
                    System.out.println("Wrong choice !!!");
            }
        }
    }

}
