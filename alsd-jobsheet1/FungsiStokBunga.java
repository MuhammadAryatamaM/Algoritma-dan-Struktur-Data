import java.util.*;
public class FungsiStokBunga {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String namaBunga[] = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int stokBunga[][] = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 12},
            {5, 7, 12, 9}
        };
        int hargaBunga[] = {75000, 50000, 60000, 10000};
        int pendapatanBunga[][] = new int[namaBunga.length][hargaBunga.length];

        while (true) {
            System.out.println();
            System.out.println("============= MENU =============");
            System.out.println("1. Lihat pendapatan bunga");
            System.out.println("2. Lihat stok bunga RoyalGarden 4");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            if (menu == 3) break;
            System.out.println();

            switch (menu) {
                case 1:
                    PendapatanBunga(stokBunga, namaBunga, pendapatanBunga, hargaBunga);
                    break;
                case 2:
                    LihatBunga(stokBunga, namaBunga);
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        }
    }
    
    static void PendapatanBunga (int stokBunga[][], String namaBunga[], int pendapatanBunga[][], int hargaBunga[]) {
        for (int i = 0; i < 4; i++) {
            System.out.printf("=== Pendapatan RoyalGarden %d ===\n", (i+1));
            for (int j = 0; j < 4; j++) {
                pendapatanBunga[i][j] = stokBunga[i][j] * hargaBunga[j];
                System.out.printf("Pendapatan bunga %s: %d\n", namaBunga[j], pendapatanBunga[i][j]);
            }
        }
    }

    static void LihatBunga (int stokBunga[][], String namaBunga[]) {
        int i = 3;
        for (int j = 0; j < 4; j++) {
            if (j == 0) {
                stokBunga[i][j] -= 1;
                System.out.printf("Stok bunga %s: %d (-1)\n", namaBunga[j], stokBunga[i][j]);
            }
            if (j == 1) {
                stokBunga[i][j] -= 2;
                System.out.printf("Stok bunga %s: %d (-2)\n", namaBunga[j], stokBunga[i][j]);
            }
            if (j == 2) {
                stokBunga[i][j] -= 0;
                System.out.printf("Stok bunga %s: %d (-0)\n", namaBunga[j], stokBunga[i][j]);
            }
            if (j == 3) {
                stokBunga[i][j] -= 5;
                System.out.printf("Stok bunga %s: %d (-5)\n", namaBunga[j], stokBunga[i][j]);
            }
        }
    }
}