import java.util.Scanner;

public class TiketBioskop06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahTiket;
        int hargaPerTiket = 50000;
        int totalTiket = 0;
        double totalHarga = 0;
        double diskon = 0;
        
        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.println("Harga tiket: Rp " + hargaPerTiket + " per tiket");
        System.out.println("Diskon:");
        System.out.println("- Beli > 4 tiket: diskon 10%");
        System.out.println("- Beli > 10 tiket: diskon 15%");
        System.out.println("========================================\n");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket < 0) {
                System.out.println("Input selesai.\n");
                break;
            }
            
            if (jumlahTiket == 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan input ulang.\n");
                continue;
            }
            
            double hargaSebelumDiskon = jumlahTiket * hargaPerTiket;
            
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            } else {
                diskon = 0; 
            }
            
            double potonganDiskon = hargaSebelumDiskon * diskon;
            double hargaSetelahDiskon = hargaSebelumDiskon - potonganDiskon;
            
            System.out.println("\nDetail Transaksi");
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Harga sebelum diskon: Rp " + (int)hargaSebelumDiskon);
            
            if (diskon > 0) {
                System.out.println("Diskon: " + (int)(diskon * 100) + "%");
                System.out.println("Potongan: Rp " + (int)potonganDiskon);
            } else {
                System.out.println("Tidak ada diskon");
            }
            
            System.out.println("Harga setelah diskon: Rp " + (int)hargaSetelahDiskon);
            System.out.println("------------------------\n");
            
            totalTiket += jumlahTiket;
            totalHarga += hargaSetelahDiskon;
        }
        

        System.out.println("TOTAL PENJUALAN HARI INI");
        System.out.println("Total tiket terjual: " + totalTiket + " tiket");
        System.out.println("Total harga penjualan: Rp " + (int)totalHarga);

        
        sc.close();
    }
}