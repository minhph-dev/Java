package basic;

import java.util.Scanner;

public class Country implements IPrintable{
    public String code, name, captital;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaptital() {
        return captital;
    }

    public void setCaptital(String captital) {
        this.captital = captital;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(float population) {
        this.population = population;
    }
    public float  area, population;

    public Country() {
    }

    public Country(String code, String name, String captital, float area, float population) {
        this.code = code;
        this.name = name;
        this.captital = captital;
        this.area = area;
        this.population = population;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap code: ");
        code = sc.nextLine();
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap capital:");
        captital = sc.nextLine();
        while (true) {
            try {
                System.out.print("Nhap Area: ");
                area = Float.parseFloat(sc.nextLine());
                if (area <=0) {
                   System.out.println("Area must be > 0 !!!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Nhap population: ");
                population = Float.parseFloat(sc.nextLine());
                if (population <=0) {
                   System.out.println("Population must be > 0 !!!");
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
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Capital: " + captital);
        System.out.println("Area: " + area);
        System.out.println("Population: " + population);
    }
     @Override
    public String toString(){
        return "Country ["
               + "Code: " + code 
               + ", Name: " + name
               + ", Captital: " + captital
               + ", Area: " + area
               + ", Population: " + population
               + "]";
    }
    
}
