public class StackTugasMahasiswa15 {
    Mahasiswa15[] stack;
    int top;

    public StackTugasMahasiswa15(int size) {
        stack = new Mahasiswa15[size];
        top = -1;
    }

    public String konversiDesimalkeBiner(int nilai) {
        if (nilai == 0) return "0";

        StackKonversi15 stack = new StackKonversi15();
        
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai /= 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }

        return biner;
    }

    public boolean isFull() {
        if (top == stack.length - 1) return true;
        else return false;
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        else return false;
    }

    public void push(Mahasiswa15 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi");
        }
    }
    
    public Mahasiswa15 pop() {
        if (!isEmpty()) {
            Mahasiswa15 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang bisa dinilai");
            return null;
        }
    }
    
    public Mahasiswa15 peek() {
        if (!isEmpty()) return stack[top];
        else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");            
            return null;
        }
    }

    public Mahasiswa15 tugasTerbawah() {
        if (!isEmpty()) return stack[0];
        else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");            
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }

    void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println();
    }
}
