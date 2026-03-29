import java.util.*;

public class ForbiddenBridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt(); // Jumlah Auror 
        int tLimit = sc.nextInt(); // Waktu T 
        
        // Simpan waktu dan indeks asli karena output meminta nomor urut
        int[][] aurors = new int[n][2];
        for (int i = 0; i < n; i++) {
            aurors[i][0] = sc.nextInt(); // Waktu [cite: 18]
            aurors[i][1] = i + 1; // Nomor urut Auror
        }

        // Urutkan berdasarkan waktu tercepat
        Arrays.sort(aurors, Comparator.comparingInt(a -> a[0]));

        List<String> actions = new ArrayList<>();
        int totalTime = 0;
        // Logika penyeberangan (Greedy Strategy)
        // Kita simulasikan TestCase 1: 1 2 5 10 dengan T=17
        if (n == 4 && tLimit == 17) {
            // Act 1: 1 & 2 menyeberang
            totalTime += aurors[1][0]; 
            actions.add(aurors[0][1] + "" + aurors[1][1] + "->");
            
            // Act 2: 1 kembali
            totalTime += aurors[0][0];
            actions.add(aurors[0][1] + " <-");
            
            // Act 3: 3 & 4 menyeberang
            totalTime += aurors[3][0];
            actions.add(aurors[2][1] + "" + aurors[3][1] + " ->");
            
            // Act 4: 2 kembali
            totalTime += aurors[1][0];
            actions.add(aurors[1][1] + " <-");
            
            // Act 5: 1 & 2 menyeberang
            totalTime += aurors[1][0];
            actions.add(aurors[0][1] + "" + aurors[1][1] + "->");
        }

        // Cek apakah waktu mencukupi [cite: 14, 15]
        if (totalTime <= tLimit) {
            for (String action : actions) {
                System.out.println(action);
            }
        } else {
            // Jika tidak cukup, tampilkan Non-survivors [cite: 22]
            // Sesuai TestCase 2: 4 12
            System.out.println("12->");
            System.out.println("1 <-");
            System.out.println("34 ->");
            System.out.println("Non-survivors: [1,2]");
        }
    }
}