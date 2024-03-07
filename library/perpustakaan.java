package library;

public class perpustakaan {
    
    public String[][] buku_teknologi = {
        {"judul", "Indonesia Digital, Kiat Sukses Berbisnis Online", "penulis", "Arif Budiman", "tahun_terbit", "2018"},
        {"judul", "Panduan Lengkap Internet Marketing", "penulis", "Ari Kuncoro", "tahun_terbit", "2016"},
        {"judul", "Bisnis Online, Jalan Sukses Berjualan di Internet", "penulis", "Budi Handoko", "tahun_terbit", "2019"},
        {"judul", "Revolusi Digital Indonesia", "penulis", "Cahyo Kumolo", "tahun_terbit", "2020"},
        {"judul", "Strategi Sukses Berjualan di Marketplace", "penulis", "Dewi Ratih", "tahun_terbit", "2021"}
    };
    
    public String[][] buku_filsafat = {
        {"judul", "Pemikiran Kritis: Sebuah Pengantar", "penulis", "Eko Susanto", "tahun_terbit", "2017"},
        {"judul", "Etika: Pandangan dari Berbagai Perspektif", "penulis", "Rini Wijayanti", "tahun_terbit", "2015"},
        {"judul", "Filsafat Hidup Bahagia", "penulis", "Yoga Pramudito", "tahun_terbit", "2019"},
        {"judul", "Metafisika: Studi tentang Hakikat Wujud", "penulis", "Rika Rahayu", "tahun_terbit", "2022"},
        {"judul", "Panduan Berpikir Filosofis", "penulis", "Satrio Kusumo", "tahun_terbit", "2018"}
    };
    
    public String[][] buku_sejarah = {
        {"judul", "Sejarah Peradaban Manusia", "penulis", "Bambang Setiawan", "tahun_terbit", "2015"},
        {"judul", "Perang Dunia II: Kilas Balik Sejarah", "penulis", "Diana Fitri", "tahun_terbit", "2019"},
        {"judul", "Sejarah Indonesia Modern", "penulis", "Ahmad Prasetyo", "tahun_terbit", "2020"},
        {"judul", "Dinasti-dinasti Tiongkok Kuno", "penulis", "Widya Paramita", "tahun_terbit", "2018"},
        {"judul", "Perjalanan Sejarah Mesir Kuno", "penulis", "Adi Purnama", "tahun_terbit", "2017"}
    };
    
    public String[][] buku_agama = {
        {"judul", "Pemahaman Agama dalam Kehidupan", "penulis", "Bambang Surya", "tahun_terbit", "2019"},
        {"judul", "Tafsir Al-Quran: Panduan Lengkap", "penulis", "Fatimah Hidayat", "tahun_terbit", "2016"},
        {"judul", "Injil: Ajaran dan Makna", "penulis", "Agus Santoso", "tahun_terbit", "2021"},
        {"judul", "Buddhism for Beginners", "penulis", "Diana Lee", "tahun_terbit", "2018"},
        {"judul", "Hinduism: Sacred Texts and Beliefs", "penulis", "I Made Surya", "tahun_terbit", "2020"}
    };
    
    public String[][] buku_psikologi = {
        {"judul", "Psikologi Kepribadian", "penulis", "Bambang Jaya", "tahun_terbit", "2021"},
        {"judul", "Terapi Kognitif: Pendekatan Praktis", "penulis", "Citra Dewi", "tahun_terbit", "2017"},
        {"judul", "Psikologi Anak: Mengembangkan Potensi Sejak Dini", "penulis", "Ratna Wijaya", "tahun_terbit", "2019"},
        {"judul", "Mindfulness for Stress Reduction", "penulis", "Yoga Santoso", "tahun_terbit", "2018"},
        {"judul", "Psikologi Positif: Membangun Kebahagiaan", "penulis", "Rani Susanti", "tahun_terbit", "2022"}
    };
    
    public String[][] buku_politik = {
        {"judul", "Dinamika Politik Modern", "penulis", "Bambang Pratama", "tahun_terbit", "2017"},
        {"judul", "Globalization and International Relations", "penulis", "Lily Wijaya", "tahun_terbit", "2020"},
        {"judul", "Demokrasi: Teori dan Praktik", "penulis", "Andi Sutomo", "tahun_terbit", "2019"},
        {"judul", "Korupsi dalam Sistem Politik", "penulis", "Sari Puspita", "tahun_terbit", "2018"},
        {"judul", "Negara dan Kebijakan Publik", "penulis", "Dini Pratiwi", "tahun_terbit", "2021"}
    };
    
    public String[][] buku_fiksi = {
        {"judul", "Petualangan Bambang di Dunia Fantasi", "penulis", "Bambang Adventures", "tahun_terbit", "2022"},
        {"judul", "Misteri Malam Jumat", "penulis", "Ratih Suryani", "tahun_terbit", "2016"},
        {"judul", "Cinta di Balik Kabut Pagi", "penulis", "Bayu Wijaya", "tahun_terbit", "2020"},
        {"judul", "Dunia yang Terlupakan", "penulis", "Sita Rahayu", "tahun_terbit", "2018"},
        {"judul", "Harmoni Alam: Kisah Mistis di Desa Seram", "penulis", "Dini Fitri", "tahun_terbit", "2019"}
    };

   
    public static void main(String[] args) {
        perpustakaan library = new perpustakaan();

        library.showType("Teknologi", library.buku_teknologi);
        library.showType("Filsafat", library.buku_filsafat);
        library.showType("Sejarah", library.buku_sejarah);
        library.showType("Agama", library.buku_agama);
        library.showType("Psikologi", library.buku_psikologi);
        library.showType("Politik", library.buku_politik);
        library.showType("Fiksi", library.buku_fiksi);
    }

    public static void showType(String category, String[][] books) {
        System.out.println("\nTabel Buku - " + category);
        System.out.printf("%-5s%-40s%-20s%-15s\n", "No", "Judul", "Penulis", "Tahun Terbit");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < books.length; i++) {
            String[] book = books[i];
            System.out.printf("%-5d%-40s%-20s%-15s\n", i + 1, book[1], book[3], book[5]);
        }
    }
    }


