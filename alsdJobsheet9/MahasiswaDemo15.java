import java.util.*;
public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);

        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Terbawah");
            System.out.println("5. Melihat Daftar Tugas");
            System.out.println("6. Tampilkan Jumlah Tugas Sekarang");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa15 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, dinilai.nilai);
                        String biner = stack.konversiDesimalkeBiner(nilai);
                        System.out.println("Nilai biner tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa15 lihat = stack.peek();
                    if (lihat != null) System.out.printf("Tugas terakhir dikumpulkan oleh %s", lihat.nama);
                    break;
                case 4:
                    Mahasiswa15 tengok = stack.tugasTerbawah();
                    if (tengok != null) System.out.printf("Tugas pertama dikumpulkan oleh %s", tengok.nama);
                    break;    
                case 5:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 6:
                    if (stack.jumlahTugas() == 0) System.out.println("Tidak ada tugas");
                    else System.out.println("Jumlah tugas sekarang ada " + stack.jumlahTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
