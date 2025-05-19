public class AntrianMahasiswa15 {
    NodeMahasiswa15 head;
    int size;
    int max;

    public AntrianMahasiswa15(int max) {
        size = 0;
        this.max = max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void enqueue(Mahasiswa15 input) {
        if (isFull()) System.out.println("Antrian penuh.");
        else {
            NodeMahasiswa15 ndInput = new NodeMahasiswa15(input, null);
            if (isEmpty()) head = ndInput;
            else {
                NodeMahasiswa15 tmp = head;
                while (tmp.next != null) tmp = tmp.next;
                tmp.next = ndInput;
            }    
            size++;
        }
    }

    public Mahasiswa15 dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            NodeMahasiswa15 tmp = head;
            if (size == 1) head = null;
            else head = head.next;
            size--;
            return tmp.data;
        }
    }

    public void getFirst() {
        if (isEmpty()) System.out.println("Antrian kosong.");
        else head.data.tampilInformasi();
    }

    public void getLast() {
        if (isEmpty()) System.out.println("Antrian kosong.");
        else {
            NodeMahasiswa15 tmp = head;
            while (tmp.next != null) tmp = tmp.next;
            tmp.data.tampilInformasi();
        }
    }

    public int getJumlahMhs() {
        return size;
    }
}
