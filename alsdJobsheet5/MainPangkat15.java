package alsdJobsheet5;
import java.util.*;
public class MainPangkat15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat15[] png = new Pangkat15[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.printf("Masukkan nilai basis elemen ke-%d: ", (i+1) );
            int basis = sc.nextInt();
            System.out.printf("Masukkan nilai pangkat elemen ke-%d: ", (i+1) );
            int pangkat = sc.nextInt();
            png[i] = new Pangkat15(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTE FORCE: ");
        for (Pangkat15 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat15 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
