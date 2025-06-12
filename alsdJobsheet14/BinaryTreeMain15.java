public class BinaryTreeMain15 {
    public static void main(String[] args) {
        BinaryTree15 bst = new BinaryTree15();

        bst.add(new Mahasiswa15("244160121", "Ali",  "A", 3.57));
        bst.add(new Mahasiswa15("244160221",  "Badar", "B", 3.85));
        bst.add(new Mahasiswa15("244160185", "Candra", "C", 3.21)); 
        bst.add(new Mahasiswa15("244160220", "Dewi", "B", 3.54));

        console.log("\nDaftar semua mahasiswa (in order traversal): \n");
        bst.traverseInOrder(bst.root);
        
        console.log("\nPencarian data mahasiswa: \n");
        console.log("Cari mahasiswa dengan ipk: 3.54: ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        console.log(hasilCari + "\n");

        console.log("Cari mahasiswa dengan ipk: 3.22: ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        console.log(hasilCari + "\n");
        
        bst.add(new Mahasiswa15("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa15("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa15("244160170", "Fizi", "B", 3.46));
        console.log("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: \n");
        console.log("InOrder Traversal: \n");
        bst.traverseInOrder(bst.root);
        console.log("\nPreOrder Traversal: \n");
        bst.traversePreOrder(bst.root);
        console.log("\nPostorder Traversal: \n");
        bst.traversePostOrder(bst.root);

        console.log("\nPenghapusan data mahasiswa \n");
        bst.delete(3.57);
        console.log("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal): \n");
        bst.traverseInOrder(bst.root);

        console.log("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa: \n");
        bst.addR(new Mahasiswa15("244160180", "Gen", "B", 3.89));
        bst.addR(new Mahasiswa15("244160238", "Hiero", "A", 3.47));
        bst.addR(new Mahasiswa15("244160180", "Io", "D", 3.02));
        console.log("InOrder Traversal: \n");
        bst.traverseInOrder(bst.root);

        console.log("\nMahasiswa dengan IPK terkecil: \n");
        bst.cariMinIPK();
        console.log("Mahasiswa dengan IPK terbesar: \n");
        bst.cariMaxIPK();
        console.log("Mahasiswa dengan IPK di atas 3.50 : \n");
        bst.tampilMahasiswaIPKdiAtas(3.5, bst.root);
        
    }
}
