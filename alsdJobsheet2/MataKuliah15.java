package alsdJobsheet2;

public class MataKuliah15 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah15() {
    }

    public MataKuliah15(String kd, String nm, int sks, int jmlJam) {
        kodeMK = kd;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilkanInformasi() {
        System.out.println();
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS diubah");
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam ditambah");
    }

    void kurangiJam(int jam) {
        if (jumlahJam - jam < 0) {
            System.out.println("Jumlah jam tidak bisa kurang dari 0");
        } else {
            jumlahJam -= jam;
            System.out.println("Jam dikurang");
        }
    }
}