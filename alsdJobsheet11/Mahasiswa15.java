public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    public Mahasiswa15 () {
    }

    public Mahasiswa15 (String nm, String nama, String kls, double ip) {
        nim = nm;
        this.nama = nama;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.printf("%s \t\t %s \t\t %s \t\t %.2f\n", this.nim, this.nama, this.kelas, this.ipk);
    }
}