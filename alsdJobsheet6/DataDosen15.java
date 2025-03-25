package alsdJobsheet6;

public class DataDosen15 {
    Dosen15[] dataDosen = new Dosen15[10];
    int idx = 0;
    
    void tambah(Dosen15 dsn) {
        dataDosen[idx] = dsn;
        idx++;
    }

    void tampil() {
        System.out.println();
        for (Dosen15 d : dataDosen) {
            d.tampil();
            System.out.println("---------------------");
        }
        System.out.println();
    }

    void bubbleSort() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j - 1].usia > dataDosen[j].usia) {
                    Dosen15 temp = dataDosen[j - 1];
                    dataDosen[j - 1] = dataDosen[j];
                    dataDosen[j] = temp; 
                }
            }
        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen15 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
