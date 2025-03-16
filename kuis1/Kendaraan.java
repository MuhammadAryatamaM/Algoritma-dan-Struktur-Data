package kuis1;

public class Kendaraan {
    String nomorPlat;
    double jarakTempuh;
    double konsumsiBahanBakar;

    static double[] hasilPerhitungan = new double[5];

    public Kendaraan(String noPlat, double jarak, double konsum) {
        nomorPlat = noPlat;
        jarakTempuh = jarak;
        konsumsiBahanBakar = konsum;
    }

    static double efisiensiBBM(Kendaraan[] atlet) {
        int i = 0;
        double terefisien = (atlet[i].jarakTempuh / atlet[i].konsumsiBahanBakar);
        for (i = 1; i < atlet.length; i++) {
            double efisiensi = (atlet[i].jarakTempuh / atlet[i].konsumsiBahanBakar);
            hasilPerhitungan[i] = efisiensi;
            if (efisiensi > terefisien) {
                terefisien = efisiensi;
            }
        }
        return terefisien;  
    }

    static void printData(Kendaraan[] atlet) {
        int counter = 0, index = 0;
        double terefisien = 0;

        for (int i = 0; i < 5; i++) {  // 5 = length array
            if (hasilPerhitungan[i] > terefisien) {
                terefisien = hasilPerhitungan[i];
                index = i;
            }
            if (hasilPerhitungan[i] > 10.0) {
                counter++;
            }
        }

        System.out.println("Dimiliki kendaraan dengan plat nomor " + atlet[index].nomorPlat);
        System.out.println("Persentase yang nilai efisiensi lebih dari 10: " + (double)((counter/5.0) * 100.0) + "%"); // 5 = length array
        
    }
}
