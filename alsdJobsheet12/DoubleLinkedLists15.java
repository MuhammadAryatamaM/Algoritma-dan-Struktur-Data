public class DoubleLinkedLists15 {
    Node15 head;
    Node15 tail;
    int size;

    public DoubleLinkedLists15() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node15 searchNim(String keyNim) {
        Node15 current = head;
        while (current != null && !current.data.nim.equalsIgnoreCase(keyNim)) current = current.next;
        if (current == null) return null;
        else return current;
    }

    public Node15 searchIndex(int keyId) {
        Node15 current = head;
        int counter = 0;
        while (current != null && !(counter == keyId)) {
            current = current.next;
            counter++;
        }
        if (current == null) return null;
        else return current;
    }

    public void addFirst(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) head = tail = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa15 data) {
        Node15 current = searchIndex(index);

        if (current != null || index == 0 || index == size) {
            if (index == 0) addFirst(data);
            else if (index == size) addLast(data);
            else {
                Node15 newNode15 = new Node15(data);
                newNode15.next = current;
                newNode15.prev = current.prev;
                current.prev.next = newNode15;
                current.prev = newNode15;
                size++;
            }
            System.out.println("Node berhasil ditambahkan di index " + index);
        }
        else System.out.println("Node di indeks " + index + " tidak bisa ditambah.");
    }
    
    public void insertAfter(String keyNim, Mahasiswa15 data) {
        Node15 current = searchNim(keyNim);
        
        if (current == null) System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        else {
            if (current == tail) addLast(data);
            else {
                Node15 newNode = new Node15(data);
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
            }
            size++;
            System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
        }
    }

    public void removeFirst() {
        if (isEmpty()) System.out.println("Linked list kosong");
        else {
            System.out.println("Berhasil menghapus data di paling awal dengan NIM " + head.data.nim);
            if (head == tail) head = tail = null;
            else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) System.out.println("Linked list kosong");
        else {
            System.out.println("Berhasil menghapus data di paling akhir dengan NIM " + tail.data.nim);
            if (head == tail) head = tail = null;
            else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }
    }

    public void remove(int index) {
        Node15 current = searchIndex(index);

        if (current == null) System.out.println("Node dengan indeks " + index + " tidak ada.");
        else {
            if (index + 1 == size) removeLast();
            else if (index == 0) removeFirst();
            else {
                System.out.println("Berhasil menghapus data di index " + index + " dengan NIM " + current.data.nim);
                current.prev.next = current.next;
                current.next.prev = current.prev; 
                size--;
            }
        }
    }

    public void removeAfter(String keyNim) {
        Node15 current = searchNim(keyNim);

        if (current == null) System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
        else {
            if (current == tail) System.out.println("Node setelah NIM " + keyNim + " tidak ada.");
            else if (current.next == tail) removeLast();
            else {
                current.next.next.prev = current;
                current.next = current.next.next;  
                size--;
                System.out.println("Berhasil menghapus data dengan NIM " + current.data.nim);
            }
        }
    }

    public void print() {
        if (isEmpty()) System.out.println("Linked list kosong");
        else {
            Node15 current = head;
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public int getJumlahData() {
        return size;
    }
}