package library;
public class perpustakaan {
    public String[][] teknologi = {};
    public String[][] filsafat = {};
    public String[][] sejarah = {};
    public String[][] agama = {};
    public String[][] psikologi = {};
    public String[][] politik = {};
    public String[][] fiksi = {};


 public perpustakaan() {
        this.teknologi = buku_teknologi;
        this.filsafat = buku_filsafat;
        this.sejarah = buku_sejarah;
        this.agama = buku_agama;
        this.psikologi = buku_psikologi;
        this.politik = buku_politik;
        this.fiksi = buku_fiksi;
    }

    
    public static String[][] buku_teknologi = {
        {"judul", "Indonesia Digital, Kiat Sukses Berbisnis Online", "penulis", "Arif Budiman", "tahun_terbit", "2018", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Panduan Lengkap Internet Marketing", "penulis", "Ari Kuncoro", "tahun_terbit", "2016", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Bisnis Online, Jalan Sukses Berjualan di Internet", "penulis", "Budi Handoko", "tahun_terbit", "2019", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Revolusi Digital Indonesia", "penulis", "Cahyo Kumolo", "tahun_terbit", "2020", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Strategi Sukses Berjualan di Marketplace", "penulis", "Dewi Ratih", "tahun_terbit", "2021", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"}
    };
    
    public static String[][] buku_filsafat = {
        {"judul", "Pemikiran Kritis: Sebuah Pengantar", "penulis", "Eko Susanto", "tahun_terbit", "2017", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Etika: Pandangan dari Berbagai Perspektif", "penulis", "Rini Wijayanti", "tahun_terbit", "2015", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Filsafat Hidup Bahagia", "penulis", "Yoga Pramudito", "tahun_terbit", "2019", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Metafisika: Studi tentang Hakikat Wujud", "penulis", "Rika Rahayu", "tahun_terbit", "2022", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Panduan Berpikir Filosofis", "penulis", "Satrio Kusumo", "tahun_terbit", "2018", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"}
    };
    
    public static String[][] buku_sejarah = {
        {"judul", "Sejarah Peradaban Manusia", "penulis", "Bambang Setiawan", "tahun_terbit", "2015", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Perang Dunia II: Kilas Balik Sejarah", "penulis", "Diana Fitri", "tahun_terbit", "2019", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Sejarah Indonesia Modern", "penulis", "Ahmad Prasetyo", "tahun_terbit", "2020", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Dinasti-dinasti Tiongkok Kuno", "penulis", "Widya Paramita", "tahun_terbit", "2018", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Perjalanan Sejarah Mesir Kuno", "penulis", "Adi Purnama", "tahun_terbit", "2017", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"}
    };
    
    public static String[][] buku_agama = {
        {"judul", "Pemahaman Agama dalam Kehidupan", "penulis", "Bambang Surya", "tahun_terbit", "2019", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Tafsir Al-Quran: Panduan Lengkap", "penulis", "Fatimah Hidayat", "tahun_terbit", "2016", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Injil: Ajaran dan Makna", "penulis", "Agus Santoso", "tahun_terbit", "2021", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Buddhism for Beginners", "penulis", "Diana Lee", "tahun_terbit", "2018", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Hinduism: Sacred Texts and Beliefs", "penulis", "I Made Surya", "tahun_terbit", "2020", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"}
    };
    
    public static String[][] buku_psikologi = {
        {"judul", "Psikologi Kepribadian", "penulis", "Bambang Jaya", "tahun_terbit", "2021", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Terapi Kognitif: Pendekatan Praktis", "penulis", "Citra Dewi", "tahun_terbit", "2017", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Psikologi Anak: Mengembangkan Potensi Sejak Dini", "penulis", "Ratna Wijaya", "tahun_terbit", "2019", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Mindfulness for Stress Reduction", "penulis", "Yoga Santoso", "tahun_terbit", "2018", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Psikologi Positif: Membangun Kebahagiaan", "penulis", "Rani Susanti", "tahun_terbit", "2022", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"}
    };
    
    public static String[][] buku_politik = {
        {"judul", "Dinamika Politik Modern", "penulis", "Bambang Pratama", "tahun_terbit", "2017", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Globalization and International Relations", "penulis", "Lily Wijaya", "tahun_terbit", "2020", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Demokrasi: Teori dan Praktik", "penulis", "Andi Sutomo", "tahun_terbit", "2019", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Korupsi dalam Sistem Politik", "penulis", "Sari Puspita", "tahun_terbit", "2018", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Negara dan Kebijakan Publik", "penulis", "Dini Pratiwi", "tahun_terbit", "2021", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"} 
    };
    
    public static String[][] buku_fiksi = {
        {"judul", "Petualangan Bambang di Dunia Fantasi", "penulis", "Bambang Adventures", "tahun_terbit", "2022", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Misteri Malam Jumat", "penulis", "Ratih Suryani", "tahun_terbit", "2016", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Cinta di Balik Kabut Pagi", "penulis", "Bayu Wijaya", "tahun_terbit", "2020", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Dunia yang Terlupakan", "penulis", "Sita Rahayu", "tahun_terbit", "2018", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"},
        {"judul", "Harmoni Alam: Kisah Mistis di Desa Seram", "penulis", "Dini Fitri", "tahun_terbit", "2019", "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore"}
    };
   
    public static void main(String[] args) {
        perpustakaan library = new perpustakaan();

        libraryMain.showType("Teknologi", library.buku_teknologi);
        libraryMain.showType("Filsafat", library.buku_filsafat);
        libraryMain.showType("Sejarah", library.buku_sejarah);
        libraryMain.showType("Agama", library.buku_agama);
        libraryMain.showType("Psikologi", library.buku_psikologi);
        libraryMain.showType("Politik", library.buku_politik);
        libraryMain.showType("Fiksi", library.buku_fiksi);
    }


    public String outputPerpus(String kategori) {
        String  output = " ";

        switch (kategori) {
            case "teknologi":
                output = "Buku\t: Teknologi\n";
                output += "---------------------------------------\n";
                    for (String[] perpus : teknologi) {
                        output += "Judul Buku\t\t: " + perpus[0] + "\n";
                        output += "Nama Penulis\t\t: " + perpus[1] + "\n";
                        output += "Jumlah Halaman\t\t: " + perpus[2] + "\n";
                        output += "Sinopsis\t\t: " + perpus[3] + "\n";
                        output += "Total kata sinopsis\t: " + hitungKata(perpus[3]) + "\n\n";
                    } 
                break;
            
            case "filsafat":
                output = "Buku\t: Filsafat\n";
                output += "---------------------------------------\n";
                    for (String[] perpus : filsafat) {
                        output += "Judul Buku\t\t: " + perpus[0] + "\n";
                        output += "Nama Penulis\t\t: " + perpus[1] + "\n";
                        output += "Jumlah Halaman\t\t: " + perpus[2] + "\n";
                        output += "Sinopsis\t\t: " + perpus[3] + "\n";
                        output += "Total kata sinopsis\t: " + hitungKata(perpus[3]) + "\n\n";
                    }
            break;

            case "sejarah": 
                output = "Buku\t: Sejarah\n";
                output += "---------------------------------------\n";
                    for (String[] perpus : sejarah) {
                        output += "Judul Buku\t\t: " + perpus[0] + "\n";
                        output += "Nama Penulis\t\t: " + perpus[1] + "\n";
                        output += "Jumlah Halaman\t\t: " + perpus[2] + "\n"; 
                        output += "Sinopsis\t\t: " + perpus[3] + "\n";
                        output += "Total kata sinopsis\t: " + hitungKata(perpus[3]) + "\n\n";
            }
            break;

            case "agama": 
                output = "Buku\t: Agama\n";
                output += "---------------------------------------\n";
                    for (String[] perpus : agama) {
                        output += "Judul Buku\t\t: " + perpus[0] + "\n";
                        output += "Nama Penulis\t\t: " + perpus[1] + "\n";
                        output += "Jumlah Halaman\t\t: " + perpus[2] + "\n";
                        output += "Sinopsis\t\t: " + perpus[3] + "\n";
                        output += "Total kata sinopsis\t: " + hitungKata(perpus[3]) + "\n\n";
                    }
            break;

            case "psikologi": 
                output = "Buku\t: Psikologi\n";
                output += "---------------------------------------\n";
                    for (String[] perpus : psikologi) {
                        output += "Judul Buku\t\t: " + perpus[0] + "\n";
                        output += "Nama Penulis\t\t: " + perpus[1] + "\n";
                        output += "Jumlah Halaman\t\t: " + perpus[2] + "\n";
                        output += "Sinopsis\t\t: " + perpus[3] + "\n";
                        output += "Total kata sinopsis\t: " + hitungKata(perpus[3]) + "\n\n";
            }
            break;

            case "politik":
                output = "Buku\t: Politik\n";
                output += "---------------------------------------\n";
                    for (String[] perpus : politik) {
                        output += "Judul Buku\t\t: " + perpus[0] + "\n";
                        output += "Nama Penulis\t\t: " + perpus[1] + "\n";
                        output += "Jumlah Halaman\t\t: " + perpus[2] + "\n";
                        output += "Sinopsis\t\t: " + perpus[3] + "\n";
                        output += "Total kata sinopsis\t: " + hitungKata(perpus[3]) + "\n\n";
                    }
            break;

            case "fiksi": 
                output = "Buku\t: Fiksi\n";
                output += "---------------------------------------\n";
                    for (String[] perpus : fiksi) {
                        output += "Judul Buku\t\t: "  + perpus[0] + "\n";
                        output += "Nama Penulis\t\t: " + perpus[1] + "\n";
                        output += "Jumlah Halaman\t\t: " + perpus[2] + "\n";
                        output += "Sinopsis\t\t: " + perpus[3] + "\n";
                        output += "Total kata sinopsis\t: " + hitungKata(perpus[3]) + "\n\n";
                    }
            break;

        default:
            output = "Kategori buku tidak ditemukan.";
            break;

        }
        return output;
    }   

    private int hitungKata(String teks) {
        String[] kataKunci = teks.split("\\s+");
        return kataKunci.length;
    }
    
}
