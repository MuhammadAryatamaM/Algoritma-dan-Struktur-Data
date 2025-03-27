package alsdJobsheet4;

public class DaftarNilai15 {
    
    String nama;
    String nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    public DaftarNilai15 (String nama, String nim, int thn, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        tahunMasuk = thn;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    static int tertinggiUTSDC (DaftarNilai15[] nilai, int l, int r) {
        if (l == r) {
            return nilai[l].nilaiUTS;
        } 

        int mid = (l+r) / 2;
        int isL = tertinggiUTSDC(nilai, l, mid);
        int isR = tertinggiUTSDC(nilai, mid + 1, r);

        int tertinggi = isL > isR ? isL : isR;
        return tertinggi; 
    }

    static int terendahUTSDC (DaftarNilai15[] nilai, int l, int r) {
        if (l == r) {
            return nilai[l].nilaiUTS;
        } 

        int mid = (l+r) / 2;
        int isL = terendahUTSDC(nilai, l, mid);
        int isR = terendahUTSDC(nilai, mid + 1, r);

        int terendah = isL < isR ? isL : isR;
        return terendah; 
    }

    static double rerataUAS (DaftarNilai15[] nilai) {
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i].nilaiUAS;
        }
        
        return (double) total/nilai.length;
    }
}
