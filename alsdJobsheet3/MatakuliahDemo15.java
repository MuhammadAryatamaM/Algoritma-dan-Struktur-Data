package alsdJobsheet3;
import java.util.Scanner;

public class MatakuliahDemo15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Matakuliah: ");
        int jmlMatkul = sc.nextInt();

        Matakuliah15[] arrayOfMataKuliah = new Matakuliah15[jmlMatkul];
        
        for (int i = 0; i < jmlMatkul; i++) {
            arrayOfMataKuliah[i] = new Matakuliah15();
            arrayOfMataKuliah[i].tambahData(arrayOfMataKuliah, i);
        }

        for (int i = 0; i < jmlMatkul; i++) {
            arrayOfMataKuliah[i].cetakInfo(arrayOfMataKuliah, i);
        }
    }
}