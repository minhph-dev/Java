package app;

import data.Member;
import java.util.Scanner;

public class MemberTest {

    int max = 10, next;
    Member[] mList = new Member[max];

    public void add() {
        if (next == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        Member m = new Member();
        m.accept();
        mList[next] = m;
        next++;
    }

    public void dislay() {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === ALL MEMBER ===");
        for (int i = 0; i < next; i++) {
            System.out.println(mList[i]);
        }
    }

    public void display(String sName) {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int count = 0;
        for (int i = 0; i < next; i++) {
            if (mList[i].name.equals(sName)) {
                mList[i].printInfo();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong co Member: " + sName);
        }
    }

    public void remove(String sID) {
        if (next == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        for (int i = 0; i < next; i++) {
            if (mList[i].id.equals(sID)) {
                for (int j = i; j < next - 1; j++) {
                    mList[j] = mList[j + 1];
                }
                next--;
                System.out.println("Da xoa Member co ID: " + sID);
                return;
            }
        }
    }
    
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        MemberTest m = new MemberTest();
        String choice = "";
        while (true){
            System.out.println("\n === MENU ===");
            System.out.println("1. Add a new member");
            System.out.println("2. Display list of member");
            System.out.println("3. Search member by name");
            System.out.println("4. Remove member by ID");
            System.out.println("5. EXIT");
            System.out.print("Vui long chon [1-5]: ");
            choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    m.add();
                    break;
                case "2":
                    m.dislay();
                    break;
                case "3":
                    System.out.print("Member name want find: ");
                    String name = sc.nextLine();
                    m.display(name);
                    break;
                case "4":
                    System.out.print("Enter id want delete: ");
                    String id = sc.nextLine();
                    m.remove(id);
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
