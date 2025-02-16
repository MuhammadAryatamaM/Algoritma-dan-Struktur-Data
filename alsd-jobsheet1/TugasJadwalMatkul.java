import java.util.*;

public class TugasJadwalMatkul {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("======== INPUT DATA MATA KULIAH ========");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
            
        String namaMatkul[] = new String[n];
        String hariMatkul[] = new String[n];
        int sksMatkul[] = new int[n];
        int semesterMatkul[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Mata kuliah ke-" + (i+1));
            System.out.print("Masukkan semester mata kuliah: ");
            semesterMatkul[i] = sc.nextInt();
            System.out.print("Masukkan nama mata kuliah: ");
            namaMatkul[i] = sc.next();
            System.out.print("Masukkan SKS mata kuliah: ");
            sksMatkul[i] = sc.nextInt();
            System.out.print("Masukkan hari mata kuliah: ");
            hariMatkul[i] = sc.next();
        }

        while (true) {
            System.out.println();
            System.out.println("============= MENU =============");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            boolean isAvailable = false;
            System.out.println();
            
            if (menu == 1) {
                System.out.println("======== JADWAL KULIAH ========");
                for (int i = 0; i < n; i++) {
                    System.out.println("Mata kuliah ke-" + (i+1));
                    System.out.println("Semester : " + semesterMatkul[i]);
                    System.out.println("Nama     : " + namaMatkul[i]);
                    System.out.println("SKS      : " + sksMatkul[i]);
                    System.out.println("Hari     : " + hariMatkul[i]);
                    System.out.println();
                }
            } else if (menu == 2) {
                System.out.print("Masukkan hari: ");
                String hari = sc.next();
                System.out.println("======== JADWAL KULIAH ========");
                for (int i = 0; i < n; i++) {
                    if (hariMatkul[i].equalsIgnoreCase(hari)) {
                        System.out.println("Semester : " + semesterMatkul[i]);
                        System.out.println("Nama     : " + namaMatkul[i]);
                        System.out.println("SKS      : " + sksMatkul[i]);
                        System.out.println();
                        isAvailable = true;
                    } else if (i == (n-1) && (isAvailable == false)) {
                        System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
                    }
                }
            } else if (menu == 3) {
                System.out.print("Masukkan semester: ");
                int semester = sc.nextInt();
                System.out.println("======== JADWAL KULIAH ========");
                for (int i = 0; i < n; i++) {
                    if (semesterMatkul[i] == semester) {
                        System.out.println("Nama     : " + namaMatkul[i]);
                        System.out.println("SKS      : " + sksMatkul[i]);
                        System.out.println("Hari     : " + hariMatkul[i]);
                        System.out.println();
                        isAvailable = true;
                    } else if (i == n-1 && (isAvailable == false)) {
                        System.out.println("Tidak ada jadwal kuliah pada semester " + semester);
                    }
                }
            } else if (menu == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                String nama = sc.next();
                System.out.println("======== JADWAL KULIAH ========");
                for (int i = 0; i < n; i++) {
                    if (namaMatkul[i].equalsIgnoreCase(nama)) {
                        System.out.println("Semester : " + semesterMatkul[i]);
                        System.out.println("SKS      : " + sksMatkul[i]);
                        System.out.println("Hari     : " + hariMatkul[i]);
                        System.out.println();
                        isAvailable = true;
                    } else if (i == n-1 && (isAvailable == false)) {
                        System.out.println("Mata kuliah " + nama + " tidak ditemukan");
                    }
                }
            } else if (menu == 5) {
                break;
            } else {
                System.out.println("Menu tidak valid");
            }
        }
    }
}