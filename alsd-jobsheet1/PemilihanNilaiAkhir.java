import java.util.*;

public class PemilihanNilaiAkhir {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();
        System.out.println("===============================");
        System.out.println("===============================");

        nilaiAkhir = (double) (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        if (nilaiTugas > 100 || nilaiTugas < 0 || nilaiKuis > 100 || nilaiKuis < 0 || nilaiUTS > 100 || nilaiUTS < 0 || nilaiUAS > 100 || nilaiUAS < 0) {
            System.out.println("Nilai tidak valid");
        } else {
            System.out.println("Nilai akhir: " + nilaiAkhir);
            System.out.println("Nilai huruf: " + nilaiHuruf);
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                System.out.println("SELAMAT, ANDA LULUS");
            } else {
            System.out.println("MAAF, ANDA TIDAK LULUS");
            }
        }

        System.out.println("===============================");
        System.out.println("===============================");

    }
}