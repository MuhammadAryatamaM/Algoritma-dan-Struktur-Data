package alsdJobsheet2;

public class DosenMain15 {
    public static void main(String[] args) {
        
        Dosen15 dsn1 = new Dosen15();
        dsn1.idDosen = "0001";
        dsn1.nama = "Ardiansyah";
        dsn1.bidangKeahlian = "Bahasa Inggris";
        dsn1.tahunBergabung = 2006;
        dsn1.statusAktif = true;
        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja(2025);
        
        Dosen15 dsn2 = new Dosen15("0012", "Joseph", "Bahasa Jerman", 2012, false);
        dsn2.tampilInformasi();
        dsn1.ubahKeahlian("K3");
        dsn2.setStatusAktif(true);
        dsn2.tampilInformasi();
    }
}
