package Electronics;

public class TelevisionCatalog {

    public int max = 10, count = 0;
    Television[] tvList = new Television[max];

    public TelevisionCatalog() {
    }

    public void add() {
        if (count == max) {
            System.out.println("Out of memory !!!");
            return;
        }
        Television t = new Television();
        t.accept();
        tvList[count] = t;
        count++;
    }

    public void searchByBrand(String brandName) {
        if (count == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int cntTen = 0;
        for (int i = 0; i < count; i++) {
            if (tvList[i].brand.contains(brandName)) {
                tvList[i].printInfo();
                cntTen++;
            }
        }

        if (cntTen == 0) {
            System.out.println("Khong tim thay televison: " + brandName);
        }
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        System.out.println("\n === THONG TIN TAT CA SAN PHAM ===");
        for (int i = 0; i < count; i++) {
            System.out.println(tvList[i]);
        }
    }

    public void displayHighValue() {
        if (count == 0) {
            System.out.println("He thong chua co du lieu !!!");
            return;
        }
        int cntTen = 0;
        for (int i = 0; i < count; i++) {
            if (tvList[i].price > 500) {
                tvList[i].printInfo();
                cntTen++;
            }
        }

        if (cntTen == 0) {
            System.out.println("Khong co televison co gia tren 500 !!!");
        }
    }

}
