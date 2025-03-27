package alsdJobsheet6;

public class MainDosen15 {
    public static void main(String[] args) {
        DataDosen15 list = new DataDosen15();
    
        Dosen15 d1 = new Dosen15("001", "Claude de Alger Obelia", true, 38);
        Dosen15 d2 = new Dosen15("003", "Anastasius de Alger Obelia", true, 31);
        Dosen15 d3 = new Dosen15("005", "Athanasia de Alger Obelia", false, 20);
        Dosen15 d4 = new Dosen15("006", "Diana", false, 26);
        Dosen15 d5 = new Dosen15("007", "Jennette Margarita", false, 22);
        Dosen15 d6 = new Dosen15("010", "Lucas", true, 25);
        Dosen15 d7 = new Dosen15("014", "Ijekiel Alpheus", true, 38);
        Dosen15 d8 = new Dosen15("021", "Penelope Judith", false, 36);
        Dosen15 d9 = new Dosen15("026", "Aeternitas de Alger Obelia", true, 50);
        Dosen15 d10 = new Dosen15("030", "Lilian York", false, 29);
        
        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        System.out.println(">>>>>>> Menampilkan Semua Data Dosen <<<<<<<");
        list.tampil();

        String searchName = "Diana";
        System.out.printf(">>>>>>> Mencari Data Dosen Bernama %s <<<<<<<\n", searchName);
        list.tampilData(list.pencarianDataSequential15(searchName));
        System.out.println();

        System.out.println(">>>>>>> Mengurutkann Data Dosen dari Termuda ke Tertua <<<<<<<");
        list.bubbleSort();
        System.out.println("Data berhasil diurutkan.");
        System.out.println();

        int searchAge = 38;
        System.out.printf(">>>>>>> Mencari Data Dosen Berusia %d Tahun <<<<<<<\n", searchAge);
        list.tampilData(list.pencarianDataBinary15(searchAge, 0, 9));
    }
}
