package data;

import java.util.Scanner;

public class Triangle extends Shape {

    Scanner sc;
    private float p, area, premeter;

    public Triangle() {
    }

    public Triangle(Scanner sc, float p, float area, float premeter, float sideA, float sideB, float sideC) {
        super(sideA, sideB, sideC);
        this.sc = sc;
        this.p = p;
        this.area = area;
        this.premeter = premeter;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPremeter() {
        return premeter;
    }

    public void setPremeter(float premeter) {
        this.premeter = premeter;
    }

    //ham kiem tra do dai 3 canh cua tam giac
    public boolean checkTrigangle() {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB)
                && (sideC + sideB > sideA)) {
            return true;
        } else {
            return false;
        }
    }

    // ham input
    public void inputData() {
        sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter side A : ");
            sideA = sc.nextFloat();
            System.out.print("Enter sidde B : ");
            sideB = sc.nextFloat();
            System.out.print("Enter side C : ");
            sideC = sc.nextFloat();
            if (checkTrigangle() == false) {
                System.out.println("Can't create triangle!!!");
            } else {
                break;
            }
        }
    }

    //ham tinh nua chu vi
    public float premeterHalf() {
        return (this.sideA + this.sideB + this.sideC) / 2;
    }

    @Override
    public float getPPremeter() {
        return premeter = premeterHalf() * 2;
    }

    @Override
    public float getAArea() {
        return area = (float) Math.sqrt(premeterHalf()
                * (premeterHalf() - sideA) *
                (premeterHalf() - sideB) *
                (premeterHalf() - sideC));
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Premeter half : " + premeterHalf());
        System.out.println("Area : " + getAArea());
        System.out.println("Premeter : " + getPPremeter());
    }

    //ham kiem tra dang cua tam giac
    public boolean typeOfTr() {
        if ((sideA == sideB) || (sideA == sideC) || (sideB == sideC)) {
            return true;
        } else {
            return false;
        }
    }

}
