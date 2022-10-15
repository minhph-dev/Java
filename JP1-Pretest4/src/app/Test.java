package app;

import basic.StudentFPT;
import java.util.Scanner;

public class Test {

    int max = 10, next;
    StudentFPT[] arr = new StudentFPT[max];

    public void add() {
        if (next == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        StudentFPT st = new StudentFPT();
        st.input();
        arr[next] = st;
        next++;
    }

    public void dislayAll() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === ALL STUDENT ===");
        for (int i = 0; i < next; i++) {
            System.out.println(arr[i]);
        }
    }

    public void displayPass() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("=== STUDENT PASS ===");
        int count=0;
        for (int i = 0; i < next; i++) {
            if (arr[i].theoryMark > 40 &&
                arr[i].practiceMark > 40 &&
                arr[i].project > 40 && 
                arr[i].getFinal() >= 50) {
                arr[i].print();
                count++;
            }
        }
        if(count==0){
            System.out.println("Cannot find student pass !!");
        }
    }
    public void displayTop1(){
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        StudentFPT top1Mark = arr[0];
        for (int i = 0; i < next; i++) {
            if(arr[i].getFinal() > top1Mark.getFinal()){
               top1Mark = arr[i];
            }
        }
        System.out.println(top1Mark);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Test t = new Test();
        String choice = "";
        while (true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Add new student");
            System.out.println("2. Display all students");
            System.out.println("3. Display students passed the examinations");
            System.out.println("4. Display Top 1 Students");
            System.out.println("5. Exit");
            System.out.print("Vui long chon [1-5]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    t.add();
                    break;
                case "2":
                    t.dislayAll();
                    break;
                case "3":
                    t.displayPass();
                    break;
                case "4":
                   t.displayTop1();
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
