package alsdJobsheet3;
import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dosen15[] arrayOfDosen15 = new Dosen15[4];   // untuk 4 objek
        boolean jenisKelamin = true;

        for (int i = 0; i < arrayOfDosen15.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String gender = sc.nextLine();
            if (gender.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } else if (gender.equalsIgnoreCase("wanita")) {
                jenisKelamin = false;
            } else {
                System.out.println("Jenis Kelamin Invalid");
                return;
            }
            System.out.print("Umur          : ");
            int umur = sc.nextInt();
            sc.nextLine();
            System.out.println("-------------------------------");

            arrayOfDosen15[i] = new Dosen15(kode, nama, jenisKelamin, umur);
        }

        int j = 0;
        for (Dosen15 d : arrayOfDosen15) {
            cetakInfo(arrayOfDosen15, j);
            j++;
        }

        while (true) {
            System.out.println();
            System.out.println("1. Tampilkan Data Semua Dosen");
            System.out.println("2. Tampilkan Jumlah Dosen per Jenis Kelamin");
            System.out.println("3. Tampilkan Rerata Usia Dosen per Jenis Kelamin");
            System.out.println("4. Tampilkan Data Dosen Paling Tua");
            System.out.println("5. Tampilkan Data Dosen Paling Muda");
            System.out.println("6. Keluar");
            System.out.print("Pilihanmu: ");
            int menu = sc.nextInt();
            System.out.println();
            switch (menu) {
                case 1:
                    DataDosen15.dataSemuaDosen(arrayOfDosen15);
                    break;
                case 2:
                    DataDosen15.jumlahDosenPerJenisKelamin(arrayOfDosen15);
                    break;
                case 3:
                    DataDosen15.rerataUsiaDosenPerJenisKelamin(arrayOfDosen15);
                    break;
                case 4:
                    DataDosen15.infoDosenPalingTua(arrayOfDosen15);
                    break;
                case 5:
                    DataDosen15.infoDosenPalingMuda(arrayOfDosen15);
                    break;
                default:
                    System.out.println("Keluar program.");
                    break;
            }
        }
    }

    static void cetakInfo(Dosen15 data[], int j) {
        System.out.println("Data Dosen ke-" + (j+1));
        System.out.println("Kode          : " + data[j].kode);
        System.out.println("Nama          : " + data[j].nama);
        System.out.println("Jenis Kelamin : " + (data[j].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Umur          : " + data[j].umur);
        System.out.println("-------------------------------");
    }
}