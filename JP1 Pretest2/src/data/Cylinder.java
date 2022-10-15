package data;

import java.util.Scanner;

public class Cylinder extends Shape implements IGeometry {

    public float radius, height;
    Scanner sc = new Scanner(System.in);

    public Cylinder() {
    }

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void accept() {
        while (true) {
            System.out.print("Nhap Radius: ");
            radius = Float.parseFloat(sc.nextLine());
            if (radius > 0) {
                break;
            }
            System.out.println("Radius must be >0 !!!");
        }
        while (true) {
            System.out.print("Nhap Height: ");
            height = Float.parseFloat(sc.nextLine());
            if (radius > 0) {
                break;
            }
            System.out.println("Height must be >0 !!!");
        }
    }

    @Override
    public void printInfo() {
        System.out.println("=== Detailed information of a cylinder ===");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.printf("Peripheral: %.2f \n", peripheral());
        System.out.printf("Area : %.2f \n", area());
        System.out.printf("Volumn: %.2f \n", volume());
        System.out.println("---------");

    }

    @Override
    public double area() {
        return peripheral() * (2 * PI * radius * radius);
    }

    @Override
    public double peripheral() {
        return (2 * PI * radius * height);
    }

    @Override
    public double volume() {
        return (PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return "Cylinders ["
                + "Radius: " + radius
                + ", Height: " + height
                + ", Peripheral: " + peripheral()
                + ", Area: " + area()
                + ", Volumn: " + volume()
                + "]";
    }

}
