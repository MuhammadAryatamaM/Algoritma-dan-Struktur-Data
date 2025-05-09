import java.util.*;
public class LayananKRS15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS15 antrian = new AntrianKRS15(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani 2 Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Paling Depan");
            System.out.println("5. Lihat Mahasiswa Paling Belakang");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Jumlah Mahasiswa dalam Antrian");
            System.out.println("8. Jumlah Mahasiswa yang Sudah Melakukan Proses KRS");
            System.out.println("9. Jumlah Mahasiswa yang Belum Melakukan Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    for (int i = 0; i < 2; i++) {
                        Mahasiswa15 dilayani = antrian.layaniMahasiswa();
                        if (dilayani != null) {
                            System.out.print("Melayani KRS mahasiswa: ");
                            dilayani.tampilkanData();
                        }
                    }
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatTerbelakang();
                    break;
                case 6:
                    antrian.clear();
                    break;                    
                case 7:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 8:
                    System.out.println("Jumlah yang sudah melakukan proses KRS: " + antrian.jumlahSudahDiproses());
                    break; 
                case 9:
                    System.out.println("Jumlah yang belum melakukan proses KRS: " + antrian.jumlahBelumDiproses());
                    break;                                       
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}