import java.util.Scanner;
public class SiakadWhile06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        int nilai, jml, i;
        int lulus = 0, tidakLulus = 0;
        int nilaiTertinggi = 0, nilaiTerendah = 100;
        i = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();
        
        while (i < jml) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai = sc.nextInt();
            
            if (nilai >= 0 && nilai <= 100) {
                // Update nilai tertinggi dan terendah
                if (nilai > nilaiTertinggi) {
                    nilaiTertinggi = nilai;
                }
                if (nilai < nilaiTerendah) {
                    nilaiTerendah = nilai;
                }
                
                // Hitung mahasiswa lulus dan tidak lulus
                if (nilai >= 60) {
                    lulus++;
                } else {
                    tidakLulus++;
                }
                
                // Tampilkan grade
                if (nilai >= 80 && nilai <= 100) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                    System.out.println("Bagus, pertahankan nilainya!");
                } else if (nilai >= 73 && nilai < 80) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
                } else if (nilai >= 65 && nilai < 73) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
                } else if (nilai >= 60 && nilai < 65) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
                } else if (nilai >= 50 && nilai < 60) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
                } else if (nilai >= 39 && nilai < 50) {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
                } else {
                    System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
                }
                i++;
            } else {
                System.out.println("Nilai tidak valid! Masukkan nilai antara 0-100");
            }
        }
        
        // Tampilkan statistik
        System.out.println("\n=== STATISTIK NILAI ===");
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);
        
        sc.close();
    }
}