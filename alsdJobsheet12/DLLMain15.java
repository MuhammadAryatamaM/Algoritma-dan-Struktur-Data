import java.util.*;

public class DLLMain15 {
    public static void main(String[] args) {
        DoubleLinkedLists15 dll = new DoubleLinkedLists15();
        Scanner sc = new Scanner(System.in);
        byte pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal               9. Tampilkan seluruh data");
            System.out.println("2. Tambah di akhir              10. Cari mahasiswa paling awal");
            System.out.println("3. Tambah di indeks tertentu    11. Cari mahasiswa paling akhir");
            System.out.println("4. Tambah setelah NIM tertentu  12. Cari mahasiswa di indeks tertentu");
            System.out.println("5. Hapus di awal                13. Cari mahasiswa berdasarkan NIM");
            System.out.println("6. Hapus di akhir               14. Tampilkan jumlah data di list");
            System.out.println("7. Hapus di indeks tertentu     0. Keluar");
            System.out.println("8. Hapus setelah NIM tertentu");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextByte();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    dll.addFirst(inputMahasiswa(sc));
                    System.out.println("Berhasil menambah data di paling awal");
                }
                case 2 -> {
                    dll.addLast(inputMahasiswa(sc));
                    System.out.println("Berhasil menambah data di paling akhir");
                }
                case 3 -> {
                    System.out.print("Masukkan data di indeks ke: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    dll.add(index, inputMahasiswa(sc));
                }
                case 4 -> {
                    System.out.print("Masukkan data setelah NIM: ");
                    String nim = sc.nextLine();
                    dll.insertAfter(nim, inputMahasiswa(sc));
                }
                case 5 -> dll.removeFirst();
                case 6 -> dll.removeLast();
                case 7 -> {
                    System.out.print("Hapus data di indeks ke: ");
                    int index = sc.nextInt();
                    dll.remove(index);
                }
                case 8 -> {
                    System.out.print("Hapus data setelah NIM: ");
                    String nim = sc.nextLine();
                    dll.removeAfter(nim);
                }
                case 9 -> dll.print();
                case 10 -> {
                    Node15 found = dll.searchIndex(0);
                    if (found != null) {
                        System.out.println("Menampilkan data paling depan: ");
                        found.data.tampil();
                    } else System.out.println("Linked list kosong.");
                }
                case 11 -> {
                    Node15 found = dll.searchIndex(dll.getJumlahData() - 1);
                    if (found != null) {
                        System.out.println("Menampilkan data paling belakang: ");
                        found.data.tampil();
                    } else System.out.println("Linked list kosong.");
                }
                case 12 -> {
                    System.out.print("Masukkan indeks yang dicari: ");
                    int index = sc.nextInt();
                    Node15 found = dll.searchIndex(index);
                    if (found != null) found.data.tampil();
                    else System.out.println("Indeks " + index + " tidak ditemukan.");
                }
                case 13 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node15 found = dll.searchNim(nim);
                    if (found != null) found.data.tampil();
                    else System.out.println("NIM " + nim + " tidak ditemukan");
                }
                case 14 -> System.out.println("Ada " + dll.getJumlahData() + " mahasiswa dalam list");
                case 0 -> System.out.println("Terima kasih.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    static Mahasiswa15 inputMahasiswa(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        return new Mahasiswa15(nim, nama, kelas, ipk);
    }
}
