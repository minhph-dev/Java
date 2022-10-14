package data;

public abstract class Shape {
    public float sideA, sideB, sideC;
    
    public Shape() {
    }
  
    public Shape(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }
    
    //ham tinh dien tich
    public abstract float getAArea();
    
    //ham tinh chu vi
    public abstract float getPPremeter();
    
    //ham display detail of shape
    public void displayDetail(){
        System.out.print("-----Infomation of shape---------\n");
        System.out.println("Side A : " + this.sideA);
        System.out.println("Side B : " + this.sideB);
        System.out.println("Side C : " + this.sideC);
    }
}
