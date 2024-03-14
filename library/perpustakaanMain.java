package library;
import java.util.Scanner;

public class perpustakaanMain {

    public static void main(String[] args) {
        perpustakaan buku = new perpustakaan();
        Scanner input = new Scanner(System.in);
        perpustakaan perpustakaan = new perpustakaan();
        
        System.out.println("Kategori buku :\n" + "- teknologi\n" + "- filsafat\n" + "- sejarah\n" + "- agama\n" + "- psikologi\n" + "- politik\n" + "- fiksi\n\n" + "silakan pilih kategori buku : ");

        String kategori = input.nextLine();
        String hasilPencarian = buku.outputPerpus(kategori);

        System.out.println("---------------------------------------");
        System.out.println(hasilPencarian);
      
    }
       
}

