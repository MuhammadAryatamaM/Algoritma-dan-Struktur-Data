import java.util.*;

public class PerulanganAngkaDanAsterisk {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        String digitS = nim.substring(nim.length() - 2);
        int digit = Integer.parseInt(digitS);
        
        if (digit < 10) digit += 10;
        
        for (int i = 1; i <= digit; i++) {
            if (i == 6 || i == 10) continue;
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}