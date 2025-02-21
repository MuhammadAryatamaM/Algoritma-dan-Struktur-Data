package alsdJobsheet2;

public class MataKuliahMain {
    public static void main(String[] args) {
        
        MataKuliah15 mk1 = new MataKuliah15();
        mk1.kodeMK = "AS01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 1;
        mk1.jumlahJam = 2;
        mk1.tampilkanInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();

        MataKuliah15 mk2 = new MataKuliah15("BD01", "Basis Data", 3, 8);
        mk2.tampilkanInformasi();
        mk2.kurangiJam(2);
        mk2.tampilkanInformasi();
    }
}
