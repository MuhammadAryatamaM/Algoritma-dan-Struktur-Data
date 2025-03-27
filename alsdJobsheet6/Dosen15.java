package alsdJobsheet6;

public class Dosen15 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen15(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Nama          : " + nama);
        System.out.println("Kode          : " + kode);
        System.out.println("Jenis Kelamin : " + (jenisKelamin == true ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
    }
}
