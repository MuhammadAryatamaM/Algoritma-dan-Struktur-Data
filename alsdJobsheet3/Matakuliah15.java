package alsdJobsheet3;
import java.util.Scanner;

public class Matakuliah15 {
    Scanner sc = new Scanner(System.in);
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    
    public Matakuliah15(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public Matakuliah15() {  
    }

    void tambahData (Matakuliah15[] arrayMatkul, int i) {
        System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("SKS        : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        jumlahJam = sc.nextInt();
        System.out.println("---------------------------------------");
        
        arrayMatkul[i] = new Matakuliah15(kode, nama, sks, jumlahJam);
    }

    void cetakInfo (Matakuliah15[] arrayMatkul, int i) {
        System.out.println("Data Matakuliah ke-" + (i+1));
        System.out.println("Kode       : " + arrayMatkul[i].kode);
        System.out.println("Nama       : " + arrayMatkul[i].nama);
        System.out.println("SKS        : " + arrayMatkul[i].sks);
        System.out.println("Jumlah Jam : " + arrayMatkul[i].jumlahJam);
        System.out.println("---------------------------------------");
    }
}
