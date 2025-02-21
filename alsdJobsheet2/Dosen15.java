package alsdJobsheet2;

public class Dosen15 {

    String idDosen;
    String nama;
    String bidangKeahlian;
    int tahunBergabung;
    boolean statusAktif;

    public Dosen15() {
    }

    public Dosen15(String id, String nm, String ahli, int thn, boolean aktif) {
        idDosen = id;
        nama = nm;
        bidangKeahlian = ahli;
        tahunBergabung = thn;
        statusAktif = aktif;
    }

    void tampilInformasi() {
        System.out.println();
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        if (status) {
            System.out.println("Status menjadi aktif");
            statusAktif = true;
        } else {
            System.out.println("Status menjadi tidak aktif");
            statusAktif = false;
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja;
        masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}