public class BinaryTreeArrayMain15 {
    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();

        Mahasiswa15 mhs1 = new Mahasiswa15("244160121", "Ali",  "A", 3.57);
        Mahasiswa15 mhs2 = new Mahasiswa15("244160185", "Candra", "C", 3.21); 
        Mahasiswa15 mhs3 = new Mahasiswa15("244160221",  "Badar", "B", 3.85);
        Mahasiswa15 mhs4 = new Mahasiswa15("244160220", "Dewi", "B", 3.54);
        Mahasiswa15 mhs5 = new Mahasiswa15("244160131", "Devi", "A", 3.72);
        Mahasiswa15 mhs6 = new Mahasiswa15("244160205", "Ehsan", "D", 3.37);
        Mahasiswa15 mhs7 = new Mahasiswa15("244160170", "Fizi", "B", 3.46);

        Mahasiswa15[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswa, idxLast);
        console.log("\nIn Order Traversal Mahasiswa: \n");
        bta.traverseInOrder(0);

        bta.add(new Mahasiswa15("244160180", "Gen", "B", 3.89));
        bta.add(new Mahasiswa15("244160238", "Hiero", "A", 3.47));
        bta.add(new Mahasiswa15("244160180", "Io", "D", 3.02));

        console.log("\nPre Order Traversal Mahasiswa: \n");
        bta.traversePreOrder(0);
    }
}
