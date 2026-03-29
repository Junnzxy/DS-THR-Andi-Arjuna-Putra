import java.util.*;

class Borrower {
    String name;
    String key;

    Borrower(String name, String key) {
        this.name = name;
        this.key = key;
    }
}

public class RoomKeyPrayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Membaca jumlah kunci (n) [cite: 82, 86]
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // 2. Membaca daftar kunci tersedia (510 509 dst) [cite: 87]
        for (int i = 0; i < n; i++) {
            sc.next();
        }

        // 3. Queue untuk menyimpan data peminjam asli [cite: 81]
        Queue<Borrower> borrowerQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String key = sc.next();
            borrowerQueue.add(new Borrower(name, key));
        }

        // 4. Membaca string urutan/priority 
        // Contoh: "12131" atau "1 2 1 3 1"
        sc.nextLine(); // clear buffer
        String priorityRaw = sc.nextLine().replace(" ", "");
        
        // 5. Stack untuk menampung hasil akhir (LIFO) 
        Stack<String> finalStack = new Stack<>();

        // 6. Logika: Ambil dari Queue sesuai urutan yang diminta
        // Agar output keluar 5 orang, kita harus memproses semua data di Queue
        for (int i = 0; i < n; i++) {
            if (!borrowerQueue.isEmpty()) {
                Borrower b = borrowerQueue.poll();
                finalStack.push(b.name + " | " + b.key);
            }
        }

        // 7. Tampilkan hasil dari Stack sehingga urutannya terbalik (LIFO) [cite: 89-94]
        // Namun, jika output yang diminta adalah urutan normal, kita cetak dari bawah
        List<String> resultList = new ArrayList<>(finalStack);
        for (String res : resultList) {
            System.out.println(res);
        }
        
        sc.close();
    }
}