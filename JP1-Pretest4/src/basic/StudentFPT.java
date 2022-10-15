package basic;

import java.util.Scanner;

public class StudentFPT extends Student {

    public int theoryMark, practiceMark, project;
    Scanner sc = new Scanner(System.in);

    public StudentFPT() {
    }

    public StudentFPT(int theoryMark, int practiceMark, int project) {
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
        this.project = project;
    }

    public StudentFPT(int theoryMark, int practiceMark, int project, String id, String name, int yob) {
        super(id, name, yob);
        this.theoryMark = theoryMark;
        this.practiceMark = practiceMark;
        this.project = project;
    }

    public float getFinal() {
        return (theoryMark * 2 + practiceMark + project * 3) / 6;
    }

    @Override
    public void input() {
        super.input();
        while (true) {
            try {
                System.out.print("Nhap theoryMark: ");
                theoryMark = Integer.parseInt(sc.nextLine());
                if (theoryMark < 0 || theoryMark > 100) {
                    System.out.println("Mark must be between 0 and 100 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap practiceMark: ");
                practiceMark = Integer.parseInt(sc.nextLine());
                if (practiceMark < 0 || practiceMark > 100) {
                    System.out.println("Mark must be between 0 and 100 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap project Mark: ");
                project = Integer.parseInt(sc.nextLine());
                if (project < 0 || project > 100) {
                    System.out.println("Mark must be between 0 and 100 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("TheoryMark: " + theoryMark);
        System.out.println("PracticeMark: " + practiceMark);
        System.out.println("Project Mark: " + project);
        System.out.println("Final mark: " + getFinal());
        System.out.println("------------");
    }

    @Override
    public String toString() {
        return "Student ["
                + "Id: " + id
                + ", Name: " + name
                + ", Yob: " + yob
                + ", TheoryMark: " + theoryMark
                + ", PracticeMark: " + practiceMark
                + ", Project: " + project
                + ", Final mark: " + getFinal()
                + "]";
    }

}
