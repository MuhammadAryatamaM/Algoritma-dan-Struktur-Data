package alsdJobsheet2;

public class MahasiswaMain15 {
    public static void main(String[] args) {

        Mahasiswa15 mhs1 = new Mahasiswa15();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.5;
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa15 mhs2 = new Mahasiswa15("Annisa Nabila", "2241720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa15 mhsMuhammadAryatamaMukapraja = new Mahasiswa15("Muhammad Aryatama Mukapraja", "244107020028", 3.86, "TI 1H");
    }
}