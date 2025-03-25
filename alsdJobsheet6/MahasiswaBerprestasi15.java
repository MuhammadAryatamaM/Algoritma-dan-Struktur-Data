package alsdJobsheet6;
import java.util.*;
public class MahasiswaBerprestasi15 {
    Scanner sc = new Scanner(System.in);
    
    Mahasiswa15[] listMhs = new Mahasiswa15[5];
    int idx;

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

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa15 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa15 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa15 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
