public class StackSurat15 {
    Surat15[] tumpukanSurat = new Surat15[10];
    int top = -1;
   
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == tumpukanSurat.length - 1;
    }

    public void push(Surat15 srt) {
        if (!isFull()) {
            top++;
            tumpukanSurat[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi");
        }
    }

    public Surat15 pop() {
        if (!isEmpty()) {
            Surat15 m = tumpukanSurat[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    public Surat15 peek() {
        if (!isEmpty()) return tumpukanSurat[top];
        else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan");            
            return null;
        }
    }

    public Surat15 cariNama(String nama) {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (tumpukanSurat[i].namaMahasiswa.equals(nama)) return tumpukanSurat[i];
            }
        }  
        System.out.println("Mahasiswa tidak ditemukan.");
        return null;
    }
}