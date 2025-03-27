package alsdJobsheet4;

public class MainDaftarNilai15 {
    public static void main(String[] args) {
        
        DaftarNilai15[] nilai = new DaftarNilai15[8];
        nilai[0] = new DaftarNilai15("Ahmad", "220101001", 2022, 78, 82);
        nilai[1] = new DaftarNilai15("Budi", "220101002", 2022, 85, 88);
        nilai[2] = new DaftarNilai15("Cindy", "220101003", 2021, 90, 87);
        nilai[3] = new DaftarNilai15("Dian", "220101004", 2021, 76, 79);
        nilai[4] = new DaftarNilai15("Eko", "220101005", 2023, 92, 95);
        nilai[5] = new DaftarNilai15("Fajar", "220101006", 2020, 88, 85);
        nilai[6] = new DaftarNilai15("Gina", "220101007", 2023, 80, 83);
        nilai[7] = new DaftarNilai15("Hadi", "220101008", 2020, 82, 84);

        System.out.println("Nilai UTS Tertinggi: " + DaftarNilai15.tertinggiUTSDC(nilai, 0, nilai.length - 1));
        System.out.println("Nilai UTS Terendah: " + DaftarNilai15.terendahUTSDC(nilai, 0, nilai.length - 1));
        System.out.println("Rerata Nilai UAS: " + DaftarNilai15.rerataUAS(nilai));
    }
}
