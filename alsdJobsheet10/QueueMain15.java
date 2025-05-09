import java.util.*;
public class QueueMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue15 Q = new Queue15(n);

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0) System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih > 0 && pilih < 6);

    }
    
    public static void menu() {
        System.out.println("------------------------");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.print("\nMasukkan operasi yang diinginkan: ");
    }
}