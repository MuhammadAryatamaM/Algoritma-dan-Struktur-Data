package alsdJobsheet3;

public class Mahasiswa15 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo(Mahasiswa15[] mhs, int i) {
        System.out.println("Data mahasiswa ke-" + (i+1));
        System.out.println("NIM       : " + mhs[0].nim);
        System.out.println("Nama      : " + mhs[0].nama);
        System.out.println("Kelas     : " + mhs[0].kelas);
        System.out.println("IPK       : " + mhs[0].ipk);
        System.out.println("---------------------------------------");
    }
}