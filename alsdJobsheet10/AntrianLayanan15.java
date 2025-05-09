public class AntrianLayanan15 {
    Mahasiswa15[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan15(int n) {
        this.max = n;
        this.data = new Mahasiswa15[n];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(Mahasiswa15 mhs) {
        if (isFull()) System.out.println("Antrian penuh, tidak dapat menambah mahasiswa"); 
        else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian");
        }   
    }

    public Mahasiswa15 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa15 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerdepan() {
        if (isEmpty()) System.out.println("Antrian kosong.");
        else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) System.out.println("Antrian kosong.");
        else {
            System.out.print("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) System.out.println("Antrian kosong.");
        else {
            System.out.print("Daftar Mahasiswa dalam Antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i+1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public int getJumlahAntrian() {
        return size;
    }
}
