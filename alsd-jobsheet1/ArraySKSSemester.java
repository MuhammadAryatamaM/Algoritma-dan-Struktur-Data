import java.util.*;

public class ArraySKSSemester {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String namaMatkul[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar", "Rekayasa Perangkat Lunak", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double sksMatkul[] = {2, 2, 2, 3, 2, 2, 3, 2};

        String nilaiHuruf[] = new String[namaMatkul.length];
        double nilaiSetara[] = new double[namaMatkul.length];
        double nilai[][] = new double[2][namaMatkul.length]; // 0: nilai awal, 1: bobot nilai

        double sumNilai = 0, totalSKS = 18, IP;

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");
        
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nilai angka untuk matkul " + namaMatkul[i] + ": ");
            nilai[0][i] = sc.nextInt();

            if (nilai[0][i] > 100 || nilai[0][i] < 0) {
                System.out.println("Nilai tidak valid");
                break;
            }   

            if (nilai[0][i] > 80 && nilai[0][i] <= 100) {
                nilaiHuruf[i] = "A ";
                nilaiSetara[i] = 4;
            } else if (nilai[0][i] > 73 && nilai[0][i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilai[0][i] > 65 && nilai[0][i] <= 73) {
                nilaiHuruf[i] = "B ";
                nilaiSetara[i] = 3;
            } else if (nilai[0][i] > 60 && nilai[0][i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilai[0][i] > 50 && nilai[0][i] <= 60) {
                nilaiHuruf[i] = "C ";
                nilaiSetara[i] = 2;
            } else if (nilai[0][i] > 39 && nilai[0][i] <= 50) {
                nilaiHuruf[i] = "D ";
                nilaiSetara[i] = 1;
            } else {
                nilaiHuruf[i] = "E ";
                nilaiSetara[i] = 0;
            }
        }

        for (int j = 0; j < namaMatkul.length; j++) {
            nilai[1][j] = nilaiSetara[j] * sksMatkul[j];
            sumNilai += nilai[1][j];
        }

        IP = sumNilai / totalSKS;

        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================");
        System.out.println("MK                                         Nilai Angka      Nilai Huruf      Bobot Nilai");

        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print(namaMatkul[i]);
            for (int s = 0; s < 46 - namaMatkul[i].length(); s++) {
                System.out.print(" ");
            }
            System.out.print(nilai[0][i]);
            for (int s = 0; s < 14; s++) {
                System.out.print(" ");
            }
            System.out.print(nilaiHuruf[i]);
            for (int s = 0; s < 14; s++) {
                System.out.print(" ");
            }
            System.out.println(nilaiSetara[i]);
        }
        System.out.println("================================");
        System.out.printf("IP : %.2f", IP);
    }
}