import java.util.*;

public class CardSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membaca semua baris input karena kartu tersebar di beberapa baris
        StringBuilder fullInput = new StringBuilder();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            fullInput.append(line).append(" ");
        }
        
        // Memisahkan kartu berdasarkan spasi
        String[] allCards = fullInput.toString().trim().split("\\s+");
        
        // Menggunakan List of List untuk menampung beberapa tumpukan (Stack)
        List<List<String>> stacks = new ArrayList<>();
        stacks.add(new ArrayList<>());

        // LOGIKA KRITIS: LIFO (Ambil dari kartu paling terakhir/kanan)
        for (int i = allCards.length - 1; i >= 0; i--) {
            String currentCard = allCards[i];
            boolean placed = false;

            // Cek setiap stack yang sudah ada
            for (List<String> s : stacks) {
                if (!s.contains(currentCard)) {
                    s.add(currentCard); // Tambahkan jika belum ada duplikat di stack ini
                    placed = true;
                    break;
                }
            }

            // Jika semua stack yang ada sudah memiliki kartu tersebut, buat stack baru
            if (!placed) {
                List<String> newStack = new ArrayList<>();
                newStack.add(currentCard);
                stacks.add(newStack);
            }
        }

        // OUTPUT: Cetak isi setiap stack
        for (List<String> s : stacks) {
            for (int j = 0; j < s.size(); j++) {
                System.out.print(s.get(j) + (j == s.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        
        sc.close();
    }
}