public class SingleLinkedList15 {
    NodeMahasiswa15 head;
    NodeMahasiswa15 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa15 tmp = head;
            System.out.println("Isi Linked List:");
            System.out.println("NIM \t\t Nama \t\t Kelas \t\t IPK");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else System.out.println("Linked list kosong");
    }

    public void addFirst(Mahasiswa15 input) {
        NodeMahasiswa15 ndInput = new NodeMahasiswa15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa15 input) {
        NodeMahasiswa15 ndInput = new NodeMahasiswa15(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa15 input) {
        NodeMahasiswa15 ndInput = new NodeMahasiswa15(input, null);
        NodeMahasiswa15 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            } 
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa15 input) {
        if (index < 0) System.out.println("Indeks salah");
        else if (index == 0) addFirst(input);
        else {
            NodeMahasiswa15 temp = head;
            for (int i = 0; i < index - 1; i++) temp = temp.next;
            temp.next = new NodeMahasiswa15(input, temp.next);
            if (temp.next.next == null) tail = temp.next; 
        }
    }

    public void getData(int index) {
        NodeMahasiswa15 tmp = head;
        for (int i = 0; i < index; i++) tmp = tmp.next;
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        NodeMahasiswa15 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) return -1;
        else return index;
    }

    public void removeFirst() {
        if (isEmpty()) System.out.println("Linked list kosong! Tidak ada yang dihapus.");
        else if (head == tail) head = tail = null;
        else head = head.next;
    }

    public void removeLast() {
        if (isEmpty()) System.out.println("Linked list kosong! Tidak ada yang dihapus.");
        else if (head == tail) head = tail = null;
        else {
            NodeMahasiswa15 tmp = head;
            while (tmp.next != tail) tmp = tmp.next;
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) System.out.println("Linked list kosong! Tidak ada yang dihapus.");
        else {
            NodeMahasiswa15 tmp = head;
            while (tmp != null) {
                if ((tmp.data.nama.equalsIgnoreCase(key)) && head == tmp) {
                    this.removeFirst();
                    break;
                } else if (tmp.data.nama.equalsIgnoreCase(key)) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) tail = tmp;
                    break;
                }
            }
            tmp = tmp.next;
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) System.out.println("Linked list kosong! Tidak ada yang dihapus.");
        else if (index == 0) this.removeFirst(); 
        else {
            NodeMahasiswa15 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) tail = tmp;
        }
    }
}
