public class AntrianKRS15 {
    Mahasiswa15[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahDiproses;

    public AntrianKRS15(int n) {
        this.max = n;
        this.data = new Mahasiswa15[n];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahDiproses = 0;
    }

    public boolean isEmpty() { // cek antrian kosong
        return size == 0;
    }

    public boolean isFull() {  // cek antrian penuh
        return size == max;
    }

    public void tambahAntrian(Mahasiswa15 mhs) {  // menambahkan antrian
        if (isFull()) System.out.println("Antrian penuh, tidak dapat menambah mahasiswa"); 
        else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian");
        }   
    }

    public Mahasiswa15 layaniMahasiswa() {  // memanggil antrian
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa15 mhs = data[front];
        front = (front + 1) % max;
        size--;
        sudahDiproses++;
        return mhs;
    }

    public void lihatDuaTerdepan() {  // menampilkan 2 antrian terdepan
        if (isEmpty()) System.out.println("Antrian kosong.");
        else {
            System.out.print("2 Mahasiswa Paling Depan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            if (size != 1) {
                if ((front + 1) < 10) data[front + 1].tampilkanData(); 
                else data[0].tampilkanData();
            } else System.out.println("Tidak ada mahasiswa lagi");
        }
    }

    public void lihatTerbelakang() {  // menampilkan antrian paling akhir
        if (isEmpty()) System.out.println("Antrian kosong.");
        else {
            System.out.print("Mahasiswa Paling Belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    

    public void tampilkanSemua() {  // menampilkan semua antrian
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

    public void clear() { // mengosongkan antrian
        if (!isEmpty()) {
            size = 0;
            front = rear = -1;
            System.out.println("Queue berhasil dikosongkan");
        } else System.out.println("Queue masih kosong.");
    }

    public int getJumlahAntrian() {  // cek jumlah antrian 
        return size;
    }

    public int jumlahSudahDiproses() {  // jumlah yang sudah melakukan proses KRS
        return sudahDiproses;
    }

    public int jumlahBelumDiproses() {  // jumlah yang belum melakukan proses KRS
        return 30 - sudahDiproses;
    }
}
