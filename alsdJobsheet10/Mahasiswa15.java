public class Mahasiswa15 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    Mahasiswa15(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData(){
        System.out.printf("%s - %s - %s - %s\n", nim, nama, prodi, kelas);
    }
}
