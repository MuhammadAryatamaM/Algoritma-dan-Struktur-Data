import java.util.*;
public class AntrianDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianMahasiswa15 sll = new AntrianMahasiswa15(3);
        byte pilihan;

        while (true) {
            menu();
            pilihan = sc.nextByte();
            sc.nextLine();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println(">> Masukkan data <<");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sll.enqueue(new Mahasiswa15(nim, nama, kelas, ipk));
                    break;
                case 2:
                    Mahasiswa15 dequeued = sll.dequeue();
                    if (dequeued != null) System.out.printf("Mahasiswa %s telah dipanggil.\n", dequeued.nama);
                    break;
                case 3:
                    System.out.println("Mahasiswa paling depan: ");
                    sll.getFirst();
                    break;
                case 4:
                    System.out.println("Mahasiswa paling belakang: ");
                    sll.getLast();
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + sll.getJumlahMhs());
                    break;
                case 6:
                    sll.clear();
                    System.out.println("Antrian dikosongkan.");
                    break;    
                case 0:
                    System.out.println("Terima kasih.");
                    return;
                default:
                    System.out.println("Input invalid, input ulang.");
            }
        }
    }

    static void menu() {
        System.out.println("\n------ LAYANAN UNIT KEMAHASISWAAN ------");
        System.out.println("1. Daftar ke Antrian");
        System.out.println("2. Panggil Mahasiswa Selanjutnya");
        System.out.println("3. Tampilkan Mahasiswa Paling Depan");
        System.out.println("4. Tampilkan Mahasiswa Paling Belakang");
        System.out.println("5. Tampilkan Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }
}
