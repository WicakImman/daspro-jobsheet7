import java.util.Scanner;

public class SiakadFor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nilai, tertinggi, terendah;
        tertinggi = 0;
        terendah = 100;
        int lulus = 0;
        int tidakLulus = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            
            if (nilai < terendah) {
                terendah = nilai;
            }
            
            // Cek kelulusan (batas minimal 60)
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        
        System.out.println("\nNilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        
        sc.close();
    }
}