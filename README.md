# DS-THR-Andi-Arjuna-Putra

Disclaimer!!
semua tugas di dalam sini tidak semua pure dari saya, hampir semua tugas ini di kerjakan oleh Ai generated.

**Tentang Tugas**

Tugas ini berfokus pada penerapan dua struktur data dasar—Stack dan Queue—untuk menyelesaikan berbagai skenario pemrograman. Intinya, kita belajar memahami kapan harus menggunakan prinsip LIFO (Last In First Out) dan kapan harus memakai FIFO (First In First Out) agar alur data bisa dikelola dengan baik.

**Apa yg tugas ini minta**

Dalam tugas ini, soal meminta untuk:
- Membuat implementasi Stack untuk fitur seperti riwayat, membalik urutan data, dan menghindari duplikasi di bagian atas tumpukan.
- Membuat implementasi Queue untuk mengatur antrean dan memproses data sesuai urutan kedatangan.
- Menangani input yang kompleks dan dinamis dengan batasan tertentu.
- Menghasilkan output yang sesuai, baik dari segi nilai maupun format (misalnya penggunaan tanda |, ->, atau spasi).

**Gambaran Pengerjaan**

Pengerjaan dilakukan menggunakan bahasa pemrograman Java, dengan memanfaatkan Java Collection Framework. Berikut ringkasan tiap soal:
- Soal 1 (Forbidden Bridge): Menggunakan logika Greedy untuk mencari kombinasi penyeberangan tercepat. Stack dan Queue dipakai untuk melacak siapa yang sudah menyeberang dan siapa yang harus kembali membawa lampu.
- Soal 2 (Confusing Calculator): Menggabungkan operasi Stack.pop() dan Queue.poll() secara bergantian untuk mengekstrak karakter unik dari dua grup input.
- Soal 3 (Room Key): Queue digunakan untuk menyimpan daftar peminjam, sementara Stack menampung hasil proses. Pemilihan siapa yang diproses ditentukan oleh string indeks prioritas.
- Soal 4 (Card Pile): Menggunakan nested list of stacks. Program membaca data secara terbalik (LIFO), lalu menaruh kartu ke tumpukan berikutnya jika kartu yang sama sudah ada di tumpukan saat ini.
- Soal 5 (Card Game): Simulasi permainan kartu. Setiap kartu yang dimainkan disimpan ke dalam Stack. Setelah permainan selesai, riwayat permainan ditampilkan dengan cara membongkar Stack satu per satu.

**Cara Menjalankan Program**

- Pastikan perangkat sudah terinstal JDK (Java Development Kit).
- Buka terminal atau Command Prompt di folder tempat file .java disimpan.
- Kompilasi kode dengan perintah:
javac NamaFile.java
- Jalankan program dengan:
java NamaFile
- Masukkan input sesuai format TestCase. Untuk soal dengan input panjang (seperti nomor 4 dan 5), tekan Enter dua kali agar output diproses.

**Penjelasan Output**

Output yang dihasilkan mencerminkan hasil akhir dari manipulasi Stack dan Queue:
- Urutan Terbalik: Pada soal yang menggunakan Stack (misalnya nomor 4 dan 5), data terakhir yang masuk akan muncul pertama kali di output.
- Format Spesifik: Output mengikuti aturan penulisan yang diminta di soal, termasuk penggunaan spasi dan simbol pemisah.
- Status Kondisi: Jika ada batas waktu atau aturan yang tidak terpenuhi (contoh pada soal 1), program akan menampilkan status tambahan seperti Non-survivors.

**Referensi**
- Dokumentasi resmi Java: java.util.Stack & java.util.LinkedList (untuk Queue).
- Konsep dasar LIFO dan FIFO pada struktur data.
- Algoritma optimasi penyeberangan (Bridge and Torch Problem).
- Gemini
