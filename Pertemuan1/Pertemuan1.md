# Pertemuan 1 - Dasar Pemrograman Java

---

## 🎯 Tujuan Pembelajaran

Setelah mengikuti pertemuan ini, Anda diharapkan mampu:

1. ✅ Membuat, mengompilasi, dan menjalankan program Java sederhana menggunakan NetBeans.
2. ✅ Menjelaskan struktur dasar program Java, seperti **class**, method `main()`, dan statement.
3. ✅ Mendeklarasikan dan menggunakan **variabel serta tipe data** dalam Java.
4. ✅ Menggunakan berbagai jenis **operator**, seperti operator aritmatika, relasi, dan logika.
5. ✅ Menerapkan **percabangan** menggunakan `if-else`, `if-else if`, dan `switch`.
6. ✅ Menerapkan **perulangan** menggunakan `for`, `while`, dan `do-while`.
7. ✅ Membuat program sederhana dengan menggabungkan variabel, operator, percabangan, dan perulangan.

---

## 🔑 KATA KUNCI UTAMA (KEY WORDS)

Pada materi ini, terdapat kata kunci utama yang wajib Anda pahami fungsi dan penggunaannya:

* **`JDK & NetBeans`** : JPerangkat yang digunakan untuk mengembangkan, mengompilasi, dan menjalankan program Java, sedangkan NetBeans IDE yang digunakan untuk menulis, mengelola, mengompilasi, dan menjalankan program Java.
* **`Class`** : Struktur dasar dalam Java yang digunakan sebagai tempat mendefinisikan data dan perilaku program.
* **`main()`** : Fungsi/method utama yang menjadi pintu masuk pertama kali saat program Java dijalankan.
* **`Variabel`** : Tempat untuk menyimpan suatu nilai atau data yang dapat digunakan dalam program.
* **`Tipe Data`** : Menentukan jenis data yang dapat disimpan dalam sebuah variabel, seperti `int`, `double`, `char`, `boolean`, dan `String`.
* **`Operator`** : Simbol khusus untuk melakukan kalkulasi data, perbandingan nilai, hingga operasi logika (seperti +, ==, &&).
* **`Percabangan`** : Struktur kontrol yang digunakan untuk menentukan tindakan berdasarkan suatu kondisi.
* **`Perulangan`** : Struktur kontrol yang digunakan untuk menjalankan suatu blok kode secara berulang.

---

## 📂 RESOURCES

💡 **File demo tersedia di folder `contoh_kode/pertemuan_1/`****

| **File** | **Deskripsi** |
|---|---|
| `src/pertemuan1_dasarjava/Pertemuan1_DasarJava.java` | Kelas utama demonstrasi struktur dasar program |
| `src/pertemuan1_dasarjava/InputOuputBuku.java` | Kelas demonstrasi *Input/Output* menggunakan `Scanner` |
| `src/pertemuan1_dasarjava/IntegrasiPerpustakaan.java` | Kelas integrasi operator, percabangan, dan perulangan |

---

## 📋 PERSIAPAN SEBELUM MEMULAI

- [ ] Apache NetBeans IDE / IDE pilihan sudah terbuka.
- [ ] JDK terkonfigurasi dengan benar.
- [ ] Mengetahui lokasi folder penyimpanan untuk menyimpan seluruh file project praktikum.

---

## PART 1: Membuat Project di NetBeans
1. Buka aplikasi **Apache NetBeans**.
![alt text](image-8.png)
2. Pilih menu **File → New Project**, atau klik ikon **New Project** (ikon folder berwarna
coklat), atau tekan **Ctrl + Shift + N**. Pada jendela yang muncul, pilih kategori **Java with Ant** dan
jenis project **Java Application**, lalu klik Next.
![alt text](image-9.png)
3. Beri nama project (misal: `Pertemuan1_DasarJava`) dan tentukan lokasi penyimpanannya.
![alt text](image-11.png)
4. Klik **Finish** untuk membuat project baru..

---

## PART 2: Struktur Dasar Program Java

### Struktur Dasar
Struktur dasar dari sebuah program Java terdiri dari sebuah kelas utama (main class) yang di dalamnya terdapat fungsi utama (main()). Fungsi main ini adalah pintu masuk utama (entry point) program. Ketika program dijalankan, semua perintah di dalam fungsi main akan dieksekusi secara berurutan dari atas ke bawah.

```
                 ┌──────────────────────────────┐
                 │    KODE PROGRAM JAVA (.java) │
                 │                              │
                 │  public class NamaClass     │
                 └──────────────┬───────────────┘
                                │
                    Dikompilasi oleh JDK
                                │
                                ▼
                 ┌──────────────────────────────┐
                 │    BYTECODE JAVA (.class)    │
                 └──────────────┬───────────────┘
                                │
                       Menjalankan main()
                                │
                                ▼
                 ┌──────────────────────────────┐
                 │ public static void main(...) │
                 │       Entry Point Program    │
                 └──────────────┬───────────────┘
                                │
                  ┌─────────────┴─────────────┐
                  │                           │
                  ▼                           ▼
        ┌───────────────────┐       ┌───────────────────┐
        │    PERCABANGAN    │       │     PERULANGAN    │
        │                   │       │                   │
        │ if-else           │       │ for               │
        │ if-else if        │       │ while             │
        │ switch            │       │ do-while          │
        └───────────────────┘       └───────────────────┘
```

Perhatikan contoh kode program sistem perpustakaan berikut beserta penjelasannya:

```java
package pertemuan1_dasarjava;
    
public class Pertemuan1_DasarJava {

    public static void main(String[] args) {
        // Perintah untuk menampilkan teks ke layar
        System.out.println("Selamat Datang di Pemrograman Java!");
    }
}
```

1. package pertemuan1_dasarjava;
Menandakan nama folder atau kelompok tempat file Java ini disimpan.
2. public class Pertemuan1_DasarJava
Mendefinisikan nama kelas utama. Nama kelas wajib sama persis dengan nama file .java (contoh: Pertemuan1_DasarJava.java).
3. public static void main(String[] args)
Fungsi utama yang akan dipanggil dan dijalankan pertama kali oleh Java saat program mulai dibuka.
4. System.out.println(...)
Perintah standar di Java untuk menampilkan teks atau nilai ke layar (output).
5. Aturan Penamaan (Naming Convention)
Dalam penulisan kode Java, terdapat standar penamaan yang sangat disarankan agar kode rapi dan mudah dibaca oleh developer lain:
    - **PascalCase:** Digunakan untuk penamaan Kelas (Class). Huruf pertama di setiap kata ditulis dengan huruf besar tanpa spasi. Contoh: SistemPerpustakaan, PerpustakaanDigital, atau BukuTeks.
    - **camelCase:** Digunakan untuk penamaan Variabel dan Fungsi/Method. Kata pertama diawali dengan huruf kecil, sedangkan kata-kata berikutnya diawali dengan huruf besar. Contoh: judulBuku, jumlahHalaman, atau hitungDenda().

### Output
Untuk menampilkan data atau teks ke layar konsol, digunakan perintah berikut:
- System.out.println() → mencetak teks ke layar, lalu otomatis memindahkan kursor ke baris baru (newline).
- System.out.print() → mencetak teks ke layar tanpa memindahkan kursor ke baris baru.

```java
System.out.print("Judul Buku: ");
System.out.println("Laskar Pelangi");
```

### Input
Untuk menerima input data dari pengguna melalui keyboard, digunakan kelas Scanner yang diimpor dari paket java.util (import java.util.Scanner;).

Beberapa fungsi pembacaan data yang sering digunakan pada Scanner:
- nextLine() → membaca input berupa teks atau kalimat (contoh: judul buku, nama peminjam).
- nextInt() → membaca input berupa angka bulat (contoh: jumlah halaman, stok buku).
- nextDouble() → membaca input berupa angka desimal (contoh: harga buku, nilai IPK).

```java
import java.util.Scanner;

public class InputBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Judul Buku: ");
        String judulBuku = input.nextLine(); // Membaca teks

        System.out.print("Masukkan Jumlah Halaman: ");
        int jumlahHalaman = input.nextInt(); // Membaca angka

        // Menampilkan kembali data yang dimasukkan pengguna
        System.out.println("\n--- DATA BUKU ---");
        System.out.println("Judul          : " + judulBuku);
        System.out.println("Jumlah Halaman : " + jumlahHalaman + " halaman");
    }
}
```

## PART 3: Variabel dan Tipe Data
Variabel adalah wadah di dalam memori komputer yang digunakan untuk menyimpan data sementara saat program berjalan. Dalam bahasa Java, setiap variabel wajib memiliki tipe data tertentu yang menentukan jenis nilai yang dapat disimpan di dalamnya.

Jenis Tipe Data Dasar
1. **int (integer):** menyimpan bilangan bulat tanpa desimal (contoh: stok buku, jumlah halaman, tahun terbit).
2. **double:** menyimpan bilangan desimal atau pecahan (contoh: 3.14, -8.8).
3. **boolean:** menyimpan nilai logika, hanya bernilai true (benar) atau false (salah) (contoh: status ketersediaan buku).
4. **String:** menyimpan teks atau kumpulan karakter (contoh: judul buku, nama pengarang, kategori).

---

## PART 4: Operator di Java
Operator adalah simbol yang digunakan dalam Java untuk melakukan operasi terhadap nilai atau variabel. Operator dapat digunakan untuk melakukan perhitungan, membandingkan nilai, menggabungkan kondisi, serta mengubah nilai suatu variabel.

Dalam Java, operator dapat dikelompokkan menjadi beberapa jenis, di antaranya:
### Operator Aritmatika
Operator aritmatika digunakan untuk melakukan perhitungan matematika terhadap nilai atau variabel.

| Operator | Nama | Contoh | Hasil |
|:---:|---|:---:|---:|
| `+` | Penjumlahan | `5 + 3` | `8` |
| `-` | Pengurangan | `5 - 3` | `2` |
| `*` | Perkalian | `5 * 3` | `15` |
| `/` | Pembagian | `10 / 2` | `5` |
| `%` | Modulus (Sisa Bagi) | `10 % 3` | `1` |

Contoh kode:
```java
public class Aritmatika {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1
    }
}
```

### Operator Relasi (Perbandingan)
Operator relasi atau operator perbandingan digunakan untuk membandingkan dua nilai.
Hasil dari operasi relasi selalu berupa nilai **boolean**, yaitu:
true → kondisi benar
false → kondisi salah

| Operator | Nama | Contoh | Hasil |
|:---:|---|:---:|:---:|
| `==` | Sama dengan | `5 == 3` | `false` |
| `!=` | Tidak sama dengan | `5 != 3` | `true` |
| `>` | Lebih besar dari | `5 > 3` | `true` |
| `<` | Lebih kecil dari | `5 < 3` | `false` |
| `>=` | Lebih besar atau sama dengan | `5 >= 5` | `true` |
| `<=` | Lebih kecil atau sama dengan | `3 <= 5` | `true` |

Contoh kode:
```java
public class Relasi {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
    }
}
```

### Operator Logika
Operator logika digunakan untuk menggabungkan atau membalikkan kondisi boolean. Biasanya dipakai pada percabangan (if, switch) atau perulangan.

| Operator | Nama | Contoh | Keterangan |
|:---:|---|---|---|
| `&&` | AND (Dan) | `(x > 3) && (y < 10)` | `true` jika semua kondisi benar |
| `\|\|` | OR (Atau) | `(x > 3) \|\| (y < 10)` | `true` jika minimal satu kondisi benar |
| `!` | NOT (Bukan) | `!(x > 3)` | Membalik nilai boolean |

Contoh kode:
```java
public class Logika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a);     // false
    }
}
```

---

## PART 5: Percabangan
Percabangan (selection statement) adalah struktur kontrol yang digunakan untuk mengatur alur eksekusi program berdasarkan suatu kondisi. Dengan percabangan, program dapat memilih tindakan yang berbeda sesuai dengan hasil evaluasi suatu ekspresi boolean (true atau false).

Dalam Java, terdapat tiga bentuk percabangan yang paling umum digunakan, yaitu if-else, if-else if, dan switch.

### If-Else
if-else merupakan bentuk percabangan paling sederhana yang digunakan ketika program hanya memiliki dua kemungkinan hasil, yaitu kondisi terpenuhi atau tidak terpenuhi.

Alur kerjanya adalah sebagai berikut:
- Kondisi pada if akan dievaluasi terlebih dahulu.
- Jika kondisi bernilai true, maka blok if dijalankan.
- Jika kondisi bernilai false, maka blok else dijalankan.

**Sintaks**
```java
if (kondisi) {
    // dijalankan jika kondisi bernilai true
} else {
    // dijalankan jika kondisi bernilai false
}
```

**Contoh Program**
```java
public class IfElse {
    public static void main(String[] args) {
        int nilai = 80;

        if (nilai >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
```

**Output:**
Lulus

Pada contoh di atas, variabel nilai bernilai 80. Karena kondisi nilai >= 75 bernilai true, program menampilkan "Lulus" dan mengabaikan bagian else.

### If-Else If
if-else if digunakan ketika program memiliki lebih dari dua kondisi yang perlu diperiksa. Setiap kondisi akan diuji secara berurutan dari atas ke bawah, dan hanya kondisi pertama yang bernilai benar yang akan dijalankan.

Struktur ini cocok digunakan untuk mengelompokkan data, seperti kategori nilai, usia, atau tingkat diskon.

**Sintaks**
```java
if (kondisi1) {
    // aksi 1
} else if (kondisi2) {
    // aksi 2
} else {
    // aksi jika semua kondisi salah
}
```

**Contoh Program**
```java
public class IfElseIf {
    public static void main(String[] args) {
        int nilai = 80;

        if (nilai >= 90) {
            System.out.println("Sangat Baik");
        } else if (nilai >= 75) {
            System.out.println("Baik");
        } else {
            System.out.println("Kurang");
        }
    }
}
```

**Output:**
Baik

Nilai 80 tidak memenuhi kondisi pertama (>= 90), sehingga program melanjutkan pemeriksaan ke kondisi berikutnya. Karena 80 >= 75, program menampilkan "Baik" dan tidak memeriksa kondisi lainnya.

## Switch
switch adalah bentuk percabangan yang digunakan untuk memilih satu aksi dari beberapa pilihan nilai yang tetap (konstan). Dibandingkan dengan if-else if, struktur switch lebih ringkas dan mudah dibaca ketika semua kondisi bergantung pada satu variabel yang sama.

Setiap pilihan ditulis menggunakan case, sedangkan default dijalankan apabila tidak ada nilai yang sesuai.

**Sintaks**
```java
switch (variabel) {
    case nilai1:
        // aksi
        break;
    case nilai2:
        // aksi
        break;
    default:
        // aksi jika tidak ada yang cocok
}
```

**Contoh Program**
```java
public class Switch {
    public static void main(String[] args) {
        int pilihan = 2;

        switch (pilihan) {
            case 1:
                System.out.println("Tambah Buku");
                break;
            case 2:
                System.out.println("Pinjam Buku");
                break;
            case 3:
                System.out.println("Kembalikan Buku");
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }
    }
}
```

**Output:**
Pinjam Buku

Pada contoh tersebut, nilai variabel pilihan adalah 2, sehingga program menjalankan case 2. Perintah break digunakan untuk menghentikan proses switch agar program tidak melanjutkan ke case berikutnya.

* **Perbedaan If-Else, If-Else If, dan Switch**
| Percabangan | Digunakan Ketika | Jumlah Kondisi |
|---|---|---|
| `if-else` | Hanya ada dua kemungkinan hasil | 2 |
| `if-else if` | Terdapat beberapa kondisi yang perlu diperiksa | Lebih dari 2 |
| `switch` | Memilih aksi berdasarkan satu variabel dengan nilai tertentu | Banyak pilihan |

---

## PART 6: Perulangan
Perulangan (looping) adalah struktur kontrol yang digunakan untuk menjalankan blok kode secara berulang selama kondisi tertentu terpenuhi. Perulangan membantu mengurangi penulisan kode yang sama secara berulang sehingga program menjadi lebih singkat dan efisien.

Dalam Java, terdapat tiga jenis perulangan yang umum digunakan, yaitu:
1. for
2. while
3. do-while

### For
Perulangan for biasanya digunakan ketika jumlah perulangan sudah diketahui atau dapat ditentukan sejak awal.

Struktur for terdiri dari tiga bagian utama:
- Inisialisasi: menentukan nilai awal variabel penghitung.
- Kondisi: menentukan apakah perulangan masih dapat dilakukan.
- Increment/Decrement: mengubah nilai variabel penghitung setiap perulangan.

**Sintaks**
```java
for (inisialisasi; kondisi; increment/decrement) {
    // kode yang diulang
}
```

**Contoh Program**
```java
public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
    }
}
```

**Output:**
Perulangan ke-1
Perulangan ke-2
Perulangan ke-3
Perulangan ke-4
Perulangan ke-5

Pada contoh tersebut:
- int i = 1 → menentukan nilai awal i yaitu 1.
- i <= 5 → perulangan berjalan selama i kurang dari atau sama dengan 5.
- i++ → nilai i bertambah 1 setiap perulangan.
Karena kondisi berhenti ketika i lebih besar dari 5, maka perulangan dilakukan sebanyak 5 kali.

### While
Perulangan while digunakan ketika jumlah perulangan belum tentu diketahui sejak awal dan perulangan bergantung pada suatu kondisi.

Pada while, kondisi diperiksa sebelum blok kode dijalankan. Jika kondisi bernilai true, blok kode akan dijalankan. Setelah itu, kondisi diperiksa kembali sampai menghasilkan false.

**Sintaks**
```java
while (kondisi) {
    // kode yang diulang
}
```

**Contoh Program**
```java
public class While {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }
    }
}
```

**Output:**
Perulangan ke-1
Perulangan ke-2
Perulangan ke-3
Perulangan ke-4
Perulangan ke-5

Pada contoh tersebut:
- int i = 1 → menentukan nilai awal i.
- i <= 5 → menjadi kondisi perulangan.
- i++ → menambah nilai i sebesar 1 setiap perulangan.
- Ketika i menjadi 6, kondisi i <= 5 bernilai false, sehingga perulangan berhenti.
Hal penting: Karena kondisi diperiksa terlebih dahulu, while dapat tidak menjalankan blok kode sama sekali jika kondisi awal bernilai false.

### Do-While
Perulangan do-while hampir sama dengan while, tetapi memiliki perbedaan pada urutan pemeriksaan kondisi.

Pada do-while, blok kode dijalankan terlebih dahulu, kemudian kondisi diperiksa. Oleh karena itu, blok kode pada do-while pasti dijalankan minimal satu kali, meskipun kondisi awal bernilai false.

**Sintaks**
```java
do {
    // kode yang diulang
} while (kondisi);
```

**Contoh Program**
```java
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Perulangan ke-" + i);
            i++;
        } while (i <= 5);
    }
}
```

**Output**
Perulangan ke-1
Perulangan ke-2
Perulangan ke-3
Perulangan ke-4
Perulangan ke-5

* **Pada contoh tersebut:**
    - Nilai awal i adalah 1.
    - Blok do dijalankan terlebih dahulu.
    - Nilai i bertambah dengan i++.
    - Kondisi i <= 5 kemudian diperiksa.
    - Jika kondisi true, perulangan kembali ke bagian do.
    - Jika kondisi false, perulangan berhenti.

* **Perbedaan while dan do-while**
    Perbedaan utama keduanya terletak pada waktu pemeriksaan kondisi:
    - while → kondisi diperiksa terlebih dahulu, kemudian kode dijalankan.
    - do-while → kode dijalankan terlebih dahulu, kemudian kondisi diperiksa.

Contoh Sederhana:
```java
int i = 10;

while (i <= 5) {
    System.out.println("Hello");
}
```

Kode di atas tidak akan mencetak apa pun karena kondisi 10 <= 5 langsung bernilai false.

Sedangkan:
```java
int i = 10;

do {
    System.out.println("Hello");
} while (i <= 5);
```
Kode tersebut akan mencetak:
Hello

karena blok do dijalankan minimal satu kali sebelum kondisi diperiksa.

* **Ringkasan Perulangan**
| Perulangan | Kegunaan | Pemeriksaan Kondisi |
|---|---|---|
| `for` | Digunakan ketika jumlah perulangan sudah diketahui | Sebelum perulangan |
| `while` | Digunakan ketika perulangan bergantung pada suatu kondisi | Sebelum perulangan |
| `do-while` | Digunakan ketika kode harus dijalankan minimal satu kali | Setelah perulangan |

## Challenge Praktikan
1. Buat program untuk meminta input harga buku dan jumlah buku, kemudian hitung dan tampilkan total harga pembelian.
2. Buat program yang meminta input nilai mahasiswa, kemudian tentukan keterangan nilai menggunakan if-else if:
    A) jika nilai ≥ 85
    B) jika nilai ≥ 75
    C) jika nilai ≥ 65
    D) jika nilai < 65
3. Buat program menggunakan perulangan for untuk menampilkan angka 1 sampai 10, kemudian gunakan switch untuk menampilkan keterangan berdasarkan angka yang dipilih pengguna.

---

# Pertemuan 1 - Collection

---

## 🎯 Tujuan Pembelajaran

Setelah mengikuti pertemuan ini, Anda diharapkan mampu:

1. ✅ Memahami pengertian **Collection** dan **Collection Framework** dalam Java.
2. ✅ Memahami konsep dasar **Array** sebagai struktur penyimpanan data dalam Java.
3. ✅ Membuat dan menggunakan **Array** untuk menyimpan sekumpulan data.
4. ✅ Memahami konsep **ArrayList** sebagai salah satu implementasi Collection dalam Java.
5. ✅ Membuat dan menggunakan **ArrayList** untuk menyimpan dan mengelola data.
6. ✅ Memahami perbedaan antara **Array** dan **ArrayList** serta menentukan penggunaannya sesuai kebutuhan program.

---

## 🔑 KATA KUNCI UTAMA (KEY WORDS)

Pada materi ini, terdapat beberapa kata kunci utama yang perlu dipahami fungsi dan penggunaannya:

* **`Collection`** : Kumpulan objek yang digunakan untuk menyimpan dan mengelola sekumpulan data dalam program Java.
* **`Collection Framework`** : Sekumpulan *interface* dan *class* yang disediakan Java untuk membantu proses penyimpanan dan pengelolaan data.
* **`Array`** : Struktur data yang digunakan untuk menyimpan beberapa nilai dengan tipe data yang sama dalam satu variabel.
* **`Index`** : Posisi suatu data di dalam Array atau ArrayList yang dimulai dari angka `0`.
* **`ArrayList`** : Salah satu implementasi Collection dalam Java yang digunakan untuk menyimpan dan mengelola sekumpulan data secara dinamis.
* **`List`** : Interface dalam Collection Framework yang digunakan untuk menyimpan data secara berurutan dan memungkinkan adanya data yang sama.
* **`Size`** : Jumlah elemen yang tersimpan di dalam ArrayList.

---

## 📂 RESOURCES

💡 **File demo tersedia di folder `contoh_kode/pertemuan_2/`**

| **File** | **Deskripsi** |
|---|---|
| `src/pertemuan2_collection/Array.java` | Kelas demonstrasi penggunaan Array |
| `src/pertemuan2_collection/ArrayList.java` | Kelas demonstrasi penggunaan ArrayList |
| `src/pertemuan2_collection/PerbandinganArray.java` | Kelas demonstrasi perbedaan Array dan ArrayList |

---

## 📋 PERSIAPAN SEBELUM MEMULAI

Sebelum memulai materi ini, pastikan Anda sudah memahami dasar-dasar pemrograman Java dari pertemuan sebelumnya, terutama:

- [ ] Apache NetBeans IDE / IDE pilihan sudah terbuka.
- [ ] JDK terkonfigurasi dengan benar.
- [ ] Memahami dasar-dasar pemrograman Java.
- [ ] Memahami penggunaan variabel, tipe data, operator, percabangan, dan perulangan.
- [ ] Mampu membuat dan menjalankan program Java sederhana.

---

## PART 1: Pengertian Collection
Collection adalah kumpulan objek yang digunakan untuk menyimpan dan mengelola sekumpulan data dalam program Java. Java menyediakan Collection Framework, yaitu sekumpulan interface dan class yang dapat digunakan untuk mempermudah proses penyimpanan dan pengelolaan data.

Collection menyediakan berbagai fitur untuk mengelola data, seperti menambahkan, menghapus, mencari, dan mengakses data sesuai kebutuhan program. Dalam Java, Collection memiliki beberapa bentuk utama, seperti List, Set, dan Map, yang masing-masing memiliki karakteristik dan penggunaan yang berbeda.

### Array & ArrayList

1. **Array**

Array adalah struktur data yang digunakan untuk menyimpan beberapa data dalam satu variabel. Data yang disimpan dalam Array memiliki tipe data yang sama dan setiap data dapat diakses menggunakan index.

Ukuran Array ditentukan saat Array dibuat dan tidak dapat diubah setelahnya. Index pada Array dimulai dari 0, sehingga elemen pertama berada pada index 0.

**Contoh Kode:**

```java
public class ContohArray {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("     CONTOH 1: ARRAY KONVENSIONAL         ");
        System.out.println("==========================================");

        // 1. Deklarasi Array String dengan ukuran TETAP (3 slot)
        String[] daftarBuku = new String[3];

        // 2. Mengisi data ke dalam Array berdasarkan Indeks
        daftarBuku[0] = "Pemrograman Java";
        daftarBuku[1] = "Struktur Data";
        daftarBuku[2] = "Basis Data";

        // *CATATAN: Jika kita coba tambah data ke-4 di bawah ini, program akan ERROR
        // (ArrayIndexOutOfBoundsException) karena ukurannya sudah dikunci hanya 3!
        // daftarBuku[3] = "Jaringan Komputer"; 

        // 3. Menampilkan jumlah slot Array (.length)
        System.out.println("Kapasitas/Ukuran Array : " + daftarBuku.length);
        System.out.println("------------------------------------------");

        // 4. Menampilkan semua isi Array menggunakan Perulangan (For Loop)
        System.out.println("Daftar Buku di Array:");
        for (int i = 0; i < daftarBuku.length; i++) {
            System.out.println("Indeks ke-" + i + " : " + daftarBuku[i]);
        }
    }
}
```

**Hasil Program:**
==========================================
     CONTOH 1: ARRAY KONVENSIONAL
==========================================
Kapasitas/Ukuran Array : 3
------------------------------------------
Daftar Buku di Array:
Indeks ke-0 : Pemrograman Java
Indeks ke-1 : Struktur Data
Indeks ke-2 : Basis Data

* **Membuat Array:**
```java
String[] daftarBuku = new String[3];
```
Membuat Array daftarBuku yang dapat menyimpan 3 data bertipe String.
* **Mengisi Data**
```java
daftarBuku[0] = "Pemrograman Java";
daftarBuku[1] = "Struktur Data";
daftarBuku[2] = "Basis Data";
```
Data dimasukkan berdasarkan index. Index Array dimulai dari 0, sehingga data tersebut berada pada index 0, 1, dan 2.
* **Mengetahui Ukuran Array**
```java
daftarBuku.length
```
length digunakan untuk mengetahui ukuran Array. Pada contoh ini, hasilnya adalah 3.
* **Menampilkan Data**
```java
for (int i = 0; i < daftarBuku.length; i++) {
    System.out.println("Indeks ke-" + i + " : " + daftarBuku[i]);
}
```
Perulangan for digunakan untuk menampilkan seluruh data dalam Array berdasarkan index.

2. **ArrayList**

ArrayList adalah salah satu implementasi dari List dalam Collection Framework Java yang digunakan untuk menyimpan dan mengelola sekumpulan data.

Berbeda dengan Array yang memiliki ukuran tetap, ukuran ArrayList dapat bertambah atau berkurang sesuai dengan jumlah data yang disimpan. ArrayList juga menyediakan berbagai method untuk membantu pengelolaan data, seperti add(), remove(), dan get().

**Contoh Kode**

```java
import java.util.ArrayList;

public class ContohArrayList {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("        CONTOH 2: JAVA ARRAYLIST          ");
        System.out.println("==========================================");

        // 1. Deklarasi ArrayList String (Ukuran FLEKSIBEL/DINAMIS)
        ArrayList<String> daftarBuku = new ArrayList<>();

        // 2. Mengisi data menggunakan method .add()
        // Bebas menambah berapa pun tanpa takut kehabisan slot!
        daftarBuku.add("Pemrograman Java");
        daftarBuku.add("Struktur Data");
        daftarBuku.add("Basis Data");
        daftarBuku.add("Jaringan Komputer"); // Tambah data ke-4 dengan aman!

        // 3. Menampilkan jumlah elemen yang tersimpan (.size())
        System.out.println("Jumlah Elemen Terisi   : " + daftarBuku.size());
        System.out.println("------------------------------------------");

        // 4. Menampilkan semua isi ArrayList menggunakan Perulangan (For Loop)
        System.out.println("Daftar Buku di ArrayList:");
        for (int i = 0; i < daftarBuku.size(); i++) {
            // Mengambil elemen menggunakan method .get(indeks)
            System.out.println("Indeks ke-" + i + " : " + daftarBuku.get(i));
        }
    }
}
```

**Hasil Program:**
==========================================
        CONTOH 2: JAVA ARRAYLIST
==========================================
Jumlah Elemen Terisi   : 4
------------------------------------------
Daftar Buku di ArrayList:
Indeks ke-0 : Pemrograman Java
Indeks ke-1 : Struktur Data
Indeks ke-2 : Basis Data
Indeks ke-3 : Jaringan Komputer

* **Membuat ArrayList**
```java
ArrayList<String> daftarBuku = new ArrayList<>();
```
Membuat ArrayList bernama daftarBuku yang digunakan untuk menyimpan data bertipe String. Berbeda dengan Array, ArrayList memiliki ukuran yang fleksibel.
* **Menambahkan Data**
```java
daftarBuku.add("Pemrograman Java");
daftarBuku.add("Struktur Data");
daftarBuku.add("Basis Data");
daftarBuku.add("Jaringan Komputer");
```
Method add() digunakan untuk menambahkan data ke dalam ArrayList. Data dapat terus ditambahkan sesuai kebutuhan.
* **Mengetahui Jumlah Data**
```java
daftarBuku.size()
```
Method size() digunakan untuk mengetahui jumlah data yang tersimpan di dalam ArrayList. Pada contoh ini, terdapat 4 data.
* **Menampilkan Data**
```java
for (int i = 0; i < daftarBuku.size(); i++) {
    System.out.println("Indeks ke-" + i + " : " + daftarBuku.get(i));
}
```
Perulangan for digunakan untuk menampilkan seluruh data dalam ArrayList.

Method get(i) digunakan untuk mengambil data berdasarkan index. Sama seperti Array, index ArrayList dimulai dari 0.

3. Perbedaan Array & ArrayList
Array dan ArrayList sama-sama digunakan untuk menyimpan sekumpulan data. Namun, keduanya memiliki beberapa perbedaan dalam ukuran, tipe data, dan cara pengelolaan datanya.

| **Aspek** | **Array** | **ArrayList** |
|---|---|---|
| Ukuran | Tetap setelah dibuat | Dapat bertambah atau berkurang |
| Tipe Data | Dapat menyimpan tipe primitif dan objek | Menyimpan objek |
| Akses Data | Menggunakan index | Menggunakan index |
| Menambah Data | Menggunakan index | Menggunakan `add()` |
| Menghapus Data | Tidak memiliki method khusus | Menggunakan `remove()` |
| Jumlah Data | Menggunakan `length` | Menggunakan `size()` |
| Mencari Data | Tidak memiliki method bawaan khusus | Dapat menggunakan `contains()` |

**Contoh Perbandingan:**
- Array
```java
String[] buku = new String[3];

buku[0] = "Java";
buku[1] = "Python";
buku[2] = "C++";

System.out.println(buku.length);
```

- ArrayList
```java
ArrayList<String> buku = new ArrayList<>();

buku.add("Java");
buku.add("Python");
buku.add("C++");

System.out.println(buku.size());
```

Pada kedua contoh tersebut, data dapat diakses berdasarkan index. Perbedaannya, ukuran Array sudah ditentukan sejak awal, sedangkan ArrayList dapat menyesuaikan jumlah data yang ditambahkan.

**Catatan:** ArrayList hanya dapat menyimpan objek. Untuk tipe data primitif seperti int, digunakan wrapper class seperti Integer. Java akan melakukan autoboxing secara otomatis saat nilai tersebut dimasukkan ke dalam ArrayList.