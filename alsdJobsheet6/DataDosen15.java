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
   
    int pencarianDataSequential15(String cari) {
        int posisi = -1;
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equals(cari)) {
                posisi = i;
                break;
            }
        }

        return posisi;
    }

    int pencarianDataBinary15(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == dataDosen[mid].usia) {
                if (cari == dataDosen[mid - 1].usia) {
                    System.out.println("Peringatan! Ada data dengan umur yang sama, contohnya di indeks " + (mid - 1));
                }
                if (cari == dataDosen[mid + 1].usia) {
                    System.out.println("Peringatan! Ada data dengan umur yang sama, contohnya di indeks " + (mid + 1));
                }
                return mid;
            } else if (dataDosen[mid].usia > cari) {
                return pencarianDataBinary15(cari, left, mid - 1);
            } else {
                return pencarianDataBinary15(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilData(int posisi) {
        if (posisi == -1) {
            System.out.println("Data tidak ditemukan");
            return;
        }
        System.out.println("Data ditemukan pada indeks " + posisi);
        System.out.println("Nama          : " + dataDosen[posisi].nama);
        System.out.println("Kode          : " + dataDosen[posisi].kode);
        String jk = (dataDosen[posisi].jenisKelamin == true ? "Pria" : "Wanita");
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + dataDosen[posisi].usia);
    }
}
