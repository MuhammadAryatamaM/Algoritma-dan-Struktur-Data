public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa15(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampil() {
        System.out.printf("NIM: %s, Nama: %s, Kelas: %s, IPK: %.2f\n", this.nim, this.nama, this.kelas, this.ipk);
    }
    
}