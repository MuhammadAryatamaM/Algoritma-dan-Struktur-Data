package alsdJobsheet6;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        
        list.tambahData();

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();

    }
}
