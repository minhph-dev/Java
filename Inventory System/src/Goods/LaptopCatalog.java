package Goods;

public class LaptopCatalog {

    public int max =10, cnt = 0;
    Laptop[] cList = new Laptop[max];

    public LaptopCatalog() {
    }

    public LaptopCatalog(int max, int cnt) {
        this.max = max;
        this.cnt = cnt;
    }

    public void addLaptop() {
        if (cnt == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        Laptop lap = new Laptop();
        lap.accept();
        cList[cnt] = lap;
        cnt++;
    }

    public void search(String laptopName) {
        if (cnt == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int cntTen = 0;
        for (int i = 0; i < cnt; i++) {
            if (cList[i].name.contains(laptopName)) {
                cList[i].printInfo();
                cntTen++;
            }
        }

        if (cntTen == 0) {
            System.out.println("Khong tim thay laptop: " + laptopName);
        }
    }

    public void displayAll() {
        if (cnt == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === THONG TIN TAT CA SAN PHAM ===");
        for (int i = 0; i < cnt; i++) {
            System.out.println(cList[i]);
        }
    }

    public void remove(String laptopID) {
        if (cnt == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        for (int i = 0; i < cnt; i++) {
            if (cList[i].id.equals(laptopID)) {
                for (int j = i; j < cnt - 1; j++) {
                    cList[j] = cList[j + 1];
                }
                cnt--; 
                System.out.println("Da xoa Laptop co ID: " + laptopID);
                return;
            }
        }
    }

}
