import java.util.*;
public class TugasPlatNomor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char kota[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'}, 
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'}, 
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'}, 
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'}, 
            {'B', 'O', 'G', 'O', 'R'}, 
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'}, 
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'}, 
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'}, 
            {'M', 'A', 'L', 'A', 'N', 'G'}, 
            {'T', 'E', 'G', 'A', 'L'}
        };

        System.out.print("Masukkan kode plat nomor: ");
        char kodePlat = sc.next().charAt(0);
        for (int i = 0; i < kode.length; i++) {
            if (kodePlat == kode[i]) {
                System.out.print("Nama Kota: ");
        
                int x = 0;
        
                switch (kodePlat) {
                    case 'A': x = 0; break;
                    case 'B': x = 1; break;
                    case 'D': x = 2; break;
                    case 'E': x = 3; break;
                    case 'F': x = 4; break;
                    case 'G': x = 5; break;
                    case 'H': x = 6; break;
                    case 'L': x = 7; break;
                    case 'N': x = 8; break;
                    case 'T': x = 9; break;
                }
                for (int j = 0; j < kota[x].length; j++) {
                    System.out.print(kota[x][j]);
                }
                break;
            } else if (i == kode.length - 1) {
                System.out.println("Kode plat tidak valid");
            }
        }
    }
}