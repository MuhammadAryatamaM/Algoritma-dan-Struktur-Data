import java.util.*;

public class TugasRumusKubus {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println();
            System.out.print("Masukkan panjang rusuk kubus: ");
            int rusuk = sc.nextInt();
        
            System.out.println("1. Hitung volume kubus");
            System.out.println("2. Hitung luas permukaan kubus");
            System.out.println("3. Hitung keliling kubus");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            if (menu == 4) break;
            System.out.println();

            switch (menu) {
                case 1:
                    int volume = VolumeKubus(rusuk);
                    System.out.println("Volume kubus: " + volume);
                    break;
                case 2:
                    int luasPermukaan = LuasPermukaanKubus(rusuk);
                    System.out.println("Luas permukaan kubus: " + luasPermukaan);
                    break;
                case 3:
                    int keliling = KelilingKubus(rusuk);
                    System.out.println("Keliling kubus: " + keliling);
                    break;
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        }
    }
    
    static int VolumeKubus (int rusuk) {
        int volume = rusuk * rusuk * rusuk;
        return volume;
    }
    
    static int LuasPermukaanKubus (int rusuk) {
        int luasPermukaan = 6 * rusuk * rusuk;
        return luasPermukaan;
    }

    static int KelilingKubus (int rusuk) {
        int keliling = 12 * rusuk;
        return keliling;
    }
}