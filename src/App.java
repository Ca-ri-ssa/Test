import model.Lingkaran;

public class App {
    public static void main(String[] args) throws Exception {
        String pesan = "Selamat Datang di Kuliah PBO ";
        int tahun = 2022;
        System.out.println(pesan + tahun);
        System.out.println("==============================\n");

        
        lingkaran lingkaran1 = new lingkaran();
        lingkaran1.r = 12;
        lingkaran1.luasLingkaran();
    }
}
