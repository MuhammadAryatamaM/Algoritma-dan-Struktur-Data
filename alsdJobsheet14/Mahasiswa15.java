public class Mahasiswa15 {
    String nim, nama, kelas;
    double ipk;
    
    public Mahasiswa15() {
    }

    public Mahasiswa15(String nm, String name, String kls, double ipk) {
        nim = nm;
        nama = name;
        kelas = kls;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        console.log("NIM: " + this.nim + " Nama: " + this.nama + " Kelas: " + this.kelas + " IPK: " + this.ipk + "\n");
    }
}
