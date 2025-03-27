package alsdJobsheet4;
import java.util.*;
public class MainSum15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Sum15 sm = new Sum15(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.printf("Masukkan keuntungan ke-%d: ", (i+1));
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
}
