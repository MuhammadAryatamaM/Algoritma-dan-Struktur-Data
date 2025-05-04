import java.util.*;
public class SuratDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat15 stack = new StackSurat15();
        

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    Surat15 srt = new Surat15(id, nama, kelas, jenisIzin, durasi);
                    stack.push(srt);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", srt.namaMahasiswa);
                    break;
                case 2:
                    Surat15 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memroses surat dari " + diproses.namaMahasiswa);
                        System.out.print("Valid? (y/n): ");
                        char verif = sc.nextLine().charAt(0);
                        String hasilVerifikasi = (verif == 'y') ? "valid" : "tidak valid";
                        System.out.printf("Surat dari %s telah diproses dan hasilnya %s\n", diproses.namaMahasiswa, hasilVerifikasi);
                    }
                    break;
                case 3:
                    Surat15 lihat = stack.peek();
                    if (lihat != null) System.out.printf("Surat terakhir dikumpulkan oleh %s", lihat.namaMahasiswa);
                    break;
                case 4:
                    System.out.print("Nama mahasiswa yang dicari: ");
                    String nm = sc.nextLine();
                    Surat15 cari = stack.cariNama(nm);
                    if (cari != null) System.out.printf("Mahasiswa dengan nama %s ditemukan", cari.namaMahasiswa);
                    break;    
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            } 
        }
    }
}
