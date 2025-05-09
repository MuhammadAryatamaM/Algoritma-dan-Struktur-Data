public class Queue15 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;
    
    public Queue15(int n) {
        max = n;
        data = new int[n];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void peek() {
        if (!isEmpty()) System.out.println("Elemen terdepan adalah " + data[front]);
        else System.out.println("Queue masih kosong.");
    }

    public void print() {
        if (isEmpty()) System.out.println("Queue masih kosong.");
        else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            size = 0;
            front = rear = -1;
            System.out.println("Queue berhasil dikosongkan");
        } else System.out.println("Queue masih kosong.");
    }

    public void enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh.");
            System.exit(0);
        }
        else {
            if (isEmpty()) front = rear = 0;
            else {
                if (rear == max - 1) rear = 0;
                else rear++;
            }
            data[rear] = dt;
            size++;
        }
    }

    public int dequeue() {
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong.");
            System.exit(0);
        }
        else {
            dt = data[front];
            size--;
            if (isEmpty()) front = rear = -1;
            else {
                if (front == max -1) front = 0;
                else front++;
            }
        } 
        return dt;
    }
}