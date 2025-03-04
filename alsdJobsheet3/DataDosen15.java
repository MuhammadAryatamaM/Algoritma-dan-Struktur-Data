package alsdJobsheet3;

public class DataDosen15 {
    
    static void dataSemuaDosen(Dosen15 arrayOfDosen[]) {
        for (int j = 0; j < arrayOfDosen.length; j++) {
            System.out.println("Data Dosen ke-" + (j+1));
            System.out.println("Kode          : " + arrayOfDosen[j].kode);
            System.out.println("Nama          : " + arrayOfDosen[j].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[j].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Umur          : " + arrayOfDosen[j].umur);
            System.out.println("-------------------------------");
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen15 arrayOfDosen[]) {
        int jmlLk = 0, jmlPr = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) jmlLk++;
            else jmlPr++;
        }
        System.out.println("Jumlah Dosen Pria   : " + jmlLk);
        System.out.println("Jumlah Dosen Wanita : " + jmlPr);
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen15 arrayOfDosen[]) {
        double usiaLk = 0, usiaPr = 0;
        int jmlLk = 0, jmlPr = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                usiaLk += arrayOfDosen[i].umur;
                jmlLk++;
            } else { 
                usiaPr += arrayOfDosen[i].umur;
                jmlPr++;
            }
        }
        System.out.println("Rerata Umur Dosen Pria   : " + usiaLk/jmlLk);
        System.out.println("Rerata Umur Dosen Wanita : " + usiaPr/jmlPr);
    }

    static void infoDosenPalingTua(Dosen15 arrayOfDosen[]) {
        int tertua = 0, index = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].umur > tertua) {
                tertua = arrayOfDosen[i].umur;
                index = i;
            }
        }
        System.out.println("Kode          : " + arrayOfDosen[index].kode);
        System.out.println("Nama          : " + arrayOfDosen[index].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[index].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Umur          : " + arrayOfDosen[index].umur);
        System.out.println("-------------------------------");
    }

    static void infoDosenPalingMuda(Dosen15 arrayOfDosen[]) {
        int termuda = arrayOfDosen[0].umur , index = 0;
        for (int i = 1; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].umur < termuda) {
                termuda = arrayOfDosen[i].umur;
                index = i;
            }
        }
        System.out.println("Kode          : " + arrayOfDosen[index].kode);
        System.out.println("Nama          : " + arrayOfDosen[index].nama);
        System.out.println("Jenis Kelamin : " + (arrayOfDosen[index].jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Umur          : " + arrayOfDosen[index].umur);
        System.out.println("-------------------------------");
    }
}