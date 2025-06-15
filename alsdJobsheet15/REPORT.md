|            | Algorithm and Data Structure                                              |
| ---------- | ------------------------------------------------------------------------- |
| NIM        | 244107020028                                                              |
| Nama       | Muhammad Aryatama Mukapraja                                               |
| Kelas      | TI - 1H                                                                   |
| Repository | [link] (https://github.com/MuhammadAryatamaM/Algoritma-dan-Struktur-Data) |

# Jobhseet #15 Collections

## Praktikum - Implementasi ArrayList

### 15.3 Jawaban Pertanyaan

4. Cobalah tambahkan object `customer` baru ke dalam `customers`. Apakah object dapat ditambahkan meskipun melebihi kapasitas? <p>
   Jawab: Bisa
5. Compile dan run kode program, di mana object yang baru ditambahkan? Di awal, di tengah, atau di akhir collection? <p>
   Jawab: Di akhir
6. Compile dan run kode program. Index pada `ArrayList` dimulai dari `0` atau `1`? <p>
   Jawab: `0`
7. Cobalah hapus angka `2` saat instansiasi object `customers`. Apakah `ArrayList` dapat diinstansiasi tanpa harus menentukan size di awal? <p>
   Jawab: Bisa

## Praktikum - Implementasi Stack

### 15.4 Jawaban Pertanyaan

5. Mengapa perlu ada pengecekan `(temp != null)`? <p>
   Jawab: Jika tidak ada objek yang di return (`null`), akan error
6. Bagaimana cara melakukan pencarian elemen pada stack menggunakan method **search()**? <p>
   Jawab: Jika hasil **search()** = -1, objek tidak ada di stack. Jika hasil **search()** = 1, objek ada di `top`, lalu angka lain berarti posisi dari `top` (karena `top` di 1, posisi 2 artinya di bawah `top` langsung, dst)

## Praktikum - Implementasi TreeSet

### 15.5 Jawaban Pertanyaan

4. Compile dan run program. Mengapa urutan yang ditampilkan berbeda dengan urutan penambahan data ke dalam `TreeSet fruits`? <p>
   Jawab: `TreeSet` langsung terurut, di sini terurut dengan urutan alfabet
5. Apa yang dilakukan oleh method **first()**, **last()**, **remove()**, **pollFirst()**, dan **pollLast()**? <p>
   Jawab: **first()** mengambil elemen pertama/terkecil, **last()** mengambil elemen terakhir/terbesar, **remove()** menghapus elemen tertentu, **pollFirst()** menghapus elemen pertama/terkecil, **pollLast()** menghapus elemen terakhir/terbesar
