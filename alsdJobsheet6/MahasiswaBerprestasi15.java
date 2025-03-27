package alsdJobsheet6;
import java.util.*;
public class MahasiswaBerprestasi15 {
    Scanner sc = new Scanner(System.in);

    public MahasiswaBerprestasi15(int n) {
        listMhs = new Mahasiswa15[n];
    }
    
    Mahasiswa15[] listMhs;

    void tambahData() {
        for (int i = 0; i < listMhs.length; i++) {
            System.out.printf( "======= MAHASISWA KE-%d =======\n", (i+1));
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            System.out.println();
            sc.nextLine();
            listMhs[i] = new Mahasiswa15(nim, nama, kelas, ipk);
        }
    }
   
    void tampil() {
        for (Mahasiswa15 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
    
    void tampilDataSearch(double x, int pos) {
        if (pos != 1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
