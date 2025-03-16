package kuis1;

public class KendaraanMain {
    public static void main(String[] args) {
        Kendaraan[] atlet = new Kendaraan[5]; // 5 = length array

        atlet[0] = new Kendaraan("N 1023 QQ", 3100, 500);
        atlet[1] = new Kendaraan("AG 7432 SL", 290, 10);
        atlet[2] = new Kendaraan("AE 8764 PR", 5000, 200);
        atlet[3] = new Kendaraan("S 7652 NT", 7800, 910);
        atlet[4] = new Kendaraan("B 652 PM", 635, 90);

        System.out.println("Efisiensi kendaraan tertinggi: " + Kendaraan.efisiensiBBM(atlet));
        Kendaraan.printData(atlet);
    }
}
