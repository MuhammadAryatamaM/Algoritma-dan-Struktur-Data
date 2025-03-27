package alsdJobsheet6;
import java.util.*;
public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15(jumMhs);
        
        list.tambahData();
        list.tampil();

        // seq search
        System.out.println("-----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching: ");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        // binary search
        System.out.println("-----------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        cari = sc.nextDouble();

        System.out.println("Menggunakan binary search: ");
        posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }    
}
