package library;
import java.util.Scanner;

public class libraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        perpustakaan perpustakaan = new perpustakaan();

        while (true) {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.println("8. Total buku yang ada di perpustakaan");
            System.out.println("9. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilih = scanner.nextInt();

            if (pilih == 1) {
                perpustakaan.showType("Teknologi", perpustakaan.buku_teknologi);
            } else if (pilih == 2) {
                perpustakaan.showType("Filsafat", perpustakaan.buku_filsafat);
            } else if (pilih == 3) {
                perpustakaan.showType("Sejarah", perpustakaan.buku_sejarah);
            } else if (pilih == 4) {
                perpustakaan.showType("Agama", perpustakaan.buku_agama);
            } else if (pilih == 5) {
                perpustakaan.showType("Psikologi", perpustakaan.buku_psikologi);
            } else if (pilih == 6) {
                perpustakaan.showType("Politik", perpustakaan.buku_politik);
            } else if (pilih == 7) {
                perpustakaan.showType("Fiksi", perpustakaan.buku_fiksi);
            } else if (pilih == 8) {
                System.out.println("Total buku yang ada di perpustakaan ini berjumlah 35 buku.");
            } else if (pilih == 9) {
                System.out.println("Terima kasih! Sampai jumpa lagi.");
                scanner.close();
                return;
            } else {
                System.out.println("Pilihan tidak valid. Silakan memilih pilihan yang tersedia.");
            }
        }
    }
}


