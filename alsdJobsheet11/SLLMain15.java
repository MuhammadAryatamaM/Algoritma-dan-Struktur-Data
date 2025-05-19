import java.util.*;
public class SLLMain15 {
    public static void main(String[] args) {
        SingleLinkedList15 sll = new SingleLinkedList15();
        
        sll.print();
        sll.addFirst(input());
        sll.print();
        sll.addLast(input());
        sll.print();
        sll.insertAfter("Lucas", input());
        sll.insertAt(2, input());
        sll.print();

        System.out.println("Data index 3: ");
        sll.getData(3);

        System.out.println("Data mahasiswa an Eupha berada di index: " + sll.indexOf("eupha"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }

    public static Mahasiswa15 input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        return new Mahasiswa15(nim, nama, kelas, ipk);
    }
}
