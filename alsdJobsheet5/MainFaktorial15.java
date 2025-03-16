package alsdJobsheet5;
import java.util.*;
public class MainFaktorial15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print( "Masukkan nilai: ");
        int nilai = sc.nextInt();

        Faktorial15 fk = new Faktorial15();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
