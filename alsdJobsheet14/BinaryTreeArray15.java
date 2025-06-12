public class BinaryTreeArray15 {
    Mahasiswa15[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray15() {
        this.dataMahasiswa = new Mahasiswa15[10];
    }

    void populateData(Mahasiswa15 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa15 data) {
        if (idxLast < dataMahasiswa.length - 1) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else console.log("Tree penuh");
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2*idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2*idxStart + 1);
                traversePreOrder(2*idxStart + 2);
            }
        }
    }
}
