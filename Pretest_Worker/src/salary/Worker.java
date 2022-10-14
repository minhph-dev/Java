package salary;

import Iemployee.Interface;
import java.util.Scanner;

public class Worker implements Interface {

    public String name;
    public int workday;
    public double salary;
    Scanner sc = new Scanner(System.in);

    @Override
    public void input() {
        while (true) {
            try {
                System.out.print("Enter name: ");
                name = sc.nextLine();
                if (name.isBlank()) {
                    System.out.println("The name must be not blank ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Enter workday : ");
                workday = Integer.parseInt(sc.nextLine());
                if (workday<0 || workday >31) {
                    System.out.println("workday in range from 0 to 31 ");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    @Override
    public double calculateSalary() {
          salary = (workday *BASIC)/22;
          return salary;
    }
    
    @Override
    public void display() {
        System.out.println("=== WORKER have workday > 24 ===");
        System.out.println("Name: " + name);
        System.out.println("Workday: " + workday);
        System.out.printf("Salary: %.2f \n" , calculateSalary());
    }
    
     @Override
    public String toString(){
        return "Worker ["
               + "Name: " + name 
               + ", Workday: " + workday
               + "]";
    }
    
    

}
