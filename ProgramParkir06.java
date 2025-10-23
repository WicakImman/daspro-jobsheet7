import java.util.Scanner;

public class ProgramParkir06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String inputJenis;
        int jenis, durasi, total;
        total = 0;
        
        System.out.println("=== PROGRAM PERHITUNGAN BIAYA PARKIR ===");
        System.out.println("Jenis Kendaraan:");
        System.out.println("1 / Mobil");
        System.out.println("2 / Motor");
        System.out.println("=========================================\n");
        
        // Loop untuk input parkir
        while (true) {
            System.out.print("Masukkan jenis kendaraan (1/Mobil, 2/Motor, 0/Keluar): ");
            inputJenis = sc.next();
            
            // Konversi input ke angka
            if (inputJenis.equals("0") || inputJenis.equalsIgnoreCase("Keluar")) {
                break;
            } else if (inputJenis.equals("1") || inputJenis.equalsIgnoreCase("Mobil")) {
                jenis = 1;
            } else if (inputJenis.equals("2") || inputJenis.equalsIgnoreCase("Motor")) {
                jenis = 2;
            } else {
                System.out.println("Jenis kendaraan tidak valid!\n");
                continue;
            }
            
            System.out.print("Input durasi parkir (jam): ");
            durasi = sc.nextInt();
            
            // Hitung biaya berdasarkan durasi dan jenis
            if (durasi > 5) {
                // Durasi lebih dari 5 jam = tarif tetap 12500
                total = total + 12500;
                System.out.println("Biaya parkir: Rp 12500");
            } else if (durasi > 0) {
                // Durasi 1-5 jam
                if (jenis == 1) {
                    // Mobil: 3000 per jam
                    total = total + (durasi * 3000);
                    System.out.println("Biaya parkir: Rp " + (durasi * 3000));
                } else {
                    // Motor: 2000 per jam
                    total = total + (durasi * 2000);
                    System.out.println("Biaya parkir: Rp " + (durasi * 2000));
                }
            } else {
                System.out.println("Durasi tidak valid!");
            }
            
            System.out.println();
        }
        
        // Tampilkan total
        System.out.println("\n=========================================");
        System.out.println("TOTAL PEMBAYARAN PARKIR: Rp " + total);
        System.out.println("=========================================");
        
        sc.close();
    }
}